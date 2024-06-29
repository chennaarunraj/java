
public class String_tocharary {

	public static void main(String[] args) {
      String arun="jathi ratnam packet prep";
      char ch[]=arun.toCharArray();
      int count=0;
      for(int t=0;t<arun.length();t++) {
    	  if(ch[t]=='a')
    		  count++;
      }
      System.out.println(count);
    		  
	}

}
