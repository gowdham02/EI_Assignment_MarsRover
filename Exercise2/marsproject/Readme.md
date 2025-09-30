# 🛰️ Mars Rover – Console Simulation (Java)
A simple console application where a rover moves on a 2D grid, turns left/right, avoids obstacles, and reports its final position. The design follows pure OOP and the Command pattern, keeping logic clean and extensible.

# Features
Grid navigation (0-based): valid cells are x ∈ [0, width-1], y ∈ [0, height-1]
Commands: M (move), L (turn left), R (turn right)
Obstacle handling: movement into a blocked cell is prevented and logged
Out-of-bounds protection: all moves beyond the grid are blocked and logged
Strict input validation: re-prompts for invalid sizes, coordinates, and commands
Status report: final (x, y, direction) and list of encountered obstacle cells

# Project Structure
marsproject/
├─ main.java                      # Entry point (console I/O and orchestration)
├─ commands/
│  ├─ Command.java                # Command interface (execute on Rover)
│  ├─ MoveCommand.java            # M
│  ├─ TurnLeftCommand.java        # L
│  └─ TurnRightCommand.java       # R
├─ grid/
│  ├─ Grid.java                   # Width/height, obstacles, bounds checks
│  └─ Obstacle.java               # Value object (x,y) with equals/hashCode
└─ rover/
   ├─ Direction.java              # N/E/S/W with turnLeft/turnRight and deltas
   ├─ Rover.java                  # Position, direction, movement rules
   └─ StatusReport.java           # Printable summary of rover state

# How It Works (quick tour)
Grid holds size and obstacles and decides if a cell is in-bounds or blocked.
Rover owns (x, y, direction) and asks the Grid before moving.
Commands (M/L/R) are small objects implementing Command.execute(Rover).
main reads/validates input, builds commands, executes them, and prints a StatusReport.

# Usage
Width/height must be positive integers.
Obstacle & command counts must be ≥ 0.
Starting cell must be inside the grid and not on an obstacle.
Each command must be M/L/R.
When a move can’t happen:
Out of bounds → Move blocked: out of bounds at (x, y)
Obstacle → Move blocked: obstacle at (x, y)

# Design Notes (OOP)
Command pattern: Each action is a class (MoveCommand, TurnLeftCommand, TurnRightCommand) with a common interface → easy to add new actions without changing existing logic.

Encapsulation: Rover protects its state; Grid protects world rules; Obstacle is a value object.

Polymorphism: List<Command> lets one loop execute different behaviors.

Composition: Rover has a Grid; Grid has Obstacles.

SRP: Each class has one clear reason to change.
