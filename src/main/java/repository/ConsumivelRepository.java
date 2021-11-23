package repository;

import model.Consumivel;

import javax.persistence.EntityManager;
import java.util.List;

public class ConsumivelRepository extends EntityRepository<Consumivel> {

    public ConsumivelRepository(EntityManager entityManager) {
        super(entityManager);
    }

    public List<Consumivel> findAllByNomeContaining(String nome) {
        String jpql = "SELECT e FROM Consumivel e WHERE e.nome LIKE :nome";

        return super.entityManager
                .createQuery(jpql, Consumivel.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }
}
