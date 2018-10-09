define(['text!../templates/home.html',
        'lib/plugin/output.js',
        'lib/kugouAPI/song_get.js',
        '../login/views/loginView.js',
        '../photo/views/photoView.js',
        'css!../style/homeStyle.css',
        'css!../style/backgroundImg.css'],
    function (tem,output,song_get,loginView,photoView) {
    var view ={
        render : function (el) {
            $(el).append(tem);
            this.init();
        },
        init : function () {
            var that = this;
            that.loading();
            that.loadUser(photoView);
            that.loadLogin(loginView);

        },
        loadUser : function (photoView) {
            $.ajax({ // 加载photo模块详情
                method:'post',
                url:'detail/getAllDetail',
                async:true,
                data:{},
                dataType:'json',
                success:function (result) {
                    if (result.resultCode == 1){
                        for (var i=0;i<result.resultObject.list.length;i++){
                            photoView.render('#homeBody',result.resultObject.list[i]);
                            // (function (i) {
                            //     require(['photome/photo/views/photoView.js'],function (photoView) {
                            //         var userDetail = result.resultObject.list[i];
                            //         photoView.render('#homeBody',userDetail);
                            //     });
                            // })(i);

                        }
                        if (result.resultObject.list.length == 0) $('.loading').hide();
                    }else alert("加载用户："+result.resultMsg);
                }
            });
        },
        // 加载导航栏
        loadLogin : function (loginView) {
            loginView.render('#homeBody');
        },
        loading : function () {
            var message = '<div class="loading"><h3 class="message">正 在 加 载 中 . . .</h3></div>';
            $('#home').append(message);
        }

    };
    return view;
});