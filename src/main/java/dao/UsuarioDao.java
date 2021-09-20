package dao;

import model.Usuario;

import javax.persistence.EntityManager;

public class UsuarioDao extends EntityDao<Usuario> {

    public UsuarioDao(EntityManager entityManager) {
        super(entityManager);
    }
}
