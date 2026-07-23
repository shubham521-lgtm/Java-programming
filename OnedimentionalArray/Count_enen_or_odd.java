// package OnedimentionalArray;

public class Count_enen_or_odd {
    public static void main(String[] args) {
// Q6. Count even and odd elements.
int [] arr = {54 , 61 , 98 , 77 , 76};
        
       int evencount = 0;
       int oddcount = 0;

      System.out.print("even element = ");
             
        for(int i = 0; i<arr.length; i++){
            int even = arr[i];
            if(even%2==0){
                System.out.print(arr[i] + " ");
                evencount++;
            }
            
             
        }
        System.out.println(" ");

        
        System.out.println("number of even element = " + evencount);

        // int count = 0;
       System.out.print("odd element = ");

        for(int i = 0; i<arr.length; i++){
            int odd = arr[i];
            if(odd%2 !=0){
            //  int count = 0;

                System.out.print(arr[i] + " ");

                oddcount++;
            }
        }
        System.out.println( );

        System.out.println("number of odd element = " + oddcount);
        

    }
}
