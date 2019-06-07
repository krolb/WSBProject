public class Main {
//@autor Bartosz Król
    // Plik gówny main w którym będzie wykonwany słaściwy program korzystający z klas znajdujących się w innych plikach
    public static void main(String[] args) {



        int i= 10;
        String ii;

        Personel per = new Personel();
        per.setOffice(001);
        per.getNumber();

//        Employee emp = new Employee();
//        System.out.println(emp.getHours());
//        emp.setHours(160);
//        emp.setRate(14);
//        System.out.println(emp.countSalary());
//        Seller sel = new Seller();
//        sel.setOffice(10);
//
//        System.out.println(sel.getNumber());

        Director dir = new Director();
        System.out.println(dir.countSalary());
        System.out.println(dir.getBonus());
        System.out.println(dir.getSalary());
    }
}
