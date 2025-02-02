import java.util.List;

public class Reportoire {

    private List<String> reportoireForThisWeek = List.of(
            "Gladiator 09:30, 13:45, 17:30",
            "The Lord of the Rings: The Fellowship of the Ring 10:15, 15:00, 19:45",
            "Harry Potter and the Sorcerer’s Stone 10:00, 12:45, 17:00",
            "Star Wars: A New Hope 11:00, 16:30, 20:30",
            "The Godfather 12:30, 18:00, 22:15",
            "The Avengers 10:30, 14:45, 19:15",
            "Spider-Man: No Way Home 11:45, 16:15, 20:45");


    private List<String> reportoireForNextWeek = List.of(
            "Inception 11:00, 15:30, 20:00",
            "Interstellar 10:45, 14:15, 18:45, 21:30",
            "The Dark Knight 12:00, 16:45, 19:30",
            "Avatar: The Way of Water 13:00, 17:30, 21:00",
            "The Matrix 10:30, 14:00, 18:30, 22:00",
            "Pulp Fiction 11:15, 15:45, 20:15",
            "The Shawshank Redemption 12:45, 17:15, 21:45",
            "Forrest Gump 10:00, 14:30, 19:00, 22:30");


    public void displayReportoireForNextWeek() {
        System.out.println("Repertuar na najbliższy tydzień: \n");

        //Lepiej użyć pętli bo przy "sout" wyświetla się z przecinkami

        for (String movieName : reportoireForNextWeek) {
            System.out.println(movieName);
        }


    }


}
