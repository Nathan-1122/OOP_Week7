package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    int age = input.nextInt();
    String name = input.nextLine();
    String memberID = input.next();

    Member member= new Member(memberID,name,age);
    }
}
