define(['text!../templates/login.html','css!../style/login.css'],
    function (tem) {
    var view ={
        render : function (el) {
            // 挂载模板
            $(el).append(tem);
        },

        initClassName : function (tem) {
            var that = this;
            tem = tem.replace('\"photoContainer\"','\"photoContainer photoContainer'+ that.conCount +'\"');
            tem = tem.replace('\"img\"','\"img img'+ that.conCount +'\"');
            tem = tem.replace('\"imgInfo\"','\"imgInfo imgInfo'+ that.conCount +'\"');
            tem = tem.replace('\"photo\"','\"photo photo'+ that.conCount +'\"');
            tem = tem.replace('\"music\"','\"music music'+ that.conCount +'\"');
            tem = tem.replace('\"comment\"','\"comment comment'+ that.conCount +'\"');
            return tem;
        },
        loadMusic: function (user,selector) {
            var userName ={ userName: "<" + user.photomeUserUsername + ">"} ;
            $.ajax({
                method:'get',
                url:'../music/getMusicByUserName',
                async:true,
                data:userName,
                dataType:'json',
                success:function (result) {
                    for (var i=0;i<result.length;i++){
                        (function (i) {
                            var liCount = $(".mLi").length + 1;
                            $(selector).append('<li class="mLi mLi'+liCount+'">' +
                                result[i].photomeUsermusicMusicname + ' - '+
                                result[i].photomeUsermusicMusicsinger +
                                '<input hidden="hidden" value="' +
                                result[i].photomeUsermusicMusicurl +
                                '"></li>');
                            $('.mLi'+liCount).click(function () {
                                // var music = $("#backgroundMusic");
                                var music = document.getElementById('backgroundMusic');
                                if (music.paused) {
                                    if (music.src == $('.mLi'+liCount+' input').val()){}
                                    else {
                                        music.src = $('.mLi'+liCount+' input').val();

                                    }
                                    music.play();
                                    // $('.modal-body').css({"background-image":"url("+result[i].photomeUsermusicMusicimg+")"})
                                }else{
                                    music.pause();//暂停
                                    if (music.src == $('.mLi'+liCount+' input').val()){
                                        $('.modal-body').css({"background-image":"url()"})
                                    }
                                    else { //换歌
                                        music.src = $('.mLi'+liCount+' input').val();
                                        music.play();
                                        // $('.modal-body').css({"background-image":"url("+result[i].photomeUsermusicMusicimg+")"})
                                    }
                                }
                            })
                        })(i);
                    }
                }
            })
        },
        loadComment : function (user,selector) {
            var userName ={ userName: user.photomeUserUsername } ;
            $.ajax({
                method:'get',
                url:'../comment/getCommentByUserName',
                async:true,
                data:userName,
                dataType:'json',
                success:function (result) {
                    for (var i=0;i<result.length;i++){
                        (function (i) {
                            var liCount = $(".cLi").length + 1;
                            $(selector).append('<li class="cLi cLi'+liCount+'">' +
                                result[i].photomeUsercommentCommentuser +
                                '<p>' + result[i].photomeUsercommentCommentcontent +
                                '</p></li>')
                        })(i);
                    }
                }
            })
        },
        loadPhoto : function (user) {
            var that = this;
            var userName ={ userName: user.photomeUserUsername } ;
            $.ajax({ //加载用户详情
                method:'get',
                url:'../detail/getDetailByUserName',
                async:true,
                data:userName,
                dataType:'json',
                success:function (result) {
                    $('.imgInfo'+that.conCount + ' .peopleInfo').text( result[0].photomeUserdetailUserintroduction);
                    var photoCode ={ photoCode: result[0].photomeUserdetailUsercover } ;
                    $.ajax({ //加载用户封面
                        method:'get',
                        url:'../photo/getPhotoByPhotoCode',
                        async:true,
                        data:photoCode,
                        dataType:'json',
                        success:function (result) {
                            $('.img'+that.conCount).attr('src',result[0].photomeUserphotoPhotourl);
                            // $('.img'+that.conCount).src = result[0].photomeUserphotoPhotourl;
                             var s = $('.img'+that.conCount);
                            //console.log("se: "+)
                        }
                    });
                }
            });
        },
        init : function (user) {
            var that = this;
            that.loadPhoto(user); //加载用户详情
            that.loadMusic(user,'.music'+that.conCount+' .musicList'); //加载music
            that.loadComment(user,'.comment'+that.conCount+' .commentList'); //加载comment
        }
    }
    return view;
});