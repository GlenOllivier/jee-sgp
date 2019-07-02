package sgp.filter;

import sgp.entity.VisiteWeb;
import sgp.util.Constantes;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class FrequentationFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        String url = ((HttpServletRequest)req).getRequestURI();
        long before = System.currentTimeMillis();
        filterChain.doFilter(req, resp);
        long after = System.currentTimeMillis();
        Constantes.WEB_SERVICE.addVisiteWeb(new VisiteWeb(url, (int)(after - before)));
    }

    @Override
    public void destroy() {

    }
}
