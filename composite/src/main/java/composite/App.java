package composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	/**
	 * Program entry point
	 * 
	 * @param args
	 *            command line args
	 */
	public static void main(String[] args) {
		LOGGER.info("Message from the orcs: ");

		LetterComposite orcMessage = new Messenger().messageFromOrcs();
		orcMessage.print();

		LOGGER.info("\nMessage from the elves: ");

		LetterComposite elfMessage = new Messenger().messageFromElves();
		elfMessage.print();
	}
}
