define(['text!../templates/home.html','lib/plugin/output.js','lib/kugouAPI/song_get.js','css!../style/homeStyle.css'],
    function (tem,output,song_get) {
    var view ={
        render : function (el,user) {
            $(el).append(tem);
            this.init();
            console.log("type: "+typeof tem+" tem: "+ tem);

        },
        loadMusic: function (user,selector) {

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