<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:set var="ver" value="0101" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>${title}</title>

    <style>
        ul.toolbar {
            position:	relative;
            overflow:	hidden;  required to CONTAINER 'floating li' in FF
        height:		auto;
            margin:		0;
            padding:	2px;
            width:		100%;
            list-style:	none;
            text-align: left;
            background: #D6D6D6 0 50% repeat-x;
            border-top: 1px solid #BBB;
        }
        ul.toolbar li {
            font-size: 0.9em;
            margin: 0;
            padding: 2px 7px;
            float: left;
            color: #000;
            border: 1px solid transparent;
            border-right-color: #BBB;
            cursor: pointer;
        }
        ul.toolbar li:hover {
            color: #005;
            border-top-color: #BBB;
            border-bottom-color: #BBB;
        }
        ul.toolbar li.first:hover {
            border-left-color: #BBB;
        }
        ul.toolbar li span {
            icons in toolbar
        width: 			15px;
            height:			15px;
            margin-left:	-3px;
            margin-right:	0.75ex;
            vertical-align:	middle;
            opacity:		0.6;
            filter:			alpha(opacity=60);
            display:		block;
            display:		inline-block;
        }
        ul.toolbar li:hover span {
            opacity: 1;
            filter: alpha(opacity=100);
        }
    </style>
    <link href="<c:url value='/static/css/jquery-ui.min.css?v=${ver}'/>" type="text/css" rel="stylesheet" />
    <link href="<c:url value='/static/css/layout-default-latest.css?v=${ver}'/>" type="text/css" rel="stylesheet" />
    <link href="<c:url value='/static/css/jquery.dataTables.css?v=${ver}'/>" rel="stylesheet" type="text/css" />
    <link href="<c:url value='/static/css/jquery.loadmask.css?v=${ver}'/>" type="text/css" rel="stylesheet" />
    <link href="<c:url value='/static/css/core.css?v=${ver}'/>" type="text/css" rel="stylesheet" />
    <link href="<c:url value='/static/css/coreGrid.css?v=${ver}'/>" rel="stylesheet" type="text/css" />
    <link href="<c:url value='/static/css/jquery.timepicker.addon.css?v=${ver}'/>" rel="stylesheet" type="text/css" />
    <!-- dialog JS -->
    <link href="<c:url value='/static/js/dialog/css/fDialog.css?v=${ver}'/>" rel="stylesheet" type="text/css" />

    <script type="text/javascript" src="${ctx}/static/js/core/jquery-1.11.1.min.js?v=${ver}"></script>
    <script type="text/javascript" src="${ctx}/static/js/core/jquery-ui.min.js?v=${ver}"></script>
    <script type="text/javascript" src="${ctx}/static/js/core/jquery.layout-latest.js?v=${ver}"></script>
    <script type="text/javascript" src="${ctx}/static/js/core/jquery.validate.js" ></script>
    <script type="text/javascript" src="${ctx}/static/js/core/jquery.metadata.js" ></script>
    <script type="text/javascript" src="${ctx}/static/js/core/jquery.timepicker.addon.js?v=${ver}"></script>
    <script type="text/javascript" src="${ctx}/static/js/core/jquery.json.min.js?v=${ver}"></script>
    <script type="text/javascript" src="${ctx}/static/js/core/jquery.dataTables.min.js?v=${ver}"></script>
    <script type="text/javascript" src="${ctx}/static/js/core/jquery.loadmask.min.js?v=${ver}"></script>
    <!-- dialog JS -->
    <script type="text/javascript" src="${ctx}/static/js/dialog/jquery.fDialog.min.js?v=${ver}"></script>
    <script type="text/javascript" src="${ctx}/static/js/dialog/fDialog.plugin.js?v=${ver}"></script>

    <script type="text/javascript" src="${ctx}/static/js/core/core.js?v=${ver}"></script>
    <script type="text/javascript" src="${ctx}/static/js/core/coreGrid.js?v=${ver}"></script>
    <script type="text/javascript" src="${ctx}/static/js/main.js?v=${ver}"></script>
    <script type="text/javascript" src="${ctx}/static/js/core/jquery.datepicker.localize.js?v=${ver}"></script>
    <script type="text/javascript" src="${ctx}/static/js/core/FormUtils.js?v=${ver}"></script>
    <link rel="stylesheet" href="${ctx}/static/js/breadcrumb/Styles/BreadCrumb.css" type="text/css"/>
    <script type="text/javascript" src="${ctx}/static/js/breadcrumb/js/jquery.easing.1.3.js"></script>
    <script type="text/javascript" src="${ctx}/static/js/breadcrumb/js/jquery.jBreadCrumb.1.1.js"></script>
    <script type="text/javascript" src="${ctx}/static/js/core/validateUtils.js"></script>
    <script type="text/javascript">
        Main.contextPath = '..';
        Main.language = "zh";
    </script>
    <style>
    html {
    overflow-x: hidden;
    }
    </style>
</head>
<body>
<div class="main-container">
    <div id="main-content" class="main-content;"style="overflow-y:auto;min-height: 900px;">
    </div>
</div>
<div class="main-copyright">Copyright © 2016 鲜驰达. All Rights Reserved.</div>
<div id="pdialogId"></div>
<div id="alertMessageId"></div>
<iframe name='hidden_frame' id="hidden_frame" style='display:none;'></iframe>
</body>
<script type="text/javascript">
    $(document).ready(function () {

        //$('.main-content').first().css("min-height", winHeight - 50);
        // 获取窗口高度
        var winHeight;
        if (window.innerHeight)
            winHeight = window.innerHeight;
        else if ((document.body) && (document.body.clientHeight))
            winHeight = document.body.clientHeight;
        //$('.main-content').first().height( winHeight - 50);
        $("#main-content").postUrl('${url}' , JSON.parse('${data}'),function(){$("#headBreadCrumb").hide()});
    });
</script>
</html>

