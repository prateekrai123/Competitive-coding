public class knapsack {

	public static void main(String[] args) {
		int n = 8;
		int w[] = {3,4,5};
		int v[] = {30,50,60};
		int knap[][] = new int[w.length+1][n+1];
		for(int i=0;i<knap.length;i++){
			knap[i][0] = 0;
		}
		for(int i=0;i<knap[0].length;i++) {
			knap[0][i] = 0;
		}
		for(int i=1;i<knap.length;i++) {
			for(int j=1;j<knap[0].length;j++) {
				if(j >= w[i-1]) {
					knap[i][j] = Math.max(knap[i-1][j], (v[i-1]+knap[i-1][Math.abs(w[i-1]-j)]));
				}
				else {
					knap[i][j] = knap[i-1][j];
				}
			}
		}
		for(int i=0;i<knap.length;i++) {
        	for(int j=0;j<knap[0].length;j++) {
        		System.out.print(knap[i][j]+" ");
        	}
        	System.out.println();
        }
	}
}
