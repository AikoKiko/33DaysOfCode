public class Step {
	
	public Step () {
		
	}
	int stepNumber(int n,  int[] moore) {
	if(n==0) {
			return 1;
	}
	else if (n<0) {
		return 0;
	}
	else if (moore[n]==0){
			return moore[n]= stepNumber(n-1, moore)+stepNumber(n-2,moore)+stepNumber(n-3,moore);
		}
	else {
		
			return moore[n];
	}
		
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		Step step=new Step();
		int n=70;
		System.out.println(step.stepNumber(n, new int[n+1]));		
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
	
}
