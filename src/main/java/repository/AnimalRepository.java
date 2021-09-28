package repository;

import model.Animal;

import javax.persistence.EntityManager;

public class AnimalRepository extends EntityRepository<Animal> {

    public AnimalRepository(EntityManager entityManager) {
        super(entityManager);
    }
}
