package CodingPractice.FindingYourAge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class findDays {
    public static void main(String[] args) throws ParseException {

        System.out.println(yourAge("26-04-1985"));
        System.out.println(asylumPeriod("03-09-2017"));

    }

    /**
     *
     * @param dateOfBirth       date format should be ---->  dd-MM-yyyy
     * @return                  String
     */
    public static String yourAge(String dateOfBirth) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse(dateOfBirth);

        //Converting obtained Date object to LocalDate object
        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate givenData = zone.toLocalDate();


        Period period = Period.between(givenData, LocalDate.now());
        return "Your age is "+period.getYears()+" years "+period.getMonths()+" months "+period.getDays()+" days. ";
    }

    public static String asylumPeriod(String asylumDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse(asylumDate);

        //Converting obtained Date object to LocalDate object
        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate givenData = zone.toLocalDate();


        Period period = Period.between(givenData, LocalDate.now());
        return "Your asylum period is "+period.getYears()+" years "+period.getMonths()+" months "+period.getDays()+" days. ";

    }
}
