<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="ko">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Hello World</title>
    </head>
    <body>
        <h2>Hello World</h2>
        <hr>
        현재 날짜와 시간은 <%=java.time.LocalDateTime.now()%>입니다.
        <hr>
        메시지: ${msg}
    </body>
</html>