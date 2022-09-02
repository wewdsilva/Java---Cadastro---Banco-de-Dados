import Dao.ContatoDao;
import Dao.DesenvolvedorDao;
import Dao.LinguagemDao;
import model.Contato;
import model.Desenvolvedor;
import model.Linguagem;


public class principal {
    public static void main(String[] args) {

//     Desenvolvedores

        Desenvolvedor dev1 = new Desenvolvedor();
        Desenvolvedor dev2 = new Desenvolvedor();
        Desenvolvedor dev3 = new Desenvolvedor();
        Desenvolvedor dev4 = new Desenvolvedor();

        dev1.setId(1L);
        dev1.setNome("wellington");
        dev1.setDocumento("1001");
        dev1.setGenero("Masculino");
        dev1.setAnonascimento("30/08/2000");

        dev2.setNome("Roberto");
        dev2.setDocumento("1002");
        dev2.setGenero("Masculino");
        dev2.setAnonascimento("25/12/2011");

        dev3.setNome("Carla");
        dev3.setDocumento("1003");
        dev3.setGenero("Femenino");
        dev3.setAnonascimento("15/10/1980");

        dev4.setNome("Paula");
        dev4.setDocumento("1004");
        dev4.setGenero("Femenino");
        dev4.setAnonascimento("11/09/2003");

//       Execução (Salvar, Listar por ID, Deletar, Atualizar, Listar todos)

         DesenvolvedorDao desenvolvedorDao = new DesenvolvedorDao();
//       desenvolvedorDao.salvar(dev4);
//       System.out.println(desenvolvedorDao.listarporid(3L));
//       desenvolvedorDao.deletar(4l);
//       desenvolvedorDao.atualizar(dev1);
         desenvolvedorDao.listartodos();




    ////////////////////////////////////////////////////////////////////////

//     Linguagem

        Linguagem l1 = new Linguagem();

        l1.setNome("Java");
        l1.setVersao("11");


//        LinguagemDao linguagemDao = new LinguagemDao();
//        linguagemDao.salvar(11);
    //////////////////////////////////////////////////////////////////

//        Contato

        Contato contato1 = new Contato();
        Contato contato2 = new Contato();
        Contato contato3 = new Contato();
        Contato contato4 = new Contato();

        contato1.setEmail("contato1@gmail.com");
        contato1.setDdd("81");
        contato1.setNumero("985456522");

        contato2.setEmail("contato2@hotmail.com");
        contato2.setDdd("11");
        contato2.setNumero("987968844");

        contato3.setEmail("contato3@yahoo.com.br");
        contato3.setDdd("21");
        contato3.setNumero("998556377");

        contato4.setEmail("contato4@live.com");
        contato4.setDdd("61");
        contato4.setNumero("988741121");

//        ContatoDao contatoDao = new ContatoDao();
//        contatoDao.salvar(contato4);















    }
}


