define(['text!../templates/login.html','css!../style/login.css'],
    function (tem) {
    var view ={
        render : function (el) {
            // 挂载模板
            $(el).append(tem);
            this.init();
            this.initEvent();
        },
        // 初始化loginView
        init : function () {
            var that = this;
            var localStorage = window.localStorage;
            var sessionStorage = window.sessionStorage;
            if (localStorage.getItem("userName") != "undefined" && sessionStorage.getItem("isLogin") == "yes"){//已登录状态
                that.loadUserDatil(localStorage,sessionStorage)
            }else {//未登录状态
                $('.login .loginPage').show();
                $('.login .registerPage').hide();
                $('.login .userDetailPage').hide();
                $('.navBar .icon-off').hide();
                $('.navBar .icon-group').show();
                $('.navBar .icon-user').show();
            }
        },
        initEvent : function () {
            var that = this;
            // 导航条事件
            $(".navBar").on('click','.icon-home',function () {
                var selector  = $(".loginContainer");
                if ( selector.hasClass("loginShow")){
                    selector.removeClass("loginShow").addClass("loginHidden");
                }else {
                    selector.removeClass("loginHidden").addClass("loginShow");
                }
            });
            // to登录
            $('.navBar').on('click','.toLoginBtn',function () {
                $('.login .loginPage').show();
                $('.login .registerPage').hide();
                $('.login .userDetailPage').hide();
                $('.navBar .icon-off').hide();
                $('.navBar .icon-group').show();
                $('.navBar .icon-user').show();
            });
            // to注册
            $('.navBar').on('click','.toRegisterBtn',function () {
                $('.login .loginPage').hide();
                $('.login .registerPage').show();
                $('.login .userDetailPage').hide();
                $('.navBar .icon-off').hide();
                $('.navBar .icon-group').show();
                $('.navBar .icon-user').show();
            });
            //退出登录
            $(".navBar").on('click','.icon-off',function () {
                var sessionStorage = window.sessionStorage;
                sessionStorage.clear();
                $('.login .loginPage').show();
                $('.login .registerPage').hide();
                $('.login .userDetailPage').hide();
                $('.navBar .icon-off').hide();
                $('.navBar .icon-group').show();
                $('.navBar .icon-user').show();
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
                        that.afterLoginRegister(result);
                    },
                    error:function (e) {
                        confirm("登录："+e.responseJSON.message);
                    }
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
                        that.afterLoginRegister(result);
                    },
                    error:function (e) {
                        confirm("注册用户："+e.responseJSON.message);
                    }
                })
            });
            // 编辑开关按钮事件
            $('.login').on('click','.editIcon',function () {
                $('.detailMusic .editMusic').removeClass('icon-plus').addClass('icon-plus');//放开按钮
                $('.peopleInfo .editInfo').removeClass('icon-edit').addClass('icon-edit');
                $('.login .userEditForm').show(); //放开表单
                $('.login .editInfoInput').attr('readonly',false); //输入框可编辑

                if ($('.login .coverForm').attr("display") == "block" || $('.login .musicForm').attr("display") == "block"){
                    $('.login .coverForm').hide(); //关闭表单
                    $('.login .musicForm').hide(); //关闭表单
                }
            });
            // 照片选择框
            $('.login').on('click','.icon-picture',function () {
                var userPhoto = new FormData(document.getElementsByClassName('coverForm')[0]);
                userPhoto.append('photomeUserphotoPhotocode',$('.userDetailPage .photoUrl').val());
                $.ajax({
                    method:'post',
                    url:'../photo/addPhoto',
                    async:true,
                    data:userPhoto,
                    dataType:'json',
                    cache: false,                      // 不缓存
                    processData: false,                // jQuery不要去处理发送的数据
                    contentType: false,                 // jQuery不要去设置Content-Type请求头
                    success:function (result) {
                        that.afterPhotoAdd(result);
                    },
                    error:function (e) {
                        alert("修改照片："+JSON.stringify(e));
                    }
                });
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
                        that.afterMusicAdd(result);
                    },
                    error:function (e) {
                        alert("添加音乐："+e.responseJSON.message);
                    }
                });
                $('.detailMusic .editMusic').removeClass('icon-plus');//关闭按钮
                $('.login .musicForm').hide(); //关闭表单
            });
            // 音乐弹出框
            $('.detailMusic').on('click','.addMusicName',function () {
                require(['photome/popup/views/popupView.js'],function (popupView) {
                    popupView.render();
                });
            });
            // 音乐列表点击事件
            $('.detailMusic').on('click','.musicList',function () {
                var music = document.getElementById('backgroundMusic');
                if (music.paused) {
                    if (music.src == $('.detailMusic .musicListUrl').val()){}
                    else {
                        music.src = $('.detailMusic .musicListUrl').val();
                    }music.play();
                }else{
                    music.pause();//暂停
                    if (music.src != $('.detailMusic .musicListUrl').val()){//换歌
                        music.src = $('.detailMusic .musicListUrl').val();
                        music.play();
                    }
                }
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
                    success:function (result) {
                        if (result.resultCode == 1){
                            alert("人物说明："+result.resultMsg);
                        }else alert("人物说明："+result.resultObject);
                    },
                    error:function (e) {
                        alert("添加人物说明："+e.responseJSON.message);
                    }
                });
                $('.peopleInfo .editInfo').removeClass('icon-edit');//关闭按钮
                $('.login .editInfoInput').attr('readonly',true); //输入框不可编辑
            });
        },
        loadUserDatil :function (localStorage,sessionStorage) {
            var that = this;
            if (sessionStorage.getItem("isLogin") == "yes"){//已登录状态
                var user = JSON.parse(sessionStorage.getItem("user"));
                $('.userDetailPage .userName').val(user.photomeUserdetailUsername);
                $('.userDetailPage .musicList').val(user.photomeUserdetailUsermusicname);
                $('.userDetailPage .editInfoInput').val(user.photomeUserdetailUserintroduction);
                // $('.userDetailPage .commentList').append('<li>'+result[0].photomeUserdetailUsercomment+'</li>');
                that.loadPhotoByCode(user.photomeUserdetailUsercovercode,'.userDetailPage img');
                that.loadMusicByCode(user.photomeUserdetailUsermusiccode);

                $('.login .loginPage').hide();
                $('.login .registerPage').hide();
                $('.login .userDetailPage').show();
                $('.navBar .icon-off').show();
                $('.navBar .icon-group').hide();
                $('.navBar .icon-user').hide();
            }
        },
        loadMusicByCode : function (musicCode) {
            var userMusic = {photomeUsermusicMusiccode:musicCode};
            $.ajax({ // 加载UserMusic详情
                method:'post',
                url:'../music/getMusicByMusicCode',
                async:true,
                data:userMusic,
                dataType:'json',
                success:function (result) {
                    if (result.resultCode == 1){
                        $('.userDetailPage .musicListUrl').val(result.resultObject.photomeUsermusicMusicurl);
                    }else alert(result.resultObject);
                }
            });
        },
        loadPhotoByCode : function (PhotoCode,selector) {
            var photoCode ={ photomeUserphotoPhotocode: PhotoCode} ;
            $.ajax({ //加载用户封面
                method:'post',
                url:'../photo/getPhotoByPhotoCode',
                async:true,
                data:photoCode,
                dataType:'json',
                success:function (result) {
                    if (result.resultCode == 1){
                        $(selector).attr('src', result.resultObject.photomeUserphotoPhotourl);
                    }else alert("加载用户封面："+result.resultObject);
                },
                error:function (e) {
                    alert("加载用户封面："+e.responseJSON.message);
                }
            });
        },
        afterLoginRegister : function (result) {
            var that = this;
            // 根据userName加载用户详情
            if (result.resultCode == 1 ){
                var localStorage = window.localStorage;
                var sessionStorage = window.sessionStorage;
                localStorage.setItem("userName",result.resultObject.photomeUserdetailUsername);
                sessionStorage.setItem("isLogin","yes");
                sessionStorage.setItem("user",JSON.stringify(result.resultObject));
                that.loadUserDatil(localStorage,sessionStorage);
            }else{
                alert("注册用户："+result.resultObject);
            }
        },
        afterPhotoAdd : function (result) {
            var that = this;
            if (result.resultCode == 1){
                var localStorage = window.localStorage;
                var userNameToPhotoCode = {
                    username:localStorage.getItem("userName"),
                    photocode:result.resultObject.photomeUserphotoPhotocode
                };
                that.loadPhotoByCode(result.resultObject.photomeUserphotoPhotocode,'.userDetailPage img');
                $.ajax({
                    method:'post',
                    url:'../UNTPC/addUserNameToPhotoCode',
                    async:true,
                    data:userNameToPhotoCode,
                    dataType:'json',
                    success:function (result) {
                        alert("添加userNameToPhotoCode："+result.resultMsg);
                    },
                    error:function (e) {
                        alert("添加userNameToPhotoCode："+e.responseJSON.message);
                    }
                });
            }else alert("添加userNameToPhotoCode："+result.resultObject);
        },
        afterMusicAdd : function (result) {
            var that = this;
            if (result.resultCode == 1){
                var localStorage = window.localStorage;
                var userNameToPhotoCode = {
                    username:localStorage.getItem("userName"),
                    musiccode:result.resultObject.photomeUsermusicMusiccode
                };
                // that.loadPhotoByCode(result.resultObject.photomeUsermusicMusiccode,'.userDetailPage img');
                $.ajax({
                    method:'post',
                    url:'../UNTMC/addUserNameToMusicCode',
                    async:true,
                    data:userNameToPhotoCode,
                    dataType:'json',
                    success:function (result) {
                        alert("添加userNameToMusicCode："+result.resultMsg);
                    },
                    error:function (e) {
                        alert("添加userNameToMusicCode："+e.responseJSON.message);
                    }
                });
            }else alert("添加userNameToMusicCode："+result.resultObject);
        }
    }
    return view;
});