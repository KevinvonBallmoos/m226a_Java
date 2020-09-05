package edu.ab01;

public class MyClass {

    private String firstName;
    private String lastName;
    private Integer age;
    private Boolean married;

    public MyClass() {

    }

    public void printFullName() {
        System.out.println(this.firstName + this.lastName);
    }

    public MyClass(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public Integer calcDivision(Integer number1, Integer number2) {
        return number1 / number2;
    }
}
