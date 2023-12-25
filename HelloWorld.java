// // // public class HelloWorld {

// // //     public static void main(String[]args) {
// // //         System.out.println("Hello Kshitij");
// // //     }
// // // }

// // public class HelloWorld {
// //     public static void main(String[]args){
// //         float num1 = 10, num2 = 8, sum, diff, mul, div, rem;
// //         sum = num1+num2;
// //         diff = num1-num2;
// //         mul = num1*num2;
// //         div = num1/num2;
// //         rem = num1 % num2;
// //         System.out.println(sum);
// //         System.out.println(diff);
// //         System.out.println(mul);
// //         System.out.println(div);
// //         System.out.println(rem);
// //     }
// // }


// // public class HelloWorld {
// //     public static void main(String[]args) {
// //         float length = 10f, breadth = 20f, area;
// //         area = length * breadth;
// //         System.out.println("The area of rectangle is "+area);
// //     }
// // }


// // public class HelloWorld {
// //     public static void main (String[]args) {
// //         float PI = 3.14f, area, radius, circum;
// //         radius = 5;
// //         area = PI * radius *radius;
// //         circum = 2 * PI * radius;
// //         System.out.println("The area if circle is "+area);
// //         System.out.println("The circumference if circle is "+circum);
// //     }
// // }

// import java.util.Scanner;

// public class HelloWorld {
//     public static void main (String[]args) {

//         // float SI, principle, time, rate;
//         // principle = 1000f;
//         // time = 2f;
//         // rate = 4f;
//         // SI = (principle*rate*time)/100;
//         // System.out.println(SI);

//         Scanner age = new Scanner(System.in);
//         System.out.println("Enter your age: ");
//         int myAge = age.nextInt();
//         if (myAge >= 18) {
//             System.out.println("You are eligible to vote.");
//         }else {
//             System.out.println("You are not eligible to vote.");
//         }
//         age.close();

//         // float area, radius, circum;
//         // radius = 5;
//         // area = Math.Pi * Math.pow(radius);
//         // circum = 2 * Math.pi * radius;
//         // System.out.println("The area if circle is "+area);
//         // System.out.println("The circumference if circle is "+circum);
//     }
// }



// import java.util.Scanner;

// public class HelloWorld {

//     public static void main(String[] args) {
//         Scanner num1 = new Scanner(System.in);
//         System.out.println("Enter the first number: ");
//         int firstNum = num1.nextInt();


//         Scanner num2 = new Scanner(System.in);
//         System.out.println("Enter the second number: ");

//         int secondNum = num2.nextInt();

//         int sum = firstNum + secondNum;
//         System.out.println("The sum is "+ sum);
//     }
// }

// -----Question 1------//
public class HelloWorld {

    public static void main(String[] args) {
        String myName = "Kshitij Adhikari";
        System.out.println("Hey there,\nI am \""+myName +"\"!");
    }
}


// // ----Question 2-------//
// public class HelloWorld {

//     public static void main(String[] args) {
//         int num1 = 45, num2 = 32, diff, product;

//         diff = num1 - num2;
//         product = num1 * num2;

//         System.out.println("The difference of 45 and 32 is "+diff);
//         System.out.println("The product of 45 and 32 is "+product);
//     }
// }