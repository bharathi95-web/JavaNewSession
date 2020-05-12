package week1.day2;

public class ReversrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "feeling good";
		
		char[] obj = test.toCharArray();
		
		for(int i=obj.length-1;i>=0;i--) {
			System.out.print(obj[i]);
			
		}


	}

}
