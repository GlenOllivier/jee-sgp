package sgp.web;


import sgp.util.Constantes;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Arrays;

public class ListerCollaborateursController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        req.setAttribute("listeCollaborateurs", Constantes.COLLAB_SERVICE.listCollaborateurs());
        req.setAttribute("listeDepartements", Constantes.DEP_SERVICE.listDepartements());

        req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
    }
}