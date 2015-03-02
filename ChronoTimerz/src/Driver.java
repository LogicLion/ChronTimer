import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Driver {
public static void main(String[] args) throws Exception{
	//Create command reader here.
	
	ChronoTimer t = new ChronoTimer();
	CommandReader r = new CommandReader();
	Scanner input = new Scanner(System.in);
	//while(r.parse(input.nextLine()) != null);
	while(true){
		String line = input.nextLine();
		String lineSplits[] = line.split(" ");
		if(lineSplits[0].equals("TEST")){
			Command.parseCommandFile(new File(lineSplits[1]));
		}else{
			Command c = Command.commandFromString(line);
			c.execute(t);
		}
	}
	
	
	
	/*
	IndividualStream test = new IndividualStream(10);
	for(int i = 0; i<10; ++i)
	{
	test.startRecord();
	try{
		Thread.sleep(1000);
	}
	catch(InterruptedException ex){
		Thread.currentThread().interrupt();
	}
	test.finishRecord();
	}*/
}
}
