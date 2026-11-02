package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    int age = input.nextInt();
    String name = input.nextLine();
    String memberID = input.next();




    System.out.println("1.Add Member 2.Display Members 3.Search by ID 4.Remove Member 5.Exit");
    System.out.println("Enter Your Choice:");

    if (input.nextInt() == 1) {
        Member addMember = new Member(memberID,name,age);
    }
    if (input.nextInt() == 2) {
        Member.displayDetails();
    }
    if (input.nextInt() == 3) {
        System.out.println("Enter Member ID:");
        input.nextLine();

        System.out.println("Member ID:"+memberID "Name:"+name "Age:"+age);

    }
    if (input.nextInt() == 4) {
     Member removeMember = new Member(memberID, name, age);
    }
    if (input.nextInt() == 5) {

    }


    }
}
