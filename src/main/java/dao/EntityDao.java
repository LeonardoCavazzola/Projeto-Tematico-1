package dao;

import javax.persistence.EntityManager;

public abstract class EntityDao<T> {

    protected final EntityManager entityManager;

    public EntityDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void insert(T entity) {
        this.entityManager.persist(entity);
    }

    public void update(T entity) {
        this.entityManager.merge(entity);
    }
}
