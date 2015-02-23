import java.time.*;
public class TimingRecord {
private Instant start;
private Instant finish;
private Duration total;
private enum status {
	CANCEL, FINISH, DNF
}

public TimingRecord()
{
start=Instant.MIN;
finish=Instant.MAX;
total=Duration.between(start, finish);
}

}
