/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author fauza
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Fauzan", 20, "Laki-laki", "information System", 4.00);
//        student1.name = "Fauzan";
//        student1.age = 20;
//        student1.gender = "Laki - Laki";
//        student1.major = "Information System";
//        student1.gpa = 4.00;
        
        Teacher teacher1 = new Teacher("Pak Putut", 35, "Laki-laki", 5, 10_000_000);
//        teacher1.name = "Pak Putut";
//        teacher1.age = 35;
//        teacher1.gender = "Laki - laki";
//        teacher1.salary = 10_000_000;
//        teacher1.yearOfExperience = 5;
        
//        student1.sayHello();
//        teacher1.sayHello();
        
        student1.biodataStudent();
        System.out.println("=======================");
        teacher1.biodataTeacher();
    }
}
