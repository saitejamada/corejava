package collections.binarysearch;

import java.util.*;

class Game
{
	int game_id;
	String game_name;
	int no_of_players;
	String game_rules;
	public int getGame_id() {
		return game_id;
	}
	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}
	public String getGame_name() {
		return game_name;
	}
	public void setGame_name(String game_name) {
		this.game_name = game_name;
	}
	public int getNo_of_players() {
		return no_of_players;
	}
	public void setNo_of_players(int no_of_players) {
		this.no_of_players = no_of_players;
	}
	public String getGame_rules() {
		return game_rules;
	}
	public void setGame_rules(String game_rules) {
		this.game_rules = game_rules;
	}
	public Game(int game_id, String game_name, int no_of_players, String game_rules) {
		super();
		this.game_id = game_id;
		this.game_name = game_name;
		this.no_of_players = no_of_players;
		this.game_rules = game_rules;
	}
	@Override
	public String toString() {
		return "Game [game_id=" + game_id + ", game_name=" + game_name + ", no_of_players=" + no_of_players
				+ ", game_rules=" + game_rules + "]";
	}
	
}

class ComparatorById1 implements Comparator<Game>
{

	@Override
	public int compare(Game o1, Game o2) {
		// TODO Auto-generated method stub

		if(o1.game_id<o2.game_id)
			return -1;
		else if(o1.game_id>o2.game_id)
			return 1;
		else
			return 0;
	}	
}

class ComparatorByName1 implements Comparator<Game>
{

	@Override
	public int compare(Game o1, Game o2) {
		// TODO Auto-generated method stub
		return o1.game_name.compareTo(o2.game_name);
	}
	
}
class ComparatorByPlayers implements Comparator<Game>
{

	@Override
	public int compare(Game o1, Game o2) {
		// TODO Auto-generated method stub

		if(o1.no_of_players<o2.no_of_players)
			return -1;
		else if(o1.no_of_players>o2.no_of_players)
			return 1;
		else
			return 0;
	}	
}


public class Game_Sort_BinarySerach {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char c='n';
		Game g1=new Game(112,"Rugby",30,"No kicking The Ball");
		Game g2=new Game(132,"kabbadi",14,"Time Limit for Raid No Crossing The Line ");
		Game g3=new Game(12,"Hockey",20,"No Touch Ball");
		Game g4=new Game(1,"Cricket",22,"Limited overs 50 or 20");
		Game g5=new Game(11,"Batminton",4,"singles 2 players doubles 4 Players");
	
		ArrayList<Game> ts=new ArrayList<Game>();
		ts.add(g1);
		ts.add(g2);
		ts.add(g3);
		ts.add(g4);
		ts.add(g5);
		
		System.out.println("Select The Option Below For Sorting ");
		System.out.println(" 1.sort by name 2.sort by number of players ");
		int choice=sc.nextInt();
		System.out.println("Before Sorting "+ts);
		
		if(choice==1)
		{
			Collections.sort(ts, new ComparatorByName1()); 
		}
		else if(choice==2)
		{
			Collections.sort(ts,new ComparatorByPlayers());
		}
		else
		{
			Collections.sort(ts,new ComparatorById1());
		}
			
		
		
		System.out.println(" After Sorting ");
		
		for (Game game : ts) {
			System.out.println(game);
		}
		
		do
		{
		System.out.println("choose The Option For Searching ");
		
		System.out.println("1.search by name 2.search by Number Of Players");
		int op=sc.nextInt();
			
		if(op==1)
		{
			System.out.println("Enter The name To Search");
			String sname=sc.next();
			Game gg1=new Game(0,sname,0,null);
			int index=Collections.binarySearch(ts, gg1, new ComparatorByName1());
			
			if(index<0)
			System.out.println("Element Not Found ");
			else
			System.out.println("Element Found at "+index+" Item Name Is "+ts.get(index));
		}
	
			else if(op==2)
			{
				
				System.out.println("Enter The Number Of Players To Search");
				int sno=sc.nextInt();
				//Collections.sort(ts,new ComparatorByPlayers());
				Game gg1=new Game(0,null,sno,null);
				int index=Collections.binarySearch(ts, gg1, new ComparatorByPlayers());
				
				if(index<0)
					System.out.println("Element Not Found ");
				else
					System.out.println("Element Found at "+index+" Item Name Is "+ts.get(index));
			}
		System.out.println("Do You Wish To Continue y / n");
		c=sc.next().charAt(0);
		}while(c=='y');
	}
}
