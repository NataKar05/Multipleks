package SeatingPlan;

import java.util.ArrayList;
import java.util.List;

import static SeatingPlan.SeatsList.*;

public class Seats {

    public static List<Seat> generateSeats () {
        List<Seat> seats = new ArrayList<>();
        seats.addAll(prepareSeats(superPromoRow, superPromoNumber, SeatType.SUPER_PROMO));
        seats.addAll(prepareSeats(superPromoForDisabledRow, superPromoForDisabledNumber, SeatType.SUPER_PROMO_FOR_DISABLED));
        seats.addAll(prepareSeats(promoRow, promoNumber, SeatType.PROMO));
        seats.addAll(prepareSeats(standardRow, standardNumber, SeatType.STANDARD));
        seats.addAll(prepareSeats(standardVIPRow, standardVIPNumber, SeatType.STANDARD_VIP));
        return seats;
    }

    private static List<Seat> prepareSeats(List<String> rows, List<Integer> numbers, SeatType type) {
        List<Seat> seats = new ArrayList<>();
        for (String row : rows) {
            for (int seatNumber : numbers) {
                seats.add(new Seat(row + seatNumber, type, false));
            }
        }
        return seats;
    }
}
