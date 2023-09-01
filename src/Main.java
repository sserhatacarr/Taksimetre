import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double distance, init, amount;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen mesafeyi giriniz : ");
        distance = input.nextDouble();

        init = 10.0;
        amount = 2.2 * distance + init;

        if (amount < 20) {
            amount = 20;
        }

        System.out.print("Toplam tutar = " + amount);

    }
}
