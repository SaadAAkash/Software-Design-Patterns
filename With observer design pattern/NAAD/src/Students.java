import java.util.*;
import java.io.*;


public class Students {
	
	public static String teacherArr[] = new String[8] ;
	public static String stuArr[] = new String[20] ;
	
	String name, id;
	int ii = 0;
    public static String nameArr[] = new String [100];
    public Students(String name, String id) 
    {
        this.name = name;
        this.id = id;
        System.out.println("Student "+name +" is in!");
        nameArr[ii++] = name;
    }

	public Students (String [] stuArr)
	{
		this.stuArr = stuArr;
	}
	public Students ()
	{
		//this.stuArr = stuArr;
	}
	public String[] giveId()
	{
		return stuArr;
	}
    public String giveName(int indxx)
    {
        return stuArr[indxx];
    }

//	public int takeId( String[] stuArr )
//	{
//		this.stuArr = stuArr;
//	}
}
