package repository;

import model.Raca;

import javax.persistence.EntityManager;

public class RacaRepository extends EntityRepository<Raca> {

    public RacaRepository(EntityManager entityManager) {
        super(entityManager);
    }
}

