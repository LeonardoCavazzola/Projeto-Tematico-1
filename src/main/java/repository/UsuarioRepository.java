package repository;

import model.Usuario;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class UsuarioRepository extends EntityRepository<Usuario> {

    public UsuarioRepository(EntityManager entityManager) {
        super(entityManager);
    }

    public List<Usuario> findAllByNomeContaining(String nome) {
        String jpql = "SELECT e FROM Usuario e WHERE e.nome LIKE :nome";

        return super.entityManager
                .createQuery(jpql, Usuario.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }

    public Optional<Usuario> findOneByEmail(String email) {
        String jpql = "SELECT e FROM Usuario e WHERE e.email = :email";

        try {
            return Optional.of(super.entityManager
                    .createQuery(jpql, Usuario.class)
                    .setParameter("email", email)
                    .getSingleResult());
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
