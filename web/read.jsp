
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customers</title>
        <link href="style.css" rel="stylesheet" type="text/css" >
    </head>

    <% String table = (String) request.getAttribute("table");%>

    <body>
        <div class="wrap">
           
            <%@ include file="include/search.jsp" %>
            
            <%@include file="include/header.jsp" %>  
            
            <%@include file="include/menu.jsp" %>  

            <div class="main">
                <h1>Customers</h1>
                <%= table%>
                <br>
                <br>
                <a href ="add.jsp">Add a new Customer</a>
                <br> <br>
                


            </div>
                
            <%@include file="include/footer.jsp" %>
        </div> 
    </body>
</html>