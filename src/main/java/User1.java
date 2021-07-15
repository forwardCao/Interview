public class User1 {
    private static final long serialVersionUID = 1L;

    public String userId;
    private String userName;

//    public User1(String userId, String userName) {
//        this.userId = userId;
//        this.userName = userName;
//    }


    class Solution {
        public int trap() {
            int[] height =new int[]{0,1,0,2,1,0,1,3,2,1,2,1};

            int length = height.length, result = 0;
            int[] maxLeft = new int[length];
            int[] maxRight = new int[length];

            maxLeft[0] = height[0];
            for (int i = 1; i < length; i++) {
                maxLeft[i] = Math.max(height[i],height[i-1]);
            }
            System.out.println(maxLeft.toString());

            maxRight[length-1] = height[length-1];
            for (int i = length-2; i >= 0 ; i--) {
                maxRight[i] = Math.max(height[i],height[i+1]);
            }
            System.out.println(maxRight.toString());

            for (int i = 0; i < length; i++) {
                result += Math.min(maxLeft[i], maxRight[i]) - height[i];
            }
            return result;

        }
    }

}
