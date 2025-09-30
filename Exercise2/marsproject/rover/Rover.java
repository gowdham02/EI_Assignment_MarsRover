package rover;
import grid.Grid;

import java.util.*;
public class Rover {
    private int x;
    private int y;
    private Direction direction;
    private Grid grid;
    private Set<int[]> encounterObstacles;

    public Rover(int x,int y,Direction direction,Grid grid){
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.grid = grid;
        this.encounterObstacles = new HashSet<>();
    }
    public void move(){
        int newx = x;
        int newy = y;
        switch (direction) {
            case N -> newy += 1;
            case E -> newx += 1;
            case S -> newy -= 1;
            case W -> newx -= 1;
        }
        if(grid.isWithinBounds(newx,newy) && !grid.isObstacle(newx,newy)){
            x = newx;
            y = newy;
        }else if(grid.isObstacle(newx,newy)){
            encounterObstacles.add(new int[]{newx,newy});
        }
    }
    public void turnLeft(){
        direction = direction.turnLeft();
    }
    public void turnRight(){
        direction = direction.turnRight();
    }
    public StatusReport getStatusReport(){
        return new StatusReport(x,y,direction);
    }
    public Set<int[]> getEncounteredObstacles(){
        return encounterObstacles;
    }
}
