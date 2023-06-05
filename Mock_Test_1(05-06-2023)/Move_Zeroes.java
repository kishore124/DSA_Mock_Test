package in.ineuron;

import java.util.Arrays;

public class Move_Zeroes {

	public static void main(String[] args) {

		int[] nums=new int[] {4,1,0,3,1,2};
		moveZeros(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static void moveZeros(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				continue;
			else {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
			}
		}
	}

}
