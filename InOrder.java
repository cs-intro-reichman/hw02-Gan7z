/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int rand;
		int num1 = 0;
		do{
			rand = (int)(Math.random()*10);
			
			if (num1 > rand){
				num1 = 10;
			}
			else{
				System.out.println(rand);
				num1 = rand;
			}
		}while(rand >= num1);
	}
}
