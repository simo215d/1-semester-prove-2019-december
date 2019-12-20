import java.util.Scanner;

/**
 * Lavet af Simon Grove
 * Denne klasse illustrere grundlæggende principper angående metoder, while loops og souts.
 * 20/12/2019
 */

public class QuickMaths {
    public int gennemsnit(int a, int b){
        // opgaven beder om, at returnere en integer,
        // derfor vil der være tilfælde hvor metoden ikke returnere det korrekte gennemsnit,
        // da hvis a+b giver et ulige tal så vil division med 2 give et komma tal
        // og resultatet rundes derfor ned til nærmeste integer.
        return (a+b)/2;
    }

    //denne metode returnere summen af 2 integers
    public int sum(int a, int b){
        return a+b;
    }

    //denne metode beder om at man indtaster 2 tal og så printer den summen og gennemsnittet af tallene
    //det gør den i al uendelighed.
    public void start(){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Lommeregner");
            System.out.print("Indtast A: ");
            int a = input.nextInt();
            System.out.print("Indtast B: ");
            int b = input.nextInt();
            System.out.println("Sum: "+sum(a,b));
            System.out.println("Gennemsnit: "+gennemsnit(a,b));
            System.out.println("----------");
        }
    }

    //denne metode gør at klassen kan køres og den sætter start metoden i gang.
    public static void main(String[] args) {
        QuickMaths quickMaths = new QuickMaths();
        quickMaths.start();
    }
}
