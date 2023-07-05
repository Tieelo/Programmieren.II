package ProgrammierungII.enumSingleton;

public enum ChocolateBoiler {
    UNIQUE_INSTANCE;

    private boolean empty;
	private boolean boiled;
  
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
		}
	}
 
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
			empty = true;
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}

    public void describeState() {
        System.out.print("The boiler is");
        if (isEmpty()) System.out.print(" empty and");
        else System.out.print(" full and");
        if (isBoiled()) System.out.println(" boiled.");
        else System.out.println(" cold.");
    }
}
