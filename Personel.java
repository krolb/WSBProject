public class Personel {
    private String name;
    private int office;

    Personel(){
        this.name="Janusz";
        this.office=00;
    }
    //Konstruktor przeciążony pozwalający zapisać zmienne swoimi danymi od razu przy tworzeniu
    Personel(String name, int office) {
        this.name = name;
        this.office = office;
    }

    public Personel setName(String name) {
        this.name = name;
        return this;
    }

    public Personel setOffice(int office) {
        this.office = office;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getOffice() {
        return office;
    }

    public String getNumber(){
        String number = "500 700 0";
        number+=String.valueOf(this.getOffice());
        return number;
    }
}
