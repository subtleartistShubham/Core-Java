package testInterface;

public class Buisenessman implements SocialWorker, Richman {

	@Override
	public void helpToOthers() {
		System.out.println("Help to Others");
		
	}

	@Override
	public void earnMoney() {
		System.out.println("Earn MOney");
		
	}

	@Override
	public void donation() {
		System.out.println("Give Donation");
		
	}

	@Override
	public void party() {
		System.out.println("Party Hard");
		
	}
	public static void main(String[] args) {
		SocialWorker s=new Buisenessman();
		s.helpToOthers();
		Richman r=new Buisenessman();
	r.earnMoney();
	r.donation();
	r.party();
		
	}
	
	
	
	
	

}
