package com.company;

public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private int grade;
    public Student(String fname,String lname,String sid,int grade){
        firstName = fname;
        lastName = lname;
        id = sid;
        this.grade = grade;
    }


    public void print(){
        System.out.println(firstName + " " + lastName + " " + id + " " + grade);
    }


    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String fname){
        firstName = fname;
    }


    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lname){ lastName = lname; }


    public String getId(){
        return id;
    }
    public void setId(String sid){
        id = sid;
    }


    public int getGrade(){
        return grade;
    }
    public void setGrade(int sgrade){
        grade = sgrade;
    }
}
