package dao;

import model.Adotante;

import javax.persistence.EntityManager;

public class AdotanteDao extends EntityDao<Adotante>{

    public AdotanteDao(EntityManager entityManager) {
        super(entityManager);
    }
}
