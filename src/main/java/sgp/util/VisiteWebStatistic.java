package sgp.util;

import sgp.entity.VisiteWeb;

import java.util.*;
import java.util.stream.Collectors;

public class VisiteWebStatistic {
    private String chemin;
    private int nbVisite;
    private int min;
    private int max;
    private int moyenne;

    public VisiteWebStatistic() {

    }

    public VisiteWebStatistic(String chemin, int nbVisite, int min, int max, int moyenne) {
        this.chemin = chemin;
        this.nbVisite = nbVisite;
        this.min = min;
        this.max = max;
        this.moyenne = moyenne;
    }

    public static List<VisiteWebStatistic> getStats (List<VisiteWeb> visites) {
        Map<String, List<Integer>> map = new HashMap<>();

        for (VisiteWeb v : visites) {
            if (!map.containsKey(v.getChemin())) {
                map.put(v.getChemin(), new ArrayList<>());
            }
            map.get(v.getChemin()).add(v.getTempsExecution());
        }

        List<VisiteWebStatistic> liste = new ArrayList<>();
        for (Map.Entry<String, List<Integer>> e : map.entrySet()) {
            IntSummaryStatistics stats = e.getValue().stream()
                    .mapToInt(i -> i)
                    .summaryStatistics();
            liste.add(new VisiteWebStatistic(e.getKey(), e.getValue().size(), stats.getMin(), stats.getMax(), (int)stats.getAverage()));
        }
        liste = liste.stream()
                .sorted(Comparator.comparing(VisiteWebStatistic::getChemin))
                .collect(Collectors.toList());

        return liste;
    }

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public int getNbVisite() {
        return nbVisite;
    }

    public void setNbVisite(int nbVisite) {
        this.nbVisite = nbVisite;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(int moyenne) {
        this.moyenne = moyenne;
    }
}
