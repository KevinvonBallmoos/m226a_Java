package edu.ab01;

public class NewClass {

    Integer saldo;

    public static void main(String[] args) {
        MyClass myclass = new MyClass("Kevin", "Ballmoos");
        String firstName = myclass.getFirstName();
        System.out.println(firstName);
    }
}
