import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

	private static BinarySearch bs = new BinarySearch();
	
	@BeforeEach
	void setUp() throws Exception {
		bs.data.add(4);
		bs.data.add(5);
		bs.data.add(6);
		bs.data.add(7);
		bs.data.add(8);
	}

	@Test
	void testBsearch() {
		 assertEquals(21, bs.bsearch(5));
	}
	
	@Test
	void testBsearchforIndex() {
		 assertEquals(0, bs.bsearch(4));
	}

}
