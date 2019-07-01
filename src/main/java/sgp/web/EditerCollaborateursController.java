package sgp.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditerCollaborateursController extends HttpServlet {
    @Override
    public void doGet (HttpServletRequest req, HttpServletResponse rep) throws IOException {
        String matricule = req.getParameter("matricule");

        rep.setContentType("text/html");

        if(matricule == null || "".equals(matricule)) {
            rep.setStatus(400);
            rep.getWriter().print("<p>Erreur : un matricule est attendu.</p>");
        } else {
            rep.getWriter().print("<h1>Edition de collaborateur</h1>"
            + "<p>Matricule : " + matricule + "</p>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {

        String matricule = req.getParameter("matricule");
        String titre = req.getParameter("titre");
        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");

        if(matricule == null || "".equals(matricule)
                || titre == null || "".equals(titre)
                || nom == null || "".equals(nom)
                || prenom == null || "".equals(prenom)) {
            rep.setStatus(400);
            rep.getWriter().print("Les parametres sont incorrects");
        } else {
            rep.setStatus(201);
            rep.getWriter().print("Creation de collaborateur avec les parametres suivants\n"
                    + "matricule=" + matricule
                    + ",titre=" + titre
                    + ",nom=" + nom
                    + ",prenom=" + prenom
            );
        }
    }
}
