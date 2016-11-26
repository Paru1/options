package stdtechcoll;

import java.util.Scanner;

/**
 * Created by paru on 11/25/2016.
 */
public class CollegeServices {
 College[] colleges= new College[2];
    int a;
    public void setInfo(){

    for(int j=0;j<2;j++) {
        Scanner s=new Scanner(System.in);
        College college = new College();
        System.out.println("Enter name of college");
        college.na = s.nextLine();
        System.out.println("Enter contact number");
        college.contact = s.nextLine();
        colleges[j] = college;
    }
}

    public void getInfo(){
        int j=0;
        System.out.println("Enter college whose details you want to collect...");
        System.out.println("press 0------>college1");
        System.out.println("press 1------>college2");
        Scanner n=new Scanner(System.in);
        a= n.nextInt();
        College coll=colleges[a];
        System.out.println("name="+coll.na);
        System.out.println("idno="+coll.contact);

}


        }
