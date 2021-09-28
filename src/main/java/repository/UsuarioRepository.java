package repository;

import model.Usuario;

import javax.persistence.EntityManager;

public class UsuarioRepository extends EntityRepository<Usuario> {

    public UsuarioRepository(EntityManager entityManager) {
        super(entityManager);
    }
}
