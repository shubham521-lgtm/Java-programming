public class Time_Convert {
    public static void main(String[] args) {
// Q10. Convert total seconds into Hours, Minutes, and Seconds.
      float totalsecond = 864;
      double Hours = (totalsecond/3600);
      double Minutes = (totalsecond%3600)/60;
      double seconds = totalsecond%60;
      System.out.println("hourse = " + Hours);
      System.out.println("Minutse  = " + Minutes);
      System.out.println("seconds = " + seconds);  


    }
}
