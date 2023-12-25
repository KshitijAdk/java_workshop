// // Q.No.2

// import java.util.Scanner;

// public class workshop2 {
//     public static void main(String[] args) {
//         int marks;

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your marks: ");
//         marks = sc.nextInt();

//         if (marks >= 40 && marks < 50) {
//             System.out.println("Your grade is 'C'.");
//         } else if (marks >= 50 && marks < 60) {
//             System.out.println("Your grade is 'C+'.");
//         } else if (marks >= 60 && marks < 70) {
//             System.out.println("Your grade is 'B'.");
//         } else if (marks >= 70 && marks < 80) {
//             System.out.println("Your grade is 'B+'.");
//         } else if (marks >= 80 && marks < 90) {
//             System.out.println("Your grade is 'A'.");
//         } else if (marks >= 90 && marks <= 100) {
//             System.out.println("Your grade is 'A+'.");
//         } else if (marks > 100) {
//             System.out.println("Invalid input. Marks should be between 0 to 100.");
//         } else {
//             System.out.println("You are fail.");
//         }
//         sc.close();
//     }
// }

// Q.No.1

// import java.util.Scanner;

// public class workshop2 {

//     public static void main(String[] args) {
//         int length, breadth;
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the length of rectangle: ");
//         length = sc.nextInt();

//         System.out.println("Enter the breadth of rectangle: ");
//         breadth = sc.nextInt();

//         if (length == breadth){
//             System.out.println("It's a square.");
//         }else{
//             System.out.println("It's not a square.");
//         }
//         sc.close();
//     }
// }

// Q.No.3

import java.util.Scanner;

// public class workshop2 {
//     public static void main(String[] args) {
//         int i;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of people: ");
//         int people = sc.nextInt();

//         int oldest = Integer.MIN_VALUE;
//         int youngest = Integer.MAX_VALUE;

//         for (i = 1; i <= people; i++) {
//             System.out.println("Enter the age of person: ");
//             int age = sc.nextInt();

//             if (age > oldest) {
//                 oldest = age;
//             }
//             if (age < youngest) {
//                 youngest = age;
//             }
//         }
//         System.out.println("Oldest person age is: " + oldest);
//         System.out.println("Youngest person age is: " + youngest);
//         sc.close();
//     }
// }

// Q.NO.4

// public class workshop2 {

//     public static void main(String[] args) {
//         int x = 2, y = 5, z = 0;

//         System.out.println(x==2);

//         System.out.println(x != 5);
//         System.out.println(x != 5 && y >= 5);
//         System.out.println(z != 0 || x == 2);
//         System.out.println(!(y < 10));
//     }
// }

// Q.No.5

// import java.util.Scanner;
// public class workshop2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Do you have any medical cause or not('y' or 'n')?: ");
//         char med = sc.next().charAt(0);

//         if (med == 'y') {

//             System.out.println("You are not allowed to sit in the exam.");
//         } else if (med == 'n') {
//             System.out.println("You are allowed to sit in the exam.");
//         } else {
//             System.out.println("Invalid input. Please enter 'y' or 'n'.");
//         }
//         sc.close();
//     }
// }

// Q.No.6

// import java.util.Scanner;

// public class workshop2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number to check even or odd: ");
//         int num = sc.nextInt();

//         if (num % 2 == 0) {

//             System.out.println("This is even number.");
//         } else {
//             System.out.println("This is odd number.");
//         }
//         sc.close();
//     }
// }

// Q.No.7

// import java.util.Scanner;

// public class workshop2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number for value of x: ");
//         int x = sc.nextInt();

//         if (x > 5 && x < 15) {

//             System.out.println("The value of x is: "+x);
//         } else {
//             System.out.println("The number is out of range.");
//         }
//         sc.close();
//     }
// }

// Q.N0.8

// public class workshop2 {

//     public static void main(String[] args) {
//         int x = 20, y = 15, z = 10;

//         if (x > y) {
//             if (y > z) {
//                 System.out.println("x is greater than y and z");
//             } // statement1.
//         } else
//             System.out.println("x is less than or equal to y"); // statement2.

//     }

// }

// Q.No.9

// import java.util.Scanner;
// public class workshop2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your grade: ");
//         String grade = sc.nextLine();
//         switch (grade) {
//             case "A+":
//                 System.out.println("Excellent");
//                 break;
//             case "A":
//                 System.out.println("Outstanding");
//                 break;
//             case "B+":
//                 System.out.println("Good");
//                 break;
//             case "B":
//                 System.out.println("Can do better");
//                 break;
//             case "C+":
//                 System.out.println("Just Passed");
//                 break;
//             case "C":
//                 System.out.println("You Failed");
//                 break;

//             default:

//                 System.out.println("Invalid Grade!");
//                 break;
//         }
//         sc.close();
//     }
// }

// Q.No.10

// class Student {

//     public static void main(String[] args) {
//         int roll_no = 12;    
//         switch (roll_no) {
//             case 10:
//                 System.out.println("Your roll number is 10");
//                 break;
//             case 12:
//                 System.out.println("Your roll number is 12");
//                 break;
//             default:
//                 System.out.println("Your roll number is greater than 12");
//         }
//     }
// }

// Q.No.11

// import java.util.Scanner;

// public class workshop2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a string: ");
//         String s1 = sc.nextLine();
//         System.out.println("Enter another string: ");
//         String s2 = sc.nextLine();

//         System.out.println(s1.length());

//         System.out.println(s1.compareTo(s2));
//         System.out.println(s1.charAt(1));
//         System.out.println(s1.substring(2));
//         System.out.println(s1.equals(s2));
//         System.out.println(s1.toUpperCase());
//         System.out.println(s2.toLowerCase());
//         sc.close();
//     }
// }

// Q.No.12

// import java.util.Scanner;

// public class workshop2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = sc.nextInt();

//         long longNum = num;
//         float myFloat = num;

//         System.out.println("Converted into long: " + longNum);

//         System.out.println("Converted into float: " + myFloat);
//         sc.close();
//     }
// }

// Q.No.13

// import java.util.Scanner;

// public class workshop2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a double datatype number: ");
//         double myDouble = sc.nextDouble();

//         long myLong = (long) myDouble;

//         int myInt = (int) myLong;
//         System.out.println("Double converted into long: " + myInt);
//         System.out.println("Long converted into integer: " + myInt);
//         sc.close();
//     }
// }

// Q.No.14

import java.util.Scanner;

public class workshop2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number in float: ");
        float myFloat = sc.nextFloat();

        int float_to_int = (int) myFloat;
        System.out.println("Converted to integer: " + float_to_int);

        System.out.println("Enter a integer: ");
        int myInt = sc.nextInt();

        float int_to_float = (float) myInt;
        System.out.println("Converted to float: " + int_to_float);
        sc.close();
    }
}