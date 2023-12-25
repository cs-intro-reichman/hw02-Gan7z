/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int familyOfTwo = 0;
		int familyOfThree = 0;
		int familyOfFourPlus = 0;
		Double average = 0.0;
		for (int i = 0; i <T; i++ )
		{
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
					//System.out.print("b ");
				}
				else
				{				
					childCount++;
					girl = true;
					//System.out.print("g ");
				}				
			}
			average += childCount;
			switch (childCount) { // Adds to the static counter
				case 2:
					familyOfTwo++;
					break;
				case 3:
					familyOfThree++;
				default:
					familyOfFourPlus++;
					break;
			}
		}
		average /= T;
		System.out.println(average+" children to get at least one of each gender");
		System.out.println("Number of families with 2 children: "+familyOfTwo);
		System.out.println("Number of families with 3 children: "+familyOfThree);
		System.out.println("Number of families with 4 or more children: "+familyOfFourPlus);
		// showing the correct message according to the category of families
		if (familyOfTwo > familyOfFourPlus){
			if (familyOfThree > familyOfTwo){
				System.out.println("The most common number of children is 3");
			}
			else{
				System.out.println("The most common number of children is 2");
			}
		}
		else{
			if (familyOfFourPlus > familyOfThree){
				System.out.println("The most common number of children is 4 or more");
			}
			else{
				System.out.println("The most common number of children is 3");
			}
		}
	}
}
