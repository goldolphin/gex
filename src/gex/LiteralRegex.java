package gex;

public class LiteralRegex extends AbstractRegex {
	private final String value;

	public LiteralRegex(IRegex next, String value) {
		super(next);
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public int match(String text, int start, int end) {
		int len = value.length();
		if (start + len <= end && text.startsWith(value, start)) {
			return matchNext(text, start + len, end);
		}
		return -1;
	}
}
