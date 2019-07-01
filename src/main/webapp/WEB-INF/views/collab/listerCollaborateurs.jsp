<%@ page import="java.util.List" %>
<%@ page language="java" pageEncoding="utf-8" %>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8"/>
        <title>SGP - App</title>
    </head>
    <body>
        <h1> Les collaborateurs</h1>
        <ul>
            <%
            List<String> listeNoms = (List<String>)request.getAttribute("listeNoms");
            for(String nom : listeNoms) {
            %><li><%= nom %></li>
            <%
            }
            %>
        </ul>
    </body>
</html>