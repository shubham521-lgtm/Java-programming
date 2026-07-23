// package OnedimentionalArray;

public class Smallest_number {
    public static void main(String[] args) {
// Q5. Find the smallest element.
int [] arr = {54 , 66 , 98 , 7 , 76};
        
int smallest = arr[0];
for(int i =0 ;i<arr.length;i++){
    int element = arr[i];
    if(element<=smallest){
      smallest = element;
    }
}
System.out.println("smallest element = " + smallest);
    }
}
