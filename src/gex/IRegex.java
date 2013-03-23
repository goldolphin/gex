package gex;

public interface IRegex {

	/**
	 * 
	 * @param text
	 * @param start
	 * @param end
	 * @return -1 when not match, otherwise new start index.
	 */
	public int match(String text, int start, int end);

}
