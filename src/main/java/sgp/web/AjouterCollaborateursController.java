package sgp.web;

import sgp.entity.Collaborateur;
import sgp.util.Constantes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class AjouterCollaborateursController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/views/collab/nouveauCollaborateur.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String lastName = req.getParameter("last-name");
        String firstName = req.getParameter("first-name");
        LocalDate birthDate;
        try {
            birthDate = LocalDate.parse(req.getParameter("birth-date"));
        } catch (DateTimeParseException e) {
            birthDate = null;
        }
        String address = req.getParameter("address");
        String securityNumber = req.getParameter("security-number");

        if (lastName == null || "".equals(lastName) ||
                firstName == null || "".equals(firstName) ||
                birthDate == null || "".equals(birthDate) ||
                address == null || "".equals(address) ||
                securityNumber == null || "".equals(securityNumber)) {

            resp.setStatus(400);
            req.getRequestDispatcher("/WEB-INF/views/collab/nouveauCollaborateur.jsp").forward(req, resp);
        } else {
            Collaborateur c = new Collaborateur();
            c.setAddress(address);
            c.setBirthDate(birthDate);
            c.setFirstName(firstName);
            c.setLastName(lastName);
            c.setSecurityNumber(securityNumber);
            Constantes.COLLAB_SERVICE.sauvegarderCollaborateur(c);

            resp.sendRedirect(req.getContextPath() + "/collaborateurs/lister");
        }
    }
}
