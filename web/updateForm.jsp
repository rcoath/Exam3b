<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Customers"%>
<% Customers cust = (Customers) request.getAttribute("cust");%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Customer</title>
        <link href="style.css" rel="stylesheet" type="text/css" >
    </head>
    <body>
            
            <%@include file="includes/search.jsp" %>  

            <%@include file="includes/header.jsp" %>  
            
            <%@include file="includes/menu.jsp" %>  

                <p>
                <form name ="updateForm" action ="updateCustomer" method="get">
                 
                        <h1>Update Customer</h1>
                        <label class="field">Customer ID:</label>
                        <input type="text" name="id" value="<%= cust.getCustID()%>" readonly/>
                        <br>
                        <label class="field">First Name:</label>
                        <input type="text" name="fName" value="<%= cust.getFirstName()%>"/>
                        <br>
                        <label class="field">Last Name:</label>
                        <input type="text" name="lName" value="<%= cust.getLastName()%>" />
                        <br>
                        <label class="field">Address1:</label>
                        <input type="text" name="addr1" value="<%= cust.getAddrress1()%>" />
                        <br>
                        <label class="field">Address2:</label>
                        <input type="text" name="addr2" value="<%= cust.getAddress2()%>" />
                        <br>
                        <label class="field">City:</label>
                        <input type="text" name="city" value="<%= cust.getCity()%>" />
                        <br>
                        <label class="field">State:</label>
                        <input type="text" name="state" value="<%= cust.getState()%>" />
                        <br>
                        <label class="field">Zip:</label>
                        <input type="text" name="zip" value="<%= cust.getZip()%>" />
                        <br>
                        <label class="field">Email Address:</label>
                        <input type="text" name="email" value="<%= cust.getEmail()%>" />
                        <br>
                        <label class="field">Age</label>
                        <input type="text" name="age" value="<%= cust.getAge()%>" />
                        <br>
                        <div class="center">
                            
                            <input type="submit" name="Submit" value="Update" />

                        </div>
                 
                </form>
                </p>

            </div>
            <%@include file="include/footer.jsp" %><!--Footer-->

        </div> 
    </body>
</html>