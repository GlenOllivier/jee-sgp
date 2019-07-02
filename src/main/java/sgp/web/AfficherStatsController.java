package sgp.web;

import sgp.util.Constantes;
import sgp.util.VisiteWebStatistic;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AfficherStatsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("stats", VisiteWebStatistic.getStats(Constantes.WEB_SERVICE.listVisitesWeb()));

        req.getRequestDispatcher("/WEB-INF/views/stats/afficherStats.jsp").forward(req, resp);
    }
}
