<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<body>

<h2>test
    <br>
    <br>

    <a href="/przyjecie">Dodaj lub pobierz Towar</a>


    <br>
    <br>
    <c:forEach var="towar" items="${towary}"> <!- To odpowiada za wyświetlanie listy towarów ->

        <table summary="Produkty Magazynu" id="tabela">

            <tbody>
            <tr>

                <td>${towar.nameProduct}</td>
                <td>${towar.quantity}</td>
                <td>${towar.timeUse}</td>
                <td>${towar.nameDistributor}</td>

                <td><a href="/towar/${towar.id}">Statystyka</a></td>

            </tr>
            </tbody>
        </table>

    </c:forEach>
</h2>


</body>
</html>