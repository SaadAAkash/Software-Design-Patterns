import java.util.*;
import java.io.*;

public class TeacherB  {

	public int pass = 10101;
	public int ArrA[] = new int[60] ;
	public int ArrE[] = new int[60] ;
	public int ArrC[] = new int[60] ;
	public int totId[] = new int[100];
	public int passArr[] = new int[60] ;
	

	public static String tempArr[] = new String[30] ;
	//Queue<Integer> queue = new LinkedList<Integer>();
	
	int i, foundFlag ;
	
	Queue q = new Queue();
	private List studentsQueue;
	
	
	
	public TeacherB(String name) {
		//super(name);
		// TODO Auto-generated constructor stub
		studentsQueue = new ArrayList<Students>();
		TeacherD td = new TeacherD("blabla");

		
	}
	int index1 = 0;

/*
    public void addStudentInQueue(Students student)
    {
        if (!isStudentInQueue(student))
        {
            System.out.println("queued successfully");
            studentsQueue.add(student);
        }
        else
        	System.out.println( "Duplicate found! Not queued." );
    }

    private boolean isStudentInQueue(String str, Students student)
    {
        for (int i= 0 ; i <studentsQueue.size();i++)
        {
            Students temp = (Students) studentsQueue.get(i);
            if (temp.giveName(i).matches(student.giveName(i)))
                return true;
        }
        return false;
    }
    
    public List getList()
    {
        return studentsQueue;
    }
*/
	public void createQueue( String str )
    {
		tempArr [index1++] = str;
		
		for (int i=0; i< index1-2; i++  )
		{
			
			if ( tempArr[i].matches( str ) )
				foundFlag = 1;
//			if (q.equals(str) == true )
//				foundFlag = 1;
		}
		if ( foundFlag == 1 )
		{
			System.out.println( "Duplicate found! Not queued." );
			foundFlag = 0;
		}
		else
		{
			q.enqueue ( str );
			System.out.println( "queued successfully." );
			
			TeacherD td1 = new TeacherD("blabla");
			td1.givePass( str );
	    
		}
    }

	public Object getList() {
		// TODO Auto-generated method stub

	        return studentsQueue;
	    

	}

/*    @Override
    public void update() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println ("UPDATED.");
    
    
    }
  */  
}
