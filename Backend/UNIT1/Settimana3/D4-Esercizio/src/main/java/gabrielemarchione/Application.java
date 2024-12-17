package gabrielemarchione;

import gabrielemarchione.dao.LocationDAO;
import gabrielemarchione.dao.PartecipazioneDAO;
import gabrielemarchione.dao.PersoneDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("d2_esercizio");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        PersoneDAO pd = new PersoneDAO(em);
        EventoDAO ed = new EventoDAO(em);
        PartecipazioneDAO ticket = new PartecipazioneDAO(em);
        LocationDAO ld = new LocationDAO(em);

    }

}
