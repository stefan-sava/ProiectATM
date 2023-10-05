import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void introducerePIN(Card cardClient){
        System.out.println("Bine ati venit!");
        System.out.println("Introduceti codul PIN:");

        boolean verificare = false;
        for(int i = 1; i<=3; i+++){
            if(input.nextInt() == cardClient.getPIN()){
                verificare = true;
                break;
            }
        }
        if(verificare == false){
            System.out.println("Ati depasit numarul de introduceri a PIN-ului.");
            System.out.println("Va rugam contactati serviciul de relatii clienti pentru returnarea cardului.");
        }
    }

    public static void optiuniATM(Card cardClient){

        switch (input.nextInt()){
            case
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}