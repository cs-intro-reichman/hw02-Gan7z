
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int childCount = 0;
		boolean boy = false;
		boolean girl = false;
		while( boy == false || girl == false )
		{
			double rand = Math.random();
			if (rand >= 0.5)
			{
				childCount++;
				boy = true;
				System.out.print("b ");
			}
			else
			{				
				childCount++;
				girl = true;
				System.out.print("g ");
			}				
		}
		System.out.println("\nYou made it... and you now have " + childCount + " children.");
	}
}
