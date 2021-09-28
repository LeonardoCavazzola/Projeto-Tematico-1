package repository;

import model.Historico;

import javax.persistence.EntityManager;

public class HistoricoRepository extends EntityRepository<Historico> {

    public HistoricoRepository(EntityManager entityManager) {
        super(entityManager);
    }
}
