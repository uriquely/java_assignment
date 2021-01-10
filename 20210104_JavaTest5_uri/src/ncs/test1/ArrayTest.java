package ncs.test1;

public class ArrayTest {

	public static void main(String[] args) {
	
		ArrayTest at = new ArrayTest();
		
		int[] array = new int[6];

		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100 + 1);
		}
		
		System.out.println("할당된 배열의 크기 : " + array.length);
		at.print(array);
		at.max(array);
		at.min(array);
		at.evenCount(array);
		at.oddCount(array);
		at.sum(array);
		at.avg(array);
	}
	
//	배열의 합계를 계산해서 리턴
	public int sum(int[]arr) {
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			 sum += arr[i];
		}
		
		System.out.println("합계 : " + sum);
		return sum;
	}
	
//	배열의 평균을 계산해서 리턴
	public double avg(int[] arr) {
	
		double sum = 0.0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("평균 : " + (Math.round((sum / arr.length) * 100) / 100.0));
		return sum / arr.length;
	}
	
//	배열에서 가장 큰 값을 찾아서 리턴
	public int max(int[] arr) {
		
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("가장 큰 값 : " + max);
		return max;
	}
	
//	배열에서 가장 작은 값을 찾아서 리턴
	public int min(int[] arr) {
		
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("가장 작은 값 : " + min);
		return min;	
	}
	
//	배열에서 짝수의 개수를 리턴
	public int evenCount(int[] arr) {
		
		int evenCount = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenCount++;			
			}
		}
		System.out.println("짝수의 개수 : " + evenCount);
		return evenCount;
	}
	
//	배열에서 홀수의 개수를 리턴
	public int oddCount(int[] arr) {
		
		int oddCount = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				oddCount++;
			}
		}
		System.out.println("홀수의 개수 : " + oddCount);
		return oddCount;
	}
	
//	배열 값들 출력
	public void print(int[] arr) {
		
		System.out.print("array : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
