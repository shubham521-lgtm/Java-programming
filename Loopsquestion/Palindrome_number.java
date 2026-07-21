public class Palindrome_number {
    public static void main(String []args){

// Q7. Check palindrome number.
        int num = 1221;
        int palindrome = num;
        int revarse = 0;
while (num!=0) {
    int digit = num%10;
    revarse = revarse * 10 + digit;
    num = num/10;

}
if(palindrome == revarse){
    System.out.println("number is an palindrom");
}
else{

System.out.println("number is not  palindrom");
}
    }
}
