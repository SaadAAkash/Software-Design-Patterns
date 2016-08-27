
import java.security.*;
import java.util.List;
import java.math.*;


public class PassGen implements ComponentInterfacePassGen
{
	
	private SecureRandom randd = new SecureRandom();
	private List studentsQueue;
    public static int[] mode;
	
    public String ArrID[] = new String[60] ;
        int i=0;
        
       int cou = 0; 
    LeafClassPass leaf = new LeafClassPass();
    
        
	public PassGen (List<Students> students)
	{
		this.studentsQueue = students;
	}
	
	public String getPass(int[] mymode)
	{
		//ArrID[i++] = new BigInteger (30, randd).toString( 32 );
		//return ArrID[i-1];
			this.mode = mymode;
			ArrID[i++] = add();
			return ArrID[i-1];
	}

	@Override
	public String add() {
		// TODO Auto-generated method stub
		
		String str2 = retStr();
		
		System.out.println(" -> mode:" + mode[cou++]);System.out.println(" -> mode:" + mode[cou++]);
		str2+=new BigInteger (10, randd).toString( 32 );
		if (mode[cou] == 1 )
			str2+=" " + leaf.retStr();
		else
			return str2;
		return str2;
	}

	@Override
	public String retStr() {
		// TODO Auto-generated method stub
		String str1=new BigInteger (10, randd).toString( 32 );;
		if (mode[cou] == 2)
			str1+=" " + leaf.retStr();
		else
			return str1+ " ";
		return str1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		//System.out.println(" ok ");
	}

	
    
        /*
    public void createPassword()
    {
        for (int i=0;i<studentsQueue.size();i++)
        {
            String uuid = UUID.randomUUID().toString();
            if (!ifAlreadyExists(uuid))
            {
                Student temp = (Student) studentList.get(i);
                passList.add(uuid);
             //   System.out.println("pass: "+ uuid+"  for "+ temp.getName());
            }
            else
                i--;
        }
    }
    */
	/*
    private boolean ifAlreadyExists(String pass)
    {
         for (int i= 0 ; i <passList.size();i++)
        {
            String temp = (String) passList.get(i);
            if (temp.matches(pass))
                return true;
        }
        return false;
    }
*/


}
