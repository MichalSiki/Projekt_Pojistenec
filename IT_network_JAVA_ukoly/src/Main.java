/*
     _____ _______         _                      _
 *  |_   _|__   __|       | |                    | |
 *    | |    | |_ __   ___| |___      _____  _ __| | __  ___ ____
 *    | |    | | '_ \ / _ \ __\ \ /\ / / _ \| '__| |/ / / __|_  /
 *   _| |_   | | | | |  __/ |_ \ V  V / (_) | |  |   < | (__ / /
 *  |_____|  |_|_| |_|\___|\__| \_/\_/ \___/|_|  |_|\_(_)___/___|

                ZKOUSENÍ TESTŮ Z WEBOVÝCH STRÁNEK
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 3/1
        /*System.out.println("Ahoj jak se jmenuješ");
        String jmeno = sc.nextLine();
        System.out.println("Jaký jsi");
        String vlastnost = sc.nextLine();
        System.out.println(jmeno + " je " + vlastnost);
        */

     // 3/2
        /*System.out.println("Napiš číslo na druhou mocninu");
        int cislo = sc.nextInt();
        float vysledek = (float) Math.pow(cislo,2);
        System.out.println("Výsledek: " + vysledek );
        */

     // 3/3
       /* System.out.println("Zadej poloměr kruhu");
        float polomer = sc.nextFloat();
        System.out.println(polomer);
        float obvod =(float) (2 * 3.1415 * polomer);
        float obsah =(float) (3.1415 * (Math.pow(polomer,2)));
        System.out.println("Vysledek obvodu je: " + obvod);
        System.out.println("Vysledek obsahu je: " + obsah);
        */
//----------------------------------------------------------------------------------------------------------------------

    // 4/1
        /*System.out.println("Zadej jmeno");
        String jmeno = sc.nextLine();
        System.out.println("Zadej prijmeni");
        String prijmeni = sc.nextLine();
        System.out.println("Zadej věk");
        int vek = sc.nextInt();
        int vekk = vek+1;
        System.out.println(jmeno.toUpperCase() + " " + prijmeni.toUpperCase());
        System.out.println("za rok ti bude: " + vekk);
         */

    // 4/2
        /*System.out.println("zadej delsí slovo");
        String delsi = sc.nextLine();
        System.out.println("zadej kratsi slovo");
        String kratsi = sc.nextLine();
        int aDelsi = delsi.length();
        int aKratsi = kratsi.length();
        int porovnani = aDelsi - aKratsi;
        System.out.println("Slova se lisi delkou o " + porovnani + " znaku");
         */

    // 4/3
        /*System.out.println("Zadej vetu");
        String veta = (sc.nextLine().toLowerCase());
        boolean aVeta = veta.contains("itnetwork");
        System.out.println(aVeta);
         */
//----------------------------------------------------------------------------------------------------------------------

    // 5/1
        /*System.out.println("Zadej jmeno");
        String jmeno = sc.nextLine();
        int aJmeno = jmeno.length();
        if ((aJmeno >= 3 ) && (aJmeno <= 10)) {
            System.out.println("Normální jmeno");
        }
        else { System.out.println("Blbe jmeno");}
         */

    // 5/2
        /*System.out.println("Zadej smajlika");
        String smajl = sc.nextLine().trim().replace("-","");
        switch (smajl){
            case ":)":
                System.out.println("Tvuj smajlik je stastny");
                break;
            case ":(":
                System.out.println("Tvuj smajlik je smutny");
                break;
            case ":*":
                System.out.println("Tvuj smajlik je zamilovany");
                break;
            case ":P":
                System.out.println("tvuj smajlik je blaznivy");
                break;
            default:
                System.out.println("Smajlik NEEXISTUJE");
        }
         */

     // 5/3
        /*System.out.println("Zadej a");
        int a = sc.nextInt();
        System.out.println("Zadej b");
        int b = sc.nextInt();
        System.out.println("Zadej c");
        int c = sc.nextInt();
         */
//----------------------------------------------------------------------------------------------------------------------

   // 6/1
        /*System.out.println("Kolik ryb si das?");
        int pocetRyb = sc.nextInt();
        for (int i = 0; i < pocetRyb; i++) {
            System.out.println("<---O");
        }
         */

   // 6/2
        /*for (int i = 10; i >= 5; i--) {
            System.out.println(i + " zelenych lahvi stoji na stole a jedna lahev spadne");
        }
        for (int i = 4; i >= 1; i--) {
            System.out.println(i + " zelene lahve stoji na stole a jedna spadne" );
        }
         */
//----------------------------------------------------------------------------------------------------------------------

    // 7/1
        /*int[] pole = new int[10];
        pole[0] = 10;
        for (int i = 0; i < 10; i++) {
            pole[i] = i+1;
        }
        for (int i = 0; i < pole.length; i++) {
            System.out.println(pole[i] + " ");
        }
         */
     // 7/2
         String [] zelenina = {"brokolice" , "rajce" , "okurka"};
         String [] ovoce = {"banan" , "jablko" , "hruska"};
         System.out.println("Vyber ovoce / zeleninu");
         String vyber = sc.nextLine().toLowerCase();
        }

}