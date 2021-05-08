
//Importing the util Package of Scanner Class
import java.util.*;

// Name the Class
public class Main
 {
	public static void main(String args[]) 
	{
		
		// Scanner Object
		Scanner in = new Scanner(System.in);

		// Taking Distance Covered as input by the user
		System.out.print("Enter distance travelled: ");
		// Storing the value of distance in a variable
		int distance = in.nextInt();

		/*
		  Making a variable to tell the fair to be paid by the 
			passenger based on the distance travelled as per 
			tariff
		*/
		int fare = 0;

		// Used if else If Condition !!!

		// As If Distance less than or equal to 0
		if (distance <= 0)
			fare = 0;

		else
		// As If Distance Less than or equal to 10
		if (distance <= 10)
			fare = 80;

		else
		// As If Distance Less than or equal to 20
		if (distance <= 20)
			fare = 80 + (distance - 10) * 6;

		else
		// As If Distance Less than or equal to 30
		if (distance <= 30)
			fare = 80 + 60 + (distance - 20) * 5;

		else
		// As If Distance greater than 30
		if (distance > 30)
			fare = 80 + 60 + 50 + (distance - 30) * 4;

		// Display the Fare to be paid
		// As Per Distance Conditions
		System.out.println("Fare = " + fare);

	}

}