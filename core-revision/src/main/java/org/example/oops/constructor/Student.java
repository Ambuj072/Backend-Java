package org.example.oops.constructor;



public class Student {

    String name;
    int age;
    int marks;

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    Student(){
//        this.name="Ambuj";
//        this.age=24;
//        this.marks=90;
//
        //internally:- new Student("Ambuj dubey",15,80);
        this("Ambuj dubey",15,80);
    }
    Student(Student other){
        this.name=other.name;
        this.age=other.age;
        this.marks=other.marks;
    }

    //it is treated like method not constructor
    void Student(){
        System.out.println("hello");
    }

    //inside constructor passing another object
    void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);

    }

    //here change the name

    void changeName(String newName){
        //passing the name to current object
        this.name=newName;
    }


    public static void main(String[] args) {
        Student ambuj=new Student();
        ambuj.print();
        //ambuj.changeName("anup");
       // ambuj.print();
        Student random=new Student(ambuj);
        random.print();
        random.Student();

        Student one=new Student();
        Student two=one;
        //passing one two another
        two.name="ramesh";

        System.out.println(one.name);


    }
}
