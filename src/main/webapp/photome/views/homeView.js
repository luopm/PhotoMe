define(['text!../templates/home.html',
        'lib/plugin/output.js',
        'lib/kugouAPI/song_get.js',
        '../login/views/loginView.js',
        'css!../style/homeStyle.css'],
    function (tem,output,song_get,loginView) {
    var view ={
        render : function (el) {
            $(el).append(tem);
            this.init();
        },
        init : function () {
            var that = this;
            that.loadUser();
            that.loadLogin(loginView);

        },
        loadUser : function () {
            $.ajax({ // 加载photo模块详情
                method:'post',
                url:'../detail/getAllDetail',
                async:true,
                data:{},
                dataType:'json',
                success:function (result) {
                    if (result.resultCode == 1){
                        for (var i=0;i<result.resultObject.list.length;i++){
                            (function (i) {
                                require(['photome/photo/views/photoView.js'],function (photoView) {
                                    var userDetail = result.resultObject.list[i];
                                    photoView.render('#homeBody',userDetail);
                                });
                            })(i);

                        }
                    }else alert("加载用户："+result.resultMsg);
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