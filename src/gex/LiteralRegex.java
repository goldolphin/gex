package gex;

public class LiteralRegex implements IRegex {
	private final String value;

	public LiteralRegex(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
