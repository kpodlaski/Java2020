package zaj1;

public class Pierwsza {

    public static void main(String[] args) {
        Osoba o = new Osoba("Kalina","Kalinowska",98111901234L);
        System.out.println("Osoba :"+o);
        System.out.println(o.getImie()+" "+o.getNazwisko()+" "+o.getPesel());
        Osoba o2 = new Osoba("Kalina","Tomaszewska",98111901234L);
        if (o==o2) System.out.println("Ten sam obiekt");
        else System.out.println("Inny obiekt");
        if (o.equals(o2)) System.out.println("Ta sama osoba");
        else System.out.println("Inna osoba");
    }
}
