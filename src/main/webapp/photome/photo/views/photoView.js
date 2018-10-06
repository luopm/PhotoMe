define(['text!../templates/photo.html'],
    function (tem) {
    var view = {
        conCount : 0,
        render : function (el,userDetail) {
            this.conCount++;
            // 初始化模板
            tem = this.initClassName(tem,this.conCount);
            $(el).append(tem);
            // 初始化数据
            this.loadData(userDetail,this.conCount);
        },
        initClassName : function (tem,num) {
            tem = tem.replace(/(\"photoContainer)+(\sphotoContainer\d)?\"/,'\"photoContainer photoContainer'+ num +'\"');
            tem = tem.replace(/(\"img)+(\simg\d)?\"/,'\"img img'+ num +'\"');
            tem = tem.replace(/(\"imgInfo)+(\simgInfo\d)?\"/,'\"imgInfo imgInfo'+ num +'\"');
            tem = tem.replace(/(\"photo)+(\sphoto\d)?\"/,'\"photo photo'+ num +'\"');
            tem = tem.replace(/(\"music)+(\smusic\d)?\"/,'\"music music'+ num +'\"');
            tem = tem.replace(/(\"comment)+(\scomment\d)?\"/,'\"comment comment'+ num +'\"');
            return tem;
        },
        loadData : function (UserDetail,num) {
            var that = this;
            var userDetail = UserDetail;
            $.ajax({ // 加载UserMusic详情
                method:'post',
                url:'../detail/getDetail',
                async:false,
                data:userDetail,
                dataType:'json',
                success:function (result) {
                    if (result.resultCode == 1){
                        that.loadPeopleInfo(result.resultObject.userDetail,'.imgInfo'+ num + ' .peopleInfo');
                        that.loadCoverPhoto(result.resultObject.coverPhoto,'.img'+ num);
                        that.loadComment(result.resultOtherObj.userComment,'.comment'+ num +' .commentList');
                        that.loadMusic(result.resultOtherObj.userMusic,'.music'+ num +' .musicList');
                    }else alert("加载photo模块用户详情："+result.resultObject);

                }
            });
        },
        loadPeopleInfo : function (userDetail,selector) {
            if (userDetail != null && userDetail.photomeUserdetailUserintroduction != null){
                $(selector).text(userDetail.photomeUserdetailUserintroduction);
            }else $(selector).text("暂无详情，请在用户详情界面添加");
        },
        loadCoverPhoto : function (coverPhoto,selector) {
            if (coverPhoto != null && coverPhoto.photomeUserphotoPhotourl != null){
                $(selector).attr('src',coverPhoto.photomeUserphotoPhotourl);
            } else if (coverPhoto != null && coverPhoto.photomeUserphotoPhotoname != null){
                $(selector).attr('alt',coverPhoto.photomeUserphotoPhotoname);
            } else $(selector).attr('alt',"请添加用户Photo");
        },
        loadComment : function (commentList,selector) {
            for (var i=0;i<commentList.length;i++){
                (function (i) {
                    var liCount = $(".cLi").length + 1;
                    $(selector).append('<li class="cLi cLi'+liCount+'">' +
                        commentList[i].photomeUsercommentCommentuser + '<p>' +
                        commentList[i].photomeUsercommentCommentcontent + '</p></li>')
                })(i);
            }
        },
        loadMusic : function (musicList,selector) {
            for (var i=0;i<musicList.length;i++){
                (function (i) {
                    var liCount = $(".mLi").length + 1;
                    $(selector).append('<li class="mLi mLi'+liCount+'">' +
                        musicList[i].photomeUsermusicMusicname + ' - '+
                        musicList[i].photomeUsermusicMusicsinger + '<input hidden="hidden" value="' +
                        musicList[i].photomeUsermusicMusicurl + '"></li>');
                    $('.mLi'+liCount).click(function () {
                        var music = document.getElementById('backgroundMusic');
                        if (music.paused) {
                            if (music.src != $('.mLi'+liCount+' input').val()){
                                music.src = $('.mLi'+liCount+' input').val();
                            }music.play();
                        }else{
                            music.pause();//暂停
                            if (music.src != $('.mLi'+liCount+' input').val()){//换歌
                                music.src = $('.mLi'+liCount+' input').val();
                                music.play();
                            }
                        }
                    })
                })(i);
            }
        }
    }
    return view;
});