// public class tutorial3 {

//     public static void main(String[] args) {
//         String clzName = "Herald College Kathmandu";

//         for (int i=1; i<=5; i++){
//             System.out.println(clzName);
//         }
//     }
// }

// import java.util.Scanner;
// public class tutorial3 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of natural numbers: ");
//         int n = sc.nextInt();

//         int sum = 0;
//         for (int i=1; i<=n; i++){
//             sum = sum + i;
//         }
//         System.out.println("The total sum is "+sum);
//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class tutorial3 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of even terms: ");
//         int n = sc.nextInt();

//         int sum = 0;
//         for (int i = 1; i <= n; i++) {

//             sum = sum + 2 * i;
//         }
//         System.out.println("The sum of first " + n + " even numbers is " + sum);
//     }
// }

// While Loops in Java

// import java.util.Scanner;

// public class tutorial3 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number to print multiplication table: ");
//         int num = sc.nextInt();

//         int i = 1;
//         while (i <= 10) {
//             System.out.printf("%d * %d = %d\n", num, i, num * i);
//             i++;
//         }
//         sc.close();
//     }
// }

// public class tutorial3 {

//     public static void main(String[] args) {

//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j<=i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class tutorial3 {

//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class tutorial3 {

//     public static void main(String[] args) {

//         // Initializing an array
//         int [] arr = {1,2,3,4,5,6};
//         int[] myArr = new int[7];
//         int[] arr1;
//         arr1 = new int[10];
//     }
// }

// public class tutorial3 {

//     public static void main(String[] args) {

//         int[][] array = { { 5, 12, 17, 9, 3 }, { 13, 4, 8, 14, 1 }, { 9, 6, 3, 7, 21 } };

//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print(array[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class tutorial3 {

//     public static void main(String[] args) {
//         int[] integerArray = {1,2,3,4,5};        

//         for (int i = 0; i<=integerArray.length; i++){

//             System.out.println(integerArray[i]);
//         }
//     }
// }

import java.util.Scanner;

public class tutorial3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int[] integerArray = { 1, 2, 3, 4, 5 };

        // Use a flag to track whether the number is found
        boolean found = false;

        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] == num) {
                found = true;
                break; // Exit the loop once the number is found
            }
        }

        // Print the result after the loop
        if (found) {
            System.out.println("Number found.");
        } else {
            System.out.println("Number not found.");
        }
    }
}
