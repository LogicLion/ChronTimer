import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class TimingRecord {
private LocalDateTime _start;
private LocalDateTime _finish;
private Duration _duration;
private STATUS _eventCode;
private int _BIB;

private enum STATUS {
	 START, DNF, FINISH, CANCEL
}

public TimingRecord(int BIB){
	_BIB = BIB;
	_start=null;
	_finish=null;
	_duration=null;
}

public void start(LocalDateTime startTime){
	//_start=LocalDateTime.now();
	_start = startTime;
	_eventCode=STATUS.START;
}

public void finish(LocalDateTime finishTime){
	//_finish=LocalDateTime.now();
	_finish = finishTime;
	_eventCode=STATUS.FINISH;
	_duration=Duration.between(_start, _finish);
}

public boolean isReady(){
	return (_start == null &&_finish == null);
}

public void DNF(){
	_eventCode=STATUS.DNF;
}

public void cancel(){
	_eventCode=STATUS.CANCEL;
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

public STATUS get_eventCode() {
	return _eventCode;
}

public String toString()
{
	if(_eventCode==STATUS.CANCEL) return _BIB + "\tCANCEL";
	else if(_eventCode==STATUS.START) {
		return _BIB+ "\tSTART";
	}
	else if(_eventCode==STATUS.DNF) {
		return _BIB+"\tDNF";
	}
	else{
		return _BIB+ "\t" + _duration.getSeconds() + "." +_duration.getNano();
	}
	
}

}