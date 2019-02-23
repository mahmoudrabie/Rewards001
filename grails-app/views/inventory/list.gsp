<%--
  Created by IntelliJ IDEA.
  User: mahmoudrabie
  Date: 2019-02-23
  Time: 16:59
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>List Products</title>
</head>

<body>
    <table border="1">
        <g:each in="${listOfAllProducts}" var="aProduct">
            <tr>
                <td>
                    ${aProduct.name}
                </td>
                <td>
                    ${aProduct.price}
                </td>
                <td>
                    ${aProduct.sku}
                </td>
            </tr>
        </g:each>
    </table>
</body>
</html>