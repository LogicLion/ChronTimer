import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class TimingRecord {
private LocalDateTime _start;
private LocalDateTime _finish;
private Duration _duration;
private STATUS _status;
private enum STATUS {
	 CREATED, STARTED, DNF, FINISHED, CANCELLED
}

public TimingRecord()
{
_start=null;
_finish=null;
_duration=null;
_status=STATUS.CREATED;
}

public void start(){
	_start=LocalDateTime.now();
	_status=STATUS.STARTED;
}

public void finish(){
	_finish=LocalDateTime.now();
	_status=STATUS.FINISHED;
	_duration=Duration.between(_start, _finish);
}

public void DNF(){
	_status=STATUS.DNF;
}

public void cancel(){
	_status=STATUS.CANCELLED;
}

public LocalDateTime get_start() {
	return _start;
}

public LocalDateTime get_finish() {
	return _finish;
}

public Duration get_duration() {
	return _duration;
}

public STATUS get_status() {
	return _status;
}

public String toString()
{
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLL yyyy HH:mm:ss.SS");
	if(_status==STATUS.CREATED) return "***CREATED***";
	else if(_status==STATUS.CANCELLED) return "***CANCELLED***";
	else if(_status==STATUS.STARTED) {
		return "***STARTED***	 Start: " + _start.format(formatter);
	}
	else if(_status==STATUS.DNF) {
		return "***DNF***		Start: " + _start.format(formatter);
	}
	else{
		return "***FINISHED***		Start: " + _start.format(formatter) + "	Finish: " + _finish.format(formatter) + 
				"	Duration: " + _duration.getSeconds() + "." +_duration.getNano();
	}
	
}

}