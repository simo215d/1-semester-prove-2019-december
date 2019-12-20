package quiz;

import java.util.Scanner;

public class Quiz {
    //den er static så vi slipper for at oprette en ny klasse af Quiz i vores main()
    public static Sporgsmaal sporgsmaal = new Sporgsmaal();
    public static void main(String[] args) {
        //the following lines sets up the game
        sporgsmaal.setSporgsmaalsTekst("Which of these fruits are yellow?");
        Svar svar1 = new Svar("Orange");
        Svar svar2 = new Svar("Banana");
        Svar svar3 = new Svar("Watermelon");
        Svar svar4 = new Svar("Blueberry");
        Svar[] svar = new Svar[] {svar1, svar2, svar3, svar4};
        sporgsmaal.setSvar(svar);
        sporgsmaal.setKorrektSvarIndex(1);
        sporgsmaal.setPoint(10);
        //the following lines are the actual game in the console
        System.out.println(sporgsmaal.getSporgsmaalsTekst() + " Enter a the number of your answer:");
        //henter svarene fra sporgsmaals instansen og printer deres svar
        for (int i = 0; i < sporgsmaal.getSvar().length; i++) {
            System.out.println("Svar " + i + ": " + sporgsmaal.getSvar()[i].getSvarmulighed());
        }
        Scanner input = new Scanner(System.in);
        //en løkke som beder dig indtaste dig svar indtil du rammer rigtig
        while (true) {
            System.out.print("Enter your answer: ");
            int answer = input.nextInt();
            if (answer != sporgsmaal.getKorrektSvarIndex()) {
                System.out.println("Incorrect! Try Again.");
                continue;
            }
            System.out.println("Correct! You score "+sporgsmaal.getPoint()+" points.");
            break;
        }
    }
}
