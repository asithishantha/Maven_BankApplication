<%--
  Created by IntelliJ IDEA.
  User: asith
  Date: 2020-08-28
  Time: 11.38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>

    body {
        background-image: url('back.jpg');
        text-align: center;

    }

    input{
        width: 50%;
    }
    input[type=text], select {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    input[type=submit] {
        width: 100%;
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    input[type=submit]:hover {
        background-color: #45a049;
    }

    div {
        border-radius: 5px;
        background-color: darkgreen;
        padding: 20px;
    }
</style>



<body>

<div>
<%--    login form to get inputs from users--%>
    <form name="loginForm" method="post" action="/webappasith_war/LoginServlet">  <%--  action link to loginservlet page--%>
        <label for="userName">Username</label>
        <input type="text" id="userName" name="userName" placeholder="Your Username..">

        <label for="accountNumber">AccountNumber</label>
        <input type="text" id="accountNumber" name="accountNumber" placeholder="Your AccountNumber..">

        <label for="bankAmount"> BankAmount</label>
        <input type="text" id="bankAmount" name="bankAmount" placeholder="Your BankAmount..">

        <input type="submit" value="Login" />
    </form>

</div>
</body>
</html>
