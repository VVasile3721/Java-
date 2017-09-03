public class TheProblem {

	public static void main(String[] args) {
		int[] A = new int[5];
		A[0]=4;
		A[1]=5;
		A[2]=10;
		A[3]=11;
		A[4]=6;
		int M = -1;
		for(int i=0; i<A.length; i++) {
			for(int j=i+1; j<A.length; j++) {
				if( A[i]-A[j] == M) {
					System.out.print(i+"-"+j+" "); 
				}
			}
		}

	}

}