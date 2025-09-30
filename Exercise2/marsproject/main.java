import commands.*;
import grid.*;
import rover.*;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter grid width: ");
        int width = scanner.nextInt();
        System.out.print("Enter grid height: ");
        int height = scanner.nextInt();

        Grid grid = new Grid(width,height);

        System.out.print("Enter the number of obstacle: ");

        int numObstacle = scanner.nextInt();
        for(int i = 0;i<numObstacle;i++){
            System.out.print("Enter obstacle " + (i+1)+" x-coordinate ");
            int obx = scanner.nextInt();
            System.out.print("Enter obstacle " + (i+1)+" y-coordinate ");
            int oby = scanner.nextInt();
            grid.addObstacle(new Obstacle(obx,oby));

        }

        System.out.print("Enter Starting x-coordinate ");
        int startx = scanner.nextInt();
        System.out.print("Enter Starting y-coordinate ");
        int starty = scanner.nextInt();
        System.out.print("Enter the starting Direction(N/E/S/W): ");
        Direction startDirection = Direction.valueOf(scanner.next().toUpperCase());

        Rover rover = new Rover(startx,starty,startDirection,grid);

        System.out.print("Enter the Number of command: ");
        int numCommand = scanner.nextInt();
        List<Command> commands = new ArrayList<>();
        System.out.println("Enter commands (M for move, L for turn left, R for turn right):");
        for(int i = 0;i<numCommand;i++){
            char cmd = scanner.next().charAt(0);
            switch (cmd) {
                case 'M'-> commands.add(new MoveCommand());
                case 'L'-> commands.add(new TurnLeftCommand());
                case 'R'-> commands.add(new TurnRightCommand());
                default -> System.out.println("Invalid cmd: "+cmd);

            }
        }
        for(Command command:commands){
            command.execute(rover);
        }
        StatusReport statusReport = rover.getStatusReport();
        System.out.println(statusReport);

        
        Set<int[]> encounteredObstacles = rover.getEncounteredObstacles();
        if (!encounteredObstacles.isEmpty()) {
            System.out.println("Rover encountered obstacles at:");
            for (int[] obstacle : encounteredObstacles) {
                System.out.printf("(%d, %d)%n", obstacle[0], obstacle[1]);
            }
        } else {
            System.out.println("Rover did not encounter any obstacles.");
        }

        scanner.close();
    }
}
