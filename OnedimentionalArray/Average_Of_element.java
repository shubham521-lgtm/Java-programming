// package OnedimentionalArray;

public class Average_Of_element {
    public static void main(String[] args) {
// Q3. Find the average.
int [] arr = {54 , 66 , 98 , 77 , 76};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];

        }
        double average = sum/5;
        System.out.println("average = " + average);
    }
}
