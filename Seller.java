public class Seller extends Employee {
private int supplement;     //Dodatek


    Seller(){   //kKonstruktor bezparametrowy
        super();
        this.supplement=0;
    }

    Seller(String name, int office, int rate, int hours, int supplement) {      //Konstruktor przeciążony
        super(name, office, rate, hours);
        this.supplement = supplement;
    }

    public Seller setSupplement(int supplement) {       //Setter dodatku
        this.supplement = supplement;
        return this;
    }

    public int getSupplement() {        //Gettet dodatku
        return supplement;
    }

    @Override
    public int countSalary(){       //Publiczna funkcja obliczająca wypłatę sprzedawcy
         int result;
         result=this.getRate()+this.getHours()+this.supplement;

         return result;
    }
}
