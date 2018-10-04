/**
 * @method
 * @param {String} str 输出字符串,{Number} time 输出延时,{String} selector 选择器
 * @returns 
 * @desc 根据选择器延时输出字符串
 */
define(function () {
    var kugouAPI = {
        playID : [],
        addID : [],
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
                    $(selector).html('');
                    for (var i=0;i<10;i++){
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
                            newSongInfo.playUrl = that.song_get(newSongInfo);
                            $(selector).append(
                                '<label class="musiclist'+ i +'">'+
                                newSongInfo.songName +' - '+ newSongInfo.singerName +'' +
                                '<i class="icon-play playIcon"></i><i class="icon-plus addIcon"></i> '
                                +'</label>'
                            );
                            $('.musiclist'+i).on('click','.playIcon',function () {
                                if (that.playID.length != 0){
                                    var playId = that.playID.pop();
                                    $('.musiclist'+ playId +' .playIcon').removeClass('icon-headphones').addClass('icon-play');
                                }
                                that.playID.push(i);//记录当前播放歌曲
                                var music = document.getElementById('backgroundMusic');
                                if (music.paused) {
                                    if (music.src != newSongInfo.playUrl){
                                        music.src = newSongInfo.playUrl;
                                    }
                                    music.play();
                                    $('.musiclist'+i+' .playIcon').removeClass('icon-play').addClass('icon-headphones');
                                }else{
                                    music.pause();//暂停
                                    if (music.src != newSongInfo.playUrl ){
                                        music.src = newSongInfo.playUrl;
                                        music.play();
                                        $('.musiclist'+i+' .playIcon').removeClass('icon-play').addClass('icon-headphones');
                                    }
                                }
                            });
                            $('.musiclist'+i).on('click','.addIcon',function () {
                                if (that.addID.length != 0){
                                    var addId = that.addID.pop();
                                    $('.musiclist'+ addId +' .addIcon').removeClass('icon-ok').addClass('icon-plus');
                                }
                                that.addID.push(i);
                                $('.musiclist'+i+' .addIcon').removeClass('icon-plus').addClass('icon-ok');
                                $('.musicForm .addMusicName').val(newSongInfo.songName);
                                $('.musicForm .addMusicUrl').val(newSongInfo.playUrl);
                                $('.musicForm .addMusicSinger').val(newSongInfo.singerName);
                                $('.musicForm .addMusicAlbum').val(newSongInfo.albumID);
                                $('.musicForm .addMusicDuration').val(newSongInfo.songTime);
                                $('.musicForm .addMusicSize').val(newSongInfo.fileSize);
                                $('.musicForm .addMusicImg').val(newSongInfo.img);
                                $('.musicForm .addMusicLrc').val(newSongInfo.lyrics);
                                $('.musicForm .addMusicCode').val(newSongInfo.fileHash);
                            });
                        })(i);
                    }
                }
            })
        },
        song_get:function (songInfo) {
            var play_url = '';
            var currentTime = ( new Date() ).getTime();
            var RequestURL = "http://wwwapi.kugou.com/yy/index.php?r=play/getdata&hash=" +
                songInfo.fileHash + "&album_id=" + songInfo.albumID + "&_=" +currentTime;
            $.ajax({
                method:'get',
                url: RequestURL,
                async:false,
                data:{},
                dataType:'jsonp',
                success:function (result) {
                    var play_url = result.data.play_url
                    songInfo.playUrl = play_url;
                    songInfo.lyrics = result.data.lyrics;
                    songInfo.img = result.data.img;
                    // songInfo.lyrics = result.data.lyrics;
                }
            })
        }
    };
    return kugouAPI;
})
