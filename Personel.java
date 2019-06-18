//Główna klasa po której podklasy dziedziczą pola i metody
public class Personel {
    private String name;        //Zmienna typu ztring przechowyjąca nazwę pracownika
    private int office;     //Prywatna zmienna typu int przechowująca numer biura pracownika
    static private int counter;     //Statyczny licznik wszystkich obiektów w bazie

    Personel(){     //Konstruktor bezparametrowy
        this.name="Janusz";
        this.office=00;
    }
    //Konstruktor przeciążony pozwalający zapisać zmienne swoimi danymi od razu przy tworzeniu
    Personel(String name, int office) {
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
    }

    public int getOffice() {    //Getter biura
        return office;
    }

    public static int getCounter() {    //Getter licznika wszystkich obiektów znajdujących się w bazie
        return counter;
    }

    public String getNumber(){      //Publiczna metoda zwracająca numer pracownika
        String number = "500 700 0";
        number+=String.valueOf(this.getOffice());
        return number;
    }
}
