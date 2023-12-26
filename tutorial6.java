// Task 1

// abstract class Parent {
//     int balance;

//     abstract void message();
// }

// class firstChild extends Parent {
//     void message(){
//         System.out.println("Child1 message.");
//     }
// }

// class secondChild extends Parent {
//     void message(){
//         System.out.println("Child2 message.");
//     }
// }

// public class tutorial6 {

//     public static void main(String[] args) {
//         Parent p1 = new firstChild();
//         Parent p2 = new secondChild();

//         // child1.message();
//         p1.message();
//         p2.message();
//     }
// }

// Task 2

// abstract class Bank {

//     abstract void getBalance(int balance);
// }

// class BankA extends Bank {
//     BankA() {
//         super();
//     }

//     @Override
//     void getBalance(int balance) {
//         System.out.println("Deposited: $" + balance + " in BankA");
//     }
// }

// class BankB extends Bank {
//     BankB() {
//         super();
//     }

//     @Override
//     void getBalance(int balance) {
//         System.out.println("Deposited: $" + balance + " in BankB");
//     }
// }

// class BankC extends Bank {
//     BankC() {
//         super();
//     }

//     @Override
//     void getBalance(int balance) {
//         System.out.println("Deposited: $" + balance + " in BankC");
//     }
// }

// public class tutorial6 {
//     public static void main(String[] args) {
//         BankA bank1 = new BankA();
//         BankB bank2 = new BankB();
//         BankC bank3 = new BankC();

//         bank1.getBalance(100);
//         bank2.getBalance(150);
//         bank3.getBalance(200);
//     }
// }

// Task 3

// abstract class Shape {
//     abstract void getRectangleArea(int length, int width);

//     abstract void getSquareArea(int length);

//     abstract void getCircleArea(int radius);
// }

// class Area extends Shape {

//     @Override
//     void getRectangleArea(int length, int width) {
//         System.out.println("Area of rectangle: " + length * width);
//     }

//     @Override
//     void getCircleArea(int radius) {
//         System.out.println("Area of circle: " + Math.PI * radius * radius);
//     }

//     @Override
//     void getSquareArea(int length){
//         System.out.println("Area of square: "+length*length);
//     }
// }

// public class tutorial6 {

//     public static void main(String[] args) {
//         Area a1 = new Area();

//         a1.getCircleArea(10);
//         a1.getRectangleArea(5, 2);
//         a1.getSquareArea(5);
//     }
// }

// Task 4

// interface Employee {
//     void getEmployeeId();

//     void printSalary(int salary);
// }

// class Manager implements Employee {

//     @Override
//     public void getEmployeeId() {
//         System.out.println("Manager Id: 1");
//     }

//     @Override
//     public void printSalary(int salary) {
//         System.out.println("Manager Salary: " + salary);
//     }
// }

// class Developer implements Employee {
//     @Override
//     public void getEmployeeId() {
//         System.out.println("Developer Id: 2");
//     }

//     @Override
//     public void printSalary(int salary) {
//         System.out.println("Developer Salary: "+salary);
//     }
// }

// public class tutorial6 {
//     public static void main(String[] args) {
//         Manager manager1 = new Manager();
//         Developer developer1 = new Developer();

//         manager1.printSalary(200000);
//         manager1.getEmployeeId();

//         developer1.printSalary(200000);
//         developer1.getEmployeeId();
//     }
// }


// Task 7

// import java.util.regex.Pattern;

// public class tutorial6 {

//     public static void main(String[] args) {
//         boolean isValid = Pattern.matches("[0-9a-zA-Z]","1");
//         System.out.println(isValid);
//     }
// }



// Task 9

import java.util.regex.Pattern;
public class tutorial6 {

    public static void main(String[] args) {
        boolean result = Pattern.matches("[a-zA-Z0-9]+\\.(txt/java)", "java.txt");
        System.out.println(result);
    }
}