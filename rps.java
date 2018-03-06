/****************************************************************************
 *
 * Created by: Tristan
 * Created on: March 2018
 * This program is a console version of rock, paper, scissors.
 *
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class rps
{
    
    public static void main(String args[]) 
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter either rock, paper or scissors.");
        
        String userInputString = "";
        try {
            userInputString = br.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        Random rn = new Random();
        int randomchoice = rn.nextInt(3);
        String[] choices = {"rock", "paper", "scissors"};
        String pickUser = userInputString;
        String pickComputer = choices[randomchoice];
        String winner = "";
        
        if (pickUser.equals("rock") & pickComputer.equals("paper") | pickUser.equals("paper") & pickComputer.equals("scissors") | pickUser.equals("scissors") & pickComputer.equals("rock")) {
            winner = "you lost.";        
        } else if (pickUser.equals("rock") & pickComputer.equals("scissors") | pickUser.equals("scissors") & pickComputer.equals("paper") | pickUser.equals("paper") & pickComputer.equals("rock")) {
            winner = "you won.";
        } else if (pickUser.equals(pickComputer)) {
            winner = "you tied.";
        }
        System.out.println("The computer picked " + pickComputer);
        System.out.println(winner);
    }
}