import java.util.Scanner;

/**
 * Lavet af Simon Grove
 * 20/12/2019
 */

public class Loops {

    private String brugere[] = {"Anders", "Birgit", "Carsten", "Dennis", "Esben"};

    public String[] getBrugere() {
        return brugere;
    }

    public static void main(String[] args) {
        Loops l = new Loops();
        l.printBrugereArr();
        System.out.println("*******");
        l.printBrugereReverseArr();
        System.out.println("*******");
        l.waitingFor0();
    }

    /**
     * Viser en liste med brugere i konsollen
     */
    public void printBrugereArr() {
        for (int i = 0; i < getBrugere().length; i++) {
            System.out.println("navn: "+getBrugere()[i]);
        }
    }

    /**
     * Viser en liste med brugere i konsollen i omvendt rækkefølge
     * Denne metode tæller ned fra længden af brugere -1 og printer deres navn indtil vi er nået igennem vores array
     */
    public void printBrugereReverseArr() {
        for (int i = getBrugere().length-1; i >= 0; i--) {
            System.out.println("navn: "+getBrugere()[i]);
        }
    }

    //den looper og beder om et nyt tal indtil vi skriver 0
    public void waitingFor0() {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Venter på 0. Skriv et tal... ");
            int n = input.nextInt();
            if (n!=0) {
                continue;
            }
            System.out.println("Du indtastede 0, og loopet er færdig.");
            break;
        }
    }
}
