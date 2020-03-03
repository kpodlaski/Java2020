package zaj1;

public class Osoba {
    private String imie = "Jane";
    private String nazwisko = "Doe";
    private long pesel ;

    public Osoba(String imie, String nazwisko, long pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public String toString(){
        return pesel+" "+imie+" "+nazwisko;
    }

    public boolean equals(Object o){
        Osoba o2 = (Osoba) o;
        return o2.pesel == this.pesel;
    }

}
