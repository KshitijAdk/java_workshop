// class Animal{
//     int age;
//     int weight;

//     void print(){
//         System.out.println("I am inside Dog class.");
//     }
// }

// class Dog extends Animal{
//     String breed;
// }

// public class tutorial5 {
//     public static void main(String[] args) {
//         Dog dog1 = new Dog();

//         dog1.age = 10;
//         dog1.weight = 20;
//     }
// }

// Task 1

// class Person {
//     String name;
//     int age;
// }

// class Employee extends Person {
//     int employeeId;
//     double salary;
// }

// public class tutorial5 {

//     public static void main(String[] args) {
//         Employee employee1 = new Employee();

//         employee1.name = "Kshitij";
//         employee1.age = 19;
//         employee1.employeeId = 101;
//         employee1.salary = 2000.00;
//     }
// }

// Task 2

// class Animal {
//     String name;
//     int weight;
//     String color;
//     int age;
// }

// class Dog extends Animal {
//     String breed;
//     boolean isIndoor;
// }

// class Cat extends Animal {

// }

// Task 3

// class Animal {
//     String name;
//     int weight;
//     String color;
//     int age;

//     void makeSound() {
//         System.out.println("Sound made by Animal class.");
//     }
// }

// class Dog extends Animal {
//     String breed;
//     boolean isIndoor;

//     @Override
//     void makeSound() {
//         System.out.println("Sound made by Dog class.");
//     }
// }

// class Cat extends Animal {
//     @Override
//     void makeSound() {
//         System.out.println("Sound made by Cat class.");
//     }
// }

// public class tutorial5 {

//     public static void main(String[] args) {
//         Dog dog1 = new Dog();
//         Cat cat1 = new Cat();

//         dog1.makeSound();
//         cat1.makeSound();
//     }
// }

// Task 4

// class A {
//     void display() {
//         System.out.println("Class A");
//     }
// }

// class B extends A {
//     @Override
//     void display() {
//         System.out.println("Class B");
//     }
// }

// class C extends B {
//     @Override
//     void display() {
//         System.out.println("Class C");
//     }
// }

// public class tutorial5 {

//     public static void main(String[] args) {
//         C c1 = new C();
//         c1.display();
//     }
// }

// Task 5

// class Animal {
//     int age;
//     int weight;

//     void makeSound(){
//         System.out.println("Make sound in Animal class");
//     }

//     Animal(int age, int weight){
//         this.age = age;
//         this.weight = weight;
//     }
// }

// class Dog extends Animal {
//     String breed;

//     Dog(int age, int weight, String breed){
//         super(age,weight);
//         this.breed = breed;
//     }
// }

// public class tutorial5 {

//     public static void main(String[] args) {
//         Dog dog1 = new Dog(10, 20, "Husky");

//         dog1.makeSound();
//         System.out.println(dog1.age+"\n"+dog1.weight+"\n"+dog1.breed);
//     }
// }

// Task 6

class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    double area(){
        return 0.00;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    double area(){
        return length*width;
    }
}

class Square extends Shape{
    double length;

    Square(double length, String color){
        super(color);
        this.length = length;
    }
    @Override
    double area(){
        return length*length;
    }
}