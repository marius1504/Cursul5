package Teme;

import java.util.ArrayList;
import java.util.Arrays;

public class exercitiul0 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,77,8,108,99,2421,77,15,99,23123213,21312344,22,11,75,12,342,1222,15,2222,1833,155,108,12,10));
		arrayList.add(0, Integer.valueOf(73));
		arrayList.add(55);
		arrayList.size();
		arrayList.contains(33);
		arrayList.get(12);
		arrayList.indexOf(15);
		arrayList.lastIndexOf(10);
		arrayList.remove(15);
		arrayList.set(13, 108);
		System.out.println(arrayList.size());
		System.out.println(arrayList.indexOf(15));
		System.out.println(arrayList.lastIndexOf(22));
		System.out.println(arrayList.contains(69));
		
		
		
	}
}
