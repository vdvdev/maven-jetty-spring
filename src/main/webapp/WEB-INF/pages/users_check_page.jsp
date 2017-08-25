<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Max
  Date: 16.07.2017
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <div class="container">
        <div class="col-md-6">
            <br>
            <h1 style="color: darkolivegreen">Validation for user</h1>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Atque, autem commodi cum deleniti, dolorem
                earum eligendi id impedit iure natus necessitatibus placeat quia, repellat tempora veritatis? Beatae
                ducimus eaque perferendis quaerat vel? Assumenda beatae, blanditiis earum et, iste laborum, nemo
                obcaecati odit optio perferendis praesentium quo rem repellendus sapiente sed?</p>
            <br>
            <spring:form modelAttribute="userFromServer" method="post" action="/users/check">
                <spring:input path="name"/>
                <spring:input path="password"/>
                <spring:button>check user</spring:button>
            </spring:form>
        </div>

    </div>
</body>
<head>
    <title>Validation</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
</html>