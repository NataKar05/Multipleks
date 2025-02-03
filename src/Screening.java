import SeatingPlan.Seat;
import SeatingPlan.Seats;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Screening {

    private final String movieName;
    private final String time;
    private final ScreeningType type;
    private final LocalDate date;
    private final Set<String> reservedSeats  = new HashSet<>();
    private final List<Seat> seats = Seats.generateSeats();

    public Screening(String movieName, LocalDate date,String time, ScreeningType type) {
        this.movieName = movieName;
        this.time = time;
        this.type = type;
        this.date = date;
    }

    public String getMovieName(){
        return movieName;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTime(){
        return time;
    }


    public ScreeningType getType(){
        return type;
    }

    // TODO: simplify
    public Set<String> getReservedSeats() {
        return reservedSeats;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public boolean reserveSeat(String seat){
        if (reservedSeats.contains(seat)){
            System.out.println("Miejsce "+seat  +" jest już zajęte.");
            return false;
        }
        reservedSeats.add(seat);
        System.out.println("Zarezerwowano miejsce: "+ seat);
        return true;
    }

    @Override
    public String toString() {
        return "Film: " + movieName + ", godzina: " + time + ", typ: " + type + ", zarezerwowane miejsca: " + reservedSeats;
    }

}
