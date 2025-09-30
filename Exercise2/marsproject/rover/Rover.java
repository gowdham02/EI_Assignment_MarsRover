package rover;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import grid.Grid;
import grid.Obstacle;

public class Rover {
    private int x;
    private int y;
    private Direction direction;
    private final Grid grid;

    // Changed to Set<Obstacle> to avoid duplicates and simplify equality/printing
    private final Set<Obstacle> encounteredObstacles = new HashSet<>();

    public Rover(int x, int y, Direction direction, Grid grid) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.grid = grid;
    }

    public void move() {
        int nx = x + direction.dx();
        int ny = y + direction.dy();

        if (!grid.isWithinBounds(nx, ny)) {
            System.out.println("Move blocked: out of bounds at (" + nx + ", " + ny + ")");
            return;
        }
        if (grid.isObstacle(nx, ny)) {
            System.out.println("Move blocked: obstacle at (" + nx + ", " + ny + ")");
            encounteredObstacles.add(new Obstacle(nx, ny));
            return;
        }

        // Move succeeds
        x = nx;
        y = ny;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public StatusReport getStatusReport() {
        return new StatusReport(x, y, direction);
    }

    public Set<Obstacle> getEncounteredObstacles() {
        return Collections.unmodifiableSet(encounteredObstacles);
    }
}