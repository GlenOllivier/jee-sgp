package sgp.service;

import sgp.entity.VisiteWeb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VisiteWebService {
    private List<VisiteWeb> visitesWeb = new ArrayList<>();

    public List<VisiteWeb> listVisitesWeb() {
        return visitesWeb;
    }

    public void addVisiteWeb (VisiteWeb v) {
        visitesWeb.add(v);
    }
}
