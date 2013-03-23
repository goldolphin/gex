package gex;

public class AsteriskRegex extends AbstractRegex {
	protected final IRegex clause;

	public AsteriskRegex(IRegex next, IRegex clause) {
		super(next);
		this.clause = clause;
	}

	@Override
	public int match(String text, int start, int end) {
		int newStart = clause.match(text, start, end);
		if (newStart < 0) {
			return matchNext(text, start, end);
		}
		int ret = match(text, newStart, end);
		if (ret >= 0) {
			return ret;
		}
		return matchNext(text, start, end);
	}
}
