package SHISHIRASIR;

import java.util.Collection;
import java.util.LinkedHashSet;

public class CollectionMethodDemo {
	public static void main(String[] args) {
		Collection<String> itcol = new LinkedHashSet<String>();
		itcol.add("somya");
		itcol.add("ravi");
		itcol.add("anup");
		itcol.add("nkit");
		Collection<String> eeecol = new LinkedHashSet<String>();
		eeecol.add("Raj");
		eeecol.add("surya");
		eeecol.add("narmada");
		eeecol.add("manoj");
		Collection<String> mechcol = new LinkedHashSet<String>();
		mechcol.add("venky");
		mechcol.add("mirtunjay");
		mechcol.add("bharat");
		mechcol.add("tarun");
		Collection<String> mscol = new LinkedHashSet<String>();
		mscol.addAll(itcol);
		mscol.addAll(eeecol);
		mscol.addAll(mechcol);
		System.out.println(mscol);
		System.out.println("total number of elements=" + mscol.size());
		mscol.remove("venky");

	}
}
