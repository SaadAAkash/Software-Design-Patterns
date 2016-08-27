import java.util.*;
import java.io.*;

public class MyTimer extends TimerTask {


	public static String teacherArr[] = new String[30] ;
	public static String stuArr[] = new String[40] ;
	int time, index1 = 1;
	public MyTimer(int tim, String[] TeachArr, String[] stuArr )
	{
		this.time = tim;
		this.teacherArr = TeachArr;
		this.stuArr = stuArr;
	}
	
    @Override
    public void run() {
        //System.out.println("Timer task started at:"+new Date());
        sleepThr (time);
        //System.out.println("Timer task finished at:"+new Date());
    }

    private void createstuid()
    {
    	System.out.println( new Date() + stuArr[index1++] + " queued.");
    }
    
    private void sleepThr(int time) {
        try {
            //takes tim4 secs to complete the task
            Thread.sleep( time );
            createstuid();
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /*
    public static void main(String args[]){
        TimerTask timerTask = new MyTimer();
        //running timer task as daemon thread
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 10*1000);
        System.out.println("TimerTask started");
        //cancel after sometime
        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask cancelled");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
*/
}
