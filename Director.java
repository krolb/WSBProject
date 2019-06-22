import java.util.Scanner;

//Klasa Director dziedzicząca po klasie perdsonel
public class Director extends Personel {
 private int salary;         //Prywatna zmienna typu int przechowująca stałą stawkę
 private int bonus;          //Prywatna zmienna typu int przechowująca premia

    Director(){     //Konstruktor bezparametrowy
        super();        //Wywołanie konstruktora bezparametrowego nadklasy
        this.bonus=0;
        this.salary=0;
    }

    Director(String name, int office, int salary, int bonus) {  //Konstruktor przeciążony
        super(name, office);        //Wywołanie konstruktora przeciążonego nadklasy
        this.salary = salary;
        this.bonus = bonus;
    }

    public void setSalary(int salary) { //Setter stawki
        this.salary = salary;
    }       //Setter wypłaty

    public void setBonus(int bonus) {   //Setter premii
        this.bonus = bonus;
    }       //Setter premii

    public int getSalary() {    //Getter stawki
        return salary;
    }       //Getter stalej stawki

    public int getBonus() {     //Getter premii
        return bonus;
    }       //Getter premii


    public int countSalary(){   //Publiczna funkcja obliczająca wypłate dyrektora
        int result;
        result=salary+bonus;
        return result;
    }
    @Override
    public void addPerson(){                        //Presłoniona metoda z nadklasy, pozwala na zapisanie osoby z klasy dyrektor i dodania do niej dodatkowych informacji
        Scanner input = new Scanner(System.in);
        int in;
        super.addPerson();                                                  //Wywoładnie metody z nadklasy
        System.out.println("Podaj stałą stałą stawke miesięczną: ");
        this.setSalary(input.nextInt());
        System.out.println("Podaj premię miesięczną: ");
        this.setBonus(input.nextInt());
    }

    @Override
    public void info(){     //Przesłoniona metoda z nadklasy, pozwala na wyświetlenie osoby z klasy dyrektor z dodatkowymi informacjami
        super.info();
        System.out.printf("Stała stawka miesięczna: "+this.getSalary()+"\t|Premia miesięczna: "+this.getBonus()+"\t|");
    }

}
