public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int aktualnaLiczbaKsiazek;
    public Biblioteka(int pojemnosc) {
        this.ksiazki = new Ksiazka[pojemnosc];
        this.aktualnaLiczbaKsiazek = 0;
    }
    public void dodajKsiazke(Ksiazka nowaKsiazka) {
        if (aktualnaLiczbaKsiazek < ksiazki.length) {
            ksiazki[aktualnaLiczbaKsiazek] = nowaKsiazka;
            aktualnaLiczbaKsiazek++;
        } else {
            System.out.println("Biblioteka jest pelna!");
        }
    }
    public void wyswietlWszystkie() {
        System.out.println("Zasoby biblioteki:");
        for (int i = 0; i < aktualnaLiczbaKsiazek; i++) {
            ksiazki[i].wypiszInfo();
        }
            }
    public void wypozyczKsiazke(Ksiazka ksiazka, Czytelnik czytelnik) {
        if (ksiazka.isDostepna()) {
            ksiazka.wypozycz();
            czytelnik.dodajWypozyczenie();
            System.out.println("Sukces! Wypozyczono ksiazke uzytkownikowi.");
        } else {
            System.out.println("Niestety, ksiazka jest juz zajeta.");
        }
    }
        }

