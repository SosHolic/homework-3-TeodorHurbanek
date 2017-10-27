package sk.holic.sos;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i++ > 5) {  // Task2: ak by sme mali ++i tak vypise 6 inak vypisuje 7
                break;
            }
        }
        System.out.println(i);
        System.out.println(Test.calc()); // Task1: Vypise hodnotu 12
    }
}

