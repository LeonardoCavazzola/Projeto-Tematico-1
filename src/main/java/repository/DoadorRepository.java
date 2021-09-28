package repository;

import model.Doador;

import javax.persistence.EntityManager;

public class DoadorRepository extends EntityRepository<Doador> {

    public DoadorRepository(EntityManager entityManager) {
        super(entityManager);
    }
}
