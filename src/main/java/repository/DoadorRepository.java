package repository;

import model.Doador;

import javax.persistence.EntityManager;
import java.util.List;

public class DoadorRepository extends EntityRepository<Doador> {

    public DoadorRepository(EntityManager entityManager) {
        super(entityManager);
    }

    public List<Doador> findAllByNomeContaining(String nome) {
        String jpql = "SELECT e FROM Doador e WHERE e.nome LIKE :nome";

        return super.entityManager
                .createQuery(jpql, Doador.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }
}
