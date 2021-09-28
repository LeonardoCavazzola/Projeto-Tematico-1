package repository;

import model.Adotante;

import javax.persistence.EntityManager;

public class AdotanteRepository extends EntityRepository<Adotante> {

    public AdotanteRepository(EntityManager entityManager) {
        super(entityManager);
    }
}
