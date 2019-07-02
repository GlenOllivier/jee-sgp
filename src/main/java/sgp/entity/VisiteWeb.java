package sgp.entity;

public class VisiteWeb {
    private int id;
    private String chemin;
    private int tempsExecution;

    public VisiteWeb() {

    }

    public VisiteWeb(String chemin, int tempsExecution) {
        this.chemin = chemin;
        this.tempsExecution = tempsExecution;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public int getTempsExecution() {
        return tempsExecution;
    }

    public void setTempsExecution(int tempsExecution) {
        this.tempsExecution = tempsExecution;
    }
}
