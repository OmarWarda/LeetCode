public class mySqrt {

    public static int mySqrt(int x) {
        int left = 0;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / 2) {
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int y = 4;
        System.out.println(mySqrt(y));
    }

}
