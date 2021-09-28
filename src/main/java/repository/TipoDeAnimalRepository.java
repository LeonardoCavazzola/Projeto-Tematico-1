package repository;

import model.TipoDeAnimal;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class TipoDeAnimalRepository extends EntityRepository<TipoDeAnimal> {

    public TipoDeAnimalRepository(EntityManager entityManager) {
        super(entityManager);
    }

    public Optional<TipoDeAnimal> findOneById(Long id){
        return Optional.of(super.entityManager.find(TipoDeAnimal.class, id));
    }

    public List<TipoDeAnimal> findAllByNomeContaining(String nome){
        String jpql = "SELECT e FROM TipoDeAnimal e WHERE e.nome LIKE :nome";

        return super.entityManager
                .createQuery(jpql, TipoDeAnimal.class)
                .setParameter("nome","%" + nome + "%")
                .getResultList();
    }
}
