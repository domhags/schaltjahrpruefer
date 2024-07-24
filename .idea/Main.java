import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Willkommen zur Schaltjahrüberprüfung");
        System.out.println("Geben Sie die Jahreszahl zum überprüfen ein:");
        Scanner scanner = new Scanner(System.in);
        int eingabe = scanner.nextInt();

        if (eingabe % 4 == 0 && eingabe % 100 != 0 || eingabe % 400 == 0) {
            System.out.println("Das Jahr " + eingabe + " ist ein Schaltjahr.");
        }
        else {
            System.out.println("Das Jahr " + eingabe + " ist kein Schaltjahr.");
        }

        System.out.println("Geben Sie das Startjahr ein:");
        int startjahr = scanner.nextInt();
        System.out.println("Geben Sie nun das Endjahr ein:");
        int endjahr = scanner.nextInt();

        System.out.println("Schaltjahre zwischen " + startjahr + " und " + endjahr + ":");
        for (int jahr = startjahr; jahr <= endjahr; jahr++) {
            if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0) {
                System.out.println(jahr);
            }
        }
    }
}