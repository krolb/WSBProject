Program do zarządzania kadrą

Autor - Bartosz Król
Edytor - IntelliJ IDEA by JetBrains 2018.3.6
Język:
-Back-end - Angielski
-Front-end - Polski
-JavaDoc- Polski
Program napisany na podsatwie polecenia zawartego w pliku PDF z LAB3



Program został rozdzielony na 5 plików
-Main.java (zawierającą główny trzon programu)
-Personel.java (zawiera główną klasę personel)
-Director.java (zawiera klasę dyrektor dziedziczącą po klasie personel)
-Employee.java (zawiera klasę pracownik dziedziczącą po klasie personel)
-Seller.java (zawiera klasę sprzedawca dziedziczącą po klasie pracownik która dziedziczy po klasie personel)

       Personel
      /        \
Procaonik      Dyrektor
    |
Sprzedawca


Składowe klas:
-Personel:
+pola-name, office, counter
+setter-setName, setOffice
+getter-getName, getOffice, getCounter
+metody-getNumber

-Procownik:
+pola-rate, hours, countere
+setter-setRate, setHours
+getter-getRate, getHours, getCounterE
+metody-countSalary

-Dyrektor:
+pola- salary, bonus, sounteD
+setter-setSalary, setBonus
+getter-getSalary, getBonus
+metody-getCounterd, countSalary

-Sprzedawca:
+pole- supplement, couters
+setter-setSupplement
+getter-get Supplement, getCounters
+motody-countSalary(przeciążona metoda)

Klasa Personel posiada konstruktor jak i konstruktor bezparametrowy, pozostałe klasy posiadają swoje konstruktory które korzystają z bazowyc konstruktorów w klasie Personel i je przeciążają

