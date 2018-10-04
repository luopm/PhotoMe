define(['text!../templates/popup.html',
        'lib/kugouAPI/song_get.js',
        ,'css!../style/popup.css'],
    function (tem,kugou) {
    var view ={
        render : function () {
            var that = this;
            // 挂载模板
            $('body').append(tem);
            that.init();
        },
        init : function () {
            var that = this;
            $('.popupHeader').append('<div class="inputDiv"><label class="icon-music">' +
                '<input class="musicSearchInput"></label>' +
                '<input class="musicSearchBtn" type="button" value="Search"></div>');
            that.initEvent();

            // $.ajax({
            //     method:'post',
            //     url:'../user/addUser',
            //     async:true,
            //     data:formData,
            //     dataType:'json',
            //     success:function (result) {
            //         // 根据userName加载用户详情
            //         var userName = result[0].photomeUserUsername;
            //         that.loadUserDatil(userName);
            //         $('.login .registerPage').hide();
            //         $('.login .userDetailPage').show();
            //     },
            //     error:function (e) {}
            // })
        },
        initEvent : function () {
            // search按钮事件
            $('.popup').on('click','.musicSearchBtn',function () {
                var keyword = $('.musicSearchInput').val();
                if (keyword != ''){
                    kugou.song_search(keyword,'.popupBody');
                }
            })
            // esc事件
            $(document).keyup(function(event){
                switch(event.keyCode) {
                    case 27:
                       $('.popupContainer').remove();
                }
            });
        }
    }
    return view;
});