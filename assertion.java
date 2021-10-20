class assertion {
	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		assert number<=15;
		System.out.println("Pass");
	}
}

// $ java -ea assertion 20
// Exception in thread "main" java.lang.AssertionError
// at assertion.main(assertion.java:4)