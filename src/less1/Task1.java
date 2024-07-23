package less1;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Task1 {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        // Define a formatter for the desired pattern
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yy-MMMM-dd HH:mm:ss");
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Date now1 = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E dd.MM.yyyy 'и время' HH:mm:ss");
        System.out.println("Текущая дата: " + formatForDateNow.format(now1));

        // Format the LocalDateTime using the formatter
        String formattedDate1 = now.format(df);
        String formattedDate2 = now.format(sdf);

        // Print the formatted date
        System.out.println("Formatted (yyyy-mm-dd HH:mm:ss): " + formattedDate1);
        System.out.println("Formatted (dd/MM/yyyy HH:mm:ss): " + formattedDate2);

        // Print the original LocalDateTime object
        System.out.println("Now: " + now);

        double x = 5d / 2d;
        System.out.println(x);
    }

}
