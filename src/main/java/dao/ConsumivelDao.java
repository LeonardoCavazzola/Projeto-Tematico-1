package dao;

import model.Consumivel;

import javax.persistence.EntityManager;

public class ConsumivelDao extends EntityDao<Consumivel> {

    public ConsumivelDao(EntityManager entityManager) {
        super(entityManager);
    }
}
