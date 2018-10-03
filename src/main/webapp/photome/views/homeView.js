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
                        photoView.render('#homeBody',result.list[i]);
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