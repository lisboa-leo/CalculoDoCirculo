import application.Circulo;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tcd = new Scanner(System.in);

        Circulo C1 = new Circulo();

        System.out.println("digite o raio do circulo: ");
        C1.raio = tcd.nextDouble();

        System.out.println("A sua area é de: " + C1.area());

    }
}