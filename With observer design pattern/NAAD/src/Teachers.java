import java.util.*;
import java.io.*;

public class Teachers {

	String name;
	int stuID;

	public static String teacherArr[] = new String[8] ;
	public static String stuArr[] = new String[20] ;
	
	public Teachers(String name)
	{
		this.name = name;
		//Students st = new Students();
	}
	
	public int giveId( int id)
	{
		stuID = id;
		return stuID;
	}

}
