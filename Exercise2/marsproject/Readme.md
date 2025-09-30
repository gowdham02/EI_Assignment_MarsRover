# **Mars Rover Simulator** 

## **Project Overview**

The **Mars Rover Simulator** is a Java-based application that models a Rover exploring a grid-based Martian terrain. The Rover can **move forward, turn left, or turn right** while avoiding obstacles and staying within the grid boundaries. This project demonstrates **Object-Oriented Programming (OOP) principles**, proper **design pattern usage**, and clean software design.

---

## **Key Features**

* **Grid Navigation:** Rover moves on a user-defined grid.

* **Command Execution:** Accepts commands to move (`M`), turn left (`L`), and turn right (`R`).

* **Obstacle Detection:** Rover detects and logs obstacles encountered during navigation.

* **Status Reporting:** Provides the Rover’s current position and direction.

* **Extensible Design:** Built with **Command Pattern** and OOP principles for flexibility and maintainability.

---

## **Components**

### **Grid**

* Defines the Rover’s terrain and boundaries.

* Maintains a list of obstacles and checks for collisions.

### **Rover**

* Encapsulates position, direction, and movement logic.

* Executes commands and keeps track of encountered obstacles.

### **Commands**

* Implements the **Command Pattern** with separate classes:

  * `MoveCommand`

  * `TurnLeftCommand`

  * `TurnRightCommand`

* Commands are objects that the Rover can execute in sequence.

### **Obstacles**

* Represents impassable positions on the grid.

* Recorded if the Rover attempts to move onto them.

---

## **Design Patterns & Principles**

* **Command Pattern:** Encapsulates each Rover action.

* **Composite-Style Structure:** Grid and obstacles are modular and reusable.

* **OOP Principles:** Uses encapsulation, abstraction, and polymorphism effectively.

* **Optional:** Singleton pattern can be added for global grid management.

---

## **Usage Instructions**

1. Enter **grid dimensions** (width and height).

2. Specify **obstacles** by their coordinates.

3. Set the **Rover’s starting position** and **direction** (`N`, `E`, `S`, `W`).

4. Input a sequence of **commands** (`M`, `L`, `R`) for the Rover to execute.

---

## **Example Run**

**Input:**

`Grid width: 10`  
`Grid height: 10`  
`Number of obstacles: 2`  
`Obstacle 1: (2,2)`  
`Obstacle 2: (3,5)`  
`Starting position: (0,0) facing N`  
`Number of commands: 6`  
`Commands: M M R M L M`

**Output:**

`Rover is at (1,3) facing North`  
`Rover encountered obstacles at: (2,2)`  
