package assignment;

import java.util.*;

public class assign {

	public static void main(String[] args) {
		int num;
		int optimal_cost = 0;
		int end;
		Scanner in = new Scanner(System.in);

		System.out
				.println("\nEnter the number of station for   Aseembly lines\n\n ");
		num = in.nextInt();

		int[] s1, s2, t1, t2, f1, f2, l1, l2;
		int start1, start2, end1, end2;
		s1 = new int[num];
		s2 = new int[num];
		t1 = new int[num - 1];
		t2 = new int[num - 1];
		f1 = new int[num];
		f2 = new int[num];
		l1 = new int[num];
		l2 = new int[num];

		System.out
				.println("\nEnter the station consumption  for   Assembly line 1\n");

		for (int i = 0; i < num; i++) {
			s1[i] = in.nextInt();
		}

		System.out
				.println("\nEnter the station consumption  for   Assembly line 2\n");

		for (int i = 0; i < num; i++) {
			s2[i] = in.nextInt();
		}

		System.out
				.println("\nEnter the time crossing  for   Assembly line 1\n ");

		for (int i = 0; i < num - 1; i++) {
			t1[i] = in.nextInt();
		}

		System.out
				.println("\nEnter the time crossing   for   Assembly line 2\n ");

		for (int i = 0; i < num - 1; i++) {
			t2[i] = in.nextInt();
		}

		System.out.println("\nEnter the start time  for   Assembly line 1\n ");
		start1 = in.nextInt();
		System.out.println("\nEnter the start time  for   Assembly line 2\n ");
		start2 = in.nextInt();
		System.out.println("\nEnter the end time  for   Assembly line 1\n ");
		end1 = in.nextInt();
		System.out.println("\nEnter the start time  for   Assembly line 2\n ");
		end2 = in.nextInt();

		System.out.println("\n\t\t\tThe given Assembly  line problem  \n ");

		System.out.println("Start time  for   Assembly line 1  : " + start1);
		System.out.println("\nStart time  for   Assembly line 2  : " + start2);

		System.out.print("\nAssembly Time for Line 1\n");
		for (int i = 0; i < num; i++) {
			System.out.print(" " + s1[i]);
		}
		System.out.print("\nCrossing Time for Line 1\n");

		for (int i = 0; i < num - 1; i++) {
			System.out.print(" " + t1[i]);
		}

		System.out.println("\nCrossing  times for  line 2");

		for (int i = 0; i < num - 1; i++) {
			System.out.print(" " + t2[i]);
		}

		System.out.println("\nAssembly times for  line 2");

		for (int i = 0; i < num; i++) {
			System.out.print(" " + s2[i]);
		}

		System.out.println("\nEnd time  for   Assembly line 1 : " + end1);
		System.out.println("\nEnd time  for   Assembly line 2  : " + end2);

		assembly_line
				.fast_algo(num, start1, start2, end1, end2, s1, s2, t1, t2);

	}

}
