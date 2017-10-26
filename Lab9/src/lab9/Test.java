package lab9;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		
		assertTrue(DelimiterChecker.check("ahfljhaslkhfk"));
		assertTrue(DelimiterChecker.check("({[]})"));
		assertTrue(DelimiterChecker.check("(a{b[c]d}e)f"));
		assertFalse(DelimiterChecker.check("}}}}}}}"));
		assertFalse(DelimiterChecker.check("{))"));
		assertFalse(DelimiterChecker.check("["));
		
	}

}
