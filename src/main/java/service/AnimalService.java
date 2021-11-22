package service;

import model.Animal;
import repository.AnimalRepository;
import repository.EntityManagerProvider;

import javax.persistence.EntityManager;
import java.util.List;

public class AnimalService {

    public Animal create(Animal animal) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        AnimalRepository repository = new AnimalRepository(entityManager);

        Animal insert = repository.insert(animal);
        entityManager.getTransaction().commit();
        return insert;
    }

    public Animal update(Animal animal) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        AnimalRepository repository = new AnimalRepository(entityManager);

        Animal update = repository.update(animal);
        entityManager.getTransaction().commit();
        return update;
    }

    public List<Animal> findAllByNomeContaining(String nome) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        AnimalRepository repository = new AnimalRepository(entityManager);

        List<Animal> list = repository.findAllByNomeContaining(nome);
        entityManager.close();
        return list;
    }
}
