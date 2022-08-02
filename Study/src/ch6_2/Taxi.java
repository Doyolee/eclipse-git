package ch6_2;

public class Taxi {
	int number;
	int passengerCount;
	int money;
	
	public Taxi(int number) {
		this.number=number;
	}
	public void take(int money) {
		this.money+=money;
		passengerCount++;
		
	}
	public void showInfo() {
		System.out.println(number+"의 승객은"+passengerCount+"명이고, 수입은"+money+"입니다.");
	}
}
