package repository;

import model.Raca;

import javax.persistence.EntityManager;
import java.util.List;

public class RacaRepository extends EntityRepository<Raca> {

    public RacaRepository(EntityManager entityManager) {
        super(entityManager);
    }

    public List<Raca> findAllByNomeContaining(String nome){
        String jpql = "SELECT e FROM Raca e WHERE e.nome LIKE :nome";

        return super.entityManager
                .createQuery(jpql, Raca.class)
                .setParameter("nome","%" + nome + "%")
                .getResultList();
    }
}

