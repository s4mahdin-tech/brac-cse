public class task1 {
  public static void main (String [] args) {
    int min = 3456789 ;
    int minute_inDay=60*24;
    int minute_inYear= minute_inDay*365;
    
    int year= min/minute_inYear;
    int remainingMinute= min%minute_inYear;
    int days = remainingMinute/minute_inDay;
    
    System.out.println(year + " years" +" " + days + " days");
  }
}

//
