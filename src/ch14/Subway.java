package ch14;

public class Subway {
	String subwayColor;
	int passengerCount;
	int money;
	
	public Subway(String subwayColor) {
		this.subwayColor = subwayColor;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount += 1;
	}
	public void showSubwayInfo() {
		System.out.println(subwayColor+"색 지하철의 승객 수는 "+passengerCount+"이고 수입은 "+money+"원 입니다.");
	}
}
