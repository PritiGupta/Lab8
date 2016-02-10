/**
 * 
 */

/**
 * @author Priti
 *
 */
public class arrDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] ar =  new int[10];
expand(ar);
System.out.println(ar.length);
	}

	/**
	 * @param ar
	 */
	private static int[] expand(int[] ar) {
		int []temp = new int[ar.length*2];
		
		for(int x=0;x<ar.length;x++){
			
			 temp[x] = ar[x];
			
		}
		 return temp;
	}

	}
