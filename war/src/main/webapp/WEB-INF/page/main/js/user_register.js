;(function (window, $) {

    function _initHtml() {

    }

    function _bindEvent() {

        /*注册*/
        $("#register").click(function () {
            var form = _getElements("#form2")
            /*console.log(form)*/
             _ajaxData(form);
        })

        /*重置*/
        $("#reset").click(function () {
            _reset("#form2");
        })
    }

    function _getElements(formId) {
        var form = {};
        var t = $(formId).serializeArray();
        $.each(t, function () {
            form[this.name] = this.value;
        });
        form = JSON.stringify(form);
        return form;
    }



    function _reset(from) {
        $(':input',from)
            .not(':button,:submit,:reset,:hidden')
            .val('')
            .removeAttr('checked')
            .removeAttr('selected');
    }





    function _ajaxData(form) {
        $.ajax({
            url : '${request.contextPath}/tuser/register',
            type : 'post',
            contentType : 'application/json;charset=UTF-8',
            data : form,
            dataType : 'json',
            success : function(data) {
                // 成功
                if (data.updatebyid == 1) {
                    window.location.href='${request.contextPath}/tuser/welcome';
                } else {
                    alert("注册失败")
                }
            }
        });
    }


    function init() {
        _initHtml();
        _bindEvent();
    }

    // 供别人调用，需要导出的方法
    var Util = {
        reset : _reset
    }

    $(function () {
        init();
        window.Util = Util;
    })



})(window, $);