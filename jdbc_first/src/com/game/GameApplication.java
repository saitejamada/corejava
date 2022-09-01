package com.game;

import java.sql.*;
import java.util.Scanner;

public class GameApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle","c##scott2","tiger");
		Statement stmt=con.createStatement();
		Scanner sc=new Scanner(System.in);
		String sql=" ";
		char c;
		do
		{
		System.out.println("Enter 1.view 2.delete 3.update 4.to insert");
		int option=sc.nextInt();
		
		if(option==4)
		{
			int game_id;
			String gane_name;
			int no_of_players;
			
			System.out.println("Enter Game Id");
			game_id=sc.nextInt();
			System.out.println("Enter Game Name");
			gane_name=sc.next();
			System.out.println("Enter no_of_players");
			no_of_players=sc.nextInt();
			sql="insert into game values("+game_id+",'"+gane_name+"',"+no_of_players+")";
			
		}
		else if(option==2)
		{
			System.out.println("Delete on basis of 1.game_id,2.gane_name 3.no of players ");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("enter Game id");int game_id=sc.nextInt(); sql="delete from game where game_id="+game_id;break;
			case 2:System.out.println("enter Game name");String gane_name=sc.next(); sql="delete from book where gane_name='"+gane_name+"'";break;
			case 3:System.out.println("enter No Of palyers price");int no_of_players=sc.nextInt(); sql="delete from book where price="+no_of_players;break;
			}
		}
		else if(option==3)
		{
			System.out.println("update condition on basis of 1.game_id,2.game_name 3.no_of_players");
			int ch=sc.nextInt();
			System.out.println("what you want to update 1.game_id 2.game_name 3.no_of_players");
			int ch1=sc.nextInt();
			if(ch==1)
			{
				System.out.println("Enter Game id (condition)");
				int gameid=sc.nextInt();
				if(ch1==1)
				{
					System.out.println("Enter the game id you want to update");
					int game_id=sc.nextInt();
					sql="update game set game_id="+game_id+"where game_id="+gameid;
				}
				else if(ch1==2)
				{
					System.out.println("Enter name");
					String name=sc.next();
					sql="update book set gane_name='"+name+"' where game_id="+gameid;
				}
				else if(ch1==3)
				{
					System.out.println("Enter the no of players you want to update");
					int players=sc.nextInt();
					sql="update game set no_of_players="+players+"where game_id="+gameid;
				}
			}
		}
		else if(option==1)
		{
			ResultSet rs=stmt.executeQuery("select * from game");
			while(rs.next())
			{
			System.out.print(" "+rs.getInt("game_id"));
			System.out.print(" "+rs.getString("gane_name"));
			System.out.println(" "+rs.getInt("no_of_players"));	
			}
		}
		else
		{
			System.err.println("InValid Option");
		}
		if(option!=1)
		{
			int n=stmt.executeUpdate(sql);
		}
		System.out.println("Operation Succesfully");
		System.out.println("Dou you wish to continue");
		c=sc.next().charAt(0);
		}while(c=='y');
		con.close();
	
	}
}
