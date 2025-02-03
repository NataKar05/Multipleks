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

    //Typy siedzeń
    private final List<String> superPromoSeats = Seats.SUPER_PROMO;
    private final List<String> superPromoForDisabledSeats = Seats.SUPER_PROMO_FOR_DISABLED;
    private final List<String> promoSeats = Seats.PROMO;
    private final List<String> standardSeats = Seats.STANDARD;
    private final List<String> standardVIPSeats = Seats.STANDARD_VIP;

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

    public boolean reserveSeat(String seat){
        if (reservedSeats.contains(seat)){
            System.out.println("Miejsce "+seat  +" jest już zajęte.");
            return false;
        }
        reservedSeats.add(seat);
        System.out.println("Zarezerwowano miejsce: "+ seat);
        return true;
    }

    public List<String>getSuperPromoSeats(){
        return superPromoSeats;
    }

    public List<String> getSuperPromoForDisabledSeats() {
        return superPromoForDisabledSeats;
    }

    public List<String> getPromoSeats() {
        return promoSeats;
    }

    public List<String> getStandardSeats() {
        return standardSeats;
    }

    public List<String> getStandardVIPSeats() {
        return standardVIPSeats;
    }
    @Override
    public String toString() {
        return "Film: " + movieName + ", godzina: " + time + ", typ: " + type + ", zarezerwowane miejsca: " + reservedSeats;
    }

}
