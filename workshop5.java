// Q.No.1

// class Animal {
//     String name;
//     int age;
//     Animal(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
// }
// class Dog extends Animal {
//     String breed;

//     Dog(String name, int age, String breed) {
//         super(name, age);
//         this.breed = breed;
//     }
// }
// public class workshop5 {
//     public static void main(String[] args) {
//         Animal animal1 = new Animal("Rocky", 10);
//         Dog dog1 = new Dog("Golu", 10, "Retriever");

//         System.out.println(animal1.name + " " + animal1.age);
//         System.out.println(dog1.name + " " + dog1.age + " " + dog1.breed);
//     }
// }

// Q.No.2

// class Shape {
//     void getPerimeter() {
//         System.out.println("Perimeter calculation");
//     }

//     void getArea() {
//         System.out.println("Area calculation");
//     }
// }

// class Circle extends Shape {
//     double radius;

//     Circle(double radius) {
//         this.radius = radius;
//     }

//     @Override
//     void getPerimeter() {
//         double perimeter = 2 * Math.PI * radius;
//         System.out.println("Perimeter of the circle is: " + perimeter);
//     }

//     @Override
//     void getArea() {
//         double area = Math.PI * radius * radius;
//         System.out.println("Area of the circle is: " + area);
//     }
// }

// public class workshop5 {
//     public static void main(String[] args) {
//         Circle circle1 = new Circle(5);

//         circle1.getPerimeter();
//         circle1.getArea();
//     }
// }

// Q.No.3

// class Animal {
//     String name;
//     Animal(String name){
//         this.name = name;
//     }

//     void eat(){
//         System.out.println(name + " " + "is eating.");
//     }
// }

// class Dog extends Animal {
//     Dog(String name){
//         super(name);
//     }
//     void bark(){
//         System.out.println(name + " "+ "is barking.");
//     }
// }

// public class workshop5 {

//     public static void main(String[] args) {
//         Dog dog1 = new Dog("rocky");
//         Animal animal1 = new Animal("Rocky");

//         // animal1.eat();
//         dog1.eat();
//         dog1.bark();
//     }
// }

// Q.No.4

// class Person {
//     protected String address;

//     Person(String address){
//         this.address = address;
//     }
// }

// class Employee extends Person {
//     String department;

//     Employee(String department, String address){
//         super(address);
//         this.department = department;
//     }
// }

// public class workshop5 {

//     public static void main(String[] args) {
//         Employee emp = new Employee("SSD", "Herald");

//         System.out.println(emp.address);
//         System.out.println(emp.department);
//     }
// }

// Q.No.5

// class Parent {
//     public String publicVar = "Public Variable";
//     private String privateVar = "Private Variable";
//     protected String protectedVar = "Protected Variable";
// }

// class Child extends Parent {
//     void accessVariable(){
//         // System.out.println(privateVar);

//         System.out.println(protectedVar);
//         System.out.println(publicVar);
//     }
// }

// public class workshop5 {

//     public static void main(String[] args) {
//         Child child1 = new Child();
//         child1.accessVariable();
//     }
// }

// Q.No.6

// final class FinalClass {
//     // Final method
//     final void finalMethod() {
//         System.out.println("This is a final method in FinalClass");
//     }
// }
// // Attempt to extend a final class (will result in a compilation error)
// // class AnotherClass extends FinalClass {} // Uncommenting this line will result in a compilation error

// // class Subclass extends FinalClass {
//     // Attempt to override a final method (will result in a compilation error)
//     // @Override
//     // void finalMethod() {} // Uncommenting this line will result in a compilation error
// // }
// public class workshop5 {
//     public static void main(String[] args) {
//         // Create an instance of Subclass
//         FinalClass class1 = new FinalClass();

//         // Call the final method
//         class1.finalMethod();
//     }
// }

// Q.No.7

class Calculator {
    void addition(int a, int b) {
        int result = a + b;
        System.out.println("Result of adding two integers: " + result);
    }

    void addition(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Result of adding three integers: " + result);
    }

    void addition(double a, double b) {
        double result = a + b;
        System.out.println("Result of adding two doubles: " + result);
    }

    void addition(double a, double b, double c) {
        double result = a + b + c;
        System.out.println("Result of adding three doubles: " + result);
    }
}

public class workshop5 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.addition(5, 8);
        calculator.addition(10, 15, 20);
        calculator.addition(3.5, 2.7);
        calculator.addition(1.1, 2.2, 3.3);
    }
}
