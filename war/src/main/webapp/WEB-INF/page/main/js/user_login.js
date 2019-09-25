;(function (window, $) {

    function _initHtml() {

    }

    function _bindEvent() {

        /*登陆*/
        $("#login").click(function () {
            var form = _getElements("#form1");
            _ajaxData(form);
        })

        /*注册*/
        $("#register").click(function () {
            window.location.href='${request.contextPath}/tuser/jump/registry';
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


    /*ajax请求*/
    function _ajaxData(form) {
        $.ajax({
            url : '${request.contextPath}/tuser/login',
            type : 'post',
            contentType : 'application/json;charset=UTF-8',
            data : form,
            dataType : 'json',
            success : function(data) {
                // 成功
                if (data.code == "0") {

                } else {

                }
            }
        });
    }

    function init() {
        _initHtml();
        _bindEvent();
    }

    var Util = {
        _getElements: _getElements
    }

    $(function () {
        init();
        // 供别人调用，需要导出的方法
        window.Util = Util;
    })





})(window, $);