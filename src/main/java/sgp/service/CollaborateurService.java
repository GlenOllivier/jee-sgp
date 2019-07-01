package sgp.service;

import sgp.entity.Collaborateur;

import java.util.ArrayList;
import java.util.List;

public class CollaborateurService {
    List<Collaborateur> listeCollaborateurs = new ArrayList<>();

    public List<Collaborateur> listCollaborateurs() {
        return listeCollaborateurs;
    }

    public void sauvegarderCollaborateur(Collaborateur c) {
        listeCollaborateurs.add(c);
    }
}
