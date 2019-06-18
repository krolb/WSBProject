import java.util.Scanner;

public class Main {
//@autor Bartosz Król
    // Program do zarządzania kadrą pracowniczą
    // Projekto do dr Wojciecha Gwizdały
    // Plik gówny main w którym będzie wykonwany słaściwy program korzystający z klas znajdujących się w innych plikach
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Witaj w programie do zarządzania kadrą pracowniczą\n");  //Pierwszy poziom interfejsu tekstowego

        int i=1;
        int i2=1;
        Scanner input = new Scanner(System.in);
        String in;
        while(i!=0){        //Pętla while na której opiera się działanie programu, jej przerawnie poprzez wybór odpowiedniej opvcji skutkuje zakończeniem diałąnia całego programu
            System.out.println("Co chcesz zrobić? \n1-Wprowadź pracownika\t 2-Wyszukaj pracownika \n3-Usuń pracownika \t \t 0-Wyjdź ");     //Drugi poziom interfejsu tekstowego (menu wyboru)
            in = input.nextLine();      //Pobranie danej od użytkownika wpływającej na wybór opcji w programi

            if (in.equals("0")){        //Opcja wyjścia z programu (przerywa pętle)
                break;
            }
            while (i!=0){ //Pętla wewnętrzna pozwalająca na wybór podopcji

            if (in.equals("1")) {       //Instrukcja warunkowa pozwalająca na wprowadzenie pracownika
                System.out.println("Wprowadzasz pracownika: \n 1-Pracownik biurowy \t 2-Sprzedawca \n 3-Dyrektor \t\t\t 0-Wyjdź ");
                in = input.nextLine();
                if (in.equals("1")) {       //Wprowadzanie praacownika typu (Pracownik biurowy)

                } else if (in.equals("2")) {        //Wprowadzanie pracownika typu (Sprzedawca)

                } else if (in.equals("3")) {        //Wprowadzanie pracownika typu (Dyrektor)

                } else if (in.equals("0")) {        //Po wprowadzeniu wartości "0" następuje przerwanie wprowadzania pracownika i powrót do nadrzędnej pętli
                    break;      //Instrukcja przerywająca pętle
                } else {        //Jeśli nie zostanie wprowadzona opcja odopwiadająca predefiniowanym nastąpi wyświetlenie komunikatu o niepoprawnej wartości i prośba o ponowne wprowadzenie jednej z powyżej podnaycbh wartości
                    System.out.println("Podana opcja nie istnieje, proszę podać poprawną opcje zaproponowaną powyżej");
                }
            }


            }

        }
        System.out.printf("Koniec programu :)");  //Komunikat o zakończeniu pracy programu
    }

}
