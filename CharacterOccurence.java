package week1.day2;

public class CharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am getting better with Java";
		char ch = 't';
		int count = 0;
		char[] obj = test.toCharArray();
		for(char eachChar : obj) {
			if(eachChar==ch) {
				count++;
			}			
		}
		System.out.println(count);
	}

}
