/**
 * Created by thomas on 2/23/15.
 */

import java.time.LocalDateTime;


public class Command 
{

    private Timestamp timeStamp;
    private String cmdName;
    private Arraylist<String> args;

    Command(String timeStamp, String cmdName, Arraylist<String> args) {

    	try
    	{
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		    Date parsedDate = dateFormat.parse(timestamp);
		    Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
		}
		catch(Exception e)
		{//this generic but you can control another types of exception
		 look the origin of excption 
		}

		this.cmdName = cmdName;
		this.args = args;
    }

    private static ArrayList<Command> parseCommandFile(File fin) throws IOException 
    {
    	ArrayList<Command> comandList = new Arraylist<Command>();

    	FileInputStream fis = new FileInputStream(fin);
 
	  //Construct BufferedReader from InputStreamReader
	  BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	 
	  String line = null;
	  while ((line = br.readLine()) != null) 
	   {
	  		String timeStamp;
	  		String cmdName;
	  		Arraylist<String> args;


		    StringTokenizer multiTokenizer = new StringTokenizer(line);

		    int index = 0;

		    while (multiTokenizer.hasMoreTokens())
		    {
		      System.out.println(multiTokenizer.nextToken());
		      // USE TOKENS APPROPRIATELY
		      swich (index)
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
}


