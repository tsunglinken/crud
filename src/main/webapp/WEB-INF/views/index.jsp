<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="/crud" />
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
        function showMessage(message) {
            //跳出提示視窗並顯示文字
            if(message) {
                alert(message);
            }else{
                alert("請輸入欲顯示文字，你尚未輸入文字");
            }
        }

    </script>
</head>
<body>
    <h1>WELCOME TO SPRING BOOT TUTORIAL</h1>

    目錄選單:
    <ul>
        <li>
            <a href="${contextPath}/employee/queryEmployeeHome">員工清單 - 查詢首頁</a>
        </li>
    </ul>

    <%--利用EL(JSP表達語言)取得後端(controller ModelAndView.addObject 中指定的屬性值--%>
    <h2>${message}</h2>

    輸入文字: <input type="text" id="word" name="word" value="" />
    <button onclick="showMessage(word.value);">按我顯示文字</button>
</body>
</html>