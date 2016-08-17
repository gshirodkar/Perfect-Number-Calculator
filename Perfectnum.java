public class basic {
	public static boolean isperfectnum(double n){
		double sum= 0;
		for(double i= 1;i < n;i++){
			if(n % i == 0){
				sum+= i;
			}
		}
		return sum == n;
	}
	public static void main(String[]args){
	double count=0;
		while(true){
			if(perf(count)==true){
				System.out.println(count);
			}
			count++;
		}
	}
}
