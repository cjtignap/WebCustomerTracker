<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <title> Customer List</title>
</head>
<body>

    <div id="wrapper">
        <div id="header" >
            <h2> Customer Relationship Management</h2>
        </div>
        <div id="container" >
            <div id="content">
                <table>
                    <tr>
                        <th>FirstName</th>
                        <th>LastName</th>
                        <th>Email</th>
                    </tr>

                    <c:forEach var="tempCustomer" items="${customers}" >
                        <tr>
                            <td>${tempCustomer.firstName}</td>
                            <td>${tempCustomer.lastName}</td>
                            <td>${tempCustomer.email}</td>
                        </tr>
                    </c:forEach>

                </table>
            </div>
        </div>
    </div>
</body>
</html>