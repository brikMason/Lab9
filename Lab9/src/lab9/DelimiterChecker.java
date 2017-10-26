package lab9;

public class DelimiterChecker {

	public static void main(String[] args) {
		if (DelimiterChecker.check("(corr{ec(t)})(()[][]{}{}{}))")) {
			log("It was a balanced string!");
		} else {
			log("This was an unbalanced string!");
		}
	}

	public static boolean check(String t) {
		String open = "({[";
		String close = "]})";
		StackX stack = new StackX(t.length());

		for (int i = 0; i < t.length(); i++) {

			String cs = t.substring(i, i + 1);
			if (open.contains(cs)) {
				stack.push(cs.charAt(0));
			} else if (close.contains(cs)) {
				if (stack.isEmpty()) {
					log("Missing left delimiter.");
					return false;
				}
				if (stack.peek() == '(' && cs.charAt(0) == ')') {
					stack.pop();
				} else if (stack.peek() == '[' && cs.charAt(0) == ']') {
					stack.pop();
				} else if (stack.peek() == '{' && cs.charAt(0) == '}') {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		if (!stack.isEmpty()) {
			log("Missing right delimiter.");
			return false;
		}
		return true;

	}

	private static void log(String msg) {
		System.out.println(msg);
	}
}
