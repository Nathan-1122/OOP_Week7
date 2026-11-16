package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    int age = input.nextInt();
    String name = input.nextLine();
    String memberID = input.next();




    System.out.println("1.Add Member 2.Display Members 3.Search by ID 4.Remove Member 5.Exit");
    System.out.println("Enter Your Choice:");
    int choice = Integer.parseInt(input.nextLine());
    switch (choice) {
        case 1:
            System.out.print("Enter Member ID:");
            String MemberID = input.nextLine();
            System.out.print("Enter Name:");
            String Name = input.nextLine();
            System.out.print("Enter Age:");
            int Age = Integer.parseInt(input.nextLine());

            Member member = new Member(MemberID, Name, Age);
            member.add(newMember);
            System.out.println("Members added!!");
            break;
        case 2:
            member.displayDetails();
            break;
        case 3:
            break;
        case 4:
            break;
        case 5:
            System.out.println("Exit");
            break;
        default:
            System.out.println("Invalid Choice");

    }



    }
}
