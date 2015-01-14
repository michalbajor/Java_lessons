package lesson9;

public class Instrument {
	public enum Category {
		STRINGS, BRASS, PERCUSION
	}
	private Category category;
	private String name;
	
	public Instrument(String name, Category category) {
		this.name = name;
		this.category = category;
	}

	
	public String toString() {
		return "Instrument [category=" + category + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		Instrument instrument = new Instrument("Gitara", Category.STRINGS);
	System.out.println(instrument);	
	}
	

}
