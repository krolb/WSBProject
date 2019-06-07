public class Employee extends Personel {
    private int rate;       //Stawka godzinowa
    private int hours;      //Przepracowane godziny

    Employee(){     //Konstruktor bezparametrowy
     super();
     this.rate=0;
     this.hours=0;
    }

  Employee(String name, int office, int rate, int hours) {      //Konstruktor przeciążony
        super(name, office);
        this.rate = rate;
        this.hours = hours;
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
    }

    public int getHours() {     //Getter przeprzcowanych godzin
        return hours;
    }

    public int countSalary(){
        int result=this.hours*this.rate;
        return result;
    }



}
