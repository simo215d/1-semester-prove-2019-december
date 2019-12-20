package opgaver12345;

/**
 * Lavet af Simon Grove
 * Denne klasse illustrere 1 eksempel på typecasting og modulus. Jeg har også refaktureret koden så felterne har passende typer.
 * Klassen illustrere også et eksempel på et conditional statement.
 * 20/12/2019
 */

public class Person {
    String navn; // Test Testesen
    int alder; // 18
    String by; // Næstved
    int postNummer; // 4700
    String vej; // Femøvej
    String husnummer; // 3B
    String nationalitet; // Dansk
    String fritidsStringeresser; // Snitning, LOL, strikke
    String smarthomeDevices; // Xbox, 3 Smartlamper, Køleskab m.m.
    double hojde; // 1.56 m
    double vaegt;  // 76 kg
    double karaktergennemsnit; // 5.33
    int eksamensKarakterer; // 7, 12, -3, 4, 2, 10
    String opdateretDato; // Sun Jan 08 00:00:00 CET 1978

    //denne metode souter vaegten efter den har besluttet om det er en int eller double.
    //derefter returnerer den personens navn og by
    @Override
    public String toString() {
        //type casting eksempel
        if (vaegt%1==0){
            System.out.println("Hans vægt har ikke kommatal og er derfor typecasts til integer: "+(int)vaegt);
        } else System.out.println("Hans vægt har kommatal og forbliver en double: "+vaegt);
        return "Navn: " + navn + "By" + by;
    }

    //denne main metode illustrerer hvad metoden "toString()" gør.
    public static void main(String[] args) {
        Person person = new Person();
        person.navn = "Test Testesen";
        person.by = "Næstved";
        person.vaegt=70.0;
        System.out.println(person.toString());
        System.out.println("---------");
        person.navn = "Simon Grove";
        person.by = "Næstved";
        person.vaegt=65.5;
        System.out.println(person.toString());
    }

}
