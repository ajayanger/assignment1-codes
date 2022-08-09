package com.project.ajayengers;

import java.util.Scanner;

class Gusser{
	int guessNum;
	
	
	int guessNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser kindly Guess the number 1-9");
		guessNum=sc.nextInt();
		return guessNum;
		
	}
}
class Player{
	int pguessNum;
	int guessNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println("player kindly Guess the number 1-9");
		pguessNum=sc.nextInt();
		return pguessNum;
		
	}
}
class Umpire{
	int numFromGusser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;	
	
	
	 void collectNumFromGusser(){
		Gusser g=new Gusser();
		numFromGusser=g.guessNumber();
	}
	 
	 void collectNumFromPlayer(){
		 Player p1=new Player();
		 Player p2=new Player();
		 Player p3=new Player();
		 numFromPlayer1 =p1.guessNumber();
		 numFromPlayer2=p2.guessNumber();
		 numFromPlayer3=p3.guessNumber();
}
	
	 
	 
	 void compare()
	 {
		 if(numFromGusser==numFromPlayer1)
		 {
			 if(numFromGusser==numFromPlayer2 && numFromGusser==numFromPlayer3)
			 {
			 System.out.println("game tied");
		 }
		 else if(numFromGusser==numFromPlayer2)
		 {
			 System.out.println("player 1& 2 won the game"); 
		 } 
		 else if(numFromGusser==numFromPlayer3)
		 {
			 System.out.println("player1 & 3 won the game");
		 }
		 else
		 {
			 System.out.println("player1 won the game ");	 
		 }
	 }
		 else if(numFromGusser==numFromPlayer2)
		 {
			 if(numFromGusser==numFromPlayer3)
			 {
			 System.out.println("player2 & 3 won the game");
		 }
		 else
		 {
			 System.out.println("player2 won the game ");	 
		 }
	 }
		 else if(numFromGusser==numFromPlayer3)
			 {
			 System.out.println("player3 won the game");
		 }
		 else
		 {
			 System.out.println("game lost try again");	 
		 }
	 }
}
public class Launchgame1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Umpire u =new Umpire();
		u.collectNumFromGusser();
		u.collectNumFromPlayer();
		u.compare();
	}

}
