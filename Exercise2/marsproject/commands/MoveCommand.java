package commands;

import rover.Rover;

public class MoveCommand implements Command{
    public void execute(Rover rover){
        rover.move();
    }
}
