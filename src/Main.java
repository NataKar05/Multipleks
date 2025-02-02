import java.util.Date;
import java.util.HashSet;

public class Main {
        public static void main(String[] args) {

            Cinema cinema1 = new Cinema("Multikino", "Kraków, Serenada");

            Screening screening1 = new Screening("Inception", "11:00", new HashSet<>(),  new HashSet<>(),  new HashSet<>(), new HashSet<>());
            Screening screening2 = new Screening("Interstellar", "15:30", "3D");
            Screening screening3 = new Screening("The Dark Knight", "20:00", "VIP");
//
//            cinema.addScreening(screening1);
//            cinema.addScreening(screening2);
//            cinema.addScreening(screening3);
//
//            // Wyświetlanie programu
//            cinema.printProgramme();
//
//            // Rezerwacja miejsc na różne seanse
//            screening1.reserveSeat("H34");
//            screening2.reserveSeat("A12");
//            screening3.reserveSeat("VIP-01");
//
//            // Tworzenie biletu na seans VIP
//            Ticket ticket = new Ticket("The Dark Knight", new Date(), java.sql.Time.valueOf("20:00:00"), "VIP-01", 50);
//            System.out.println(ticket);
//
//            Ticket vipTicket = new Ticket("The Dark Knight", new Date(), java.sql.Time.valueOf("20:00:00"), "VIP-01", 50, "VIP");
//            System.out.println(vipTicket);
        }


}
