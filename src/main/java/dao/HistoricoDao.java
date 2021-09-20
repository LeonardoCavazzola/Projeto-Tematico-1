package dao;

import model.Historico;

import javax.persistence.EntityManager;

public class HistoricoDao extends EntityDao<Historico>{

    public HistoricoDao(EntityManager entityManager) {
        super(entityManager);
    }
}
