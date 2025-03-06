public class maxArea {
    public static int maxArea(int[] height) {
        int area = 0;
        int i = 0;
        int j = height.length - 1;
        while (i <= j) {
            int sqArea = (j - i) * Math.min(height[i], height[j]);
            if (sqArea > area) {
                area = sqArea;
            }
            if (height[i] <= height[j]) {
                i++;
            } else if (height[i] > height[j]) {
                j--;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }
}
