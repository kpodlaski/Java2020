package zaj1;

public class Pierwsza {

    public static void main(String[] args) {
//        for (int i=0; i<10; i++){
//            System.out.print("Liczba: ");
//            System.out.println(i);
//        }
        Osoba osoba =new Osoba("Adam","Adamowski",95121501234L);
        osoba.setImie("Alicja");
        System.out.println( osoba.getImie() + " " + osoba.getNazwisko()+ " "+osoba.getPesel() );
        System.out.println("Osoba : "+osoba.toString());
        Osoba osoba2 = new Osoba("Alicja","Tomaszewska",95121501234L);
        if (osoba == osoba2) System.out.println("Ten sam  Obiekt!!!");
        else System.out.println("Inne Obiekty !!!");
        if (osoba.equals(osoba2)) System.out.println(" Ten sam Pesel");
        else System.out.println("Inny Pesel");

    }
}
