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

class Shape {
    double getPerimeter() {
        return 0.00;
    }

    double getArea() {
        return 0.00;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class workshop5 {
    public static void main(String[] args) {
        
    }
}