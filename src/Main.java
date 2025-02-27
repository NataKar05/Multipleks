import java.time.LocalDate;
import java.util.Optional;

public class Main {
        public static void main(String[] args) {

            Cinema cinema1 = new Cinema("Multikino", "Kraków, Serenada");

            Screening screening1 = new Screening("Inception", LocalDate.now(), "12:30", ScreeningType.STANDARD);
            Screening screening2 = new Screening("Interstellar",LocalDate.now(), "15:30", ScreeningType.THREE_DIMENSIONAL);
            Screening screening3 = new Screening("The Dark Knight",LocalDate.now(), "20:00", ScreeningType.VIP);
            Screening screening4 = new Screening("The Dark Knight",LocalDate.now().plusDays(8), "20:00", ScreeningType.VIP);

            cinema1.addScreening(screening1);
            cinema1.addScreening(screening2);
            cinema1.addScreening(screening3);
            cinema1.addScreening(screening4);

            // Wyświetlanie programu
            cinema1.printProgramme();

            System.out.println();

            cinema1.printProgrammeForNextWeek();

            System.out.println();


//            // Rezerwacja miejsc na różne seanse
            screening1.reserveSeat("H40");
            screening2.reserveSeat("A12");
            screening3.reserveSeat("J10");
            screening3.reserveSeat("J10");

            // Kupno biletu na seans, gdy użytkownik nie jest zalogowany
            cinema1.buyTicket(screening1, Optional.empty(), "zzzdzisilaw@gmail.com", "A10");

            // Kupno biletu na seans, gdy użytkownik ma konto
            User user = new User("zzzdzisilaw@gmail.com", "Zdzisław");
            cinema1.buyTicket(screening1, Optional.of(user), user.getEmail(), "A11");

            // Pobieranie biletów użytkownika i ich wyświetlenie
            System.out.println("\nBilety użytkownika:");
            for (Ticket ticket : cinema1.getTicketsForUser(user.getEmail())) {
                System.out.println(ticket);
            }
        }
}