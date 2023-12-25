// Q.N0.1

// public class workshop3 {
//     public static void main(String[] args){
//         for (int i = 1; i<=10; i++){
//             System.out.println(i);
//         }
//     }
// }

// Q.No.2

// import java.util.Scanner;

// public class workshop3 {

//     public static void main(String[] args) {
//         int i = 1, fact = 1;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int n = sc.nextInt();

//         while (i <= n) {
//             fact = fact * i;
//             i++;
//         }
//         System.out.printf("The factorial of %d is: %d", n, fact);

//         sc.close();
//     }
// }

// Q.No.3

// import java.util.Scanner;

// public class workshop3 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         do {
//             System.out.println("Enter a number: ");
//             int num = sc.nextInt();
//             if (num == 0) {
//                 break;
//             } else {
//                 System.out.println("You entered: " + num);
//             }
//         } while (true);
//     }
// }

// Q.No.4

// public class workshop3 {

//     public static void main(String[] args) {
//         for (int i =1; i<=7; i++){
//             for (int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// Q.No.5

// public class workshop3 {

//     public static void main(String[] args) {
//         int[] arr = { 2, 4, 6, 8, 10 };

//         System.out.print("Original Array: ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();

//         System.out.print("Reversed Array: ");
//         for (int i = arr.length - 1; i >= 0; --i) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// Q.No.6

// public class workshop3 {

//     public static void main(String[] args) {
//         float[] arr = { 2.1f, 3.4f, 5.6f, 4.6f };

//         float sum = 0, avg = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//             avg = sum / arr.length;
//         }
//         System.out.printf("Sum: %.2f\n", sum);
//         System.out.printf("Average: %.2f\n", avg);
//     }
// }

// Q.No.7

// import java.util.Scanner;

// public class workshop3 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string: ");
//         String str = sc.nextLine();

//         String[] arr = { "Kshitij", "Swarup", "Safal", "Sajag", "Anmol" };

//         int index = -1;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i].equals(str)) {
//                 index = i;
//                 break;
//             }
//         }
//         if (index != -1) {
//             System.out.println("This string is present at index: " + index);
//         } else {
//             System.out.println("This string is not found in the array.");
//         }
//         sc.close();
//     }
// }

// Q.No.8

public class workshop3 {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 23, 21, 12, 56, 34, 9 };

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        bubbleSort(arr);
    }
}

// Q.No.9

// public class workshop3 {

//     public static void main(String[] args) {
//         char[] array = { 'A', 'b', 'c', 'd', 'e', 'f', 'i', 'u' };

//         int vowelCount = 0;
//         for (char ch : array) {
//             // System.out.println(ch);
//             char ch1 = Character.toLowerCase(ch);
//             if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
//                 vowelCount++;
//             }
//         }
//         System.out.println(vowelCount);
//     }
// }

// Q.No.10

// public class workshop3 {

//     public static void main(String[] args) {
//         double[] array = { 2.99d, 3.21d, 5.5d, 4.8d, 9.45d };

//         double max = Double.MIN_VALUE;
//         for (double arr : array) {
//             if (arr > max) {
//                 max = arr;
//             }
//         }
//         System.out.println("The maximum number is: " + max);
//     }
// }

// Q.No.11

// public class workshop3 {

//     public static void main(String[] args) {
//         int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

//         int sum = 0;

//         for (int[] row : matrix) {
//             for (int value : row) {
//                 sum += value;
//             }
//         }

//         System.out.println("Sum of all elements in the 2D array: " + sum);
//     }
// }

// Q.No.12

// public class workshop3 {

//     public static void main(String[] args) {
//         String[] stringArray = { "My ", "name ", "is ", "Kshitij ", "Adhikari " };

//         StringBuilder concatString = new StringBuilder();

//         for (String str : stringArray) {
//             concatString.append(str);
//         }
//         System.out.println("Your concated string is: "+concatString);
//     }
// }