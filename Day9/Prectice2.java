import java.util.Scanner;
public class Prectice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 🟡 Medium Level (16–30)

// Take two numbers as input and print their sum.
System.out.println("Enter num1:");
int num1 = scan.nextInt();
System.out.println("Enter num2:");
int num2 = scan.nextInt();
System.out.println("The sum of " + num1 + " and " + num2 + " is:");
System.out.println(num1 + num2);

// Calculate the area of a rectangle.

System.out.println("Enter the length of the rectangle:");
int length = scan.nextInt();
System.out.println("Enter the width of the rectangle:");
int width = scan.nextInt();
System.out.println("The area of the rectangle is:");
System.out.println(length * width);

// Calculate the perimeter of a rectangle.

System.out.println("Enter the length of the rectangle:");
int length2 = scan.nextInt();
System.out.println("Enter the width of the rectangle:");
int width2 = scan.nextInt();
System.out.println("The perimeter of the rectangle is:");
System.out.println(2 * (length2 + width2));

// Calculate the area of a square.

System.out.println("Enter the side of the square:");
int side = scan.nextInt();
System.out.println("The area of the square is:");
System.out.println(side * side);

// Calculate the circumference of a circle.


// Convert Fahrenheit to Celsius.

System.out.println("Enter temperature in Fahrenheit:");
double fahrenheit2 = scan.nextDouble();
double celsius2 = (fahrenheit2 - 32) * 5/9;
System.out.println("Temperature in Celsius is: " + celsius2);

// Calculate simple interest.

System.out.println("Enter principal amount:");
double principal = scan.nextDouble();
System.out.println("Enter rate of interest:");
double rate = scan.nextDouble();
System.out.println("Enter time period:");
double time = scan.nextDouble();
double simpleInterest = (principal * rate * time) / 100;
System.out.println("Simple Interest is: " + simpleInterest);

// Calculate compound interest (using the formula only).

System.out.println("Enter principal amount:");
double principal2 = scan.nextDouble();
System.out.println("Enter rate of interest:");
double rate2 = scan.nextDouble();
System.out.println("Enter time period:");
double time2 = scan.nextDouble();
double compoundInterest = principal2 * Math.pow(1 + rate2/100, time2) - principal2;
System.out.println("Compound Interest is: " + compoundInterest);

// Calculate the percentage of 5 subjects.

System.out.println("Enter marks for subject 1:");
int marks1 = scan.nextInt();
System.out.println("Enter marks for subject 2:");
int marks2 = scan.nextInt();
System.out.println("Enter marks for subject 3:");
int marks3 = scan.nextInt();
System.out.println("Enter marks for subject 4:");
int marks4 = scan.nextInt();
System.out.println("Enter marks for subject 5:");
int marks5 = scan.nextInt();
double totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
double percentage = (totalMarks / 500) * 100;
System.out.println("Percentage is: " + percentage);

// Calculate CGPA from percentage.

System.out.println("Enter percentage:");
double percentage2 = scan.nextDouble();
double cgpa = percentage2 / 10;
System.out.println("CGPA is: " + cgpa);

// Convert days into years, months, and days.
 int totalDays = scan.nextInt();
 int years = totalDays / 365;
    int remainingDays = totalDays % 365;
    int months = remainingDays / 30;
    remainingDays = remainingDays % 30;
    System.out.println("Years: " + years);
    System.out.println("Months: " + months);
    System.out.println("Days: " + remainingDays);

// Convert seconds into hours, minutes, and seconds.
int  totalSeconds = scan.nextInt();
int hours = totalSeconds / 3600;
    int remainingSeconds = totalSeconds % 3600;
    int minutes = remainingSeconds / 60;
    remainingSeconds = remainingSeconds % 60;
    System.out.println("Hours: " + hours);
    System.out.println("Minutes: " + minutes);
    System.out.println("Seconds: " + remainingSeconds);

// Calculate the total price after adding GST (or tax).
int price = scan.nextInt();
    double gstRate = 0.18; // 18% GST
    double totalPrice = price + (price * gstRate);
    System.out.println("Total price after adding GST: " + totalPrice);
// Calculate the total salary after adding HRA and DA.
int basicSalary = scan.nextInt();
    double hraRate = 0.20; // 20% HRA
    double daRate = 0.15; // 15% DA
    double hra = basicSalary * hraRate;
    double da = basicSalary * daRate;
    double totalSalary = basicSalary + hra + da;
    System.out.println("Total salary after adding HRA and DA: " + totalSalary);
}
}
