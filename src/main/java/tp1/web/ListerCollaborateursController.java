package tp1.web;


import javax.servlet.http.*;
import java.io.IOException;

public class ListerCollaborateursController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse rep) throws IOException {

        String avecPhotoParam = req.getParameter("avecPhoto");

        String departementParam = req.getParameter("departement");

        rep.setContentType("text/html");

        rep.getWriter().print("<h1>Liste des collaborateurs</h1>"
        + "<ul>"
        + "<li>avecPhoto = " + avecPhotoParam + "</li>"
        + "<li>departement = " + departementParam + "</li>"
        +"</ul>");
    }
}