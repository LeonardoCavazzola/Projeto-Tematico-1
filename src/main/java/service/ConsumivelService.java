package service;

import model.Consumivel;
import repository.ConsumivelRepository;
import repository.EntityManagerProvider;

import javax.persistence.EntityManager;
import java.util.List;

public class ConsumivelService {

    public Consumivel create(Consumivel consumivel) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        ConsumivelRepository repository = new ConsumivelRepository(entityManager);

        Consumivel insert = repository.insert(consumivel);
        entityManager.getTransaction().commit();
        return insert;
    }

    public Consumivel update(Consumivel consumivel) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        ConsumivelRepository repository = new ConsumivelRepository(entityManager);

        Consumivel update = repository.update(consumivel);
        entityManager.getTransaction().commit();
        return update;
    }

    public List<Consumivel> findAllByNomeContaining(String nome) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        ConsumivelRepository repository = new ConsumivelRepository(entityManager);

        List<Consumivel> list = repository.findAllByNomeContaining(nome);
        entityManager.close();
        return list;
    }
}
