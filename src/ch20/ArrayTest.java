package ch20;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int total = 0;
		for(int i = 0, num=1; i<arr.length; i++) {
			//System.out.println(arr[i]); //new로 초기화되어서 all 0
			arr[i] = num++;
		}
		//enhanced for문. element처음부터 끝까지 돌때 사용.
		for(int num : arr) { //num에 arr원소 하나씩 집어넣으면서 돌림
			total += num;
		}
		System.out.println(total);
	}

}
