package gui_tictactoe;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gui_tictactoe.BoardGameInterface;


public class TicTacToe_GUI extends JFrame{
	private JPanel jpMain;
	private TicTacToeBoard jpBoard;//a JPanel containing the board of buttons
	private Player currPlayer;
	private Player player1;
	private Player player2;
	
	public TicTacToe_GUI(){
		setLayout(new BorderLayout());
		player1 = new Player();
	    player2 = new Player();
		currPlayer = player1;
		jpBoard = new TicTacToeBoard();
		add(jpBoard, BorderLayout.CENTER);
	}
	
	
	private class TicTacToeBoard extends JPanel implements BoardGameInterface, ActionListener{

		private JButton [][] board;
		
		public TicTacToeBoard(){
			setLayout(new GridLayout(3,3));
			displayBoard();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void displayBoard() {
			board = new JButton[3][3];
			
			for(int row=0; row<board.length; row++){
				for(int col=0; col<board[row].length; col++){
//					board[row][col] = new JButton("["+row+"]["+col+"]");
					board[row][col] = new JButton(" - ");
					
					add(board[row][col]);//add to JPanel
				}
			}
			
		}

		public void clearBoard() {
			// TODO Auto-generated method stub
			for(int row=0; row<board.length; row++){
				for(int col=0; col<board[row].length; col++){
					board[row][col] = new JButton(" - ");
					add(board[row][col]);
				}
			}
		}
              public void changeTurn() {
            	  if(currPlayer == player1){
          			currPlayer = player1; 
          		}
          		else{
          			currPlayer = player2; 
          		}
			
		}

		public void placeMarker(int row, int col) {
			// TODO Auto-generated method stub
			if(board[row][col]== player1 || board[row][col]==player2){
				System.out.println("Sorry slot ["+row+"]["+col+"] is taken "
						+ "by "+ board[row][col] );
			}
			else{
				board[row][col] = currPlayer;
			}
			
			}
                  
		public boolean isWinner() {
			// TODO Auto-generated method stub
			return false;
		}

		public boolean isWinner(char currPlayer) {
			// TODO Auto-generated method stub
		return false;
		}
             
		public boolean isFull() {
			// TODO Auto-generated method stub
			return false;
		}

		public void startGame() {
			// TODO Auto-generated method stub
			System.out.println("Let's Play Tic Tac Toe");
			System.out.println("To win you need to get 3 in a row /"
					+ " col / main diagonal / secondary diagonal");
		}
		@Override
		public void populateBoard() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void takeTurn() {
			// TODO Auto-generated method stub
			 
		}
		@Override
		public void displayWinner() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public boolean isEmpty() {
			return false;
		}
		@Override
		public boolean isWinner(String currPlayer) {
			// TODO Auto-generated method stub
			return false;
		}
		
	}

}