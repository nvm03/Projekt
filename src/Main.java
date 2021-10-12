import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        double prod = 6.50;
        double vat = 23;
        BigDecimal vatPrice1 = new BigDecimal(((prod / 100) * vat) * prod);
        System.out.printf("Price with VAT: " + "%.4f", vatPrice1);
        BigDecimal countOfProd1 = new BigDecimal("8500");
        vatPrice1 = vatPrice1.multiply(countOfProd1);
        vatPrice1 = vatPrice1.setScale(10, RoundingMode.FLOOR);
        System.out.println("\n" + vatPrice1);


    }
}
