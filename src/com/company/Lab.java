package com.company;

import java.awt.desktop.ScreenSleepEvent;
import java.lang.reflect.Array;

public class Lab {

    private int avg;
    private String day;
    private int capacity;
    private int currentSize;
    private Student[] students;
    public Lab(int cap, String d){
        capacity = cap;
        day = d;
        avg = 0;
        currentSize = 0;
        students = new Student[cap];
    }

    public void enrollStudent(Student std){
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
            calculateAvg();
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    public void printLab(){
        if (currentSize == 0){
            System.out.println("lab is empty");
        }
        else{
            int i = 0;
            int sum = 0;
            Student temp;
            System.out.println("current size : "+currentSize);
            System.out.println("capacity : "+capacity);
            System.out.println("day : "+day);
            System.out.println("Students : ");
            for(i=0;i<currentSize;i++){
                temp = students[i];
                System.out.print("First name: "+temp.getFirstName()+" - last name: "+temp.getLastName()
                        +" - student id :"+ temp.getId()+" - student grade: "+temp.getGrade()+"\n");
            }
            calculateAvg();
            System.out.println("avg :"+avg);
        }

    }


    public Student[] getStudents() {
        int  i =0;
        Student[] temp;
        temp = new Student[currentSize];
        for(i=0;i<currentSize;i++){
            temp[i] = students[i];
        }
        return temp;
    }


    public void setStudents(Student[] tempStudents) {
        int size = tempStudents.length;
        int  i =0;
        currentSize = size;
        for(i = 0; i<size;i++){
            students[i] = tempStudents[i];
        }
        calculateAvg();
    }


    public void calculateAvg() {
        int  i = 0, sum = 0;
        for(i=0;i<currentSize;i++){
            sum += students[i].getGrade();
        }
        sum /= currentSize;
        avg = sum;
    }


    public int getAvg() {
        calculateAvg();
        return avg;
    }


    public String getDay() {
        return day;
    }


    public void setDay(String day) {
        this.day = day;
    }


    public int getCapacity() {
        return capacity;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
