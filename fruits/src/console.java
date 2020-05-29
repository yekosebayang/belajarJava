public class console {

	public static String readInputString(String message) {
		System.out.print(message);
		return App.scanner.next();
	  }
	
	  public static double readInputNumber(String message) {
		System.out.print(message);
		return App.scanner.nextDouble();
	  }
	
    
}