<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="../head.jsp" %>

<section class="container-fluid">

  <div class="container-fluid mb-4">
    <h1 class="display-4">Statistiques</h1>
  </div>
  <div class="container-fluid mb-4">
    <table class="table table-striped">
      <thead>
      <tr>
        <th scope="col">Chemin</th>
        <th scope="col">Nombre de visites</th>
        <th scope="col">Min (ms)</th>
        <th scope="col">Max (ms)</th>
        <th scope="col">Moyenne (ms)</th>
      </tr>
      </thead>
      <tbody>
      <c:forEach items="${stats}" var="s">
      <tr>
        <th scope="row"><c:out value="${s.chemin}"/> </th>
        <td><c:out value="${s.nbVisite}"/></td>
        <td><c:out value="${s.min}"/></td>
        <td><c:out value="${s.max}"/></td>
        <td><c:out value="${s.moyenne}"/></td>
      </tr>
      </c:forEach>

      </tbody>
    </table>
  </div>
</section>

<%@ include file="../foot.jsp" %>