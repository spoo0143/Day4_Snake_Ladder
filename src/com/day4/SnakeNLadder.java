package com.day4;

	import java.util.HashMap;
	import java.util.Map;
	import java.util.Random;
	import java.util.Scanner;
	 
	public class SnakeNLadder
	{
	     
	    final static int WINPOINT = 100;
	     
	     
	    static Map < Integer , Integer > snake = new HashMap < Integer , Integer >();
	    static Map < Integer , Integer > ladder = new HashMap< Integer , Integer >();
	     
	    {
	        snake.put(99,54);
	        snake.put(70,55);
	        snake.put(52,42);
	        snake.put(25,2);
	        snake.put(95,72);
	         
	        ladder.put(6,25);
	        ladder.put(11,40);
	        ladder.put(60,85);
	        ladder.put(46,90);
	        ladder.put(17,69);
	    }

		public void startGame() {
			// TODO Auto-generated method stub
			
		}
	     
	}
	 
	public class 
	SnakeNLadderTest {
	 
	    public static void main(String[] args) {
	        SnakeNLadder s = new SnakeNLadder();
	        s.startGame();
	    }
	}
