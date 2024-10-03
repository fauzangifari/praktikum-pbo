/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author fauza
 */
public final class Student extends Person {
    private String major;
    private double gpa;
    
    Student(String name, int age, String gender, String major, double gpa){
        super(name, age, gender);
        this.major = major;
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    void biodataStudent(){
        System.out.println("Nama: " + super.getName());
        System.out.println("Umur: " + super.getAge());
        System.out.println("Jenis Kelamin: " + super.getGender());
        System.out.println("Program Studi: " + this.getMajor());
        System.out.println("IPK: " + this.getGpa());
        super.sayHello();
    }
}
