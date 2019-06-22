import java.util.Scanner;

//Główna klasa po której podklasy dziedziczą pola i metody
public class Personel{
    private String name;        //Zmienna typu ztring przechowyjąca nazwę pracownika
    private int office;     //Prywatna zmienna typu int przechowująca numer biura pracownika

    Personel(){     //Konstruktor bezparametrowy
        this.name="Janusz";
        this.office=00;
    }
    Personel(String name, int office) {      //Konstruktor przeciążony pozwalający zapisać zmienne swoimi danymi od razu przy tworzeniu
        this.name = name;
        this.office = office;
    }

    public Personel setName(String name) { //Seter naszwy
        this.name = name;
        return this;
    }

    public Personel setOffice(int office) {    //Setter biura
        this.office = office;
        return this;
    }

    public String getName() {   //Getter nazwy
        return name;
    }       //Getter nazwy

    public int getOffice() {    //Getter biura
        return office;
    }       //getter biura


    public String getNumber(){      //Publiczna metoda zwracająca numer pracownika
        String number = "500 700 0";
        number+=String.valueOf(this.getOffice());
        return number;
    }

    public void addPerson(){        //Metoda pozwalająca na dodanie osoby
        Scanner s= new Scanner(System.in);
        System.out.println("Podaj imie:");
        this.setName(s.nextLine());
        System.out.println("Podaj nr biura:");
        this.setOffice(s.nextInt());

    }
    public void info(){     //Metoda pozwalająca na wyświetlenie danych osoby
        System.out.printf("|Imie: "+this.getName()+"\t|Biuro: "+this.getOffice()+"\t|");
    }

}
