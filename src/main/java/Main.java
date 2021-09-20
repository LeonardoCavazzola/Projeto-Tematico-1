import dao.TipoDeAnimalDao;
import model.TipoDeAnimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("ProjetoTematico1");
        EntityManager em = emFactory.createEntityManager();

        em.getTransaction().begin();
        //Operacoes

        TipoDeAnimal cachorro = new TipoDeAnimal("cachorro1");
        TipoDeAnimalDao tipoDeAnimalDao = new TipoDeAnimalDao(em);
        tipoDeAnimalDao.insert(cachorro);

        em.getTransaction().commit();
        new Scanner(System.in).nextLine();
    }
}