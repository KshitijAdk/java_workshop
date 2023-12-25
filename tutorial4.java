// class Car {
//     String brand, model;
//     int year;
// }

// public class tutorial4 {
//     public static void main(String[] args) {
//         Car car1 = new Car();
//         car1.brand = "Mercedes";
//         car1.model = "Benz";
//         car1.year = 1990;
//         System.out.println(car1.brand+"\n"+car1.model+"\n"+car1.year);
//     }
// }

// class Student {
//     String name;
//     int roll_no;
//     int age;

//     Student(String name, int roll_no, int age){
//         this.name = name;
//         this.roll_no = roll_no;
//         this.age = age;
//     }
// }

// public class tutorial4 {

//     public static void main(String[] args) {
//         Student data = new Student("John", 2, 19);
//         System.out.println(data.name+"\n"+data.roll_no+"\n"+data.age);
//     }
// }

// class Traingle {
//     int side1, side2, side3;

//     Traingle(int side1, int side2, int side3) {
//         this.side1 = side1;
//         this.side2 = side2;
//         this.side3 = side3;
//     }
// }

// public class tutorial4 {

//     public static void main(String[] args) {
//         Traingle traingleObj = new Traingle(3, 4, 5);
//         System.out.println("The sides of traingle are: " + traingleObj.side1 + ", " + traingleObj.side2 + ", "
//                 + traingleObj.side3);
//     }
// }

// class User {

// User(){
// System.out.println("User Created");
// }
// }

// public class tutorial4 {

// public static void main(String[] args) {
// User newUser = new User();
// }
// }

// class Box {
//     double length;
//     double breadth;
//     double height;

//     // For Square Box
//     Box(double length) {
//         this.length = length;
//     }

//     // For Rectangle Box
//     Box(double length, double breadth, double height) {
//         this.length = length;
//         this.breadth = breadth;
//         this.height = height;
//     }

//     // For No Parameter
//     Box() {
//         this.length = 10;
//         this.breadth = 8;
//         this.height = 12;
//     }
// }

// public class tutorial4 {

//     public static void main(String[] args) {
//         Box squareBox = new Box(5);
//         System.out.println("Square Box - length: " + squareBox.length);

//         Box rectangleBox = new Box(6, 4, 8);
//         System.out.println("Rectangle Box - Length: " + rectangleBox.length + ", breadth: " + rectangleBox.breadth
//                 + ", Height: " + rectangleBox.height);

//         Box defaultBox = new Box();
//         System.out.println(
//                 "Length: " + defaultBox.length + ", Breadth: " + defaultBox.breadth + ", Height: " + defaultBox.height);
//     }
// }

class Employee {
    int id;
    public String name;
    public String experience;
    public String department;
    private int age;
    private double salary;

    Employee(int id, String name, String experience, String department, int age,
            int salary) {
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.department = department;
        this.age = age;
        this.salary = salary;

    }
}

public class tutorial4 {

    public static void main(String[] args) {
        Employee emp = new Employee(1, "Kshitij", "Worked as Software Engineer",
                "IT", 19, 20000);

    }
}