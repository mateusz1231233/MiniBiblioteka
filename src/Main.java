
public class Main {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Wiedźmin", "Andrzej Sapkowski", 320, true);
        Ksiazka ksiazka2 = new Ksiazka("Hobbit", "J.R.R. Tolkien", 310, true);
        Ksiazka ksiazka3 = new Ksiazka("Diuna", "Frank Herbert", 600, false);

        ksiazka1.wypiszInfo();
        ksiazka1.wypozycz();
        ksiazka1.wypozycz();
        ksiazka1.zwroc();
        ksiazka1.wypiszInfo();

    System.out.println("--- Test Zadania 2 ---");
    Czytelnik c1 = new Czytelnik("Jan", "Kowalski", "K-100");
        c1.wypiszDane();
        c1.dodajWypozyczenie();
        c1.wypiszDane(); }
}
