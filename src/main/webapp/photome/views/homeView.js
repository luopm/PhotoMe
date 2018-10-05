define(['text!../templates/home.html',
        'lib/plugin/output.js',
        'lib/kugouAPI/song_get.js',
        '../photo/views/photoView.js',
        '../login/views/loginView.js',
        'css!../style/homeStyle.css'],
    function (tem,output,song_get,photoView,loginView) {
    var view ={
        render : function (el) {
            $(el).append(tem);
            this.init();
        },
        init : function () {
            var that = this;
            that.loadUser(photoView);
            that.loadLogin(loginView);

        },
        loadUser : function (photoView) {
            $.ajax({ //加载用户详情
                method:'get',
                url:'../user/getAllUser',
                async:true,
                data:{},
                dataType:'json',
                success:function (result) {
                    for (var i=0;i<result.list.length;i++){
                        (function (i) {
                            require(['photome/photo/views/photoView.js'],function (photoView) {
                                // new photoView()
                                var index = i;
                                var user = result.list[i];
                                photoView.render('#homeBody',user);
                            });
                        })(i);

                    }
                }
            });
        },
        // 加载导航栏
        loadLogin : function (loginView) {
            loginView.render('#homeBody');
        }
    };
    return view;
});