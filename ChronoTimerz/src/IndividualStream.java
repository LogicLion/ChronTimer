import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class IndividualStream {

private TimingRecord[] _stream;
private LocalDateTime _start;
private int _currentRecord;
private int _capacity;

public IndividualStream(int size)
{
	_start = LocalDateTime.now();
	_stream=new TimingRecord[size];
	for(TimingRecord i : _stream)
	{
		i = new TimingRecord();
	}
	_currentRecord=0;
	_capacity=size;
}



}
