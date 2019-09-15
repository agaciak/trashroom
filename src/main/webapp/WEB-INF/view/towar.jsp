<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>

<h2>test

    <c:forEach var="towar" items="${towary}">
        <tr>
            <td>${towar.description}</td>
            <td>Goal: ${towary.name_product}</td>
            <td><a href="/towar/${towar.id}">Lista</a></td>

        </tr><br>
    </c:forEach>
</h2>


</body>
</html>