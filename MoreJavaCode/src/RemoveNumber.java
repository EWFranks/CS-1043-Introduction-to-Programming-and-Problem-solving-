public class RemoveNumber {
public int[] insertArray(int index, int[] arr, int value) {
		int[] newArray = new int[arr.length + 1];
		System.arraycopy(arr, 0, newArray, 0, index);
		System.arraycopy(arr, index, newArray, index + 1, 
                         arr.length - index);
		newArray[index] = value;
		arr = newArray;
		return newArray;
	}
}