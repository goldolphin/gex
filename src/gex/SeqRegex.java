package gex;

import java.util.ArrayList;

public class SeqRegex implements IRegex {
	private ArrayList<IRegex> regexes = new ArrayList<IRegex>();
	
	public void AddRegex(IRegex regex) {
		regexes.add(regex);
	}
}
