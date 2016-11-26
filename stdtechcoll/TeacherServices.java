package stdtechcoll;

import Stringarray.*;

import java.util.Scanner;

/**
 * Created by paru on 11/25/2016.
 */
public class TeacherServices {
    Teacher[] teachers= new Teacher[2];
    int nam;
    public void setInfo(){

        for(int j=0;j<2;j++) {
            Scanner s=new Scanner(System.in);
            Teacher teacher=new Teacher();
            System.out.println("Enter name of teacher");
            teacher.name = s.nextLine();
            System.out.println("Enter idno of teacher");
            teacher.idno = s.nextDouble();
            teachers[j] = teacher;
        }
    }

    public void getInfo(){
        int j=0;
        System.out.println("Enter teacher whose details you want to collect...");
        System.out.println("press 0------>teacher1");
        System.out.println("press 1------>teacher2");
        Scanner n=new Scanner(System.in);
        nam= n.nextInt();
        Teacher tech=teachers[nam];
        System.out.println("name="+tech.name);
        System.out.println("idno="+tech.idno);


    }
}








