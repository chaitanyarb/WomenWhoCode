package learning.fun;

import java.util.List;
import java.util.function.Consumer;

public class ChainedConsumerSample<T> {

	 public void testChainedConsumer(List<T> list,
		      Consumer<T> fx) {
		    for (T e : list) {
		      fx.accept(e);
		    }
		  }
}
