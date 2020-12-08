package javaPack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionBasics {

	public static void main(String[] args) {

		// Collection - group of objects with same data-type, dynamic size
		// List - allow duplicate values and maintain the insertion order
		// Set - won't allow duplicate values and will not maintain the insertion order

		CollectionBasics cb1 = new CollectionBasics();
		CollectionBasics cb2 = new CollectionBasics();
		CollectionBasics cb3 = new CollectionBasics();

		// Integer y = 10;

		// List
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(78);
		nums.add(78);
		nums.add(48);
		System.out.println(nums);
		System.out.println(nums.get(0));
		System.out.println(nums.size());

		// Set
		Set<Integer> nums1 = new HashSet<Integer>();
		nums1.add(10);
		nums1.add(78);
		nums1.add(78);
		nums1.add(48);
		System.out.println(nums1);
		System.out.println(nums1.toArray()[0]);
		System.out.println(nums1.size());

	}

}
