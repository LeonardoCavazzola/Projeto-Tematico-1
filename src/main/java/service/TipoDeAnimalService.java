package service;

import repository.EntityManagerProvider;
import repository.TipoDeAnimalRepository;
import model.TipoDeAnimal;

import javax.persistence.EntityManager;
import java.util.List;

public class TipoDeAnimalService {

    public TipoDeAnimal create(TipoDeAnimal tipoDeAnimal) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        TipoDeAnimalRepository tipoDeAnimalRepository = new TipoDeAnimalRepository(entityManager);

        TipoDeAnimal insert = tipoDeAnimalRepository.insert(tipoDeAnimal);
        entityManager.getTransaction().commit();
        return insert;
    }

    public TipoDeAnimal update(TipoDeAnimal tipoDeAnimal) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        TipoDeAnimalRepository tipoDeAnimalRepository = new TipoDeAnimalRepository(entityManager);

        TipoDeAnimal update = tipoDeAnimalRepository.update(tipoDeAnimal);
        entityManager.getTransaction().commit();
        return update;
    }

    public List<TipoDeAnimal> findAllByNomeContaining(String nome) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        TipoDeAnimalRepository tipoDeAnimalRepository = new TipoDeAnimalRepository(entityManager);

        List<TipoDeAnimal> list = tipoDeAnimalRepository.findAllByNomeContaining(nome);
        entityManager.close();
        return list;
    }
}
