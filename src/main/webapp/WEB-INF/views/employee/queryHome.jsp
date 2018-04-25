<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="/curd" />
<html lang="en">
<head>
    <script src="/js/jquery-1.12.3.min.js"></script>

    <%--自訂js--%>
    <script type="text/javascript">
        $(function() {
            //這裡的程式在此頁面載入後會優先執行
            console.log("Hi, this is Javascript console log");
        });

        //建立所需Function的區塊


    </script>
</head>
<body>
    <h1>員工清單 - 查詢首頁</h1>
    <%--利用EL(JSP表達語言)取得後端(controller ModelAndView.addObject 中指定的屬性值--%>
    <h2>${message}</h2>


    <a href="/index">回首頁</a>
</body>
</html>