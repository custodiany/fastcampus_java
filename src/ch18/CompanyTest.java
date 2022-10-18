package ch18;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();

		System.out.println(company1); //ch18.Company@7d417077
		System.out.println(company2); //ch18.Company@7d417077
		
		
		}

}
