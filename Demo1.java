abstract class is
{
	abstract boolean isValidClaim();
}
class health extends is
{
	 boolean isValidClaim()
	{
		System.out.println("Health Insurance Surveyor : Validating health insurance claim");
		return true;
	}
}

class vehicle extends is
{
	 boolean isValidClaim()
	{
		System.out.println("Vehicle Insurance : Validating vehicle insurance claim");
		return true;
	}
}

class approval
{
	 approval(is is1)
	{
		if(is1.isValidClaim())
		{
			System.out.println("Claim Approved");
		}
	}
}

public class Demo1
{
	public static void main(String args[])
	{
		is h = new health();
		is v = new vehicle();
		approval ap = new approval(h);
		approval ap1 = new approval(v);
		
		//ap.process(h);
		//ap.process(v);
	}
}	
