class Solution {
    public String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0) {
            return "";
        }
        String[] num = new String[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            num[i] =  String.valueOf(nums[i]);
        }
        Arrays.sort(num, (a, b) -> (b + "" + a).compareTo(a + "" + b));
        //Arrays.sort(nums, (a, b) -> b - a);
        StringBuilder sb = new StringBuilder();
        
        for(String i : num) {
            sb.append(i);
        }
        if(sb.toString().charAt(0) == '0') {
            return "0";
        }
        return sb.toString();
    }
}