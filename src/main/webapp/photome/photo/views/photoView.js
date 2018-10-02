define(['text!../templates/photo.html','css!../style/photo.css'],
    function (tem) {
    var view ={
        conCount : $('.photoContainer').length + 1,
        render : function (el,user) {
            // 初始化模板
            this.initClassName(tem);
            // 挂载模板
            $(el).append(tem);
            // 初始化数据
            this.init();
        },
        initClassName : function (tem) {
            var that = this;
            tem.replace('\"photoContainer\"','\"photoContainer photoContainer\"'+ that.conCount);
            tem.replace('\"imgInfo\"','\"imgInfo imgInfo\"'+ that.conCount);
            tem.replace('\"photo\"','\"photo photo\"'+ that.conCount);
            tem.replace('\"music\"','\"music music\"'+ that.conCount);
            tem.replace('\"comment\"','\"comment comment\"'+ that.conCount);
        },
        loadMusic: function (user,selector) {
            var userMusic = {};
            userMusic.photomeUsermusicMusicuser = user.photomeUserUsername;
            $.ajax({
                method:'get',
                url:'../music/getMusic',
                async:true,
                data:userMusic,
                dataType:'json',
                success:function (result) {
                    // output.output(JSON.stringify(result.list),150,'.input-group');
                }
            })
        },
        loadComment : function (user) {

        },
        init : function () {
            var that = this;
            $("#home .modal-body").append(
                '<div class="input-group">' +
                '    <input type="text" class="form-control" id="input" placeholder="Recipient\'s username" aria-describedby="basic-addon2">' +
                '    <span class="input-group-addon" id="basic-addon2">OK</span>' +
                '</div>' );
            $("#basic-addon2").click(function () {
                // $.ajax({
                //     method:'post',
                //     url:'../user/all',
                //     async:true,
                //     data:{},
                //     dataType:'json',
                //     success:function (result) {
                //         output.output(JSON.stringify(result.list),150,'.input-group');
                //     }
                // })
                song_get.song_search($("#input").val(),'.musicList');
            })
            
            // $(".musicList li").click(function () {
            //
            // })
        }
    }

    return view;
});