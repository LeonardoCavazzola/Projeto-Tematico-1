package service;

import model.Usuario;
import repository.EntityManagerProvider;
import repository.UsuarioRepository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class UsuarioService {

    public Usuario create(Usuario usuario) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        UsuarioRepository repository = new UsuarioRepository(entityManager);

        Usuario insert = repository.insert(usuario);
        entityManager.getTransaction().commit();
        return insert;
    }

    public Usuario update(Usuario adotante) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        UsuarioRepository repository = new UsuarioRepository(entityManager);

        Usuario update = repository.update(adotante);
        entityManager.getTransaction().commit();
        return update;
    }

    public List<Usuario> findAllByNomeContaining(String nome) {

        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        UsuarioRepository repository = new UsuarioRepository(entityManager);

        List<Usuario> list = repository.findAllByNomeContaining(nome);
        entityManager.close();
        return list;
    }

    public Optional<Usuario> findOneByEmail(String email) {
        EntityManager entityManager = EntityManagerProvider.getInstanceOfEntityManager();
        UsuarioRepository repository = new UsuarioRepository(entityManager);

        Optional<Usuario> op = repository.findOneByEmail(email);
        entityManager.close();
        return op;
    }
}
