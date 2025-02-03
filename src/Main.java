import java.time.LocalDate;

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


//            // Rezerwacja miejsc na różne seanse
            screening1.reserveSeat("H34");
            screening2.reserveSeat("A12");
            screening3.reserveSeat("VIP-01");
            screening3.reserveSeat("VIP-01");

//            // Tworzenie biletu na seans VIP
//            Ticket ticket = new Ticket("The Dark Knight", new Date(), java.sql.Time.valueOf("20:00:00"), "VIP-01", 50);
//            System.out.println(ticket);
//
//            Ticket vipTicket = new Ticket("The Dark Knight", new Date(), java.sql.Time.valueOf("20:00:00"), "VIP-01", 50, "VIP");
//            System.out.println(vipTicket);
        }


}
