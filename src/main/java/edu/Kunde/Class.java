package edu.Kunde;

class Class {

    int age = 5;
    int y = 3;
    String fname = "John";
    String lname = "Doe";

    public static void main(String[] args) {

        Class myObj = new Class();
        Class myObj2 = new Class();
        myObj2.y = 50;
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);

    }

}


