package com.ericsson.javacourse.soccer;

public class League {

	public static void main(String[] args) {
		
		String leagueName;
		Game[] games;
		Team[] teams;		
		
		// Create Brazil
		
		Player player1 = new Player();
		player1.playerName = "Oscar";		
		Player player2 = new Player();
		player2.playerName = "Hulk";		
		Player player3 = new Player();
		player3.playerName = "Bernard";	
		Player player4 = new Player();
		player4.playerName = "Fred";	
		Player player5 = new Player();
		player5.playerName = "William";
		Player[] brazilianTeam = {player1, player2, player3, player4, player5};
		
		Team brazil = new Team();
		brazil.teamName = "Brazil";
		brazil.playerArray = brazilianTeam;
		
		// Create Germany
		
		Player player6 = new Player();
		player6.playerName = "Klose";
		Player player7 = new Player();
		player7.playerName = "Kross";
		Player player8 = new Player();
		player8.playerName = "Khedira";
		Player player9 = new Player();
		player9.playerName = "Muller";
		Player player10 = new Player();
		player10.playerName = "Schurlle";
		Player[] germanTeam = {player6, player7, player8, player9, player10};
		
		Team germany = new Team();
		germany.teamName = "Germany";
		germany.playerArray = germanTeam;
		
		
		// Create the game
		
		Game mineiraco = new Game();
		mineiraco.awayTeam = germany;
		mineiraco.homeTeam = brazil;
		
		Goal goal1 = new Goal();
		goal1.theTeam = mineiraco.awayTeam;
		goal1.thePlayer = mineiraco.awayTeam.playerArray[3];
		goal1.theTime = 11;
		
		Goal goal2 = new Goal();
		goal2.theTeam = mineiraco.awayTeam;
		goal2.thePlayer = mineiraco.awayTeam.playerArray[0];
		goal2.theTime = 23;
		
		Goal goal3 = new Goal();
		goal3.theTeam = mineiraco.awayTeam;
		goal3.thePlayer = mineiraco.awayTeam.playerArray[1];
		goal3.theTime = 24;
		
		Goal goal4 = new Goal();
		goal4.theTeam = mineiraco.awayTeam;
		goal4.thePlayer = mineiraco.awayTeam.playerArray[1];
		goal4.theTime = 26;
		
		Goal goal5 = new Goal();
		goal5.theTeam = mineiraco.awayTeam;
		goal5.thePlayer = mineiraco.awayTeam.playerArray[2];
		goal5.theTime = 29;
		
		Goal goal6 = new Goal();
		goal6.theTeam = mineiraco.awayTeam;
		goal6.thePlayer = mineiraco.awayTeam.playerArray[4];
		goal6.theTime = 69;
		
		Goal goal7 = new Goal();
		goal7.theTeam = mineiraco.awayTeam;
		goal7.thePlayer = mineiraco.awayTeam.playerArray[4];
		goal7.theTime = 79;
		
		Goal goal8 = new Goal();
		goal8.theTeam = mineiraco.homeTeam;
		goal8.thePlayer = mineiraco.homeTeam.playerArray[0];
		goal8.theTime = 90;
		
		Goal[] theGoals = {goal1, goal2, goal3, goal4, goal5, goal6, goal7, goal8};
		mineiraco.goals = theGoals;
		
		// Print score
		
		for (int i = 0; i < theGoals.length; i++) {
			System.out.println("Goal scored after " + 
		       mineiraco.goals[i].theTime + "mins by " +
			   mineiraco.goals[i].thePlayer.playerName + " of " +
		       mineiraco.goals[i].theTeam.teamName);
		
		}
		
		
	}

}
