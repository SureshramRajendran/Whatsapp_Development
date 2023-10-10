package Preparation;

import java.util.ArrayList;

public class UseFuncTask1 {
	public static void main(String[]args) {
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(1);
		nums.add(-2);
		nums.add(-5);
		nums.add(-11);
		nums.add(10);
		nums.add(21);
		nums.add(-29);
		nums.add(51);
		nums.add(-35);
		FuncTask1 ft=(f)->{
			for(int i=0;i<f.size();i++) {
				if(f.get(i)<0) {
					System.out.println(f.get(i));
				}
			}
		};
		ft.findNegNum(nums);
	}

}
