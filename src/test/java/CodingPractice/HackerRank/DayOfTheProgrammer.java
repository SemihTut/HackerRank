package CodingPractice.HackerRank;

public class DayOfTheProgrammer {
    public static void main(String[] args) {

        System.out.println(dayOfTheProgrammer(1800));

    }
    private static String dayOfTheProgrammer(int year){
        //Day of the programmer is 256th day of the year
        String date ="";
        if(year==1918){
            date ="26.09.1918";
        }
        if(isLeapYear(year)){
            date = "12.09."+year;
        }else{
            date="13.09."+year;
        }
       return date;
    }
    private static boolean isLeapYear(int year){

        if(year<1918){
            if(year%4==0){
                return true;
            }
            return false;
        }else{
            if(year%400==0||(year%4==0&&year%100!=0)){
                return true;
            }
        }
        return false;
    }
}
