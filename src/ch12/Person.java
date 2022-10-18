package ch12;

public class Person {

	String name;
	int age;
	
	public Person() {

		this("No name", 1); //기본생성자 부를경우, Default값을 넣고 싶을때.
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showPerson() {
		System.out.println(name + "," + age);
	}
	
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.showPerson();
		
		System.out.println(person);
		//ch12.Person@2c8d66b2
		Person person2 = person.getPerson();
		
		System.out.println(person2);
		//ch12.Person@2c8d66b2
		
	}
}
