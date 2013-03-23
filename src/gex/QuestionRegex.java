package gex;

public class QuestionRegex extends AbstractRegex {
	private final IRegex clause;

	public QuestionRegex(IRegex next, IRegex clause) {
		super(next);
		this.clause = clause;
	}

	@Override
	public int match(String text, int start, int end) {
		int newStart = clause.match(text, start, end);
		if (newStart < 0) {
			return matchNext(text, start, end);
		}
		int ret = matchNext(text, newStart, end);
		if (ret >= 0) {
			return ret;
		}
		return matchNext(text, start, end);
	}
}
