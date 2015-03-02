import java.time.LocalDateTime;


public class Gate implements ISensor {

	@Override
	public LocalDateTime trigger() {
		return LocalDateTime.now();
	}

}
