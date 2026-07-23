// package OnedimentionalArray;

public class Sum_of_All_elements {
    public static void main(String[] args) {
// Q2. Find the sum of all elements.
int [] arr = {54 , 66 , 98 , 77 , 76};
        
int sum = 0;
for(int i =0; i<arr.length;i++){
    sum = sum + arr[i];
}
System.out.println("sum of all elements = " + sum);
    }
}
