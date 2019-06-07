public class Director extends Personel {
private int salary;         //Stała stawka
private int bonus;          //Premia

    Director(){     //Konstruktor bezparametrowy
        super();
        this.bonus=0;
        this.salary=0;
    }

    Director(String name, int office, int salary, int bonus) {  //Konstruktor przeciążony
        super(name, office);
        this.salary = salary;
        this.bonus = bonus;
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
    }

    public int getBonus() {     //Getter premii
        return bonus;
    }

    public int countSalary(){   //Publiczna funkcja obliczająca wypłate dyrektora
        int result;
        result=salary+bonus;
        return result;
    }
}
