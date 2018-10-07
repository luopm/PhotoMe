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
                that.loadUserDetail();
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
            $(".navBar").on('click','.icon-off',that,function () {
                var sessionStorage = window.sessionStorage;
                sessionStorage.clear();
                that.init();
                that.editSwitch(false);
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
                        if (result.resultCode == 1){
                            that.afterLoginRegister(result.resultObject);
                        }else alert("登录/注册："+result.resultMsg);
                    },error:function (e) {
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
                        that.afterLoginRegister(result.resultObject);
                    }, error:function (e) {
                        confirm("注册用户："+e.responseJSON.message);
                    }
                })
            });
            // 编辑开关按钮事件
            $('.login').on('click','.editIcon',that,function () {
                if ($('.login .coverForm').css("display") == "block" || $('.login .musicForm').css("display") == "block"){
                    that.editSwitch(false);
                }else that.editSwitch(true);
            });
            // photo选择框
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
                        if (result.resultCode == 1){
                            // var url = result.resultObject.photomeUserphotoPhotocontent;
                            // var blob = new Blob(,{type:"image/jepg"});
                            // $('.userCover img').attr('src',URL.createObjectURL(blob));
                            // $('.userCover img').attr('src',"data:image/jpg;base64,"+url);
                            var options = {
                                resultObject:result.resultObject,
                                isCover:true
                            };that.afterPhotoAdd(options);
                        }else alert("Add Photo："+result.resultMsg);
                    },
                    error:function (e) {
                        e.print();
                        //alert("修改照片："+JSON.stringify(e));
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
                        if (result.resultCode == 1){
                            var options = {
                                isBackMusic:true,
                                resultObject:result.resultObject
                            };that.afterMusicAdd(options);
                        }else alert("Add Music："+result.resultMsg);
                    },
                    error:function (e) {
                        alert("Add Music："+e.responseJSON.message);
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
                var userDetail = {
                    photomeUserdetailUserintroduction : $('.userDetailPage .editInfoInput').val(),
                    photomeUserdetailUsername : window.localStorage.getItem("userName")
                };
                that.updateUserDetail(userDetail);
                $('.peopleInfo .editInfo').removeClass('icon-edit');//关闭按钮
                $('.login .editInfoInput').attr('readonly',true); //输入框不可编辑
            });
        },
        editSwitch : function (Switch) {
            if (Switch){
                $('.detailMusic .editMusic').addClass('icon-plus');//放开按钮
                $('.peopleInfo .editInfo').addClass('icon-edit');
                $('.login .userEditForm').show(); //放开表单
                $('.login .editInfoInput').attr('readonly',false); //输入框可编辑
            } else{
                $('.login .coverForm').hide(); //关闭表单
                $('.login .musicForm').hide(); //关闭表单
                $('.detailMusic .editMusic').removeClass('icon-plus');//关闭按钮
                $('.peopleInfo .editInfo').removeClass('icon-edit');
                $('.login .editInfoInput').attr('readonly',true); //输入框可编辑
            }

        },
        loadUserDetail :function () {
            var that = this;
            var sessionStorage = window.sessionStorage;
            var options = {
                photoCode:window.localStorage.getItem("photoCode"),
                selector:'.userDetailPage img'
            };that.loadPhotoByCode(options);

            if (sessionStorage.getItem("isLogin") == "yes"){//已登录状态
                var user = JSON.parse(sessionStorage.getItem("user"));
                $('.userDetailPage .userName').val(user.photomeUserdetailUsername);
                $('.userDetailPage .musicList').val(user.photomeUserdetailUsermusicname);
                $('.userDetailPage .editInfoInput').val(user.photomeUserdetailUserintroduction);
                // $('.userDetailPage .commentList').append('<li>'+result[0].photomeUserdetailUsercomment+'</li>');
                var options = {
                    musicCode:user.photomeUserdetailUsermusiccode,
                    selector:'.userDetailPage .musicListUrl'
                };that.loadMusicByCode(options);
                $('.login .loginPage').hide();
                $('.login .registerPage').hide();
                $('.login .userDetailPage').show();
                $('.navBar .icon-off').show();
                $('.navBar .icon-group').hide();
                $('.navBar .icon-user').hide();
            }
        },
        loadMusicByCode : function (options) {
            var userMusic = {photomeUsermusicMusiccode:options.musicCode};
            $.ajax({ // 加载UserMusic详情
                method:'post',
                url:'../music/getMusicByMusicCode',
                async:true,
                data:userMusic,
                dataType:'json',
                success:function (result) {
                    if (result.resultCode == 1){
                        $(options.selector).val(result.resultObject.photomeUsermusicMusicurl);
                        $('.userDetailPage .musicList').val(result.resultObject.photomeUsermusicMusicname)
                    }else alert("Load Back Music："+result.resultMsg);
                }
            });
        },
        loadPhotoByCode : function (options) {
            var photoCode ={ photomeUserphotoPhotocode: options.photoCode} ;
            $.ajax({ //加载用户封面
                method:'post',
                url:'../photo/getPhotoByPhotoCode',
                async:true,
                data:photoCode,
                dataType:'json',
                success:function (result) {
                    if (result.resultCode == 1){
                        $(options.selector).attr('src', "data:image/jpg;base64,"+result.resultObject.photomeUserphotoPhotocontent);
                    }else alert("Load Photo："+result.resultMsg);
                },
                error:function (e) {
                    e.print();
                    alert("Load Photo："+e.responseJSON.message);
                }
            });
        },
        afterLoginRegister : function (resultObject) {
            var that = this;
            // 根据userName加载用户详情
                var localStorage = window.localStorage;
                var sessionStorage = window.sessionStorage;
                localStorage.setItem("userName",resultObject.photomeUserdetailUsername);
                localStorage.setItem("photoCode",resultObject.photomeUserdetailUsercovercode);
                sessionStorage.setItem("isLogin","yes");
                sessionStorage.setItem("user",JSON.stringify(resultObject));
                that.loadUserDetail();
        },
        afterPhotoAdd : function (options) {
            var that = this;
            var userNameToPhotoCode = {
                username:window.localStorage.getItem("userName"),
                photocode:options.resultObject.photomeUserphotoPhotocode
            };
            $.ajax({ //注册连接信息
                method:'post',
                url:'../UNTPC/addUserNameToPhotoCode',
                async:true,
                data:userNameToPhotoCode,
                dataType:'json',
                success:function (result) {
                    if (result.resultCode == 1){
                        if (options.isCover){//如果是CoverPhoto
                            var userDetail = {
                                photomeUserdetailUsername:result.resultObject[0].username,
                                photomeUserdetailUsercovercode:result.resultObject[0].photocode,
                                // photomeUserdetailUsercovername:options.resultObject.photomeUserphotoPhotoname
                            };that.updateUserDetail(userDetail);
                        }
                    }
                    alert("Add Photo："+result.resultMsg);
                },
                error:function (e) {
                    alert("添加userNameToPhotoCode："+e.responseJSON.message);
                }
            });
        },
        afterMusicAdd : function (options) {
            var that = this;
            var userNameToPhotoCode = {
                username:window.localStorage.getItem("userName"),
                musiccode:options.resultObject.photomeUsermusicMusiccode
            };
            $.ajax({ //注册连接信息
                method:'post',
                url:'../UNTMC/addUserNameToMusicCode',
                async:true,
                data:userNameToPhotoCode,
                dataType:'json',
                success:function (result) {
                    if (result.resultCode == 1){
                        if (options.isBackMusic){//如果是CoverPhoto
                            var userDetail = {
                                photomeUserdetailUsername:result.resultObject[0].username,
                                photomeUserdetailUsermusiccode:result.resultObject[0].musiccode,
                                // photomeUserdetailUsercovername:options.resultObject.photomeUserphotoPhotoname
                            };that.updateUserDetail(userDetail);
                        }
                        // that.loadPhotoByCode(result.resultObject.photomeUsermusicMusiccode,'.userDetailPage img');
                    }
                    alert("添加userNameToMusicCode："+result.resultMsg);
                },
                error:function (e) {
                    alert("添加userNameToMusicCode："+e.responseJSON.message);
                }
            });
        },
        updateUserDetail : function (UserDetail) {
            var that = this;
            $.ajax({
                method:'post',
                url:'../detail/updateDetail',
                async:true,
                data:UserDetail,
                dataType:'json',
                success:function (result) {
                    if (result.resultCode == 1){
                        window.localStorage.setItem("photoCode",result.resultObject.photomeUserdetailUsercovercode);
                        window.sessionStorage.setItem("user",JSON.stringify(result.resultObject));
                        that.loadUserDetail();
                    }else alert("Update User Detail："+result.resultMsg);
                },
                error:function (e) {
                    alert("Update User Detail："+e.responseJSON.message);
                }
            });

        }
    }
    return view;
});