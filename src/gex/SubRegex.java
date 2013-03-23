package gex;

public class SubRegex extends AbstractRegex {
	private final IRegex child;
	
	public SubRegex(IRegex next, IRegex child) {
		super(next);
		this.child = child;
	}

	@Override
	public int match(String text, int start, int end) {
		int newStart = child.match(text, start, end);
		if (newStart < 0) {
			return -1;
		}
		return matchNext(text, newStart, end);
	}	
}
