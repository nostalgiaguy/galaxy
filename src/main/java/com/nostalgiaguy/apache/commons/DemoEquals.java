package com.nostalgiaguy.apache.commons;

//Broken - violates symmetry!
final class CaseInsensitiveString {
	private final String s;
	public CaseInsensitiveString(String s) {
		if (s == null)
			throw new NullPointerException();
		this.s = s;
	}
	//Broken - violates symmetry!
//	@Override public boolean equals(Object o) {
//		if (o instanceof CaseInsensitiveString)
//			return s.equalsIgnoreCase(
//					((CaseInsensitiveString) o).s);
//		if (o instanceof String) // One-way interoperability!
//			return s.equalsIgnoreCase((String) o);
//		return false;
//	}
	
	
	@Override public boolean equals(Object o) {
		return o instanceof CaseInsensitiveString &&
		((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
		}
}

public class DemoEquals {
	
	public static void main(String[] args) {
		
		CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
		CaseInsensitiveString cis1 = new CaseInsensitiveString("poLish");
		String s = "polish";
		
		System.out.println(cis.equals(s));
		System.out.println(s.equals(cis));
		
		System.out.println(cis.equals(cis1));
		System.out.println(cis1.equals(cis));
	}

}
