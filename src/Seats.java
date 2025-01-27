import SeatingPlan.SeatsList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static SeatingPlan.SeatsList.*;

public class Seats {

    //czemu tu lepiej dac ArrayLista???
    List<String> superPromoSeats = new ArrayList<>();
    List<String>superPromoForDisabledSeats = new ArrayList<>();
    List<String>promoSeats = new ArrayList<>();
    List<String>standardSeats = new ArrayList<>();
    List<String>standardVIPSeats=new ArrayList<>();

    public static void CreatingSeatIDs(List<String> superPromoSeats, List<String>superPromoForDisabledSeats,List<String>promoSeats, List<String>standardSeats,List<String>standardVIPSeats) {

        //superPromoSeats
        for (String row : superPromoRow) {
            for (int seatNumber : superPromoNumber) {
                superPromoSeats.add(row + seatNumber);
            }

        }

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

}
