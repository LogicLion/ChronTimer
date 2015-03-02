/**
 // Created by thomas on 2/23/15.
 */
import java.lang.Object;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Queue;

public class CommandReader {

    private ChronoTimer _timer;
    private String[] splitCommand;
    
    CommandReader()
    {
    	_timer = new ChronoTimer();
    }

    public String parse(String input){
        if (input.isEmpty()) return  null;
        splitCommand = input.split(" ");
        if(input.equalsIgnoreCase("ON")) _timer.turnOn();
        else if(input.equalsIgnoreCase("OFF")) _timer.turnOff();
        else if(splitCommand[0].equalsIgnoreCase("NUM")) _timer.num(Integer.parseInt(splitCommand[1]));
        else if(splitCommand[0].equalsIgnoreCase("CONN")) _timer.connect(splitCommand[1], Integer.parseInt(splitCommand[2]));
        else if(splitCommand[0].equalsIgnoreCase("TOGGLE")) _timer.toggle(Integer.parseInt(splitCommand[1]));
        else if(input.equalsIgnoreCase("START")) _timer.start();
        else if(input.equalsIgnoreCase("FIN")) _timer.end();
        else if(input.equalsIgnoreCase("DNF")) _timer.DNF();
        else if(input.equalsIgnoreCase("CANCEL")) _timer.cancel();
        else if(input.equalsIgnoreCase("PRINT")) _timer.print();
        else if(input.equalsIgnoreCase("EXIT")) return null;
        
        else{
        	System.out.println("NOT A VALID INPUT");
        }

		return "READING";

    }




}
