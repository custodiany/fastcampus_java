package ch14;

public class Taxi {
	int money;
	int passengerCount;
	String taxiName;
	
	public Taxi(String taxiName) {
		this.taxiName = taxiName;
	}
	public void take(int money) {
		this.money += money;
		passengerCount += 1;
		
	}
	public void showTaxiInfo() {
		System.out.println(taxiName+"택시의 승객수는 "+passengerCount+"명이고, 수입은 "+money+"원 입니다.");
	}
}
