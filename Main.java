import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;



public class Main{
//@author Bartosz Król nr 34100 & Krzysztof Łatka nr 33689
    //@version 0,1
    // Program do zarządzania kadrą pracowniczą
    // Projekto do dr Wojciecha Gwizdały
    // Plik gówny main w którym będzie wykonwany słaściwy program korzystający z klas znajdujących się w innych plikach


    public static void main(String[] args) {

        ArrayList list;
        list= new ArrayList();
        Personel per=new Personel();

        System.out.println("Witaj w programie do zarządzania kadrą pracowniczą\n");  //Pierwszy poziom interfejsu tekstowego

        int i=1;
        Scanner inputI = new Scanner(System.in);        //Strumien dla danych typu int
        Scanner inputS = new Scanner(System.in);        //Strumien dla danych typu string
        int in;
        while(i!=0){        //Pętla while na której opiera się działanie programu, jej przerawnie poprzez wybór odpowiedniej opvcji skutkuje zakończeniem diałąnia całego programu
            System.out.println("\nCo chcesz zrobić? \n1-Wprowadź pracownika\t 2-Wyszukaj pracownika \n3-Usuń pracownika \t \t4-Lista pracownikow \n5-Modyfikuj Pracownika\t0-Wyjdź ");     //Drugi poziom interfejsu tekstowego (menu wyboru)
            in = inputI.nextInt();      //Pobranie danej od użytkownika wpływającej na wybór opcji w programi

            if (in==0){        //Opcja wyjścia z programu (przerywa pętle)
                break;
            }
            while (i!=0) { //Pętla wewnętrzna pozwalająca na wybór podopcji




                if (in==1) {       //Instrukcja warunkowa pozwalająca na wprowadzenie
                    System.out.println("Wprowadzasz pracownika: \n1-Pracownik biurowy \t2-Sprzedawca \n3-Dyrektor \t\t\t0-Wyjdź ");
                    int in2;
                    in2 = inputI.nextInt();

                    if (in2==1) {       //Wprowadzanie praacownika typu (Pracownik biurowy)
                        Employee per1= new Employee();
                        per1.addPerson();
                        list.add(per1);
                    } else if (in2==2) {        //Wprowadzanie pracownika typu (Sprzedawca)
                        Seller per2 = new Seller();
                        per2.addPerson();
                        list.add(per2);
                    } else if (in2==3) {        //Wprowadzanie pracownika typu (Dyrektor)
                        Director per3 = new Director();
                        per3.addPerson();
                        list.add(per3);
                    } else if (in2==0) {        //Po wprowadzeniu wartości "0" następuje przerwanie wprowadzania pracownika i powrót do nadrzędnej pętli

                        break;//Instrukcja przerywająca pętle
                    } else {
                        System.out.println("Podana opcja nie istnieje, proszę podać poprawną opcje zaproponowaną powyżej");
                    }
                }
                else if (in==2){        //Opcja wyszukiwania
                    System.out.println("Po czym chcesz wyszukać pracowników?\n1-Po imieniu \t2-Po nr biura\n0-Wróć");
                    int in3;
                    in3=inputI.nextInt();
                    if (in3==1){        //Wyszukiwanie po imieniu
                        System.out.println("Podaj imie:");
                        String in4;
                        in4=inputS.nextLine();
                        for (int y=0; y<list.size(); y++){
                            per = (Personel)list.get(y);
                            if(per.getName().equals(in4)){
                                per.info();
                            }
                        }
                        break;
                    }
                    else if (in3==2){       //Wyszukiwanie po nr biura
                        System.out.printf("Podaj nr biura:");
                        int in4;
                        in4=inputI.nextInt();
                        for (int y=0; y<list.size(); y++){
                            per=(Personel) list.get(y);
                            if (per.getOffice()==in4){
                                per.info();
                                System.out.println("\n");
                            }
                        }

                        break;
                    }
                    else if (in3==0){
                        break;
                    }



                }
                else if (in==3){        //Opcja usuwania pracownika
                    if (list.size()>0) {
                        System.out.println("W bazie istnieje " + list.size() + " pracowników");
                        System.out.println("1-Usuń pojedyńczego pracownika\t2-Usuń wszystkioch pracownikó\n0-Wróć");
                        in = inputI.nextInt();

                        if (in == 1) {      //Usuwanie jednego pracownika


                            System.out.println("Podaj ID pracownika którego chcesz usunąć(ID pierwszego pracownika jest równe 0):");

                            int id = inputI.nextInt();
                                if (id>=list.size()){
                                    System.out.println("Pracownik o podanym ID nie istnieje :(");
                                    break;
                                }
                                else {
                                    list.remove(id);
                                    System.out.println("Pomyślnie usunięto pracownika");
                                }
                            break;
                        }

                    }
                    if (in==2){     //Usuwanie wszystkich pracaowników na raz
                        list.clear();
                        System.out.println("Usunięto wszystkich pacowników");
                        break;
                    }
                    if (in==0){
                        break;
                    }
                    else {
                        System.out.printf("Nie ma żadnych pracowników, nie możesz nic usunąć :(\n");
                        break;
                    }
                }
                else if (in==4){        //Wyświetlanie wszystkich pracowników
                    System.out.println(list.size());
                    if (list.size()>0){
                        for (int i2=0; i2<list.size();i2++){
                            per = (Personel) list.get(i2);
                            System.out.printf("|Pracownik nr: "+i2+"\t");
                            per.info();
                            System.out.println("\n");
                        }
                        break;

                    }
                    else{
                        System.out.println("W bazie nie ma pracowników, nie możesz wyświetlić ich listy :(");
                        break;
                    }
                }
                else if (in==5){        //Opcja modyfikacji pracowników
                    if (list.size()==0){
                        System.out.println("Baza jest pusta, nie możesz modyfikować jej zawartości");
                        break;
                    }

                    System.out.printf("Podaj ID pracownika do modyfikacji");
                    int id=inputI.nextInt();
                    if (list.size()<=id){
                        System.out.println("Pracownik o takim ID nie istenieje :(");
                        break;
                    }
                    per= (Personel) list.get(id);
                    System.out.println("Dane pracownika:\n");
                    per.info();
                    System.out.println("Wpeowadź powtórnie dane tego pracownika:");
                    per.addPerson();
                    System.out.printf("Dane pracownika po modyfikacji:");
                    per.info();
                    break;
                }
            }




        }

        System.out.println("Koniec programu :)");  //Komunikat o zakończeniu pracy programu
    }
}





