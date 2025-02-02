package SeatingPlan;

import java.util.ArrayList;
import java.util.List;

import static SeatingPlan.SeatsList.*;

public class Seats {

    public static List<String> SUPER_PROMO_ROW =

    public static void CreatingSeatIDs(List<String> superPromoSeats, List<String>superPromoForDisabledSeats,List<String>promoSeats, List<String>standardSeats,List<String>standardVIPSeats) {

        //superPromoSeats
        prepareSeatsIDs(superPromoRow, superPromoNumber, superPromoSeats);

        //superPromoForDisabledSeats
        for (String row : superPromoForDisabledRow) {
            for (int seatNumber : superPromoForDisabledNumber) {
                superPromoForDisabledSeats.add(row + seatNumber);
            }

        }

        //promoSeats
        for (String row : promoRow) {
            for (int seatNumber : promoNumber) {
                promoSeats.add(row + seatNumber);
            }

        }

        //standardSeats
        for (String row : standardRow) {
            for (int seatNumber : standardNumber) {
                standardSeats.add(row + seatNumber);
            }

        }
        //standardVIPSeats
        for (String row : standardVIPRow) {
            for (int seatNumber : standardVIPNumber) {
                standardVIPSeats.add(row + seatNumber);
            }

        }

    }

    private static void prepareSeatsIDs(List<String> superPromoRow, List<Integer> superPromoNumber, List<String> superPromoSeats) {
        for (String row : superPromoRow) {
            for (int seatNumber : superPromoNumber) {
                superPromoSeats.add(row + seatNumber);
            }

        }
    }

}
