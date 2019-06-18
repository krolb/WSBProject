//Klasa Director dziedzicząca po klasie perdsonel
public class Director extends Personel {
 private int salary;         //Prywatna zmienna typu int przechowująca stałą stawkę
 private int bonus;          //Prywatna zmienna typu int przechowująca premia
 static  private int counterd;        //Statyczny licznik obiektów tego typu

    Director(){     //Konstruktor bezparametrowy
        super();
        this.bonus=0;
        this.salary=0;
        this.counterd++;
    }

    Director(String name, int office, int salary, int bonus) {  //Konstruktor przeciążony
        super(name, office);
        this.salary = salary;
        this.bonus = bonus;
        this.counterd++;
    }

    public Director setSalary(int salary) { //Setter stawki
        this.salary = salary;
        return this;
    }

    public Director setBonus(int bonus) {   //Setter premii
        this.bonus = bonus;
        return this;
    }

    public int getSalary() {    //Getter stawki
        return salary;
    }       //Getter stalej stawki

    public int getBonus() {     //Getter premii
        return bonus;
    }       //Getter premii

    public int getCounterd() {   //Getter licznika obiektów tego typu
        return this.counterd;
    }   //Getter licznika obiektów tego typu

    public int countSalary(){   //Publiczna funkcja obliczająca wypłate dyrektora
        int result;
        result=salary+bonus;
        return result;
    }
}
