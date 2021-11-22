package repository;

import model.Animal;

import javax.persistence.EntityManager;
import java.util.List;

public class AnimalRepository extends EntityRepository<Animal> {

    public AnimalRepository(EntityManager entityManager) {
        super(entityManager);
    }

    public List<Animal> findAllByNomeContaining(String nome){
        String jpql = "SELECT e FROM Animal e WHERE e.nome LIKE :nome";

        return super.entityManager
                .createQuery(jpql, Animal.class)
                .setParameter("nome","%" + nome + "%")
                .getResultList();
    }
}
