public class Deposit {
	public static void main(String args[]){
		int count = 2048;
		int total = 2048;
		int i;
		for(i = 2; i <= 11; i++){
			count = count / 2;
			total = total + count;			
		}
		System.out.println("Balance as of April 2017: " + total);
	}
}