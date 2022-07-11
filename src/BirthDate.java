import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.DAYS;

public class BirthDate {
    public static long calculateDays() throws IOException {
        LocalDate today = LocalDate.now();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter birth date in format: dd.MM.yyyy");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        while (true) {
            String input = br.readLine();
            try {
                LocalDate birthDate = LocalDate.parse(input, formatter);
                return DAYS.between(birthDate, today);
            } catch (Exception e) {
                System.out.println("Please enter date in correct format: dd.MM.yyyy");
            }
        }
    }

}
