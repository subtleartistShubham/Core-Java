package Exercise;

public class Seven {
	public static void main(String[] args) {
		int temp=0;
		for(int i=100; i<=200; i++) {
			if(i%7==0)
			{
				temp += i;
			}
			
		}System.out.println(temp);
	}

}
