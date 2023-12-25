// Q.No.1
// public class workshop1 {
//     public static void main(String[] args) {
//         String myName = "Kshitij Adhikari";
//         System.out.println("Hey there,\nI am \""+myName +"\"!");
//     }
// }


// Q.No.2
// public class workshop1 {

//     public static void main(String[] args) {
//         int num1 = 45, num2 = 32, diff, product;

//         diff = num1 - num2;
//         product = num1 * num2;

//         System.out.println("The difference of 45 and 32 is "+diff);
//         System.out.println("The product of 45 and 32 is "+product);
//     }
// }


// Q.No.3
// public class workshop1 {

//     public static void main(String[] args) {
//         int myInt = 4;
//         char myChar = 'K';
//         double myNum = 2/3d;

//         System.out.println(myInt);
//         System.out.println(myChar);
//         System.out.println(myNum);
//     }
// }



// Q.No.4
// import java.util.Scanner;
// public class workshop1 {

//     public static void main(String[] args) {

//         Scanner sides = new Scanner(System.in);

//         System.out.println("Enter the length of side a: ");
//         double a = sides.nextDouble();

//         System.out.println("Enter the length of side a: ");
//         double b = sides.nextDouble();

//         System.out.println("Enter the length of side a: ");
//         double c = sides.nextDouble();

//         double s = (a+b+c) / 2;

//         double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));

//         System.out.println("The area of traingle is "+area);

//         sides.close();

//     }
// }



// Q.No.5
// import java.util.Scanner;
// public class workshop1 {

//     public static void main(String[] args) {
//         Scanner length = new Scanner(System.in);
//         System.out.println("Enter the length of one side of square: ");

//         while (!length.hasNextDouble()){
//             System.out.println("Invalid input. Please enter a valid number.\nEnter the length of one side of square: ");
//             length.next();
//         }
//         double l = length.nextDouble();
//         double area = Math.pow(l, 2);

//         System.out.println("The area of square is "+area);
//         length.close();
//     }
// }



// Q.No.6
// import java.util.Scanner;
// public class workshop1 {

//     public static void main(String[] args) {
//         Scanner temp = new Scanner(System.in);
//         System.out.println("Enter the temperature in celsius: ");

//         double celsius = temp.nextDouble();
//         double f = celsius * 9/5 + 32;

//         System.out.println("The tempertaure of "+celsius+"°C is "+ f+" F.");
//         temp.close();
//     }
// }



// Q.No.7
import java.util.Scanner;
public class workshop1 {

    public static void main(String[] args) {
        Scanner cylinder = new Scanner(System.in);

        System.out.println("Enter the radius of cylinder: ");

        while (cylinder.hasNextDouble() == false){
            System.out.println("Invalid input. Please enter a valid number.\nEnter the radius of cylinder:");
            cylinder.next();
        }
        double radius = cylinder.nextDouble();

        System.out.println("Enter the height of cylinder: ");
        while (cylinder.hasNextDouble() == false){
            System.out.println("Invalid input. Please enter a valid number.\nEnter the radius of cylinder:");
            cylinder.next();
        }
        double height = cylinder.nextDouble();

        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("The volume of the cylinder is "+volume);
    }
}




// Q.No.8
// import java.util.Scanner;
// public class workshop1 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the principal amount: ");
//         double principal = sc.nextDouble();

//         System.out.println("Enter the time period: ");
//         double time = sc.nextDouble();

//         System.out.println("Enter the rate  of interest: ");
//         double rate = sc.nextDouble();

//         double SI = (principal * rate * time)/100;
//         System.out.println("The Simple Interest amount is "+SI);
//     }
// }



// Q.No.9
// import java.util.Scanner;
// public class workshop1 {

//     public static void main(String[] args) {
//         int num1, num2, sum, diff, prod, div;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number: ");
//         num1 = sc.nextInt();

//         System.out.println("Enter the second number");
//         num2 = sc.nextInt();

//         sum = num1 + num2;
//         diff = num1 - num2;
//         prod = num1 * num2;
//         div = num1/num2;

//         System.out.println("The sum of the numbers is "+sum);
//         System.out.println("The difference of the numbers is "+diff);
//         System.out.println("The product of the numbers is "+prod);
//         System.out.println("The divison of the numbers is "+div);

//         sc.close();
//     }
// }



// Q.No.10
// import java.util.Scanner;
// public class workshop1 {

//     public static void main(String[] args) {
//         double length, width, perimeter;

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the length of rectangle: ");
//         length = sc.nextDouble();

//         System.out.println("Enter the width of rectangle: ");
//         width = sc.nextDouble();

//         perimeter = 2 * (length + width);
//         System.out.println("The perimeter of the rectangle is "+perimeter);

//         sc.close();
//     }
// }



// Q.No.11
// import java.util.Scanner;
// public class workshop1 {

//     public static void main(String[] args) {
//         double miles, km;

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the distance in miles: ");
//         miles = sc.nextDouble();

//         km = miles * 1.6;
//         System.out.println("The given distance in kilometers is "+km);

//         sc.close();
//     }
// }




// Q.No.12
// import java.util.Scanner;
// public class workshop1 {

//     public static void main(String[] args) {
//         double radius, area;

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the radius of circle: ");
//         radius = sc.nextDouble();

//         area = Math.PI * Math.pow(radius, 2);
//         System.out.println("The area of the circle is "+area);

//         sc.close();
//     }
// }



// Q.No.14
// import java.util.Scanner;
// public class workshop1 {

//     public static void main(String[] args) {
//         double USD, NPR, excRate;

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the amount in US dollars: ");
//         USD = sc.nextDouble();

//         System.out.println("Enter the exchange rate into Nepali Rupees: ");
//         excRate = sc.nextDouble();

//         NPR = USD * excRate;
//         System.out.println("The total Nepali currency is "+NPR);

//         sc.close();
//     }
// }




// // Q.No.13
// import java.util.Scanner;

// public class workshop1 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the quantity of items: ");
//         int quantity = sc.nextInt();

//         System.out.print("Enter the price per item: ");
//         double pricePerItem = sc.nextDouble();

//         sc.close();

//         double totalCost = quantity * pricePerItem;

//         System.out.println("The total cost is: $" + totalCost);
//     }
// }