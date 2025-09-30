package rover;

public enum Direction {
    N, E, S, W;

    public Direction turnLeft() {
        // N->W->S->E->N
        return values()[(ordinal() + 3) % 4];
    }

    public Direction turnRight() {
        // N->E->S->W->N
        return values()[(ordinal() + 1) % 4];
    }

    // Movement deltas
    public int dx() {
        switch (this) {
            case E: return 1;
            case W: return -1;
            default: return 0;
        }
    }

    public int dy() {
        switch (this) {
            case N: return 1;
            case S: return -1;
            default: return 0;
        }
    }

    public static Direction fromString(String s) {
        if (s == null) throw new IllegalArgumentException("Direction cannot be null");
        switch (s.toUpperCase()) {
            case "N": return N;
            case "E": return E;
            case "S": return S;
            case "W": return W;
            default: throw new IllegalArgumentException("Invalid direction: " + s);
        }
    }

    @Override
    public String toString() {
        // Keep single-letter output
        return name();
    }
}