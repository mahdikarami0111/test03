package com.company;


import java.util.Scanner;


public class Main {

    public static void main(String[] args){


        Student[] std = new Student[5];
        Lab[] labs = new Lab[3];
        Lab c1 = new Lab(6,"SAT");

        std[0] = new Student("fname1","lname1","std1",15);
        std[1] = new Student("fname2","lname2","std2",2);
        std[2] = new Student("fname3","lname3","std3",8);
        std[3] = new Student("fname4","lname4","std4",11);
        std[4] = new Student("fname5","lname5","std5",18);
        c1.setStudents(std);
        c1.printLab();
        labs[0] = c1;


//        for checking enrollStudent method
//
//        Student temp = new Student("fname6","lname6","std6",13);
//        c1.enrollStudent(temp);
//        c1.printLab();
//        temp = new Student("fname7","lname7","std7",17);
//        c1.enrollStudent(temp);
//        c1.printLab();


        std[0] = new Student("fname6","lname6","std6",16);
        std[1] = new Student("fname7","lname7","std7",20);
        std[2] = new Student("fname8","lname8","std8",18);
        std[3] = new Student("fname9","lname9","std9",7);
        std[4] = new Student("fname10","lname10","std10",12);
        Lab c2 = new Lab(8,"MON");
        c2.setStudents(std);
        labs[1] = c2;


        std[0] = new Student("fname11","lname11","std11",1);
        std[1] = new Student("fname12","lname12","std12",0);
        std[2] = new Student("fname13","lname13","std13",18);
        std[3] = new Student("fname14","lname14","std14",11);
        std[4] = new Student("fname15","lname15","std15",13);
        Lab c3 = new Lab(10,"WED");
        c3.setStudents(std);
        labs[2] = c3;



        College college1 = new College("CE",5);
        college1.setClasses(labs);
        college1.print();
        }
}
