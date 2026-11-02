package org.example;

public class Member {
    private String memberID;
    private String Name;
    private int age;


    public Member(String memberID, String Name, int age) {
        this.memberID = memberID;
        this.Name = Name;
        this.age = age;
    }
    public String getMemberID() {
        return memberID;

    }
    public String getName(String Name) {
        return Name;
    }
    public int getAge() {
        return age;
    }
public void displayDetails() {
        System.out.println("Member ID: " + memberID);
        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
    }

}
