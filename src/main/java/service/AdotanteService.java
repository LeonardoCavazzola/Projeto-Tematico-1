package service;

import model.Adotante;
import model.Raca;
import repository.AdotanteRepository;
import repository.EntityManagerProvider;
import repository.RacaRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class AdotanteService {

    public Adotante create(Adotante adotante) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        AdotanteRepository repository = new AdotanteRepository(entityManager);

        Adotante insert = repository.insert(adotante);
        entityManager.getTransaction().commit();
        return insert;
    }

    public Adotante update(Adotante raca) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        AdotanteRepository repository = new AdotanteRepository(entityManager);

        Adotante update = repository.update(raca);
        entityManager.getTransaction().commit();
        return update;
    }

    public List<Adotante> findAllByNomeContaining(String nome) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        AdotanteRepository repository = new AdotanteRepository(entityManager);

        List<Adotante> list = repository.findAllByNomeContaining(nome);
        entityManager.close();
        return list;
    }
}
