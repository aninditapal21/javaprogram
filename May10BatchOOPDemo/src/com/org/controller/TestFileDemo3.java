package com.org.controller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

class Player
{
private int playerId;
private String palyerName;
public Player(int playerId, String palyerName) {
	super();
	this.playerId = playerId;
	this.palyerName = palyerName;
}
public int getPlayerId() {
	return playerId;
}
public String getPalyerName() {
	return palyerName;
}


}
public class TestFileDemo3 {

	public static void main(String[] args)throws IOException { 
		// TODO Auto-generated method stub
		   List<Player> list=new ArrayList();
		   list.add(new Player(1, "A"));
		   list.add(new Player(2, "B"));
		   list.add(new Player(3, "C"));
		   //Charcter data --text, number--FileWriter
		   //Binary data--text, number, image, audio,video--OutStream<Abstract class> FileOutStream
		   
		   
		  // OutputStream output=new FileOutputStream("D:/playerInfo.csv", true);
		   
		   //Write(int byte)
		   //write(byte[] b)
		   
		   FileWriter writer=new FileWriter("D:/playerInfo1.csv",true);
		  //write(int c)
		   //write(String c)
		   //write(char[] ch)
		    for(Player p:list)
		    {
		    	int pId=p.getPlayerId();
		    	String playerId=String.valueOf(pId);
		    	String pname=p.getPalyerName();
		    	writer.write(String.valueOf(pId));
		    	writer.write(",");
		    	writer.write(pname);
		    	writer.write("\n");
		    	//output.write(playerId.getBytes());
		    //	output.write(",".getBytes());
		    	//output.write(pname.getBytes());
		    	//output.write(",".getBytes());
		    	//output.write("\n".getBytes());
		    	
		    	
		    	
		    }
			writer.close();			

	}

}
