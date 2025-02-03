package SeatingPlan;

public class Seat {

    private final String name;
    private final SeatType type;
    private final boolean isReserved;

    public Seat(String name, SeatType type, boolean isReserved) {
        this.name = name;
        this.type = type;
        this.isReserved = isReserved;
    }

    public String getName() {
        return name;
    }

    public SeatType getType() {
        return type;
    }

    public boolean isReserved() {
        return isReserved;
    }
}
