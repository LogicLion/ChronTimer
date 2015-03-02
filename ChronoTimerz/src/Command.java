/**
 * Created by thomas on 2/23/15.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Command 
{

    private Timestamp timeStamp;
    private String cmdName;
    private ArrayList<String> args;

    Command(String timeStamp, String cmdName, ArrayList<String> args) {

    	try
    	{
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		    java.util.Date parsedDate = dateFormat.parse(timeStamp);
		    Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
		}
		catch(Exception e)
		{//this generic but you can control another types of exception
		// look the origin of excption 
		}

		this.cmdName = cmdName;
		this.args = args;
    }


    public static Command commandFromString(String str)
    {
		String timeStamp = null;
  		String cmdName = null;
  		ArrayList<String> args = new ArrayList<String>();


	    StringTokenizer multiTokenizer = new StringTokenizer(str);

	    int index = 0;

	    while (multiTokenizer.hasMoreTokens())
	    {
	      //System.out.println(multiTokenizer.nextToken());
	      // USE TOKENS APPROPRIATELY
	      switch (index)
	      {
	        case 0:
	        	cmdName = multiTokenizer.nextToken();
	        break;


	        // CMD ARG
	        default:
	        	args.add(multiTokenizer.nextToken());
	        break;
	      }
	      ++ index;
	    }

		return    new Command(timeStamp, cmdName, args);
    }
    
    public static ArrayList<Command> parseCommandFile(File fin) throws IOException 
    {
    	ArrayList<Command> commandList = new ArrayList<Command>();

    	FileInputStream fis = new FileInputStream(fin);
 
	  //Construct BufferedReader from InputStreamReader
	  BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	 
	  String line = null;
	  while ((line = br.readLine()) != null) 
	   {
	  		String timeStamp = null;
	  		String cmdName = null;
	  		ArrayList<String> args = new ArrayList<String>();


		    StringTokenizer multiTokenizer = new StringTokenizer(line);

		    int index = 0;

		    while (multiTokenizer.hasMoreTokens())
		    {
		      System.out.println(multiTokenizer.nextToken());
		      // USE TOKENS APPROPRIATELY
		      switch (index)
		      {
		        // TIMESTAMP
		        case 0:
		        	timeStamp = multiTokenizer.nextToken();
		        break;

		        // CMD NAME
		        case 1:
					cmdName = multiTokenizer.nextToken();
		        break;

		        // CMD ARG
		        default:
		        	args.add(multiTokenizer.nextToken());
		        break;
		      }
		      ++ index;
		    }

		    commandList.add(new Command(timeStamp, cmdName, args));
		}
		 
		br.close();

		return commandList;
    }

    public void execute(ChronoTimer timer) throws Exception
    {
    	if (this.cmdName.equals("ON"))
    	{
    		timer.turnOn();
    	}
    	else if (this.cmdName.equals("OFF"))
    	{
    		timer.turnOff();
    	}
    	else if (this.cmdName.equals("NUM"))
    	{
    		timer.num(this.args.get(0));
    	}    	
    	else if (this.cmdName.equals("CONN"))
    	{	
    		timer.connect(this.args.get(0), this.args.get(1));
    	}
    	else if (this.cmdName.equals("TOGGLE"))
    	{
    		timer.toggle(this.args.get(0));
    	}
    	else if (this.cmdName.equals("START"))
    	{
    		timer.start();
    	}
    	else if (this.cmdName.equals("FIN"))
    	{
    		timer.end();
    	}
    	else if (this.cmdName.equals("EXIT"))
    	{
    		
    	}
    	else
    		throw new Exception("Invalid command name");
    }
}


