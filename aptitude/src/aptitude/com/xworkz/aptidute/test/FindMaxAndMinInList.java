package aptitude.com.xworkz.aptidute.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMaxAndMinInList {

	public static Integer findMin(List<Integer> list)
	{
		return Collections.min(list);
	}

	public static Integer findMax(List<Integer> list)
	{
		return Collections.max(list);
	}

	public static void main(String[] args)
	{

		
		List<Integer> list = new ArrayList<>();

		list.add(45);
		list.add(333);
		list.add(76);
		list.add(29);
		list.add(900);
		list.add(23);
		list.add(474);
		list.add(654);
		list.add(29);
		list.add(454);

		System.out.println("Min: " + findMin(list));
		System.out.println("Max: " + findMax(list));
	}
}

