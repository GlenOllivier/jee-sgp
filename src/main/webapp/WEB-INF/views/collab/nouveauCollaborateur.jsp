<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="../head.jsp" %>


<section class="container-fluid">

    <div class="container-fluid mb-4">
      <h1 class="display-4">Nouveau Collaborateur</h1>
    </div>
    <div class="container mb-4">

      <form action="<c:url value="/collaborateurs/ajouter"/>" method="post">
        <div class="form-group row">
          <label for="last-name" class="col-sm-3 col-form-label text-right">Nom : </label>
          <div class="col-sm-9">
            <input type="text" class="form-control" id="last-name" name="last-name" placeholder="Nom..." required="required">
          </div>
        </div>

        <div class="form-group row">
          <label for="first-name" class="col-sm-3 col-form-label text-right">Prénom : </label>
          <div class="col-sm-9">
            <input type="text" class="form-control" id="first-name" name="first-name" placeholder="Prenom..." required="required">
          </div>
        </div>

        <div class="form-group row">
          <label for="birth-date" class="col-sm-3 col-form-label text-right">Date de naissance : </label>
          <div class="col-sm-9">
            <input type="date" class="form-control" id="birth-date" name="birth-date" required="required">
          </div>
        </div>

        <div class="form-group row">
          <label for="address" class="col-sm-3 col-form-label text-right">Adresse : </label>
          <div class="col-sm-9">
            <textarea class="form-control" id="address" name="address" required="required" ></textarea>
          </div>
        </div>

        <div class="form-group row">
          <label for="security-number" class="col-sm-3 col-form-label text-right">Numéro de sécurité sociale</label>
          <div class="col-sm-9">
            <input type="" class="form-control" id="security-number" name="security-number" placeholder="" required="required">
          </div>
        </div>

        <div class="form-group row">
          <div class="offset-sm-3 col-sm-9">
            <input type="submit" class="btn btn-dark" name="submit" value="Créer">
          </div>
        </div>

      </form>

    </div>
  </section>


<%@ include file="../foot.jsp" %>