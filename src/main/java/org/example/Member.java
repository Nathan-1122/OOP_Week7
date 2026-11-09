package org.example;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberID;
    private String name;
    private int age;


    public Member(String memberID, String name, int age) {
        this.memberID = memberID;
        this.name = name;
        this.age = age;
    }
    public  String getMemberID() {
        return memberID;

    }
    public String getName(String name) {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void displayDetails() {
        System.out.println("Member ID: " + memberID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    List<Member> members=new ArrayList<>();
    public void addMember(Member member){
        members.add(member);
    }
    public void findMembers(){
        for (Member member : members) {
            member.displayDetails();
        }
    }
    public void removeMember(Member member){
        members.remove(member);

    }
}
