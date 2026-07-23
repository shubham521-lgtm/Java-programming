// package OnedimentionalArray;

public class Largest_element {
    public static void main(String[] args) {
// Q4. Find the largest element.
int [] arr = {54 , 66 , 98 , 77 , 76};
        int largest =arr[0];
        for(int i = 0; i<arr.length; i++){
          int element = arr[i];
          if(element>=largest){
            largest = element;
          }
        }
        System.out.println("largest number = " + largest);
    }
}
