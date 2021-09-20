package dao;

import model.Animal;

import javax.persistence.EntityManager;

public class AnimalDao extends EntityDao<Animal> {

    public AnimalDao(EntityManager entityManager) {
        super(entityManager);
    }
}
