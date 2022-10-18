package ch18;

public class Company {
	//default 생성자 놔두면 외부에서 Company 인스턴스를 마음대로만들 수 있다. 따라서 생성자를 만들어야 한다.
	private static Company instance = new Company(); //인스턴스를 여기서 만들어버림.
	
	private Company() {
	}
	
	public static Company getInstance() { //일반메서드는 인스턴스 생성해야만 부를 수 있으므로.
		if (instance == null){
			instance = new Company();
		}
		return instance;
	}
}