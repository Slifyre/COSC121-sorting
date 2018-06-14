
public class SortDoubleArray {
	
	private static long startTime;
	private static long finishTime;
	
	private static int doublesInArray = 10;
	
	public static void main(String[] args) {
		
		//Selection Sort
		double[] selectionArray = generateRandomArray(doublesInArray);
		
		for(double d : selectionArray) {
			System.out.print(d + "\t");
		}
		
		startTime = System.currentTimeMillis();
		double sortedSelection[] = selectionSort(selectionArray);
		finishTime = System.currentTimeMillis();
		System.out.println(doublesInArray + " runs of [Selection Sort] took: " + (finishTime - startTime) + " milliseconds");
		
		for(double d : sortedSelection) {
			System.out.print(d + "\t");
		}
		
		
//		//Heap Sort
//		double[] heapArray = generateRandomArray(doublesInArray);
//		startTime = System.currentTimeMillis();
//		selectionSort(heapArray);
//		finishTime = System.currentTimeMillis();
//		System.out.println(doublesInArray + " runs of [Heap Sort] took: " + (finishTime - startTime) + " milliseconds");
		
		
	}
	
	
	//Creates a double array of n length and fills it with random doubles.

	public static double[] generateRandomArray(int n) {
		
		double[] output = new double[n];
		
		for(int i = 0; i < output.length; i++) {
			output[i] = Math.random() * 10.0;
		}
		
		return output;
		
	}
	
	//	(n^2) example algorithm
	public static double[] selectionSort(double input[]) {
		
		for (int i = 0; i < input.length; i++) {
			
			double min = input[i];
			
			for (int j = i; j < input.length; j++) {
				
				if(input[j] < min) {
					
					double temp = input[i];
					input[i] = min;
					input[j] = temp;
					
				}
				
				
			}
			
			
			
		}
		
		
		
		
		
		return input;
		
	}
	
	//	(n*log(n)) example algorithm
	public static double[] heapSort(double input[]) {
		
		double[] output = input;
		
		return output;
		
	}
	

	
	
	
	
	

}
