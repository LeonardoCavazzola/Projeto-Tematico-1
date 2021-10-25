package service;

import model.Raca;
import repository.EntityManagerProvider;
import repository.RacaRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class RacaService {

    public Raca create(Raca raca) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        RacaRepository repository = new RacaRepository(entityManager);

        Raca insert = repository.insert(raca);
        entityManager.getTransaction().commit();
        return insert;
    }

    public Raca update(Raca raca) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        RacaRepository repository = new RacaRepository(entityManager);

        Raca update = repository.update(raca);
        entityManager.getTransaction().commit();
        return update;
    }

    public List<Raca> findAllByNomeContaining(String nome) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        RacaRepository repository = new RacaRepository(entityManager);

        List<Raca> list = repository.findAllByNomeContaining(nome);
        entityManager.close();
        return list;
    }
}
