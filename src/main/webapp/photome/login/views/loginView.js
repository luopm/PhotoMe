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
                            var localStorage = window.localStorage;
                            var sessionStorage = window.sessionStorage;
                            localStorage.setItem("userName",result.resultObject[0].photomeUserUsername);
                            sessionStorage.setItem("isLogin","yes");
                            that.loadUserDatil(localStorage.getItem("userName"));
                            $('.login .loginPage').hide();
                            $('.login .userDetailPage').show();
                        }else{
                            alert(result.resultMsg);
                        }
                    },
                    error:function (e) {
                        confirm("登录："+e.responseJSON.message);
                    }
                })
            });
            // 注册事件
            $('.login').on('click','.registerBtn',function () {
                var formData = new FormData(document.getElementById('registerForm'));
                // formData.append('photomeUserUsercreatdate',new Date().getTime());
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
                        var userName = formData.get('photomeUserUsername');
                        var localStorage = window.localStorage;
                        var sessionStorage = window.sessionStorage;
                        localStorage.setItem("userName",userName);
                        sessionStorage.setItem("isLogin","yes");
                        that.loadUserDatil(localStorage.getItem("userName"));
                        // 根据userName加载用户详情
                        $('.login .loginPage').hide();
                        $('.login .userDetailPage').show();
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
                    error:function (e) {
                        alert("修改照片："+e.responseJSON.message);
                    }
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
                });''
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
                    error:function (e) {
                        alert("添加人物说明："+e.responseJSON.message);
                    }
                });
                $('.peopleInfo .editInfo').removeClass('icon-edit');//关闭按钮
                $('.login .editInfoInput').attr('readonly',true); //输入框不可编辑
            });
        },
        loadUserDatil :function (UserName) {
            var that = this;
            var userName = {"userName": UserName};
            $.ajax({
                method:'post',
                url:'../detail/getDetailByUserName',
                async:true,
                data:userName,
                dataType:'json',
                // cache: false,                      // 不缓存
                // processData: false,                // jQuery不要去处理发送的数据
                // contentType: false,                 // jQuery不要去设置Content-Type请求头
                success:function (result) {
                    if (result.length > 0){
                        $('.userDetailPage .userName').val(result[0].photomeUserdetailUsername);
                        $('.userDetailPage .musicList').append('<li>'+result[0].photomeUserdetailUsermusicurl+'</li>');
                        // $('.userDetailPage .commentList').append('<li>'+result[0].photomeUserdetailUsercomment+'</li>');
                        $('.userDetailPage .editInfoInput').val(result[0].photomeUserdetailUserintroduction);
                        that.loadPhotoByCode(result[0].photomeUserdetailUsercovercode,'.userDetailPage img');
                    }
                },
                error:function (e) {
                    alert("加载用户详情："+e.responseJSON.message);
                }
            });
        },
        loadPhotoByCode : function (PhotoCode,selector) {
            var photoCode ={ photoCode: PhotoCode} ;
            $.ajax({ //加载用户封面
                method:'get',
                url:'../photo/getPhotoByPhotoCode',
                async:true,
                data:photoCode,
                dataType:'json',
                success:function (result) {
                    if (result.length > 0) {//存在用户photo
                        $(selector).attr('src', result[0].photomeUserphotoPhotourl);
                    }
                },
                error:function (e) {
                    alert("加载用户封面："+e.responseJSON.message);
                }
            });
        }

    }
    return view;
});