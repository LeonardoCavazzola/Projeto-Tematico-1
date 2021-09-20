package dao;

import model.Raca;

import javax.persistence.EntityManager;

public class RacaDao extends EntityDao<Raca> {

    public RacaDao(EntityManager entityManager) {
        super(entityManager);
    }
}

