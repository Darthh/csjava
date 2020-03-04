
package testing;

//the imports to make this work
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


								//jpanel needed for buttons and frames
public class TicTacToe extends JPanel
{
    JButton buttons[] = new JButton[9]; // 9 max j buttons
    int alternate = 0;//represents the 2 options between o and x
    
    public TicTacToe()
    {
    	//sets grid for 3 by 3
      setLayout(new GridLayout(3,3));
      
      //calls buttons 9 for 3 by 3
      initializebuttons(); 
    }
    
    //creates jbuttons and responds to actions by buttonlistener
    public void initializebuttons()
    {
    	//max of 9 for buttons
        for(int i = 0; i <= 8; i++)
        {
            buttons[i] = new JButton();
            buttons[i].setText("");
            buttons[i].addActionListener(new buttonListener());
            
            //if action then add new button 
            add(buttons[i]);

        }
    }
    
    //resets button if called on by Game over try again Option pane if button clicked
    //resets all 9 spaces
    public void resetButtons()
    {
        for(int i = 0; i <= 8; i++)
        {
            buttons[i].setText("");
        }
    }//---
    
    
    //reads all action through here, button listen applies to jbutton and saves data
    private class buttonListener implements ActionListener
    {
       
    	
        public void actionPerformed(ActionEvent e) //e random varible for below
        {
            
            JButton buttonClicked = (JButton)e.getSource(); //max of 2 options x and o
            if(alternate%2 == 0) 
                buttonClicked.setText("X");
            else
                buttonClicked.setText("O");
            
            if(checkForWin() == true) //if win checks for it then prints below
            {
                JOptionPane.showConfirmDialog(null, "Game Over. Wanna Try Again?");
                
             //insert zipbomb here
                //unfortunately eclipse doesnt allow increasing of file sizes ;(
                
                //if click then resets with for loop above
                resetButtons();
            }
           else {
            	
            }
            
            alternate++; //repeats cycle
            
        }
      
    //---
    
    public boolean checkForWin()
    //checks for win and if true runs dialogue in j pane
    {
     
        //horizontal win check
        if( checkAdjacent(0,1) && checkAdjacent(1,2) ) //no need to put " == true" because the default check is for true
            return true;
        else if( checkAdjacent(3,4) && checkAdjacent(4,5) )
            return true;
        else if ( checkAdjacent(6,7) && checkAdjacent(7,8))
            return true;
        
        //vertical win check
        else if ( checkAdjacent(0,3) && checkAdjacent(3,6))
            return true;  
        else if ( checkAdjacent(1,4) && checkAdjacent(4,7))
            return true;
        else if ( checkAdjacent(2,5) && checkAdjacent(5,8))
            return true;
        
        //diagonal win check
        else if ( checkAdjacent(0,4) && checkAdjacent(4,8))
            return true;  
        else if ( checkAdjacent(2,4) && checkAdjacent(4,6))
            return true;
        else 
            return false;
        
        
    } //---
    
    public boolean checkAdjacent(int a, int b)
    {
    			//the buttons checks if adjacent
        if ( buttons[a].getText().equals(buttons[b].getText()) && !buttons[a].getText().equals("") )
            return true;
        else
            return false;
    }
    
}
 
    //main
    public static void main(String[] args) 
{
    	//calls jframe frame tictactoe
    JFrame window = new JFrame("Tic-Tac-Toe");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    //runs tictactoe class
    window.getContentPane().add(new TicTacToe());
    //set bounds of image
    window.setBounds(300,200,300, 200);
    //is visible
    window.setVisible(true);
	}
    
}
    