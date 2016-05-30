<!DOCTYPE html>
<%@ page info="用户可见的信息" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta charset="utf-8"/>
    <title>欧冶平台管理系统</title>
    <meta name="description" content=""/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"/>

    <meta name="_csrf" content="${_csrf.token}" />
    <meta name="_csrf_header" content="${_csrf.headerName}" />
    <c:set var="ctx" value="${pageContext.request.contextPath}" />

    <link rel="stylesheet" href="${ctx}/assets/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="${ctx}/assets/css/font-awesome.min.css"/>

    <!-- 常用的插件的css -->
    <link rel="stylesheet" href="${ctx}/assets/css/jquery-ui.min.css"/>
    <link rel=" stylesheet" href="${ctx}/assets/plugin/css/fileinput.css"/>
    <link rel=" stylesheet" href="${ctx}/assets/css/colorbox.css"/>
    <link rel="stylesheet" href="${ctx}/assets/css/chosen.css"/>

    <link rel="stylesheet" href="${ctx}/assets/css/datepicker.css"/>
    <link rel="stylesheet" href="${ctx}/assets/css/ui.jqgrid.css"/>


    <!-- text fonts -->
    <link rel="stylesheet" href="${ctx}/assets/css/ace-fonts.css"/>

    <!-- ace styles -->
    <link rel="stylesheet" href="${ctx}/assets/css/ace.min.css"/>

    <!--[if lte IE 9]>
    <link rel="stylesheet" href="${ctx}/assets/css/ace-part2.min.css"/>
    <![endif]-->
    <link rel="stylesheet" href="${ctx}/assets/css/ace-skins.min.css"/>
    <link rel="stylesheet" href="${ctx}/assets/css/ace-rtl.min.css"/>

    <!--[if lte IE 9]>
    <link rel="stylesheet" href="${ctx}/assets/css/ace-ie.min.css"/>
    <![endif]-->

    <!-- inline styles related to this page -->
    <%--<link rel="stylesheet" href="${ctx}/assets/css/layout.css"/>--%>
    <!-- page specific plugin styles -->
    <%--<th:block layout:fragment="page-css" th:remove="tag"></th:block>--%>
</head>

<body class="no-skin">
<div id="navbar" class="navbar navbar-default">
    <div class="navbar-container" id="navbar-container">
        <button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler">
            <span class="sr-only">Toggle sidebar</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <div class="navbar-header pull-left">
            <a href="#" class="navbar-brand">
                <small>
                    <img src="${ctx}/assets/img/mnj-logo30.png"/>
                    欧冶平台管理系统
                </small>
            </a>
        </div>
        <!-- #section:basics/navbar.dropdown -->
        <div class="navbar-buttons navbar-header pull-right" role="navigation">
            <ul class="nav ace-nav">
                <li class="light-blue">
                    <a data-toggle="dropdown" href="#" class="dropdown-toggle">
                        <!--
                            <img class="nav-user-photo" src="${ctx}/assets/avatars/user.jpg" alt="Jason's Photo" />
                        -->
                            <span class="user-info">
                                <small>欢迎,</small>
                                <small id="username">匿名</small>
                            </span>
                        <i class="ace-icon fa fa-caret-down"></i>
                    </a>
                    <ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
                        <!--
                        <li>
                            <a href="#">
                                <i class="ace-icon fa fa-cog"></i>
                                设置
                            </a>
                        </li>

                        <li>
                            <a href="profile.html">
                                <i class="ace-icon fa fa-user"></i>
                                个人信息
                            </a>
                        </li>

                        <li class="divider"></li>
-->
                        <li>
                            <a>
                                <i class="ace-icon fa fa-lock"></i>
                                修改密码
                            </a>
                        </li>

                        <li class="divider"></li>

                        <li>
                            <a>
                                <i class="ace-icon fa fa-power-off"></i>
                                登出
                            </a>
                        </li>
                    </ul>
                </li>
                <!-- /section:basics/navbar.user_menu -->
            </ul>
        </div>
        <!-- /section:basics/navbar.dropdown -->
    </div>
    <!-- /.navbar-container -->
</div>
<!-- /section:basics/navbar.layout -->
<div class="main-container" id="main-container">
    <%--<div th:replace="fragments/base::sidebar"></div>--%>


    <div class="main-content">
        <div class="breadcrumbs" id="breadcrumbs">
            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="/">欧冶平台管理系统</a>
                </li>
            </ul>
            <!-- /.breadcrumb -->

        </div>

        <!-- /section:basics/content.breadcrumbs -->
        <div class="page-content">
            <div class="row">
                <div class="col-xs-12">
                    <!-- PAGE CONTENT BEGINS -->
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="row">
                                <div class="col-xs-12">
                                    <table id="grid-table"></table>
                                    <div id="grid-pager"></div>
                                </div><!-- /.col -->
                            </div><!-- /.row -->
                        </div>
                    </div>
                    <!-- PAGE CONTENT ENDS -->
                </div>
                <!-- /.col -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /.page-content -->
    </div>
    <!-- /.main-content -->

    <div class="footer">
        <div class="footer-inner">
            <!-- #section:basics/footer -->
            <div class="footer-content">
                    <span class="bigger-120">
                        <span class="blue bolder">欧冶数据</span>
                        &copy; 2015-2035
                    </span>
                &nbsp; &nbsp;
                    <span class="action-buttons">
                    </span>
            </div>
            <!-- /section:basics/footer -->
        </div>
    </div>

    <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
        <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
    </a>
</div>
<!-- /.main-container -->

<!-- basic scripts -->
<!-- ace settings handler -->
<script src="${ctx}/assets/js/ace-extra.min.js"></script>

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lte IE 8]>
<script src="${ctx}/assets/js/html5shiv.js"></script>
<script src="${ctx}/assets/js/respond.min.js"></script>
<![endif]-->

<!--[if !IE]> -->
<script type="text/javascript">
    /*<![CDATA[*/
    var jqueryUrl = /*[[@{/assets/js/jquery.min.js}]]*/ '${ctx}/assets/js/jquery.min.js';
    window.jQuery || document.write("<script src=" + jqueryUrl + ">" + "<" + "/script>");
    /*]]>*/
</script>

<!-- <![endif]-->

<!--[if IE]>
<script type="text/javascript">
    /*<![CDATA[*/
        var jquery1xUrl = /*[[@{/assets/js/jquery1x.min.js}]]*/ '${ctx}/assets/js/jquery1x.min.js';
        window.jQuery || document.write("<script src=" + jquery1xUrl + ">" + "<" + "/script>");
    /*]]>*/
    </script>
<![endif]-->

<script type="text/javascript">
    /*<![CDATA[*/
    if ('ontouchstart' in document.documentElement) {
        var jqueryMobileUrl = /*[[@{/assets/js/jquery.mobile.custom.min.js}]]*/ '${ctx}/assets/js/jquery.mobile.custom.min.js';
        document.write("<script src=" + jqueryMobileUrl + ">" + "<" + "/script>");
    }
    /*]]>*/
</script>
<script src="${ctx}/assets/js/bootstrap.min.js"></script>

<!-- layout specific plugin scripts -->
<%--<div th:include="fragments/base::layout-common-js" th:remove="tag"></div>--%>

<!-- sub layout specific plugin scripts -->
<script src="${ctx}/assets/js/uncompressed/date-time/bootstrap-datepicker.js"></script>
<script src="${ctx}/assets/js/uncompressed/jqGrid/jquery.jqGrid.js"></script>

<script src="${ctx}/assets/js/jqGrid/i18n/grid.locale-cn.js"></script>

<!-- ace scripts -->
<script src="${ctx}/assets/js/ace.min.js"></script>

<!-- xplat common scripts -->
<script src="${ctx}/js/common/xplat.common.js"></script>
<script src="${ctx}/js/common/xplat.layout.js"></script>
<script src="${ctx}/js/common/xplat.grid.js"></script>
<script src="${ctx}/js/common/xplat.ui.js"></script>
<script src="${ctx}/js/common/xplat.data.js"></script>


<script type="text/javascript">
//    var pageMeta = document.getElementsByTagName('meta')['page'];
//    if (!(pageMeta === undefined))
//        xplat.layout.initSidebarAndBreadcrumbs(pageMeta.content);

//    $.ajax({
//        type: 'GET',
//        contentType: 'application/json',
//        url: "/v/code/detail/selectcodedetailbytype/allcodes",
//        dataType: 'json',
//        async: false,
//        success: function (data) {
//            if (data != null) {
//                xplat.grid.codes = data;
//            }
//        },
//        error: function (data) {
//            alert("获取codes数据失败");
//        }
//    });
//
//    var isTimeOutAlert = false;
//    $(document).ajaxComplete(function (event, xhr, settings) {
//        if (xhr.getResponseHeader("sessionstatus") == "timeOut") {
//            if (!isTimeOutAlert) {
//                if (xhr.getResponseHeader("loginPath")) {
//                    alert("会话超时，请重新登陆!");
//                    window.location.replace(xhr.getResponseHeader("loginPath"));
//                    isTimeOutAlert = !isTimeOutAlert;
//                } else {
//                    alert("请求超时，请重新登陆 !");
//                }
//            }
//        }
//    });
</script>

<!-- page specific plugin scripts -->
<%--<div layout:fragment="page-js"></div>--%>

<!-- auto import page js -->
<script src="${ctx}/js/demo/order.js"></script>

</body>

</html>
