# Tic Tac Toe

A **console-based Tic Tac Toe game in Java** that allows two players to play on a dynamically sized square board. Play the classic game on any board size of 2×2 or larger.

---

## Features

- **Dynamic Board Size** – Choose any board size (minimum 2×2).  
- **Two-Player Gameplay** – Supports two human players taking turns.  
- **Input Validation** – Checks for valid coordinates and prevents overwriting occupied cells.  
- **Win Detection** – Detects winning conditions across rows, columns, and diagonals.  
- **Draw Detection** – Declares a draw if the board is full with no winner.  
- **Custom Player Names** – Players can enter their names, with a check to prevent duplicates.  
- **Simple ASCII Graphics** – Displays the board and game status in the console.

---

## How to Play

1. Run the program in a Java IDE or terminal.  
2. Enter the board size (minimum 2×2).  
3. Enter unique names for Player A and Player B.  
4. Players take turns entering the row and column coordinates for their moves.  
5. The game announces the winner or declares a draw when the board is full.

---

## Example
```
+================================+
|          TIC TAC TOE           |
+================================+
Enter the Board Size (2-n)
3
+---+---+---+
|   |   |   |
+---+---+---+
|   |   |   |
+---+---+---+
|   |   |   |
+---+---+---+

Enter PlayerA Name:
Alice
Enter PlayerB Name: 
Bob

+================================+
|     LET'S PLAY TIC TAC TOE     |
+================================+
      Alice (X) vs Bob (O)

Alice: Enter the coordinates of the row and column
0 0
+---+---+---+
| X |   |   |
+---+---+---+
|   |   |   |
+---+---+---+
|   |   |   |
+---+---+---+
Bob: Enter the coordinates of the row and column
1 1
+---+---+---+
| X |   |   |
+---+---+---+
|   | O |   |
+---+---+---+
|   |   |   |
+---+---+---+
Alice: Enter the coordinates of the row and column
0 2
+---+---+---+
| X |   | X |
+---+---+---+
|   | O |   |
+---+---+---+
|   |   |   |
+---+---+---+
Bob: Enter the coordinates of the row and column
1 2
+---+---+---+
| X |   | X |
+---+---+---+
|   | O | O |
+---+---+---+
|   |   |   |
+---+---+---+
Alice: Enter the coordinates of the row and column
0 1
+---+---+---+
| X | X | X |
+---+---+---+
|   | O | O |
+---+---+---+
|   |   |   |
+---+---+---+
Game Has Ended.
+====================================+
|          CONGRATULATIONS!!         |
+====================================+
Alice Has Won!!!
 /\_/\
( o.o )
 > ^ <
```

