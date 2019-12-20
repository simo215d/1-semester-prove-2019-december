/**
 * Lavet af Simon Grove
 * Klassen her handler om hello world og hvordan vi kan behandle Strings
 * 20/12/2019
 */

public class Main {

    public static void main(String[] args) {
        //Opgave 1.a
        System.out.println("Hello world!");
        //Opgave 1.b
        Main main = new Main();
        System.out.println(main.hello("Simon"));
        //Opgave 1.c
        System.out.println(main.hello(""));
    }

    //denne metode printer hello world hvis navn er en tom String. ellers printer den hello og navnent angivet i parametret
    public String hello(String navn) {
        if (navn.equals("")){
            return "Hello World!";
        } else return "Hello "+navn+"!";
    }
}
