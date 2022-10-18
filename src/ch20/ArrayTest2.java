package ch20;

public class ArrayTest2 {

	public static void main(String[] args) {
		double[] darr = new double[5];
		int count = 0;
		darr[0] = 1.1; count++;
		darr[1] = 2.1; count++;
		darr[2] = 3.1; count++;
		
		double mtotal = 1;
		for(int i = 0; i<count; i++) {
			mtotal *= darr[i];
		}
		System.out.println(mtotal);
	}

}
