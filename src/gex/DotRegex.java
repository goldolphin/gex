package gex;

public class DotRegex extends AbstractRegex {

	protected DotRegex(IRegex next) {
		super(next);
	}

	@Override
	public int match(String text, int start, int end) {
		if (start < end) {
			return matchNext(text, start + 1, end);
		}
		return -1;
	}
}
