import java.util.*;
import java.io.*;

public class TeacherD extends Teachers{

	public int ArrID[] = new int[60] ;
	String pass1;
	List studentsList;
	PassGen pg;
	public TeacherD(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		//Students st = new Students();
		
		studentsList = new ArrayList<Students>();
		

	}
	
	//TeacherB tb =  new TeacherB();
	//ArrID = tb.getid();
	
	
	public void givePass( String str)
	{

		pg= new PassGen(studentsList);
		//pass1 = pg.getPass();
		System.out.println("Password generated for " + str + " " + pass1);
		
	}
	public void AddStudentFromApplicationProcessor(List<Students> students)
    {
        studentsList = new ArrayList<Students>();
        for (int i = 0;i<students.size();i++)
        {
            //System.out.println("Name: "+ ((Student) students.get(i)).getName());
            studentsList.add((Students) students.get(i));
        }
    }
    
    public List getList()
    {
        return studentsList;
    }
    
    public void askForPassword()
    {
        
        System.out.println("Asking for pasword called here...");
        pg = new PassGen(studentsList);
        //pg.createPassword();
        
    }


}
