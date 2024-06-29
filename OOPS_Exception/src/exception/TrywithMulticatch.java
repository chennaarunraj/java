package exception;

class TrywithMulticatchException extends Exception {
	TrywithMulticatchException(String str){	}	
	public static void main(String[] args) {
try {
	int n1=Integer.parseInt(args[0]);
	int n2=Integer.parseInt(args[1]);
	int sum=n1+n2;
	System.out.println(sum);
}
catch(ArrayIndexOutOfBoundsException e)	
{
	System.out.println("array index exception");

}
catch(NumberFormatException ae)	
{
	ae.printStackTrace();
}
}
}



