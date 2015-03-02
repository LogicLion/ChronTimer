import java.time.LocalDateTime;


public class Pad implements ISensor {

	@Override
	public LocalDateTime trigger() {
		return LocalDateTime.now();
	}

}
