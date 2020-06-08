<%--
  Created by IntelliJ IDEA.
  User: yuanjingshen
  Date: 2020/6/4
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>deserialize</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">

    <script type="application/javascript" src="${pageContext.request.contextPath}/js/jquery1.8.3.js"></script>
    <script type="text/javascript">

        $(function () {
            listFolder();
        });

        function listFolder() {
            $.post("<%=request.getContextPath()%>/browser/deserializeList", function (resp) {
                $("div").empty();
                for (i = 0; i < resp.length; i++) {
                    $("div").append("<p><input type='checkbox' name='folderName' value='" + resp[i] + "' />" + resp[i] +"</p>");
                }
                $("div").append("<button type='button' name='commitBtn' onclick='startDeserialize()'>开始反序列化</button>");
                $("div").append("<p><a href='<%=request.getContextPath()%>/browser/portal?path=/tmp/megrez/loan/'>跳转到文件下载页</p>");
            });
        }

        function startDeserialize() {
            $("button[name='commitBtn']").attr('disabled',"true")

            var chklist = ''
            var checkboxs = document.getElementsByName("folderName")
            for (let i = 0; i < checkboxs.length; ++i){
                if (checkboxs[i].checked) {
                    chklist = chklist+","+checkboxs[i].value
                }
            }

            $.post("<%=request.getContextPath()%>/browser/startDeserialize", {"chklist": chklist}, function (resp) {
            }).success(function() { alert("反序列化成功，请到文件浏览页面下载"); })
              .error(function() { alert("反序列化失败，请查看后台日志"); })
              .complete(function() { $("button[name='commitBtn']").removeAttr("disabled"); });
        }
    </script>
</head>
<body>
    <p><font size="3" face="arial" color="purple">请选择要进行序列化的文件夹:</font></p>
    <div style="color:#0101DF">
    </div>
</body>
</html>
