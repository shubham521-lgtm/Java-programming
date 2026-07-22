package AlltopicsMixedproble;

public class Leap_year {
    public static void main(String[] args) {
        // Q4. Check leap year.
int year = 2024;

if((year% 400 ==0) || (year % 100 !=0 && year%4==0)){
    System.out.println("year is an leap year");
}else{
    System.out.println("year is not an leap year");
}

    }
}
