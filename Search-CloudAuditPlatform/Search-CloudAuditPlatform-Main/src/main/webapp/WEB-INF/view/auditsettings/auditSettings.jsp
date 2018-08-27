<%@page language="java" pageEncoding="UTF-8" %>
<%@include file="/WEB-INF/layout/taglib/head.jsp" %>
<!doctype html>
<html>
<head>
    <title>审计设置</title>
    <link rel="stylesheet" type="text/css" href="${CSS}/demo/demo.css?${V}"/>
    <meta name='description' content='审计设置'>
    <style type="text/css">
        table tr td label {
            float: right;
        }

        table tr td {
            padding-top: 10px;
        }
    </style>
    <script type="text/javascript">
        var usertype = '${usertype}';
    </script>
</head>
<body>
<form id="setting">
    <div id="sid" class="search-texthide"></div>
    <table class="around_list" style="margin:0 auto; margin-top:20px;">
        <c:if test="${usertype == 1}">
            <tr>
                <td>
                    <label>机构：</label>
                </td>
                <td>
                    <div id="sorgid" class="search-treeselect" idField="id" parentField="pid" textField="text" rules="required" onvaluechanged="sorgidchange" width="200" height="30"></div>
                </td>
            </tr>
        </c:if>
        <tr>
            <td>
                <label>概算总投资区分线：</label>
            </td>
            <td>
                <div id="idividingline" class="search-textbox" rules="required,twofloat" rules="required" width="200" height="30"></div>
            </td>
        </tr>
        <tr>
            <td colspan="4" style="text-align:center; padding-top:5px;">
                <input class="org-save" type="button" onclick="saveData()" value="保存"/>
            </td>
        </tr>
    </table>
</form>
<script type="text/javascript" src="${JS}/auditsettings/auditSettings.js"></script>
</body>
</html>