package gex;

public class KleeneRegex implements IRegex {
	private final IRegex subRegex;

	public KleeneRegex(IRegex subRegex) {
		this.subRegex = subRegex;
	}
	
	 
}
