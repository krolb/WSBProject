import java.util.Scanner;
//Klasa Seller dziedzicząca po klasie Employee która dziedziczy po klasie Personel
public class Seller extends Employee {
 private int supplement;     //Prywatna zmienna typu inr przechowyująca Dodatek


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


    @Override
    public int countSalary(){       //Publiczna metoda obliczająca wypłatę sprzedawcy
         int result;
         result=this.getRate()+this.getHours()+this.supplement;

         return result;
    }
    @Override
    public void addPerson(){        //Przyesłoniona metoda dodająca osobę z dodatkowymi danymi korzystająca z metody z nadklasy employee która bazuje na metodzie klasy personel
        Scanner s= new Scanner(System.in);
        super.addPerson();                                  //Wywołanie metody addperson z nadklasy
        System.out.println("Podaj wartość dodatku: ");
        this.setSupplement(s.nextInt());
    }
    @Override
    public void info(){     //Przesłoniona metoad bazująca na metodzie z nadklasy i wyświetlająca dodatkowe dane z tej klasy
        super.info();
        System.out.printf("Dodatek: "+this.getSupplement()+"\t|");
    }


}
