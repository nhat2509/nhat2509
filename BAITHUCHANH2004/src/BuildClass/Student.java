package BuildClass;

import java.util.Scanner;

public class Student extends Person {
    private double math, physics,average;

    public Student() {

    }

    public Student(String name, int age, double math, double physics) {
        this.name = name;
        this.age = age;
        this.math = math;
        this.physics = physics;
        average = (math + physics) / 2;
    }

    public double getAverage() {
        return average;
    }

    public double getMath() {
        return math;
    }
    public double getPhysics() {
        return physics;
    }

    public void display() {
        super.display();
        System.out.println("\tDiem toan: " + math);
        System.out.println("\tDiem vat ly: " + physics);
        System.out.println("\tDiem trung binh: " + average);
    }

    public void enter(Scanner sc) {
        super.enter(sc);
        System.out.print("\tNhap diem toan: ");
        math = sc.nextDouble();
        System.out.print("\tNhap diem ly: ");
        physics = sc.nextDouble();
        average = (math + physics ) / 2;
    }
}
