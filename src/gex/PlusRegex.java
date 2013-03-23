package gex;

public class PlusRegex extends AsteriskRegex {

	public PlusRegex(IRegex next, IRegex clause) {
		super(next, clause);
	}

	@Override
	public int match(String text, int start, int end) {
		int newStart = clause.match(text, start, end);
		if (newStart < 0) {
			return -1;
		}
		return super.match(text, newStart, end);
	}
}
