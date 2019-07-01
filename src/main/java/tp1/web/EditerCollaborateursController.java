package tp1.web;

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

        if(matricule == null) {
            rep.setStatus(400);
            rep.getWriter().print("<p>Erreur : un matricule est attendu.</p>");
        } else {
            rep.getWriter().print("<h1>Edition de collaborateur</h1>"
            + "Matricule : " + matricule);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {

        String matricule = req.getHeader("matricule");
        String titre = req.getHeader("titre");
        String nom = req.getHeader("nom");
        String prenom = req.getHeader("prenom");


        if(matricule == null || titre == null || nom == null || prenom == null) {
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
