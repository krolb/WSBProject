import java.util.Scanner;

public class Employee extends Personel {
    private int rate;       //Stawka godzinowa
    private int hours;      //Przepracowane godziny

    Employee(){     //Konstruktor bezparametrowy
     super();       //Wywoładnie konstruktora bezparametrowego nadklasy
     this.rate=0;
     this.hours=0;
    }

  Employee(String name, int office, int rate, int hours) {      //Konstruktor przeciążony
        super(name, office);        //Wywoładnie konstruktora nadklasy
        this.rate = rate;
        this.hours = hours;
    }
    public void setRate(int rate) {     //Setter stawki godzinowej
        this.rate = rate;
    }       //Setter stawki godzinowej

    public void setHours(int hours) {       //Setter przepracowanych godzin
        this.hours = hours;
    }       //Setter godzin

    public int getRate() {      //Getter stawki godzinowej
        return rate;
    }       //Getter stawki godzinowej

    public int getHours() {     //Getter przeprzcowanych godzin
        return hours;
    }       //Getter przepracowanych godzin


    public int countSalary(){       //Publiczna metoda obliczania wypłaty
        int result=this.hours*this.rate;
        return result;
    }
    @Override
    public  void  addPerson(){      //Metoda addPerson dodająca osobę, przesłania metodę z nadklasy i dodaje do niej dodatkowe opcje

        Scanner s= new Scanner(System.in);
        super.addPerson();                          //Wywołanie metody z nadklasy
        System.out.println("Podaj Stawkę:");
        this.setRate(s.nextInt());
        System.out.println("Podaj ilość godzin:");
        this.setHours(s.nextInt());



    }

    @Override
    public void info(){     //Przesłoniona metoda info pozwalająca na wyświetlenie dodatkowych informacji zawartych w podklasie
        super.info();
        System.out.printf("Stawka: "+this.getRate()+ "\t|Przepracowane godizny: "+this.getHours()+"\t|");
    }


}


