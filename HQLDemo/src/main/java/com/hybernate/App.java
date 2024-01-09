package com.hybernate;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();

        boolean continueloop = true;
        while (continueloop){
            System.out.println("Enter your choice:");
            System.out.println("1.Insert \n2.Read\n3.update\n4.Delete\n5.exit\n");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter first name");
                    String first_name = scanner.next();
                    System.out.println("Enter last name");
                    String last_name = scanner.next();
                    System.out.println("Enter email");
                    String email = scanner.next();
                    InsertStudent.insertStudent(session,first_name,last_name,email);
                    break;
                case 2:
                    System.out.println("Enter roll no: ");
                    int roll_no=scanner.nextInt();
                    String hql= "From Student S where S.student_id=:roll_no";
                    Query query = session.createQuery(hql);
                    query.setParameter("roll_no", roll_no);
                    List<Student> results = query.getResultList();
                    //Student student=new Student();
                    for(Student student1 : results){
                        System.out.println("Paginated students::"+ student1.getStudent_id()+","+student1.getFirst_name()+","+student1.getLast_name()+", mail: "+student1.getEmail());
                    }
                    break;
                case 3:
                    System.out.println("What do you want to update?\n1.First name\n2.Last name\n3.email");
                    int updatechoice = scanner.nextInt();
                    UpdateStudent.update(session,updatechoice,scanner);
                    break;
                case 4:System.out.println("Enter student Id");
                    int student_id= scanner.nextInt();
                    Transaction transaction= session.beginTransaction();
                    query = session.createQuery("delete from Student where student_id= :student_id");
                    query.setParameter("student_id", student_id);
                    int result = query.executeUpdate();
                    System.out.println("Employee Delete Status="+result);
                    transaction.commit();
                    System.out.println("Successfully deleted");

                    break;
                case 5: continueloop=false;
                break;
            }
        }
    }
}
