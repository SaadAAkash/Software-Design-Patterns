

import java.util.*;
import java.io.*;

public class Main {

	
	//app rcv -> ta
	//pas man -> td
	//app prc -> tb
	
	public static String teacherArr[] = new String[8] ;
	public static String stuArr[] = new String[20] ;
	static List studentsList;
	static  TeacherB tb;
    static List apprcvList;
    static TeacherD td;
    
    public static int[] mymode = {1, 2, 3, 3, 2, 1};
    
	/////////////////////////////////////////////////////////
		static class StuThread extends TimerTask 
	    {
			//mode = {2,3,1,3,2,1};
			//double[] myList = {1.9, 2.9, 3.4, 3.5};
			Random rand1 = new Random();
			public void run() 
	        {
	            try 
	            {
	                Random rand = new Random();
	                
	                int randomInt = rand.nextInt(teacherArr.length-1);
	                int randomStudent = rand.nextInt(stuArr.length-1);
	                
	                Students st1  = new Students (stuArr);
	                TeachersA ta1  = new TeachersA("blabla");
	                ta1.getstuid();
	                
	                ta1.giveB ( randomStudent );
	                
	                Thread.sleep(1000);
	            } catch (InterruptedException ex) {
	                
	            }
	            System.out.println("Creation Time:" + new Date() + " " );
	            Timer timer = new Timer();
	            
	            int dup = 0;
	            int min = 0, max = 8;
	            long randomInt = rand1.nextInt( ((max-min)+1) + min );
	            
                    
                    
	            timer.schedule(new StuThread(), randomInt);
	            timer.schedule(new StuThread(), randomInt);
		        
	        }
	    }
	///////////////////////////////////////////////////
	static class PassThread extends TimerTask
	    {
	        public void run()
	        {
	            try
	            {
	                Thread.sleep(10000);
	                System.out.println("\nAsking Authority to generate password for current students\n");
	               // td.AddStudentFromApplicationProcessor(tb.getList());
	                td.askForPassword();
	               
	            } catch (InterruptedException ex) {
	               // Logger.getLogger(SDP_NAAD.class.getName()).log(Level.SEVERE, null, ex);
	            }
	         
	            Timer timer = new Timer();
	            timer.schedule(new PassThread(), 10000);
	        }
	    }
	    
///////////////////////////////////////
	/*	static class PassThread extends TimerTask 
	    {
	        public void run() 
	        {
	            try 
	            {
	                Random rand = new Random();
	                
	                int randomInt = rand.nextInt(teacherArr.length-1);
	                int randomStudent = rand.nextInt(stuArr.length-1);
	                
	                Students st1  = new Students (stuArr);
	                TeachersA ta1  = new TeachersA("blabla");
	                ta1.getstuid();
	                
	                ta1.giveB ( randomStudent );
	                Thread.sleep(1000);
	            } catch (InterruptedException ex) {
	                //Logger.getLogger(SDP_NAAD.class.getName()).log(Level.SEVERE, null, ex);
	            }
	            System.out.println("Creation Time:" + new Date() + " " );
	            Timer timer = new Timer();
	            timer.schedule(new PassThread(), 1000);
	        }
	    }
	*/
		/////////////////////////////////////////
	
	public static void main(String args[]) throws IOException
	{
		
		int flag = 0;
		int index = 0, index2 = 0;

		FileReader finstream;
		 BufferedReader brin  = null;
		 String str, str2;
		 
		 studentsList = new ArrayList<Students>();
		 apprcvList = new ArrayList<TeachersA>();

		 
		 
		try {
			
			finstream = new FileReader("input2.txt");
			brin = new BufferedReader(finstream);
			
		
///////////////////////////////////////////////////////
			/////////////////////////////////////
			
	       String name = brin.readLine();
		       if (name!= null)
		       {
		           td = new TeacherD(name);
		       }
		       // getting B's Info
		       name = brin.readLine();
		       if (name!= null)
		       {
		           tb = new TeacherB(name);
		       }
		       // loop to take multiple apps receiver
		       while ( (name = brin.readLine())!=null)
		       {
		           if (name.matches("student"))
		           {
		        	   stuArr[index2++] = name;
		        	   break;
		           }
		           else
		           {
		        	   teacherArr[index++] = name;
		        	   String val[]= name.split(" ");
		               if (val.length==2)
		               {
		                   TeachersA temp = new TeachersA(val[0], val[1], tb);
		                   apprcvList.add(temp);
		                   
						
		               }
		           }
		       }
		       while ( (name = brin.readLine())!=null)
		       {
		           
		           {
		               String val[]= name.split(" ");
		               if (val.length==2)
		               {
		                   Students temp = new Students(val[0], val[1]);
		                   studentsList.add(temp);
		                   stuArr[index2++] = name;
		                   /*
		                    Random randomGenerator = new Random();
		                    int randomInt = randomGenerator.nextInt(applicationReceivers.size()-1);
		                    ApplicationReceiver apps  = (ApplicationReceiver) applicationReceivers.get(0);
		                   apps.askForPassword(temp);*/
		                   
		               }
		           }
		       }
	
	
			
		///////////////////////////////////////////////////////
//		 
//		 try{
//			 finstream = new FileReader("input.txt");
//			brin = new BufferedReader(finstream);
//			
//			while ( (str = brin.readLine()) != null)
//			{
//				
//				if (str.contentEquals("student") == true)
//				{
//					flag = 1;
//					//break;
//				}
//				if (flag == 1)
//				{
//					stuArr[index2++] = str;
//				}
//				else
//				teacherArr[index++] = str;
//			}
//		       
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}finally{
//			try{
//				if(brin == null)
//					brin.close();
//			}catch (IOException ex){
//				ex.printStackTrace();
//			}
//		}
		 
		 
		 ////////////////////////////////////////////////////////////////
		 
		 
		//System.out.println( teacherArr.toString()  );
		//index = 0;
		for (int i =0 ; i<6; i++)
		{
			System.out.println( teacherArr[i] + " ");
		
		}
		System.out.println( "Teacher List Ends");
		for (int i =1 ; i<15; i++)   //REMEEMBER 1 THEKE
		{
			System.out.println( stuArr[i] + " ");
		}

		System.out.println( "STUDENT List Ends");
			
			
	    StuThread ex = new StuThread();
	    ex.run();
            
            
	   PassThread ex2 = new PassThread();
	    ex2.run();
	    
	    //cancel after fixed time
	    try {
	        Thread.sleep(120000); // after 120 sec -> 2 min
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	   
	    try {
	        Thread.sleep(30000);   // ?
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}finally{
		
	}
	
	}  //VOID MAIN ENDS

}//CLASS ENDS

//
//	}
//}


