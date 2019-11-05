public class Tset17 {
public static void main(String[] args) {
        int[]nums = {2,5,23,223,43,54,1,57,67};
        for(int i = 0;i <= nums.length - 1;i++){
        for(int j = i + 1;j <= nums.length -1;j++ ){
        if (nums[i] > nums[j]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        }
        }
        }
        System.out.println("最小值为：" + nums[0] + ",最大值为：" + nums[nums.length - 1]);
        }
        }

