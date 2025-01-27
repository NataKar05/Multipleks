public class Main {
    public static void main(String[] args) {

        //Tworzenie nowego obiektu Cinema o nazwie "cinema1"
        //Przekazujemy do konstruktora dwa argumenty: nazwa i adres

        Cinema cinema1 = new Cinema("Super Tarasy", "ul. Akademicka 5");



        //Poniżej miejsce na dodatkowy kod, który może inicjalizować kino
        //np. dodawanie filmów, godzin seansów itp.
        //... configuration and test data should be inserted here...


        // below you will find sample function executions

        //Wywołuje metode "printProgramme()" na obiekcie cinema1
        //Ta metoda wyświetla prawdopodobnie aktualny repertuar kina
        cinema1.printProgramme();

        //Pobierasz listę lub tablicę seansów (getScreenings()) z obiektu cinema1
        //Następnie wybierasz pierwszy seans ([0]) i przypisujesz go do zmiennej screening
        Screening screening = cinema1.getScreenings()[0];


        //Wywołujesz metodę reservePlaces() na obiekcie screening,
        //przekazując numery miejsc do rezerwacji ("H34", "H35", "H36").
        screening.reservePlaces("H34", "H35", "H36"); // seats number given


        //Alternatywna metoda rezerwacji miejsc.
        //Tym razem zamiast podać numery miejsc jako tekst, przekazujesz obiekty
        //(prawdopodobnie klasy Seat lub coś podobnego).
        screening.reservePlaces(seat1, seat2, seat3); // other option



        //Rezerwujesz miejsca, ale tym razem podajesz również obiekt customer
        //(prawdopodobnie klienta kina).
        //To oznacza, że rezerwacja będzie powiązana z konkretnym klientem.
        screening.reservePlaces(customer, "H34", "H35", "H36"); // reservation for registered customer


        //Wywołujesz metodę findMovie() na obiekcie cinema1,
        //aby znaleźć film o nazwie "James Bon".
        movie1 = cinema1.findMovie("James Bon");
        // ... etc ...
    }
}
