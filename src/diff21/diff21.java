package diff21;

public class diff21 {
	
	public int diff21(int n) {
		  int result = 0;
		  if(n<21){
		  result = 21-n;
		  return result;  
		  }else
		  {
		    result = 21 - n;
		    return Math.abs(result * 2);
		  }
		}


}
