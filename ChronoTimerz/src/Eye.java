import java.time.LocalDateTime;


public class Eye implements ISensor {

	@Override
	public LocalDateTime trigger() {
		return LocalDateTime.now();
	}

}
