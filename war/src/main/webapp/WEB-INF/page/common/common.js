;(function (window,$) {

    /**
     * 获取表单格式化为json
     * @param formId
     */
    function _getElements(formId) {
        var form = {};
        var t = $(formId).serializeArray();
        $.each(t, function () {
            form[this.name] = this.value;
        });
        form = JSON.stringify(form);
        return form;
    }

    // 供别人调用，需要导出的方法
    window.Util = {
        getElements: _getElements
    };

})(window,$);