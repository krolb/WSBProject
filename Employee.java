public class Employee extends Personel {
    private int rate;       //Stawka godzinowa
    private int hours;      //Przepracowane godziny
    static private int countere;    //Statyczny licznik obiektów danego typu

    Employee(){     //Konstruktor bezparametrowy
     super();
     this.rate=0;
     this.hours=0;
    }

  Employee(String name, int office, int rate, int hours) {      //Konstruktor przeciążony
        super(name, office);
        this.rate = rate;
        this.hours = hours;
        this.countere++;
    }


    public Employee setRate(int rate) {     //Setter stawki godzinowej
        this.rate = rate;
        return this;
    }

    public Employee setHours(int hours) {       //Setter przepracowanych godzin
        this.hours = hours;
        return this;
    }

    public int getRate() {      //Getter stawki godzinowej
        return rate;
    }       //Getter stawki godzinowej

    public int getHours() {     //Getter przeprzcowanych godzin
        return hours;
    }       //Getter przepracowanych godzin

    public int getCounterE() {   //Getter licznika obiektów tego typu
        return countere;
    }       //Getter licznika

    public int countSalary(){       //Publiczna metoda obliczania wypłaty
        int result=this.hours*this.rate;
        return result;
    }



}
