<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>

<h2>test
    <br>


    <br>
    <form action="?" method="get"> <!- miejsce wyszukiwania towaru ->
        Wpisz nazwę towaru: <input type="text" name="name">
        <input type="submit" value="wyszukaj"><br>

    </form>
    <form action=${pageContext.request.contextPath}"/przyjecie.jsp" method="post"> <!- dodawanie towaru do listy magazynowej ->
        <input type="submit" value="Dodaj lub pobierz Towar"><br>

    </form>
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