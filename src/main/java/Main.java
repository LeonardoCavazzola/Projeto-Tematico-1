import com.formdev.flatlaf.*;

import view.LoginView;

public class Main {

    public static void main(String[] args) {

        FlatIntelliJLaf.setup();
        LoginView login = new LoginView();
        login.setVisible(true);

//        em.getTransaction().begin();
//        //Operacoes
//
//        TipoDeAnimal cachorro = new TipoDeAnimal("cachorro1");
//        TipoDeAnimalDao tipoDeAnimalDao = new TipoDeAnimalDao(em);
//        tipoDeAnimalDao.insert(cachorro);
//        em.getTransaction().commit();
//
//        EntityManager em2 = emFactory.createEntityManager();
//
//        em2.getTransaction().begin();
//        tipoDeAnimalDao = new TipoDeAnimalDao(em2);
//
//        cachorro.setNome("vaca");
//        tipoDeAnimalDao.update(cachorro);
//
//        em2.getTransaction().commit();
    }
}
