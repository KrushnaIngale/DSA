import java.util.Arrays;

public class Freq_of_most_freq_el_1838 {
    public static void main(String[] args) {
        int[] nums={1,2,4};
        int k=5;
        Freq_of_most_freq_el_1838 obj=new Freq_of_most_freq_el_1838();
        System.out.println(obj.maxFrequency(nums, k));
    }
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        long max=0;
        long sum=0;
        int l=0, r=0;

        while(r<n){
            sum+=nums[r];
            while(nums[r]*(r-l+1L) > sum+k){
                sum-=nums[l];
                l+=1;
            }
            max=Math.max(max,r-l+1);
            r+=1;
        }        
        return (int)max;
    }
}
