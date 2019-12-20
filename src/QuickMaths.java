import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class QuickMaths {
    public int gennemsnit(int a, int b){
        // opgaven beder om, at returnere en integer,
        // derfor vil der være tilfælde hvor metoden ikke returnere det korrekte gennemsnit,
        // da hvis a+b giver et ulige tal så vil division med 2 give et komma tal
        // og resultatet rundes derfor ned til nærmeste integer.
        return (a+b)/2;
    }

    public int sum(int a, int b){
        return a+b;
    }

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

    public static void main(String[] args) {
        QuickMaths quickMaths = new QuickMaths();
        quickMaths.start();
    }
}
