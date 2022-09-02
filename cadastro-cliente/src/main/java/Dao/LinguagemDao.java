package Dao;

import model.Linguagem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LinguagemDao {

    public void salvar(Linguagem linguagem) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("moderna");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(linguagem);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}