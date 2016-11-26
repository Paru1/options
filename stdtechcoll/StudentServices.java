package stdtechcoll;

import java.util.Scanner;

/**
 * Created by paru on 11/25/2016.
 */
public class StudentServices {
    int nam;
    Student[] students=new Student[2];

    public void setInfo(){

        for(int j=0;j<2;j++) {
            Scanner s=new Scanner(System.in);
            Student student = new Student();
            System.out.println("Enter name of student");
            student.name = s.nextLine();
            System.out.println("Enter idno of student");
            student.idno = s.nextDouble();
            students[j] = student;
        }
    }

    public void getInfo(){
        int j=0;
        System.out.println("Enter student whose details you want to collect...");
        System.out.println("press 0------>student1");
        System.out.println("press 1------>student2");
        Scanner n=new Scanner(System.in);
        nam= n.nextInt();
        Student std=students[nam];
        System.out.println("name="+std.name);
        System.out.println("idno="+std.idno);


        }
    }


