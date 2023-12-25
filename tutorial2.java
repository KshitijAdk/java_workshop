// public class tutorial2 {
//     public static void main(String[] args) {
//         Boolean expr1 = 2 > 3;
//         Boolean expr2 = (2 < 5);

//         Boolean orOperation = expr1 || expr2;

//         System.out.println(orOperation);
//     }
// }

// public class tutorial2 {

//     public static void main(String[] args) {
//         Boolean expr1 = (!(5==10));

//         System.out.println(expr1);
//     }
// }

// public class tutorial2 {

//     public static void main(String[] args) {
//         char ch = 'k';
//         System.out.println(ch);

//         char[] arrayofCharacter = {'a','b','c'};
//         System.out.println(arrayofCharacter);

//         String correspondingString = new String(arrayofCharacter);
//         System.out.println(correspondingString);

//         String myString = "Kshitij Adhikari";
//         System.out.println(myString);

//         String myString2 = new String("Herald College");
//         System.out.println(myString2);

//     }
// }

// public class tutorial2 {

//     public static void main(String[] args) {
//         String s1 = "hello";
//         String s2 = "hello";
//         String s3 = "nepal";
//         String s4 = "kshitij";
//         String s5 = "flag";
//         String s6 = "";

//         System.out.println(s1.compareTo(s2));
//         System.out.println(s1.compareTo(s3));
//         System.out.println(s1.compareTo(s4));
//         System.out.println(s1.compareTo(s5));
//         System.out.println(s1.compareTo(s6));
//     }
// }

// public class tutorial2 {

//     public static void main(String[] args) {
//         // String s1 = "My name is ";
//         // String s2 = "Kshitij Adhikari";

//         // System.out.println(s1.concat(s2));

//         // String name = "Kshitij";
//         // String newsubString = name.substring(2,4);
//         // System.out.println(newsubString);

//         String s1 = "Herald College";
//         String s2 = "It is located in Naxal Kathmandu";

//         System.out.println(s1.length());
//         System.out.println(s2.length());
//     }
// }

// import java.util.Scanner;

// public class tutorial2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter you date of birth: ");
//         int Dob = sc.nextInt();
//         int age = 2023 - Dob;

//         if (age >= 18){
//             System.out.println("You are eligible to vote");
//         }else{
//             System.out.println("You are not eligble to vote.");
//         }
//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class tutorial2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter first number: ");
//         int num1 = sc.nextInt();

//         System.out.println("Enter second number: ");
//         int num2 = sc.nextInt();

//         System.out.println("Enter third number: ");
//         int num3 = sc.nextInt();

//         if (num1 > num2 && num1 > num3){
//             System.out.println(num1 + " is the greatest number.");
//         }else if(num2> num1 && num2 > num3){
//             System.out.println(num2 + " is the greatest number.");
//         }else{
//             System.out.println(num3 + " is the greatest number.");
//         }
//         sc.close();
//     }
// }

// //TASK 8
// import java.util.Scanner;
// public class tutorial2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter you marks: ");
//         int marks = sc.nextInt();

//         if (marks<50){
//             System.out.println("You are fail.");
//         }
//         else if (marks >=50 && marks < 60){
//             System.out.println("You have got 'C' grade.");
//         }
//         else if (marks >= 60 && marks < 70){
//             System.out.println("You have got 'B' grade.");
//         }
//         else{
//             System.out.println("You have got 'A' grade.");
//         }
//         sc.close();
//     }
// }

import java.util.Scanner;

public class tutorial2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = sc.next().charAt(0);

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("This is Vowel");
                break;
            default:
                System.out.println("This is Consonant");
                break;
        }
        sc.close();
    }
}