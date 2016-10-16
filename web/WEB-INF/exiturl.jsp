<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Return Page</h1>
        
        Για να επιστρέψετε στο ερωτηματολόγιο πατήστε <a href="http://localhost:8080/Ergasia2/Servlet1?qid=${sessionScope.dataBean.getID()}"> edw </a><br>
        Ή συνδεθείτε στο http://localhost:8080/Ergasia2/Servlet1?qid=${sessionScope.dataBean.getID()}   .
    </body>
</html>
