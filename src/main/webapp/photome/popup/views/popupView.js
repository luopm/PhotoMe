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
            $('.popupContainer').on('click','.popup',function () {
                return false;
            });
            $('.popupContainer').on('click',function () {
                $('.popupContainer').remove();
            });
        }
    }
    return view;
});