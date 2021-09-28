package repository;

import javax.persistence.EntityManager;

public abstract class EntityRepository<T> {

    protected final EntityManager entityManager;

    public EntityRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public T insert(T entity) {
        this.entityManager.persist(entity);
        return entity;
    }

    public T update(T entity) {
        this.entityManager.merge(entity);
        return entity;
    }
}
