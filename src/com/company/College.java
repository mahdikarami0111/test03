package com.company;

public class College {
    private String name;
    private Lab[] classes;
    private int toltalAvg;
    private int cap;
    private int current;

    public College(String name,int cap){
        this.name = name;
        this.cap = cap;
        current = 0;
        classes = new Lab[cap];
    }


    public void calculateAvg(){
        int  i = 0;
        int sum = 0;
        if (current == 0){
            return;
        }
        for(i=0;i<current;i++){
            sum += classes[i].getAvg();
        }
        sum /= current;
        toltalAvg = sum;
    }


    public void print(){
        int i = 0;
        if (current == 0){
            System.out.println("No classes added yet");
        }
        else{
            System.out.println( "\n______" + name + " College,information");
            for(i=0;i<current;i++){
                System.out.println("class number " + (i+1) + ":");
                classes[i].printLab();
            }
            calculateAvg();
            System.out.println("avg :" + toltalAvg + "\n");
        }
    }


    public void addClass(Lab lab){
        if (current < cap){
            classes[current] = lab;
            current++;
        }
        else {
            System.out.println("college is full");
        }
    }



    public String getName() {
        return name;
    }

    public int getCurrent() {
        return current;
    }

    public Lab[] getClasses() {
        return classes;
    }

    public void setClasses(Lab[] classes) {
        this.classes = classes;
        current = classes.length;
    }

    public int getToltalAvg() {
        return toltalAvg;
    }

    public int getCap() {
        return cap;
    }

}
