import java.util.Stack;

public class sumOfMinSubarrray {
    public static int[] nearestSmallerLeft(int[] arr) {
        int n = arr.length;
        int[] nums = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            nums[i] = st.empty() ? -1 : st.peek();
            st.push(i);
        }
        return nums;
    }

    public static int[] nearestSmallerRight(int[] arr) {
        int n = arr.length;
        int[] nums = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (st.size() > 0 && arr[i] < arr[st.peek()]) {
                st.pop();
            }
            nums[i] = st.empty() ? n : st.peek(); // work in why n
            st.push(i);
        }
        return nums;
    }

    public static int sumSubarrayMins(int[] arr) {

        int m = 1000000007;
        long total = 0;
        int[] NSL = nearestSmallerLeft(arr);
        int[] NSR = nearestSmallerRight(arr);

        for (int i = 0; i < arr.length; i++) {
            long sumToLeft = i - NSL[i];
            long sumToRight = NSR[i] - i;
            // (a*b)%m = (a%m * b%m)%m (Modulus Property)
            long sum = (sumToLeft % m * sumToRight % m) % m;
            long arrSum = (arr[i] % m * sum % m) % m;
            total = (total % m + arrSum % m) % m;
        }
        return (int) total;
    }
}
