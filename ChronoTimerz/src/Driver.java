import java.time.Clock;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;


public class Driver {
public static void main(String[] args){
	//Create command reader here.
	
	
	CommandReader r = new CommandReader();
	Scanner input = new Scanner(System.in);
	Clock systemClock = Clock.systemUTC();
	Clock clock = Clock.offset(systemClock, Duration.between(LocalDateTime.now(), endExclusive));
	while(r.parse(input.nextLine()) != null);
	
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
