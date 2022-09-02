package Dao;

import model.Contato;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ContatoDao {

    public void salvar(Contato contato) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("moderna");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(contato);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}