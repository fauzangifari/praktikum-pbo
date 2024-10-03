/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author fauza
 */
public final class Teacher extends Person{
    int yearOfExperience;
    double salary;
    
    Teacher(String name, int age, String gender, int yearOfExperience, double salary){
        super(name, age, gender);
        this.yearOfExperience = yearOfExperience;
        this.salary = salary;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
    void biodataTeacher(){
        System.out.println("Nama: " + super.getName());
        System.out.println("Umur: " + super.getAge());
        System.out.println("Jenis Kelamin: " + super.getGender());
        System.out.println("Pengalaman Bekerja: " + this.getYearOfExperience());
        System.out.println("Gaji: " + this.getSalary());
        super.sayHello();
    }
}
