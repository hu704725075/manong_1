<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/12/26
  Time: 0:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上屏分类</title>
</head>
<body>
    <ul id="productCategory" class="easyui-tree"></ul>
<script type="application/javascript">
    $(function(){
        $('#productCategory').tree({
            url: "product_category/list"
        })
    })
</script>
</body>
</html>
