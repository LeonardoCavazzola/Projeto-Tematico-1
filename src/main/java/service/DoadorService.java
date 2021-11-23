package service;

import model.Doador;
import repository.DoadorRepository;
import repository.EntityManagerProvider;

import javax.persistence.EntityManager;
import java.util.List;

public class DoadorService {

    public Doador create(Doador doador) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        DoadorRepository repository = new DoadorRepository(entityManager);

        Doador insert = repository.insert(doador);
        entityManager.getTransaction().commit();
        return insert;
    }

    public Doador update(Doador doador) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        DoadorRepository repository = new DoadorRepository(entityManager);

        Doador update = repository.update(doador);
        entityManager.getTransaction().commit();
        return update;
    }

    public List<Doador> findAllByNomeContaining(String nome) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        DoadorRepository repository = new DoadorRepository(entityManager);

        List<Doador> list = repository.findAllByNomeContaining(nome);
        entityManager.close();
        return list;
    }
}
