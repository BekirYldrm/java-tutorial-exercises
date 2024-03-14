package consumer;

import java.util.logging.Logger;
import java.util.List;
import sorting.util.MySortingUtil;



public class MySortingUtilConsumer {
	
	private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());
	
	
	public static void main(String[] args) {

		MySortingUtil util = new MySortingUtil();
		
		List<String> sorted = util.sort(List.of("Adem","Havva","Bekir","Halil","Merve"));
		
		logger.info(sorted.toString());
	}

}
