package com.monocept.if1;


import java.util.Scanner;

public class TreasureHunt2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	    System.out.println("Welcome to Treasure Island.");
        System.out.println("Your mission is to find the treasure.");

        playGame();
    }

    public static void playGame() {
        
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("0 for left, 1 for right");
        int path = scanner.nextInt(); 

        if (path == 0) {
            System.out.println("Left");
            System.out.println("1 for swim, 0 for wait");
            path = scanner.nextInt();
            if (path == 0) {
            	System.out.println("Wait");
            	System.out.println("Which door");
            	System.out.println("2  for Red, 1 for yellow, 2 for blue");
            	path = scanner.nextInt();
            if(path==1) {
            	 youWin();
            }
            else if(path==0) {
            	System.out.println("Burned by fire Game over");
            	
            }
            else if(path==2) {
            	System.out.println("Eaten by beasts");
            	  gameOver();
            }
            else {
            	 gameOver();
            }
               
            } else {
                System.out.println("swim");
                System.out.println("Attacked by trout.");
                gameOver();
            }
        } else {
            
            System.out.println("Fall into a hole.");
            gameOver();
        }
    }

    public static void youWin() {
        System.out.println("You Win!");
    }

    public static void gameOver() {
        System.out.println("Game Over.");

	}

}
