import java.time.*;
public class TimingRecord {
private Instant _start;
private Instant _finish;
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
	_start=Instant.now();
	_status=STATUS.STARTED;
}

public void finish(){
	_finish=Instant.now();
	_status=STATUS.FINISHED;
	_duration=Duration.between(_start,_finish);
}

public void DNF(){
	_status=STATUS.DNF;
}

public void cancel(){
	_status=STATUS.CANCELLED;
}

public Instant get_start() {
	return _start;
}

public Instant get_finish() {
	return _finish;
}

public Duration get_duration() {
	return _duration;
}

public STATUS get_status() {
	return _status;
}

}