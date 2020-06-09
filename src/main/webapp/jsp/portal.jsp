<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>browser</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">

    <script type="application/javascript" src="${pageContext.request.contextPath}/js/jquery1.8.3.js"></script>

    <style type="text/css">


        li div {
            float: left;
            width: 200px;
            height: 30px;
            line-height: 30px;
        }

        li div.size {
            float: left;
            width: 200px;
            clear: right;
            height: 30px;
            line-height: 30px;
        }

        li div.fname {
            float: left;
            width: 600px;
            clear: left;
            color: blue;
            cursor: pointer;
        }

        li div.header {
            color: black !important;
            cursor: default !important;
            font-weight: bold;
        }

    </style>
    <script type="text/javascript">

        $(function () {
            browse("/");
        });

        // 浏览文件
        function browse(path) {
            $.post("<%=request.getContextPath()%>/browser/browse", {"path": "${path}"}, function (data) {
                $("ul").empty();
                $("ul").append("<li>" + "<div class='header fname' style='width:160px'>当前路径</div><div class='header' style='width:800px'>" + data[0].currentDir + "</div>" + "</li>");
                $("ul").append("<li>" + "<div class='header fname'>文件名</div><div class='header'>文件大小</div><div class='header'>创建日期</div>" + "</li>");

                $("ul").append("<li directory='true' path='" + data[0].parent
                    + "'><div class='fname target' title='" + data[0].parent + "'>" + data[0].fileName
                    + "</div><div></div></li>");

                for (i = 1; i < data.length; i++) {
                    $("ul").append("<li directory='" + data[i].directory + "' path='" + data[i].fullPath
                        + "'><div class='fname target' title='" + data[i].fullPath + "'>" + data[i].fileName
                        + "</div><div class='size'>" + data[i].size + "</div><div>" + data[i].created + "</div></li>");
                }
                $("ul li").each(function () {
                    $(this).css("list-style", "none");
                });

                $(".target").each(function(){

                    $(this).click(function () {
                        dir = $(this).parent("li").attr("directory");
                        if ("true" == dir) {
                            path = $(this).parent("li").attr("path");
                            if (!(path.substr(path.length - 1) == "/")) {
                                path = path + "/";
                            }
                            window.open("<%=request.getContextPath()%>/browser/portal?path=" + path, "_self");
                        } else {
                            window.open("<%=request.getContextPath()%>/browser/download?file=" + $(this).attr("title"));
                        }
                    });

                });

            });
        }


    </script>

</head>
<body>
    <ul></ul>

</body>
</html>