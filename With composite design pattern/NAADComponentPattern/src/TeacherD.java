import java.util.*;
import java.io.*;

public class TeacherD extends Teachers{

	public int ArrID[] = new int[60] ;
	String pass1;
	List studentsList;
	PassGen pg;
        /*****/ 
            /*****/
            /*****/   public static int[] mymode = {1, 2, 3, 3, 2, 1};
       private List<Observer> observers = new ArrayList<Observer>();
        /*****/ 
            /*****/
            /*****/
        
	public TeacherD(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		//Students st = new Students();
		
		studentsList = new ArrayList<Students>();
                

	}
	
	public void givePass( String str)
	{

		pg= new PassGen(studentsList);
		pass1 = pg.getPass(mymode);
		System.out.println("Password generated for " + str + " " + pass1);
                 notifyAllObservers();
                 //notifyA();
		
	}
	public void AddStudentFromApplicationProcessor(List<Students> students)
    {
        studentsList = new ArrayList<Students>();
        for (int i = 0;i<students.size();i++)
        {
            //System.out.println("Name: "+ ((Student) students.get(i)).getName());
            studentsList.add((Students) students.get(i));
            
            /*****/ 
            /*****/
            /*****/
            //notifyA();
                    
        }
    }
     
     
     
     /*****/ 
            /*****/
            /*****/
    public List getList()
    {
        return studentsList;
    }
    
    
       /*****/ 
            /*****/
            /*****/
     public void notifyAllObservers(){
         
        // System.out.println ("NOTIFIED."); System.out.println ("UPDATED");
         
     observers = studentsList;    
     for (Observer observer : observers) {
        // System.out.println ("NOTIFIED.");
        observer.update();
     }
  } 
    public void askForPassword()
    {
        
        pg = new PassGen(studentsList);
        //pg.createPassword();
        
    }
    
     public void notifyA(){
 /*        
     for (Observer observer : observers) {
         System.out.println ("Notified.");
        observer.update();
     }
*/
         observers = studentsList;    
     for (Observer observer : observers) {
         System.out.println ("NOTIFIED.");
        observer.update();
     }
    }

}
