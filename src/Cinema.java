import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Cinema {

    private final String name;
    private final String address;
    private final List<Screening> screenings;

    public Cinema(String name, String address) {
        this(name, address, new ArrayList<>());
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

//    public void initializeScreeningWithSeats (String movieName, String time, ScreeningType type){
//        Screening screening = new Screening(movieName, time, type);
//        addScreening(screening);
//    }

    public void printProgramme() {
        System.out.println("Repertuar kina: " + name);
        for (Screening screening : screenings) {
            System.out.println(screening);
        }
    }

    public void printProgrammeForNextWeek() {
        System.out.println("Repertuar kina na przyszły tydzień: " + name);
        LocalDate nextWeekLastDay = LocalDate.now().plusDays(8);
        for (Screening screening : screenings) {
            if (screening.getDate().isBefore(nextWeekLastDay)) {
                System.out.println(screening);
            }
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
