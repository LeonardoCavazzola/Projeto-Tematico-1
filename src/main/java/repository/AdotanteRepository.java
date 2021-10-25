package repository;

import model.Adotante;

import javax.persistence.EntityManager;
import java.util.List;

public class AdotanteRepository extends EntityRepository<Adotante> {

    public AdotanteRepository(EntityManager entityManager) {
        super(entityManager);
    }

    public List<Adotante> findAllByNomeContaining(String nome) {
        String jpql = "SELECT e FROM Adotante e WHERE e.nome LIKE :nome";

        return super.entityManager
                .createQuery(jpql, Adotante.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }
}
