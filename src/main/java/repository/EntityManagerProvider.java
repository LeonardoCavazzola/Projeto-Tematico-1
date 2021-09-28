package repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {

    private static final EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("ProjetoTematico1");

    public static EntityManager getInstanceOfEntityManager() {
        EntityManager entityManager = emFactory.createEntityManager();
        entityManager.getTransaction().begin();
        return entityManager;
    }
}
