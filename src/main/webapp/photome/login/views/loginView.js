define(['text!../templates/login.html','css!../style/login.css'],
    function (tem) {
    var view ={
        render : function (el) {
            // 挂载模板
            $(el).append(tem);
            this.initEvent();
        },
        initEvent : function () {
            var that = this;
            // 导航条事件
            $(".navBar").on('click',function () {
                var selector  = $(".loginContainer");
                if ( selector.hasClass("loginShow")){
                    selector.removeClass("loginShow");
                    selector.addClass("loginHidden");
                }else {
                    selector.removeClass("loginHidden");
                    selector.addClass("loginShow");
                }
            });
            // 登录事件
            $(".login").on('click','.loginBtn',function () {
                var formData = new FormData(document.getElementById('loginForm'));
                $.ajax({
                    method:'post',
                    url:'../user/Login',
                    async:true,
                    data:formData,
                    dataType:'json',
                    cache: false,                      // 不缓存
                    processData: false,                // jQuery不要去处理发送的数据
                    contentType: false,                 // jQuery不要去设置Content-Type请求头
                    success:function (result) {
                        // 根据userName加载用户详情
                        if (result.resultCode == 1 ){
                            var userName = formData.get("photomeUserUsername");
                            that.loadUserDatil(userName);
                            $('.login .loginPage').hide();
                            $('.login .userDetailPage').show();
                        }else{
                            alert(result.resultMsg);
                        }
                    },
                    error:function (e) {}
                })
            });
            // 注册事件
            $('.login').on('click','.registerBtn',function () {
                var formData = new FormData(document.getElementById('registerForm'));
                $.ajax({
                    method:'post',
                    url:'../user/addUser',
                    async:true,
                    data:formData,
                    dataType:'json',
                    cache: false,                      // 不缓存
                    processData: false,                // jQuery不要去处理发送的数据
                    contentType: false,                 // jQuery不要去设置Content-Type请求头
                    success:function (result) {
                        // 根据userName加载用户详情
                        var userName = result[0].photomeUserUsername;
                        that.loadUserDatil(userName);
                        $('.login .registerPage').hide();
                        $('.login .userDetailPage').show();
                    },
                    error:function (e) {}
                })
            });
            // 编辑开关按钮事件
            $('.login').on('click','.editIcon',function () {
                $('.detailMusic .editMusic').removeClass('icon-plus').addClass('icon-plus');//放开按钮
                $('.peopleInfo .editInfo').removeClass('icon-edit').addClass('icon-edit');
                $('.login .userEditForm').show(); //放开表单

            });
            // 照片选择框
            $('.login').on('click','.icon-picture',function () {
                var userPhoto = new FormData(document.getElementsByClassName('coverForm')[0]);
                userPhoto.append('photomeUserphotoPhotocode',$('.userDetailPage .userName').val());
                $.ajax({
                    method:'post',
                    url:'../photo/updatePhoto',
                    async:true,
                    data:userPhoto,
                    dataType:'json',
                    cache: false,                      // 不缓存
                    processData: false,                // jQuery不要去处理发送的数据
                    contentType: false,                 // jQuery不要去设置Content-Type请求头
                    success:function (result) {
                        alert("修改照片："+result);
                    },
                    error:function (e) {}
                });
                // $('.userCover .icon-picture').removeClass('icon-plus');//关闭按钮
                $('.login .coverForm').hide(); //关闭表单
            });
            // 音乐编辑事件
            $('.detailMusic').on('click','.icon-plus',function () {
                var userMusic = new FormData(document.getElementsByClassName('musicForm')[0]);
                userMusic.append('photomeUsermusicMusicuser',$('.userDetailPage .userName').val());
                $.ajax({
                    method:'post',
                    url:'../music/addMusic',
                    async:true,
                    data:userMusic,
                    dataType:'json',
                    cache: false,                      // 不缓存
                    processData: false,                // jQuery不要去处理发送的数据
                    contentType: false,                 // jQuery不要去设置Content-Type请求头
                    success:function (result) {
                        alert("添加音乐："+result);
                    },
                    error:function (e) {}
                });
                $('.detailMusic .editMusic').removeClass('icon-plus');//关闭按钮
                $('.login .musicForm').hide(); //关闭表单
            });
            // 音乐弹出框
            $('.musicForm .addMusicName').on('click',function () {
                require(['photome/popup/views/popupView.js'],function (popupView) {
                    popupView.render();
                });
            });
            // 人物说明编辑事件
            $('.peopleInfo').on('click','.icon-edit',function () {
                var userDetial = new FormData(document.getElementsByClassName('peopleInfoForm')[0]);
                userDetial.append('photomeUserdetailUsername',$('.userDetailPage .userName').val());
                $.ajax({
                    method:'post',
                    url:'../detail/updateDetail',
                    async:true,
                    data:userDetial,
                    dataType:'json',
                    cache: false,                      // 不缓存
                    processData: false,                // jQuery不要去处理发送的数据
                    contentType: false,                 // jQuery不要去设置Content-Type请求头
                    success:function (result) {alert("人物说明："+result);},
                    error:function (e) {}
                });
                $('.peopleInfo .editInfo').removeClass('icon-edit');//关闭按钮
                $('.login .peopleInfoForm').hide(); //关闭表单
            });
        },
        loadUserDatil :function (UserName) {
            var userName = {"userName": UserName};
            $.ajax({
                method:'post',
                url:'../detail/getDetailByUserName',
                async:true,
                data:userName,
                dataType:'json',
                cache: false,                      // 不缓存
                processData: false,                // jQuery不要去处理发送的数据
                contentType: false,                 // jQuery不要去设置Content-Type请求头
                success:function (result) {
                    // $('.userDetailPage img').attr('src',result[0].photomeUserdetailUsercover);
                    $('.userDetailPage .userName').text(result[0].photomeUserUsername);
                    $('.userDetailPage .musicList').append('<li>'+result[0].photomeUserdetailUsermusic+'</li>');
                    $('.userDetailPage .commentList').append('<li>'+result[0].photomeUserdetailUsercomment+'</li>');
                    $('.userDetailPage .peopleInfo').append('<p>'+result[0].photomeUserdetailUserintroduction+'</p>');
                },
                error:function (e) {}
            });
        },

    }
    return view;
});