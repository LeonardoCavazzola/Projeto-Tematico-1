package dao;

import model.TipoDeAnimal;
import javax.persistence.EntityManager;
import java.util.Optional;

public class TipoDeAnimalDao extends EntityDao<TipoDeAnimal> {

    public TipoDeAnimalDao(EntityManager entityManager) {
        super(entityManager);
    }

    public Optional<TipoDeAnimal> getOneById(Long id){
        return Optional.of(super.entityManager.find(TipoDeAnimal.class, id));
    }
}
