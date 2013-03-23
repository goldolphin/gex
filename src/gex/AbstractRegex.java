package gex;

public abstract class AbstractRegex implements IRegex {
	private final IRegex next;
	
	protected AbstractRegex(IRegex next) {
		this.next = next;
	}
	
	protected int matchNext(String text, int start, int end) {
		if (next == null) {
			return start;
		}
		return next.match(text, start, end);
	}
}
