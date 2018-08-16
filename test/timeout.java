
import org.junit.Test;


public class timeout {

	@Test(timeout=2000)  // milliseconds
	public void test() {
	   while (true) {}
	}

}


