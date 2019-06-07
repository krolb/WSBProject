import java.util.Scanner;

public class Main {
//@autor Bartosz Król
    // Plik gówny main w którym będzie wykonwany słaściwy program korzystający z klas znajdujących się w innych plikach
    public static void main(String[] args) {
        System.out.println("Witaj w programie do zarządzania kadrą pracowniczą\n");

        int i=1;
        int i2=1;
        Scanner input = new Scanner(System.in);
        String in;
        while(i!=0){
            System.out.println("Co chcesz zrobić? \n1-Wprowadź pracownika\t 2-Wyszukaj pracownika \n3-Usuń pracownika \t \t 0-Wyjdź ");
            in = input.nextLine();

            if (in.equals("0")){
                break;
            }
            while (i!=0){

            if (in.equals("1")) {
                System.out.println("Wprowadzasz pracownika: \n 1-Pracownik biurowy \t 2-Sprzedawca \n 3-Dyrektor \t\t\t 0-Wyjdź ");
                in = input.nextLine();
                if (in.equals("1")) {

                } else if (in.equals("2")) {

                } else if (in.equals("3")) {

                } else if (in.equals("0")) {
                    break;
                } else {
                    System.out.println("podaj poprawną opcje");
                }
            }


            }

        }
        System.out.printf("Koniec programu :)");
    }

}
