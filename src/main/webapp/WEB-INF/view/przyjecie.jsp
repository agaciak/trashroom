<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<body>
<h2>
<form:form method="POST" action="/przyjecie" modelAttribute="towar">
    <table>
        <tr>
            <td><form:label path="nameProduct">Nazwa Towaru</form:label></td>
            <td><form:input path="nameProduct"/></td>
        </tr>
        <tr>
            <td><form:label path="quantity">Ilość</form:label></td>
            <td><form:input path="quantity"/></td>
        </tr>
        <tr>
            <td><form:label path="timeUse">Data dostawy</form:label></td>
            <td><form:input path="timeUse"/></td>
        </tr>
        <tr>
            <td><form:label path="nameDistributor">Nazwa Producenta</form:label></td>
            <td><form:input path="nameDistributor"/></td>
        </tr>

        <tr>
            <td><input type="submit" value="Add"/></td>
        </tr>
    </table>
</form:form>
</h2>

</body>
</html>