//Klasa Seller dziedzicząca po klasie Employee która dziedziczy po klasie Personel
public class Seller extends Employee {
 private int supplement;     //Prywatna zmienna typu inr przechowyująca Dodatek
 static private int counters;    //Statyczna prywatna zmienna typu int przechowująca licznik obiektów tego typu


    Seller(){   //Konstruktor bezparametrowy
        super();        //Wywoładnie konstruktora bezparametrowego nadklasy
        this.supplement=0;
    }

    Seller(String name, int office, int rate, int hours, int supplement) {      //Konstruktor przeciążony
        super(name, office, rate, hours);       //Wywoładnie przeciążonego konstruktora nadklasy
        this.supplement = supplement;
    }

    public Seller setSupplement(int supplement) {       //Setter dodatku
        this.supplement = supplement;
        return this;
    }

    public int getSupplement() {        //Gettet dodatku
        return supplement;
    }       //Geter dodatku

    public int getCounterS() {       //Getter licznika obiektóe tego typu
        return counters;
    }       //Getter licznika

    @Override
    public int countSalary(){       //Publiczna metoda obliczająca wypłatę sprzedawcy
         int result;
         result=this.getRate()+this.getHours()+this.supplement;

         return result;
    }
}
