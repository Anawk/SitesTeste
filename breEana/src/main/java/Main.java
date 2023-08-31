import entity.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        gerenciarAluno();
        //iguaiss
        //for (Pessoa p: pessoas){
        //System.out.println(p.toString());
        // }

    }


    public static void gerenciarProfessor() {

        Professor p1 = new Professor("0102", "25647893215", "Isadora Mendes", "sp4025733");
        Professor p2 = new Professor("0104", "25487965487", "Rafaela Tavares", "sp4024488");
        Professor p3 = new Professor("0103", "26548723565", "Antonio Leal", "sp4021179");

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(p1);
        session.persist(p2);
        session.persist(p3);

        transaction.commit();

        List<Professor> professores = session.createQuery("from Professor", Professor.class).list();


        //iguais
        professores.forEach(p -> System.out.println(p.toString()));
    }

    public static void gerenciarAluno() {
        Aluno a1 = new Aluno("2021", "Jose", "sp3075246");
        Aluno a2 = new Aluno("2022", "Amanda", "sp8541258");
        Aluno a3 = new Aluno("2023", "Felipe", "sp0929382");
        Aluno a4 = new Aluno("2024", "Marina", "sp4125456");
        Aluno a5 = new Aluno("2025", "Kaylane", "sp5578156");
        Aluno a6 = new Aluno("2026", "Anne", "sp78845126");
        Session sessioon = HibernateUtil.getSessionFactory().openSession();

        Transaction transactioon = sessioon.beginTransaction();

        sessioon.persist(a1);
        sessioon.persist(a2);
        sessioon.persist(a3);
        sessioon.persist(a4);
        sessioon.persist(a5);
        sessioon.persist(a6);

        transactioon.commit();

        List<Aluno> alunos = sessioon.createQuery("from Aluno", Aluno.class).list();

        alunos.forEach(p -> System.out.println(p.toString()));

    }
}
//
//    public static void gerenciarTurma(){
//
//        Turma t1 = new Turma(gerenciarProfessor(), "matutino", gerenciarAluno(), "sp3075246", "");
////        Turma t2 = new Turma("2", "7,8,10");
////        Turma t3 = new Turma("3", "5,7,2");
////        Turma t4 = new Turma("4", "Rio de janeiro");
////        Turma t5 = new Turma("5", "São Paulo");
////        Turma t6 = new Turma("6", "Belo Horizonte");
////
//       Session sesssion = HibernateUtil.getSessionFactory().openSession();
//
//       Transaction transacttion = sesssion.beginTransaction();
//
//        sesssion.persist(t1);
////        sesssion.persist(t2);
////        sesssion.persist(t3);
////        sesssion.persist(t4);
////        sesssion.persist(t5);
////        sesssion.persist(t6);
////
//       transacttion.commit();
//
//       List<Turma> turmas = sesssion.createQuery("from Turma", Turma.class).list();
//
//       turmas.forEach(p -> System.out.println(p.toString()));
//
//
//
//    }
//
//    public static void gerenciarNota(){
//        Nota n1 = new Nota("1", "Jose");
//        Nota n2 = new Nota("2", "7,8,10");
//        Nota n3 = new Nota("3", "5,7,2");
//        Nota n4 = new Nota("4", "Rio de janeiro");
//        Nota n5 = new Nota("5", "São Paulo");
//        Nota n6 = new Nota("6", "Belo Horizonte");
//
//        Session sessionn = HibernateUtil.getSessionFactory().openSession();
//
//        Transaction transactioon = sessionn.beginTransaction();
//
//        sessionn.persist(n1);
//        sessionn.persist(n2);
//        sessionn.persist(n3);
//        sessionn.persist(n4);
//        sessionn.persist(n5);
//        sessionn.persist(n6);
//
//        transactioon.commit();
//
//        List<Nota> notas = sessionn.createQuery("from Nota", Nota.class).list();
//
//        notas.forEach(p -> System.out.println(p.toString()));
//
//    }
//
//}
