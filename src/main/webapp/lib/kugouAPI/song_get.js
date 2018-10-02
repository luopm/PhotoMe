/**
 * @method
 * @param {String} str 输出字符串,{Number} time 输出延时,{String} selector 选择器
 * @returns 
 * @desc 根据选择器延时输出字符串
 */
define(function () {
    var kugouAPI = {
        song_search:function (keyword,selector) {
            var that = this;
            var currentTime = ( new Date() ).getTime();
            var RequestURL = "http://songsearch.kugou.com/song_search_v2?keyword="
                + keyword +
                "&page=1&pagesize=30&userid=-1&clientver=&platform=WebFilter&tag=em&filter=2&iscorrection=1&privilege_filter=0&_=" +
                + currentTime;

            $.ajax({
                method:'get',
                url: RequestURL,
                async:true,
                data:{},
                dataType:'jsonp',
                success:function (result) {
                    for (var i=0;i<5;i++){
                        (function (i) {
                            var songInfo = result.data.lists[i];
                            var newSongInfo = {
                                songName : songInfo.SongName,
                                singerName : songInfo.SingerName,
                                songTime : songInfo.Duration,
                                fileHash : songInfo.FileHash,
                                fileName : songInfo.FileName,
                                fileSize : songInfo.FileSize,
                                albumID : songInfo.AlbumID
                            };
                            $(selector).append(
                                '<li class="musiclist'+ i +'"><label>'+ newSongInfo.songName +' - '+ newSongInfo.singerName+'</label></li>'
                            );

                            $(".musiclist"+i).click(function () {
                                if (  $(".musiclist"+i+" audio").length > 0){
                                    $(".musiclist"+i+" audio").remove();
                                }else that.song_get(newSongInfo ,".musiclist"+i)
                            })
                        })(i);

                    }

                }
            })
        },
        song_get:function (songInfo,selector) {
            var currentTime = ( new Date() ).getTime();
            var RequestURL = "http://wwwapi.kugou.com/yy/index.php?r=play/getdata&hash=" +
                songInfo.fileHash + "&album_id=" + songInfo.albumID + "&_=" +currentTime;
            $.ajax({
                method:'get',
                url: RequestURL,
                async:true,
                data:{},
                dataType:'jsonp',
                success:function (result) {
                    var song = result.data;
                    $(selector).append(
                        // '<img src="'+ song.img +'">'+
                        '<audio src="'+ song.play_url +'" controls="controls">' +
                        '您的浏览器不支持 audio 标签。'+
                        '</audio>'
                    )
                }
            })

        }
    };
    return kugouAPI;
})
