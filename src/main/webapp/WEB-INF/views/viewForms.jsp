<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
   <%@page isELIgnored="false" %>
    <%@include file="./base.jsp"%>
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center">Form Data</h2>
        <table class="table table-bordered">
            <thead>
                <tr>
                    
                    <th>Name</th>
                    <th>Email</th>
                    <th>Mobile No</th>
                    
                </tr>
            </thead>
            <tbody>
                <c:forEach var="form" items="${forms}">
                    <tr>
                        
                        <td>${form.name}</td>
                        <td>${form.email}</td>
                        <td>${form.primaryNo} , ${form.alternativeNo}</td>
                     
                        
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
