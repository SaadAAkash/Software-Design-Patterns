import java.util.*;
import java.io.*;

public class TeachersA  {


	public int idArrA[] = new int[60] ;
	public static String teacherArr[] = new String[8] ;
	public static String stuArr[] = new String[20] ;
	//Students st = new Students();

	TeacherB tb = new TeacherB("blabla");

	
	String type;
	
	public int indexxx = 0;
	public TeachersA (String name)
	{
		
	}
	public TeachersA (String [] teacherArr)
	{
		this.teacherArr = teacherArr;
	    
	}
	
	public TeachersA(String name, String type, TeacherB tb) 
    {
        //super(name);
        this.type = type;
        System.out.println(""+type +" "+ name+ " is in!");
        this.tb = tb;
    }

	
    public void getstuid()
    {
    	Students st = new Students();
    	stuArr = st.giveId();
    }
    public String giveB (int indx)
	{
		
    	indexxx = indx;
		System.out.println( stuArr[indexxx] + " " );
		
		//tb.addStudentInQueue( stuArr [indexxx]  );
		
		tb.createQueue( stuArr [indexxx] );
		
		return stuArr[indexxx];
	    
	}
}
