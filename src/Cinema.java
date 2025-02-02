import SeatingPlan.Seats;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class Cinema {

    private final String name;
    private final String address;
    private final List<Screening> screenings;

    public Cinema(String name, String address) {
        this(name, address, List.of());
    }

    //Tworzenie konstruktora, który jest specjalną metodą
    //uruchamianą przy tworzeniu obiektu tej klasy.
    public Cinema(String name, String address, List<Screening> screenings) {
        //"this" oznacza "bieżący obiekt klasy"
        this.name = name;
        this.address = address;
        this.screenings = screenings;
    }


    //Metoda do pobierania nazwy kina
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }


    public void addScreening(Screening screening) {
        screenings.add(screening);
    }

    public List<Screening> getScreenings() {
        return screenings;
    }

    public void initializeScreeningWithSeats (String movieName, String time, String type){

        //Poniżej listy siedzeń
        List<String> superPromoSeats = new ArrayList<>();
        List<String> superPromoForDisabledSeats = new ArrayList<>();
        List<String> promoSeats = new ArrayList<>();
        List<String> standardSeats = new ArrayList<>();
        List<String> standardVIPSeats = new ArrayList<>();

        Seats.CreatingSeatIDs(superPromoSeats, superPromoForDisabledSeats, promoSeats, standardSeats, standardVIPSeats);

        Set<String> reservedSeats=new HashSet<>();

        Screening screening = new Screening(movieName, time, reservedSeats, type, superPromoSeats, superPromoForDisabledSeats, promoSeats, standardSeats, standardVIPSeats);
        addScreening(screening);
    }

    public void printProgramme() {
        System.out.println("Repertuar kina: " + name);
        for (Screening screening : screenings) {
            System.out.println(screening);
        }
    }

    public Screening findScreening(String movieName) {
        for (Screening screening : screenings) {
            if (screening.getMovieName().equalsIgnoreCase(movieName)) {
                return screening;
            }
        }
        return null;
    }

}
