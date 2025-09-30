package rover;

public class StatusReport {
    private final int x;
    private final int y;
    private final Direction direction;

    public StatusReport(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public String toString() {
        // Match your previous print style
        String facing;
        switch (direction) {
            case N: facing = "N"; break;
            case E: facing = "E"; break;
            case S: facing = "S"; break;
            case W: facing = "W"; break;
            default: facing = direction.toString();
        }
        return "Rover is at (" + x + ", " + y + ") facing " + facing;
    }
}