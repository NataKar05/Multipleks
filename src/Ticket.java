import SeatingPlan.Seat;

import java.time.LocalDate;

public class Ticket {

    private final String email;
    private final String movieName;
    private final LocalDate date;
    private final String time;
    private final Seat seat;
    private final double price;
    private final ScreeningType type;

    public Ticket(Screening screening, String email, Seat seat, double price) {

        //Konstruktor tworzy nowy obiekt reprezentujący seans
        this.email = email;
        this.movieName = screening.getMovieName();
        this.date = screening.getDate();
        this.time = screening.getTime();
        this.seat = seat;
        this.price = price;
        this.type = screening.getType();
    }

    @Override
    public String toString() {
        // TODO: add email
        return "Bilet na seans: " + movieName + ", data: " + date + ", godzina: " + time + ", miejsce: " + seat.getName() +
                ", cena: " + price + " zł, typ seansu: " + type+ ", typ siedzenia: " + seat.getType();
    }
}
