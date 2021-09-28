package repository;

import model.Consumivel;

import javax.persistence.EntityManager;

public class ConsumivelRepository extends EntityRepository<Consumivel> {

    public ConsumivelRepository(EntityManager entityManager) {
        super(entityManager);
    }
}
