package stdtechcoll;

import java.util.Scanner;

/**
 * Created by paru on 11/25/2016.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your choice.....");
        System.out.println("Student--------->press 1");
        System.out.println("Teacher------->press2 ");
        System.out.println("College------->press3 ");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                StudentServices service1=new StudentServices();
                service1.setInfo();
                service1.getInfo();
                break;
            case 2:
                TeacherServices service2=new TeacherServices();
                service2.setInfo();
                service2.getInfo();
                break;
            case 3:
                CollegeServices service3=new CollegeServices();
                service3.setInfo();
                service3.getInfo();
                break;
            default:
                System.out.println("Please choose one option...");
                break;
        }


    }
}
