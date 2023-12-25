// Q.No.1

// class BankAccount{
//     String accountNumber;
//     double balance;
//     String accountHolderName;
//     String accountHolderAddress;
// }

// Q.No.2

// class BankAccount {
//     String accountNumber;
//     double balance;
//     String accountHolderName;
//     String accountHolderAddress;
// }

// public class workshop4 {
//     public static void main(String[] args) {
//         BankAccount account1 = new BankAccount();
//         account1.accountNumber = "123U56789K";
//         account1.balance = 20150.97;
//         account1.accountHolderName = "Kshitij Adhikari";
//         account1.accountHolderAddress = "Surkhet";

//         System.out.println("Account Number: " + account1.accountNumber);
//         System.out.println("Balance: " + account1.balance);
//         System.out.println("Account Holder name: " + account1.accountHolderName);
//         System.out.println("Account Holder address: " + account1.accountHolderAddress);
//     }
// }

// Q.No.3

// class BankAccount {
//     String accountNumber;
//     double balance;
//     String accountHolderName;
//     String accountHolderAddress;

//     public void depositMoney(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("Deposited amount: $" + amount + " . New Balance: $" + balance);
//         } else {
//             System.out.println("Invalid amount. Please enter a positive amount.");
//         }
//     }

//     public void withdrawMoney(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance = balance - amount;
//             System.out.println("Withdrawn: $" + amount + ". New balance: $" + balance);
//         } else {
//             System.out.println("Invalid withdrawal amount or insufficient funds.");
//         }
//     }
// }
// public class workshop4 {
//     public static void main(String[] args) {
//         BankAccount account1 = new BankAccount();
//         account1.accountNumber = "123U56789K";
//         account1.balance = 2000.00;
//         account1.accountHolderName = "Kshitij Adhikari";
//         account1.accountHolderAddress = "Surkhet";

//         account1.depositMoney(500.00);
//         account1.withdrawMoney(300.00);
//     }
// }

// Q.No.4

// class Lamp {
//     boolean isOn;

//     public void turnOn() {
//         isOn = true;
//         System.out.println("The lamp is now ON.");
//     }

//     public void turnOff() {
//         isOn = false;
//         System.out.println("The lamp is now OFF.");
//     }

//     public void checkStatus() {
//         if (isOn) {
//             System.out.println("The lamp is ON.");
//         } else {
//             System.out.println("The lamp is OFF.");
//         }
//     }
// }

// public class workshop4 {

//     public static void main(String[] args) {
//         Lamp myLamp = new Lamp();
//         myLamp.turnOn();
//         myLamp.checkStatus();

//         myLamp.turnOff();
//         myLamp.checkStatus();
//     }
// }

// Q.No.5

// class BankAccount {
//     String accountNumber;
//     double balance;
//     String accountHolderName;
//     String accountHolderAddress;

//     BankAccount(String accountNumber, double balance, String accountHolderName, String accountHolderAddress){
//         this.accountNumber = accountNumber;
//         this.balance = balance;
//         this.accountHolderName = accountHolderName;
//         this.accountHolderAddress = accountHolderAddress;
//     }
//     public void displayInfo(){
//         System.out.println("Account Number: "+accountNumber);
//         System.out.println("Account Holder: "+accountHolderName);
//         System.out.println("Balance: $"+balance);
//     }
// }
// public class workshop4 {
//     public static void main(String[] args) {
//         BankAccount account1 = new BankAccount("129U392H343", 2000, "Kshitij Adhikari", "Surkhet");
//         account1.displayInfo();
//     }
// }

// Q.No.6

// class User {
//     User() {
//         System.out.println("User Created");
//     }
// }

// public class workshop4 {

//     public static void main(String[] args) {
//         User newUser = new User();
//     }
// }

// Q.No.7

// class Box {
//     double length;
//     double breadth;
//     double height;
//     // For Square Box
//     Box(double sidelength) {
//         this.length = sidelength;
//         this.breadth = sidelength;
//         this.height = sidelength;
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
// public class workshop4 {
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

// Q.No.8

// class BankAccount {
//     private double balance;

//     public BankAccount(double initialBalance) {
//         this.balance = initialBalance;
//     }
//     public double getBalance() {
//         return balance;
//     }
//     public void deposit(double amount) {
//         balance += amount;
//         System.out.println("Deposited $" + amount + ". New balance: $" + balance);
//     }

//     public void withdraw(double amount) {
//         if (amount > balance) {
//             System.out.println("Insufficient funds. Withdrawal failed.");
//         } else {
//             balance -= amount;
//             System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
//         }
//     }
// }

// public class workshop4 {
//     public static void main(String[] args) {
//         BankAccount account1 = new BankAccount(1000.00);
//         System.out.println("Initial balance: $" + account1.getBalance());

//         account1.deposit(500.0);
//         account1.withdraw(200.0);
//     }
// }

// Q.No.9

// class Address {
//     private String street;
//     private String city;
//     private String zipCode;

//     public Address(String street, String city, String zipCode) {
//         this.street = street;
//         this.city = city;
//         this.zipCode = zipCode;
//     }
//     public String getStreet() {
//         return street;
//     }
//     public String getCity() {
//         return city;
//     }
//     public String getZipCode() {
//         return zipCode;
//     }
// }

// public class workshop4 {
//     public static void main(String[] args) {
//         Address myAddress = new Address("Bhagwati Marg", "Kathmandu", "12345");

//         System.out.println("Street: " + myAddress.getStreet());
//         System.out.println("City: " + myAddress.getCity());
//         System.out.println("Zip Code: " + myAddress.getZipCode());

//     }
// }

// Q.No.10

class BankAccount{

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getbalance(){
        return balance;
    }

    public void setbalance(double balance){
        this.balance = balance;
    }
}

class Customer{
    private int customerId;
    private String name;
    private BankAccount bankaccount;

    public Customer(int customerId, String name, BankAccount bankaccount){
        this.customerId = customerId;
        this.name = name;
        this.bankaccount = bankaccount;
    }
    public int getCustomerId(){
        return customerId;
    }  
    public void setCustomerId (int customerId){
        this.customerId = customerId;
    }
    public String getname(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public BankAccount getbankaccount(){
        return bankaccount;

    }
    public void setBankAccount(BankAccount bankaccount){
        this.bankaccount = bankaccount;
    }
}

public class workshop4 {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("1234", 50000);
        Customer customer1 = new Customer(1, "Kshitij", account1);

        System.out.println("Customer Id :"+ customer1.getCustomerId());
        System.out.println("Customer Name: "+ customer1.getname());
        System.out.println("Customer Account Number: "+ customer1.getbankaccount().getAccountNumber());
        System.out.println("Customer Balance: "+ customer1.getbankaccount().getbalance());

    }
}

// Q.No.11

// class BankAccount {

//     private String accountNumber;
//     private double balance;

//     public BankAccount() {
//         this.accountNumber = "123";
//         this.balance = 200;
//     }

//     public BankAccount(String accountNumber) {
//         this.accountNumber = accountNumber;
//         this.balance = 200;
//     }

//     public BankAccount(double balance) {
//         this.accountNumber = "123";
//         this.balance = balance;
//     }

//     public BankAccount(String accountNumber, double balance) {
//         this.accountNumber = accountNumber;
//         this.balance = balance;
//     }

//     public String getAccountNumber() {
//         return accountNumber;
//     }

//     public void setAccountNumber(String accountNumber) {
//         this.accountNumber = accountNumber;
//     }

//     public double getbalance() {
//         return balance;
//     }

//     public void setbalance(double balance) {
//         this.balance = balance;
//     }
// }

// public class workshop4 {
//     public static void main(String[] args) {
//         BankAccount account1 = new BankAccount();
//         BankAccount account2 = new BankAccount("123");
//         BankAccount account3 = new BankAccount(200);
//         BankAccount account4 = new BankAccount("5774", 5000);

//         System.out.println("Account Number: " + account1.getAccountNumber() + ", Balance: " + account1.getbalance());
//         System.out.println("Account Number: " + account2.getAccountNumber() + ", Balance: " + account2.getbalance());
//         System.out.println("Account Number: " + account3.getAccountNumber() + ", Balance: " + account3.getbalance());
//         System.out.println("Account Number: " + account4.getAccountNumber() + ", Balance: " + account4.getbalance());
//     }
// }