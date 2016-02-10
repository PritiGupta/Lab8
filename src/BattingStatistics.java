import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BattingStatistics {
	 

	 	/**
	 	 * @param args
	 	 */



	 	private static String inputArg;

	 	public static void main(String[] args) {
	 		// TODO Auto-generated method stub
	 	
	 		 Scanner scan = new Scanner(System.in);String key = null;
	 		List<AtBat> roster = new ArrayList<>();
	 		Map<Integer[], List<AtBat>> batter = null;
	 		int batCount=0;
	 		int numOfBatters,numAtBat;
	 		System.out.println("*******Welcome to the Grand Circus Batting & Slugging Caclulator*********");
			System.out.println("*************************************************************************");
			System.out.println("Please enter number of batters: ");
			numOfBatters = getValidInt(scan);		
			int[]batterStats = new int[numOfBatters];
	 		 		
	 		for (int i = 0; i <numOfBatters; i++) {
				System.out.println("Please enter a  number of at Bats");
				numAtBat = getValidInt(scan);
				roster.add(numAtBat, );
			 //for each batter take the num of AtBats and accordingly make the array cols 
			//System.out.println("0=OUT,1 =SINGLE, 2 = DOUBLE,3 = TRIPLE,4 = HOMERUN ");
			batCount = 0;


	 		 	//validates integer input
		public static int getValidInt(Scanner scan) {
			while(!scan.hasNextInt()){//use hasNexInt to check if input # is a integer
				System.out.println("Please enter a valid number");
				scan.nextLine();
			}
				int number = scan.nextInt();
				scan.nextLine();
				return number;
	}
}