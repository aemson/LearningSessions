package refactor;

import java.time.LocalDateTime;

public class Example6 {

    public static void main(String[] args) {
        new Hunting().getCharges(LocalDateTime.now(), 5);
    }

}

class Hunting {
    LocalDateTime WINTER_START = LocalDateTime.now().withMonth(6);
    LocalDateTime WINTER_END = LocalDateTime.now().withMonth(10);

    public double getCharges(LocalDateTime dateTime, int noOfPersons) {
        double winterRate = 1200.50;
        double winterServiceCharge = 350.75;
        double summerRate = 650.75;
        if (dateTime.isBefore(WINTER_START) || dateTime.isAfter(WINTER_END)) {
            return noOfPersons * winterRate + winterServiceCharge;
        } else {
            return noOfPersons * summerRate;
        }
    }
}







/****
 * ***** Hint ****
 * Line 22 -> extract it to winterCharge(noOfPersons)
 * Line 24 -> extract it to summerCharge(noOfPersons)
 * ****/