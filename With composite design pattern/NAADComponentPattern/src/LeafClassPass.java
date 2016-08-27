import java.math.BigInteger;
import java.security.SecureRandom;
import java.security.*;

public class LeafClassPass implements ComponentInterfacePassGen  {

	

	private SecureRandom rand1 = new SecureRandom();
	
	@Override
	public String add() {
		// TODO Auto-generated method stub

		//this is leaf node
		//so this method is not applicable here
		return null;
		
	}

	public void print()
	{
		//this is leaf node
		//so this method is not applicable here
	}
	
	@Override
	public String retStr() {
		// TODO Auto-generated method stub
		String str =new BigInteger (10, rand1).toString( 32 );
		return str;
	}

}
