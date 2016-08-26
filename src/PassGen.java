
import java.security.*;
import java.util.List;
import java.math.*;


public class PassGen {

	private SecureRandom randd = new SecureRandom();
	private List studentsQueue;
	public String ArrID[] = new String[60] ;
	public PassGen (List<Students> students)
	{
		this.studentsQueue = students;
	}
	/*
	public String getPass()
	{
		strArr[i++] = new BigInteger (30, randd).toString( 32 );
		return strArr[i-1];
	}
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
