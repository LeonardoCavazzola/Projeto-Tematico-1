package dao;

import model.Doador;

import javax.persistence.EntityManager;

public class DoadorDao extends EntityDao<Doador>{

    public DoadorDao(EntityManager entityManager) {
        super(entityManager);
    }
}
