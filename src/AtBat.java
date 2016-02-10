

/**
 * 
 */

/**
 * @author Priti
 *
 */
public class AtBat {

	
	Result resultParam;
	String basesEarned;

	public enum Result{
			
			OUT, SINGLE, DOUBLE, TRIPLE, HOMERUN
		}

	public AtBat(Result newResult)
	{
		resultParam = newResult;
	}
	
	public static int basesEarned(int atBase)
	{ 		
		return atBase;
		
	}
}