public class PrecticeParfectNum {
    public static void main(String[] args) {
        //  Check whether a number is a Perfect number.

// int num = 28;
// // int original = num ;
 
// int sum = 0;
// for(int i =1;i<=num/2;i++){
    
//     if (num%i==0){
//         sum = sum + i;

//     }
    

// }
  
// System.out.println(sum);

// if(num == sum){
//     System.out.println("Number is an perfect number");
// }else{
//     System.out.println("Number is not an perfect number ");
// }

// Check whether a number is a Prime number.
// int num = 19;
// int divisor = 0;
// for(int i=1; i<=num; i++){
//     if(num%i==0){
//         divisor++;
//     }
// }
// if(divisor==2){
//     System.out.println(num + " Number is an prime number");
// }else{
//     System.out.println(num + " Number is not an prime number");
// }


 
// Print all prime numbers between 1 and N.

// int n = 31;

// for(int num=2; num<=n; num++){

//     int divisor = 0;
//     for(int i = 1; i<=num; i++){

//         if(num%i==0){

//             divisor++;
//         }
//     }
    
//     if(divisor == 2){
        
//         System.out.println(  num);
//     }

//     }
// }
// Find the GCD (HCF) of two numbers.

//  int num1 = 12;
//         int num2 = 16;

//         int HCF = 1;

//         for (int i = 1; i <= num1 && i <= num2; i++) {

//             if (num1 % i == 0 && num2 % i == 0) {
//                 HCF = i;
//             }
//         }

//         System.out.println("HCF = " + HCF);

// Find the LCM of two numbers.

//  int num1 = 12;
//         int num2 = 16;

//         int HCF = 1;

//         for (int i = 1; i <= num1 && i <= num2; i++) {

//             if (num1 % i == 0 && num2 % i == 0) {
//                 HCF = i;
//             }
//         }

//         int LCM = (num1*num2)/HCF;
//         System.out.println("HCF of two number is = " + HCF);
//         System.out.println("LCM of two number is = " + LCM);


int num1 = 5200;
int num2 = 7200;

int max = (num1>num2)?num1:num2;

while(true){

    if(max%num1==0 && max % num2 ==0){
   
        System.out.println("LCM = " + max);
        System.out.println("HCF = " + (num1*num2)/max);

        break;
    }
    max++;
}
// Check whether two numbers are co-prime.
// Reverse a number without using an extra variable for the reverse logic.
// Check whether a number is a Neon number.
// Check whether a number is a Spy number.
// Check whether a number is a Duck number.
// Find the frequency of each digit in a number.
// Remove all zeros from a number.
// Print the factors of a number.
// Count the factors of a number.
// Find the sum of all factors.
// Find the largest prime factor of a number.
// Check whether a number is both a palindrome and an Armstrong number.
// Print the Fibonacci series until the value exceeds N.
    }
}
