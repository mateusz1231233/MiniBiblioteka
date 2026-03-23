public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;
    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }
    public void wypiszInfo() {
        System.out.println("Tytuł: " + tytul + ", Autor: " + autor + ", Strony: " + liczbaStron + ", Dostępna: " + dostepna);
    }

    public void wypozycz() {
        if (dostepna == true) {
            dostepna = false;
            System.out.println("Wypożyczono: " + tytul);
        } else {
            System.out.println("Książka " + tytul + " jest już wypożyczona.");
        }
    }
    public void zwroc() {
        dostepna = true;
        System.out.println("Zwrócono: " + tytul);
    }
    public boolean isDostepna() {
        return dostepna;
    }
}

