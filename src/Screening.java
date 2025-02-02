import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Screening {

    private final String movieName;
    private final String time;
    private final String type;
    private final Set<String> reservedSeats;

    //Typy siedzeń
    private final List<String> superPromoSeats;
    private final List<String> superPromoForDisabledSeats;
    private final List<String> promoSeats;
    private final List<String> standardSeats;
    private final List<String> standardVIPSeats;


    public Screening(String movieName, String time, Set<String> reservedSeats, String type, List<String> superPromoSeats, List<String> superPromoForDisabledSeats, List<String> promoSeats, List<String> standardSeats, List<String> standardVIPSeats) {
        this.movieName = movieName;
        this.time = time;
        this.type = type;
        this.reservedSeats = new HashSet<>();

        //Typy siedzeń
        this.superPromoSeats = superPromoSeats;
        this.superPromoForDisabledSeats = superPromoForDisabledSeats;
        this.promoSeats = promoSeats;
        this.standardSeats = standardSeats;
        this.standardVIPSeats = standardVIPSeats;
    }

    public String getMovieName(){
        return movieName;
    }

    public String getTime(){
        return time;
    }


    public String getType(){
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
