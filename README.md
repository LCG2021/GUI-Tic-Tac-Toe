# GUI-Tic-Tac-Toe
Overview
In this assignment you will create a GUI based game of Connect 4. The game will be played by two players who will take turns dropping their markers into columns. The game will continue until someone wins or the board becomes full. You can see the wikipidia page on Connect 4 if you need more information.

Details
Playing The Game

On each turn, the display should show who the current player is.

The board should get filled from bottom to top just like in real life.

After a player drops their marker into the column of their choice, the program should check if he/she is a winner.

If the current player is a winner, update the display label to reflect the status, and write the name of the winner on a new line in the output file named Connect4-Results.txt. You should also and ask if they want to play again. If they decide to NOT play again and terminate this round of games, write to the output file named Connect4-Results.txt the current champion's name and how many games each player won this round. Otherwise, the alternate player should take a turn.

If the board is full, check for a winner or a tie. If the game is a tie, indicate that in a seperate line in the output file named Connect4-Results.txt. Ask if the want to play again. If they decide to NOT play again and terminate this round of games, write to the output file named Connect4-Results.txt the current champion's name and how many games each player won this round.

Score Board
Your game must have a score board similar to the one we created for the Tic Tac Toe game that we did in class. Your score board will keep track of each player's name, score, the winner of the last game and the overall champion.
scoreboard

Finding A Winner
A the end of every turn, you will be checking if the current player is a winner. Use the following diagrams to help you in determining which cells need to be checked.


4 Consecutive Markers Of The Same Color In Any Row 





4 Consecutive Markers Of The Same Color In Any Column 





4 Consecutive Markers Of The Same Color In Any Upward Diagonal 





4 Consecutive Markers Of The Same Color In Any Downward Diagonal 





Extra Credit
Image Icons
Use image icons on the labels to display a marker when a slot is filled by a player taking a turn (5pts extra).

Player Names
Allow the users to enter the names for player1 and player2 using your game GUI (5pts extra).

Board Size
A traditional Connect 4 game is played on a board of 6 rows and 7 columns. Allow the users to select the dimensions of the board using your game GUI. Please note that changing the dimensions of the board should reset the game to the beginning. (10pts extra).

Connect X
Create a ConnectX game so that the user can play connect4, or connect5, .. or connectX where they choose how many they would like to be in a row to be considered a "win" (15pts extra).
