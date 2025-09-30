package commands;
import commands.Command;
import rover.Rover;
public class TurnLeftCommand implements Command{
    public void execute(Rover rover){
        rover.turnLeft();
    }
}
