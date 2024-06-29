
public class Pattern_numbers {

	public static void main(String[] args) {
	int i,j,k=1;
	for(i=1;i<=4;i++) {  // i<=4 indicates no.of rows to be printed
		for(j=1;j<=i;j++) {
			System.out.print(k++ +" ");
		}
		System.out.println();
	}

}}
