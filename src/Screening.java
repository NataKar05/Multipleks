import SeatingPlan.Seat;
import SeatingPlan.Seats;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Screening {

    private final String movieName;
    private final String time;
    private final ScreeningType type;
    private final LocalDate date;
    private final Set<String> reservedSeats = new HashSet<>();
    private final List<Seat> seats = Seats.generateSeats();

    public Screening(String movieName, LocalDate date, String time, ScreeningType type) {
        this.movieName = movieName;
        this.time = time;
        this.type = type;
        this.date = date;
    }

    public String getMovieName() {
        return movieName;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }


    public ScreeningType getType() {
        return type;
    }

    // TODO: simplify
    public Set<String> getReservedSeats() {
        return reservedSeats;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void reserveSeat(String seatName) {
        Optional<Seat> possibleSeat = findSeat(seatName);
        if (possibleSeat.isEmpty()) {
            System.out.println("Miejsce " + seatName + " nie istnieje");
            return;
        }
        Seat seat = possibleSeat.get();
        if (seat.isReserved()) {
            System.out.println("Miejsce " + seatName + " jest już zajęte.");
            return;
        }
        seat.setReserved(true);
        System.out.println("Zarezerwowano miejsce: " + seatName);

    }

    private Optional<Seat> findSeat(String name) {
        for (Seat seat : seats) {
            if (seat.getName().equals(name)) {
                return Optional.of(seat);
            }
        }
        return Optional.empty();
    }

    @Override
    public String toString() {
        return "Film: " + movieName + ", godzina: " + time + ", typ: " + type + ", zarezerwowane miejsca: " + reservedSeats;
    }

}
