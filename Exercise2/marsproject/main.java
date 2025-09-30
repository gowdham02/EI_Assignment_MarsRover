import java.util.*;
import commands.*;
import grid.*;
import rover.*;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Grid ---
        int width  = readPositiveInt(sc, "Enter grid width: ");
        int height = readPositiveInt(sc, "Enter grid height: ");
        Grid grid = new Grid(width, height);

        // --- Obstacles ---
        int obstacleCount = readNonNegativeInt(sc, "Enter number of obstacles: ");
        for (int i = 0; i < obstacleCount; i++) {
            int ox = readInt(sc, "Enter obstacle x: ");
            int oy = readInt(sc, "Enter obstacle y: ");
            while (!grid.isWithinBounds(ox, oy)) {
                System.out.println("Coordinate out of bounds. Valid x ∈ [0," + (width-1) + "], y ∈ [0," + (height-1) + "].");
                ox = readInt(sc, "Enter obstacle x: ");
                oy = readInt(sc, "Enter obstacle y: ");
            }
            grid.addObstacle(new Obstacle(ox, oy));
        }

        // --- Starting position ---
        int sx = readInt(sc, "\nEnter starting x-coordinate: ");
        int sy = readInt(sc, "Enter starting y-coordinate: ");
        while (!grid.isWithinBounds(sx, sy) || grid.isObstacle(sx, sy)) {
            if (!grid.isWithinBounds(sx, sy)) {
                System.out.println("Start is out of bounds. Valid x ∈ [0," + (width-1) + "], y ∈ [0," + (height-1) + "].");
            } else {
                System.out.println("Start cell is blocked by an obstacle. Choose a free cell.");
            }
            sx = readInt(sc, "Enter starting x-coordinate: ");
            sy = readInt(sc, "Enter starting y-coordinate: ");
        }

        Direction dir = readDirection(sc, "Enter starting direction (N/E/S/W): ");
        Rover rover = new Rover(sx, sy, dir, grid);

        // --- Commands ---
        int n = readNonNegativeInt(sc, "\nEnter the number of commands: ");
        List<Command> commands = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            char c = readCommand(sc, "Enter command #" + i + ": ");
            commands.add(fromChar(c)); // M/L/R guaranteed valid here
        }

        // Execute
        for (Command cmd : commands) cmd.execute(rover);

        // Report
        StatusReport report = rover.getStatusReport();
        System.out.println(report.toString());

        Set<Obstacle> hits = rover.getEncounteredObstacles();
        if (hits.isEmpty()) {
            System.out.println("Rover did not encounter any obstacles.");
        } else {
            System.out.println("Rover encountered obstacles at:");
            for (Obstacle o : hits) System.out.println("(" + o.getX() + ", " + o.getY() + ")");
        }
    }

    // ---------- helpers ----------

    private static int readPositiveInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                int v = sc.nextInt();
                if (v > 0) return v;
                System.out.println("Grid value must be a positive integer.");
            } else {
                sc.next();
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    private static int readNonNegativeInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                int v = sc.nextInt();
                if (v >= 0) return v;
                System.out.println("Please enter 0 or a positive integer.");
            } else {
                sc.next();
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    private static int readInt(Scanner sc, String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Please enter a valid integer.");
            System.out.print(prompt);
        }
        return sc.nextInt();
    }

    private static Direction readDirection(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String tok = sc.next().trim().toUpperCase(Locale.ROOT);
            switch (tok) {
                case "N": return Direction.N;
                case "E": return Direction.E;
                case "S": return Direction.S;
                case "W": return Direction.W;
                default: System.out.println("Direction must be one of N, E, S, W.");
            }
        }
    }

    private static char readCommand(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String tok = sc.next().trim().toUpperCase(Locale.ROOT);
            if (tok.length() == 1) {
                char c = tok.charAt(0);
                if (c == 'M' || c == 'L' || c == 'R') return c;
            }
            System.out.println("Command must be M (move), L (left), or R (right).");
        }
    }

    // Factory (valid only called after readCommand)
    private static Command fromChar(char c) {
        switch (c) {
            case 'M': return new MoveCommand();
            case 'L': return new TurnLeftCommand();
            case 'R': return new TurnRightCommand();
            default: throw new IllegalArgumentException("Unexpected command: " + c);
        }
    }
}