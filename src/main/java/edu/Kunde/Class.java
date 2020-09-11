package edu.Kunde;

class Class {

    int age = 5;
    int y = 3;
    private String fname = "John";
    private String lname = "Doe";



    public static void main(String[] args) {

        OtherClass otherClass = new OtherClass();
        Class klasse = new Class();
        for (int i = 0; i < 3; i++){

            System.out.println(otherClass.name);
        }
        otherClass.setName(otherClass.name);
        System.out.println(klasse.fname + otherClass.name);

        if (otherClass.name.equals("Yvan")){
            System.out.println("Graduation");

        }
        else if (otherClass.name.equals("Kevin")){
            System.out.println("Hallo");
        }
        System.out.println(otherClass.getName());

    }

}


