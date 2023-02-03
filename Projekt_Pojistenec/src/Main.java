import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Pojistenec> pojistenec = new ArrayList<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pojistenec pojistenec = new Pojistenec();
        Zaznam zaznam = new Zaznam();
        System.out.println("EVIDENCE POJIŠTĚNÝCH");
        int choice = 0;
        while (choice != 3) {
            System.out.println("\n1. Přidat pojištěného");
            System.out.println("2. Zobrazit seznam pojištěných");
            System.out.println("3. Hledat pojištěného");
            System.out.println("4. Konec");
            System.out.print("\nVyberte volbu: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    setPojistenec();
                    zaznam.pridejZaznam();
                    break;
                case 2:
                    pojistenec.vypisInformaci();
                    System.out.println(pojistenec.vypisSeznamPojistencu());
                    break;
                case 3:
                    pojistenec.vyhledejPojistencee();
                    System.out.println(pojistenec.seznamPojistencu);
                    break;
                case 4:
                    System.out.println("\nKonec aplikace.");
                    break;
                default:
                    System.out.println("\nNeplatná volba. Zadejte volbu znovu.");
                    break;
            }
        }
        input.close();
    }

    private static void setPojistenec() {
        Scanner input = new Scanner(System.in);

        System.out.print("\nZadejte jméno: ");
        String firstName = input.nextLine();

        System.out.print("Zadejte příjmení: ");
        String lastName = input.nextLine();

        System.out.print("Zadejte věk: ");
        int age = input.nextInt();

        System.out.print("Zadejte telefonní číslo: ");
        int phoneNumber = input.nextInt();

        Pojistenec pojistenec1 = new Pojistenec();
        System.out.println("\nPOJIŠTĚNEC PŘIDÁN");
        System.out.println("--------------------------------------");
    }
}
