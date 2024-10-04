/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author fauza
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public void sayHello(){
        System.out.println("Halo perkenalkan, " + this.name + ", umur saya " + this.age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {      
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    } 

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    
    
}

