/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
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

    public String hello(String navn) {
        if (navn.equals("")){
            return "Hello World!";
        } else return "Hello "+navn+"!";
    }
}
