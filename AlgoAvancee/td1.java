package AlgoAvancee;

public class td1 {
	
	public static int factorielle(int n){
		if(n!=0){
			return(n*factorielle(n-1));
		}else{
			return(1);
		}
	}
	
	public static boolean pair(int n){
		if(n==1){return false;}
		if(n==0){return true;}
		return(pair(n-2));
	}
	
	public static int sommeImpairs(int n){
		if(n!=1){
			int a=sommeImpairs(n-2);
			return(n+a);
		}else{
			return(1);
		}
	}
	
	public static int puiss(int x,int n){
		if(n==0){
			return(1);
		}else{
			return(puiss(x,n-1)*x);
		}
	}
	
	public int nbOccAux(int x, int[] t, int i){
		if(t.length-1==i){
			if(t[i]==x){
				return 1;
			}else{
				return 0;
			}
		}else{
			int a= nbOccAux(x,t,i+1);
			if(t[i]==x){
				return a+1;
			}else{
				return a;
			}
		}
	}
	
	public int nbOcc(int x, int[] t){
		return(nbOccAux(x,t,0));
	}
	
	
	public static boolean croissantRecc(int[] t, int i){
		return(true);	
	}
	
	public static boolean croissant(int[] t){
		return(true);
	}

	public static void main(String[] args) {
		/*int[] a={1,2,3,4,5,6,7};
		System.out.println("a croissant ?: "+croissant(a));
		int[] b={1,2,3,4,5,8,7};
		System.out.println("b croissant ?: "+croissant(b));*/

	}

}
