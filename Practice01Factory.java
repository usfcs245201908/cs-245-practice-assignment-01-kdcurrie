
public class Practice01Factory {

	
	public Practice01Factory () {
		return;
	}
	
	public Practice01Math get(String mathtype) {
		if (mathtype.equalsIgnoreCase("recursive")) {
			return new Practice01MathRecursive();
		} else if (mathtype.equalsIgnoreCase("iterative")) {
			return new Practice01MathIterative();
		}
		return null;
	}
}
