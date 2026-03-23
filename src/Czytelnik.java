public class Czytelnik {
    private String imie;
    private String nazwisko;
    private String numerKarty;
    private int liczbaWypozyczen;
    public Czytelnik(String imie, String nazwisko, String numerKarty) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = 0;
    }
    public void wypiszDane() {
        System.out.println("Czytelnik: " + imie + " " + nazwisko + " (Nr karty: " + numerKarty + ")");
        System.out.println("Liczba wypozyczonych ksiazek: " + liczbaWypozyczen);
    }
    public void dodajWypozyczenie() {
        this.liczbaWypozyczen++;
    }
    public void odejmijWypozyczenie() {
        if (this.liczbaWypozyczen > 0) {
            this.liczbaWypozyczen--;
        }
    }
}
