import java.time.LocalDate;
import java.util.LinkedList;

public class DateofBirth {

    public static void main(String[] args) {
        // Create a LinkedList of LocalDate objects representing dates of birth
        LinkedList<LocalDate> datesOfBirth = new LinkedList<>();
        datesOfBirth.add(LocalDate.of(2000, 12, 23));
        datesOfBirth.add(LocalDate.of(2001, 12, 23));
        datesOfBirth.add(LocalDate.of(2002, 12, 23));
        datesOfBirth.add(LocalDate.of(2003, 12, 23));
        datesOfBirth.add(LocalDate.of(2004, 12, 23));

        // Iterate over the dates in reverse order
        for (LocalDate dateOfBirth : datesOfBirth) {
            // Print the date
            System.out.println("Your date of birth is " + dateOfBirth);

            // Check if the date is a leap year
            boolean isLeapYear = dateOfBirth.isLeapYear();

            // Print the message
            if (isLeapYear) {
                System.out.println("and it was a leap year.");
            } else {
                System.out.println("and it was not a leap year.");
            }
        }
    }
}