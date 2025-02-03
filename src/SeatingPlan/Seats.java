package SeatingPlan;

import java.util.ArrayList;
import java.util.List;

import static SeatingPlan.SeatsList.*;

public class Seats {

    public static List<String> SUPER_PROMO = prepareSeatsIDs(superPromoRow, superPromoNumber);
    public static List<String> SUPER_PROMO_FOR_DISABLED = prepareSeatsIDs(superPromoForDisabledRow, superPromoForDisabledNumber);
    public static List<String> PROMO = prepareSeatsIDs(promoRow, promoNumber);
    public static List<String> STANDARD = prepareSeatsIDs(standardRow, standardNumber);
    public static List<String> STANDARD_VIP = prepareSeatsIDs(standardVIPRow, standardVIPNumber);

    private static List<String> prepareSeatsIDs(List<String> rows, List<Integer> numbers) {
        List<String> seatsIds = new ArrayList<>();
        for (String row : rows) {
            for (int seatNumber : numbers) {
                seatsIds.add(row + seatNumber);
            }
        }
        return seatsIds;
    }

}
