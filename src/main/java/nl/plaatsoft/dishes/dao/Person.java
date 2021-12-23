package nl.plaatsoft.dishes.dao;

import java.util.Date;

public class Person {

	private String name;
	
	private int score;
	
	private double money;
	
	private Date lastTime;

	public Person(String name, int score, double money, Date lastTime) {
		super();
		this.name = name;
		this.score = score;
		this.money = money;
		this.lastTime = lastTime;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
}
