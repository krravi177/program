package SHISHIRASIR;

import java.util.Collection;
import java.util.LinkedHashSet;

public class mechCol {
public static void main(String[] args) {
	Collection<String>mechCol=new LinkedHashSet<String>();
	mechCol.add("venky");
	mechCol.add("anup");
	mechCol.add("ravi");
	mechCol.add("chanda");
	Collection<String>msCol=new LinkedHashSet<String>();
	msCol.add("itcol");
	msCol.add("eeecol");
	msCol.add("mechcol");
	msCol.add("col");
	System.out.println(msCol);
	System.out.println("total no of element="+msCol.size());
	msCol.remove("venky");
	System.out.println("total no of element="+msCol.size());
	System.out.println("venky present?"+msCol.contains("venky"));
	
	System.out.println("All EEE students present?"+msCol.containsAll(msCol));
	
	msCol.removeAll(mechCol);
	msCol.clear();
}
}
