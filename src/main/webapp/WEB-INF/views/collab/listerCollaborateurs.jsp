<%@ page import="java.util.List" %>
<%@ page import="sgp.entity.Collaborateur" %>

<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="../head.jsp" %>


<section class="container-fluid">
    <div class="container-fluid mt-4">
      <div class="text-right">
        <a href="<c:url value="/collaborateurs/ajouter"/>" class="btn btn-outline-dark">Ajouter un nouveau collaborateur</a>
      </div>
    </div>

    <!-- Search form -->

    <div class="container-fluid mb-4">
      <h1 class="display-4">Les collaborateurs</h1>

      <form>

        <div class="form-group row">
          <label class="col-sm-4 col-form-label text-right" for="recherche">Recherche un nom ou un prénom qui commence par :</label>
          <input type="search" class="form-control col-sm-2" name="recherche" placeholder="Recherche"/>
          <div class="col-sm-2">
            <input type="submit" class="btn btn-dark" id="recherche" name="rechercher" value="Rechercher" />
          </div>
          <div class="form-check col-sm-4">
            <input type="checkbox" class="form-check-input" id="checkbox" name="checkbox">
            <label class="form-check-label" for="checkbox">Voir les collaborateurs désactivés</label>
          </div>
        </div>

        <div class="form-group row">
          <label class="col-sm-4 col-form-label text-right" for="departement">Filtrer par département :</label>
          <select class="form-control col-sm-2" name="departement" id="departement">
            <option selected="selected">Tous</option>
            <c:forEach items="${listeDepartements}" var="d">
              <option><c:out value="${d.name}"/></option>
            </c:forEach>
          </select>
        </div>

      </form>

    </div>

    <!-- Cards -->

    <div class="container-fluid mb-4">
      <div class="row">

        <c:forEach items="${listeCollaborateurs}" var="c">
        <div class="col-md-12 col-lg-6 col-xl-4">
          <div class="card mb-4 shadow-sm">
            <div class="card-header"><c:out value="${c.firstName}"/> <c:out value="${c.lastName}"/></div>
            <div class="card-body text-dark">
              <div class="row">
                <div class="col-sm-4 mb-2">
                  <img src="<c:url value="/images/keanu.png"/>" alt="keanu" class="img-fluid shadow-sm">
                </div>
                <div class="col-sm-8">
                  <dl class="row">
                    <dt class="col-sm-5">Fonction</dt>
                    <dd class="col-sm-7"><c:out value="${c.intitulePoste}"/></dd>
                    <dt class="col-sm-5">Département</dt>
                    <dd class="col-sm-7"><c:out value="${c.departement}"/></dd>
                    <dt class="col-sm-5">Email</dt>
                    <dd class="col-sm-7"><c:out value="${c.proEmail}"/></dd>
                    <dt class="col-sm-5">Téléphone</dt>
                    <dd class="col-sm-7"><c:out value="${c.phoneNumber}"/></dd>
                  </dl>
                  <a href="#" class="btn btn-dark text-right"> Modifier </a>
                </div>
              </div>
            </div>
          </div>
        </div>

        </c:forEach>

      </div>
    </div>
  </section>


  <%@ include file="../foot.jsp"%>