import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pojistenec {

    private String firstName;
    private String lastName;
    private int age;
    private int phoneNumber;

    public Pojistenec() {
        this.firstName = this.firstName;
        this.lastName = this.lastName;
        this.age = this.age;
        this.phoneNumber = this.phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Jméno: " + firstName + ", Příjmení: " + lastName + ", Věk: " + age + ", Telefonní číslo: " + phoneNumber;
    }

    // Metoda pro výpis informací o pojištenci

    public void vypisInformaci() {
        System.out.println(seznamPojistencu);
        System.out.println("Jméno: " + firstName);
        System.out.println("Příjmení: " + lastName);
        System.out.println("Věk: " + age);
        System.out.println("Telefonní číslo: " + phoneNumber);
    }

    // Vytvoření kolekce ArrayList pro uchování všech pojištěných

    List<Pojistenec> seznamPojistencu = new ArrayList<>();

    // Přidání pojištěného do kolekce


    // Výpis seznamu všech pojištěných

    public char[] vypisSeznamPojistencu() {
        for (Pojistenec pojistenec : seznamPojistencu) {
            pojistenec.vypisInformaci();
            System.out.println("-----");
        }
        return new char[0];
    }

    // Vyhledávání pojištěného podle jmena a příjmení

    public void vyhledejPojistencee() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nZadejte jméno: ");
        String firstName = input.nextLine();
        System.out.print("Zadejte příjmení: ");
        String lastName = input.nextLine();
        for (Pojistenec pojistenec : seznamPojistencu) {
            if (pojistenec.getFirstName().equals(firstName) && pojistenec.getLastName().equals(lastName)) {
                System.out.println(pojistenec);
            }
        }
    }
//----------------------------------------------------------------------------------------------------------------------
   /* public void vyhledejPojistence() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nZadejte jméno: ");
        String firstName = input.nextLine();
        System.out.print("Zadejte příjmení: ");
        String lastName = input.nextLine();
    }*/
}