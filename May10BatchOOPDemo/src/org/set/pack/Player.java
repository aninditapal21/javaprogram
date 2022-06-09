package org.set.pack;

public class Player implements Comparable<Player>{
	private String playerName;
	private String skill;
	private  long capNumer;
	public Player(String playerName, String skill, long capNumer) {
		super();
		this.playerName = playerName;
		this.skill = skill;
		this.capNumer = capNumer;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public long getCapNumer() {
		return capNumer;
	}
	public void setCapNumer(long capNumer) {
		this.capNumer = capNumer;
	}
	@Override
	public int compareTo(Player o1) {
		// TODO Auto-generated method stub
		if(this.getCapNumer()<o1.getCapNumer())
			return 1;
		return 0;
	}
	
}
