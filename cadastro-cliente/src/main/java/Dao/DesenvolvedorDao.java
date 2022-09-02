package Dao;

import model.Desenvolvedor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class DesenvolvedorDao {

//     Adicionar

    public void salvar(Desenvolvedor desenvolvedor){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("moderna");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

       entityManager.persist(desenvolvedor);

       entityManager.getTransaction().commit();
       entityManager.close();
    }

//     Listar por id

    public Desenvolvedor listarporid(Long id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("moderna");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

       Desenvolvedor desenvolvedor = entityManager.find(Desenvolvedor.class, id);

       entityManager.close();

       return desenvolvedor;

    }

//    Deletar

    public void deletar(Long id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("moderna");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Desenvolvedor desenvolvedor = entityManager.find(Desenvolvedor.class, id);
        entityManager.remove(desenvolvedor);

        entityManager.getTransaction().commit();
        entityManager.close();

    }

//    Atualizar

    public void atualizar(Desenvolvedor desenvolvedor){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("moderna");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.merge(desenvolvedor);

        entityManager.getTransaction().commit();
        entityManager.close();

    }

//    Listar todos

    public void listartodos(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("moderna");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        var sql = "from Desenvolvedor";
        TypedQuery typedQuery = entityManager.createQuery(sql, Desenvolvedor.class);
        List<Desenvolvedor> listaDesenvolverdor = typedQuery.getResultList();

//        System.out.println(listaDesenvolverdor);
        int i = 1;
        for (Desenvolvedor desenvolvedor : listaDesenvolverdor){
          System.out.println(desenvolvedor);
          System.out.println(i++);
        }

        entityManager.close();

    }


}
