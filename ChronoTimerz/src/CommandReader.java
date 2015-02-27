/**
 // Created by thomas on 2/23/15.
 */
import java.lang.Object;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Queue;

public class CommandReader {

    private Queue<Command> listOfCommands;
    private Command _current;
    private ChronoTimer _timer;
    private String[] splitCommand;
    
    CommandReader(){
    	//Why not make ChronoTimer a singleton object? For example: _timer = ChronoTimer.Instance();
    	_timer = new ChronoTimer();
    }

    public String parse(String input){
        if (input.isEmpty()) return  null;
        splitCommand = input.split(" ");
       //Why not use equalsIgnoreCase()?
        if(input.equals("ON")) _timer.turnOn();
        else if(input.equals("OFF")) _timer.turnOff();
        else if(splitCommand[0].equals("NUM")) _timer.num(splitCommand[1]);
        else if(splitCommand[0].equals("CONN")) _timer.connect(splitCommand[1], splitCommand[2]);
        //else if(splitCommand[0].equals("TOGGLE")) _timer.toggle(splitCommand[1]);
        else if(input.equals("START")) _timer.start();
        else if(input.equals("FIN")) _timer.end();
        else if(input.equals("EXIT")) return null;
        
        else{
        	System.out.println("NOT A VALID INPUT");
        }

		return "READING";

    }




}
