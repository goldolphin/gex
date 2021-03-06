package gex;

public class OrRegex extends AbstractRegex {
	private final IRegex clause;
	
	public OrRegex(IRegex next, IRegex clause) {
		super(next);
		this.clause = clause;
	}

	@Override
	public int match(String text, int start, int end) {
		int newStart = clause.match(text, start, end);
		if (newStart < 0) {
			return matchNext(text, start, end);
		}
		return newStart;
	}
}
