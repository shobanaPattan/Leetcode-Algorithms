public class ContainerWithMostWater {

    public static int maxArea(int[] ht) {

        int l = 0;
        int r = ht.length - 1;
        int maxWater = 0;

        while (l < r) {
            maxWater = Math.max(maxWater, (r - l) * Math.min(ht[l], ht[r]));

            if (ht[l] < ht[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxWater;
    }

        public  static void  main(String[] args) {

        int[] ht = {2,4,5,6,3};

            System.out.println(maxArea(ht));

    }

}
