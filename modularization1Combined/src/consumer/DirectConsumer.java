package consumer;

import java.util.logging.Logger;
import java.util.List;

import sorting.algorithm.BubbleSort;
import sorting.util.MySortingUtil;



public class DirectConsumer {
	
	private static Logger logger = Logger.getLogger(DirectConsumer.class.getName());
	
	
	public static void main(String[] args) {

		BubbleSort util = new BubbleSort();
		
		List<String> sorted = util.sort(List.of("Adem","Havva","Bekir","Halil","Merve"));
		
		logger.info(sorted.toString());
	}

}
