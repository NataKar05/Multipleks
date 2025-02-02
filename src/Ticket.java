import java.sql.Time;
import java.util.Date;

public class Ticket {

    private String movieName;
    private Date date;
    private Time time;
    private String seat;
    private int price;
    private final String type;
    private final String seatType;

    public Ticket(String movieName, Date date, Time time, String seat, int price, String type, String seatType) {

        //Konstruktor tworzy nowy obiekt reprezentujący seans
        this.movieName = movieName;
        this.date = date;
        this.time = time;
        this.seat = seat;
        this.price = price;
        this.type = type;
        this.seatType = seatType;
    }

    @Override
    public String toString() {
        return "Bilet na seans: " + movieName + ", data: " + date + ", godzina: " + time + ", miejsce: " + seat +
                ", cena: " + price + " zł, typ seansu: " + type+ ", typ siedzenia: " + seatType;
    }


}
