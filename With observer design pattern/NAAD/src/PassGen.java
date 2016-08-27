
import java.security.*;
import java.util.List;
import java.math.*;


public class PassGen extends Observer
{

	private SecureRandom randd = new SecureRandom();
	private List studentsQueue;
	public String ArrID[] = new String[60] ;
        int i=0;
	public PassGen (List<Students> students)
	{
		this.studentsQueue = students;
	}
	
	public String getPass()
	{
		ArrID[i++] = new BigInteger (30, randd).toString( 32 );
		return ArrID[i-1];
	}
        
    @Override
    public void update() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            System.out.println("Update from pass gen.");
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
