import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

	public static List<Integer> data = new ArrayList<Integer>();
	
	public static int bsearch(int value) {
		int low = 0;
		int high = data.size();

		Integer[] a = data.toArray(new Integer[0]);
		
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == value) {
				return mid;
			} else if (a[mid] < value) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		
	}
}
