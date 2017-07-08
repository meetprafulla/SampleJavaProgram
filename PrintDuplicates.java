/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++) {
			if(map.get(arr[i]) == null) {
				map.put(arr[i], 1);
			}else {
				System.out.println(arr[i]);
			}
		}
	}
}