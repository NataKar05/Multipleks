package SeatingPlan;

public class Seat {

    private final String name;
    private final SeatType type;
    private boolean isReserved;

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

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }
}
