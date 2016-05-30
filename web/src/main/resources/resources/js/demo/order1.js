sendActivity = function (id) {
    var str = "";
    $.ajax({
        type: 'GET',
        contentType: 'application/json',
        url: ctxPath + "/activity/sendactivity/" + id,
        success: function (data) {
            if (data != null) {
                alert("发送成功");
            }
        },
        error: function (data) {
            alert("发送失败");
        }
    });
}

jQuery(function () {
    var options = {
        caption: "订单信息",
        colNames: ['订单序号', '订单名称', '创建者', '创建时间', '修改者', '修改时间', '归档标记', '租户信息'],
        colModel: [

            {name: 'orderId', index: 'orderId', autowidth: true, sorttype: "string", editable: true},
            {
                name: 'name',
                index: 'name',
                autowidth: true,
                editable: true,
                editoptions: {size: "20", maxlength: "50"}
            },

            {name: 'recCreator', index: 'recCreator', editable: false, width: 80, fixed: true},
            {name: 'recCreateTime', index: 'recCreateTime', editable: false, width: 130, fixed: true},
            {name: 'recRevisor', index: 'recRevisor', editable: false, width: 80, fixed: true},
            {name: 'recReviseTime', index: 'recReviseTime', editable: false, width: 130, fixed: true},
            {name: 'recFlag', index: 'recFlag', editable: false, width: 130, fixed: true},
            {name: 'tenantId', index: 'tenantId', editable: false, width: 130, fixed: true}
        ],
        prmNames: {
            id: "_id"
        },
        jsonReader: {repeatitems: false ,id: "orderId"},
            query: {
            url: ctxPath + "/queryPager",
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            type: "GET"
        },
        edit: {
            url: ctxPath + "/order/updateOneRow",
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            type: "POST",
            data:{_csrf_header:
                $("meta[name='_csrf_header']").attr("content"),
                _csrf: $("meta[name='_csrf']").attr("content")}
        },
        add: {
            url: ctxPath + "/order/addOneRow",
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            type: "POST"
        },
        del: {
            url: ctxPath + "/order/delOneRow",
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            type: "POST"
        },
        multi_del: {
            url: ctxPath + "/order/delMultiRow",
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            type: "POST"
        }
    };

    xplat.grid.init(options);
});