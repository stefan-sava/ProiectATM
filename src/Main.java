import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void introducerePIN(Card cardClient){
        System.out.println("Bine ati venit!");
        System.out.println("Introduceti codul PIN:");

        boolean verificare = false;
        for(int i = 1; i<=3; i+++){
            if (input.nextInt() == cardClient.getPIN()) {
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
        int optiune;
        do {
            System.out.println("Meniu:");
            System.out.println("1. Sold curent");
            System.out.println("2. Eliberare numerar");
            System.out.println("3. Depunere numerar");
            System.out.println("4. Schimbare cod PIN");
            System.out.println("5. Mini Extras Cont");
            System.out.println("0. Iesire");

            System.out.print("Alegeti o optiune: ");
            optiune = input.nextInt();
            input.nextLine(); // Consumăm newline

            switch (optiune) {
                case 1:
                    System.out.println("Soldul dumneavoastra este de: " + cardClient.getCardSold());
                    break;
                case 2:
                    System.out.println("Introduceti suma pe care o doriti. Suma trebuie sa fie multiplu de 10");
                    int suma = input.nextInt();
                    if(suma % 10 == 0){
                        System.out.println("Suma extrasa este de: " + suma + " lei");
                        cardClient.setCardSold(cardClient.getCardSold() - suma);
                    }
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 0:
                    System.out.println("La revedere!");
                    break;
                default:
                    System.out.println("Optiune invalida.");
            }
        } while (optiune != 0);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}