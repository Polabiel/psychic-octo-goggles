import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static int lastestTimeToCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);
        HashSet<Integer> set = new HashSet<>();
        int ans = -1;
        int j = 0;

        for (int i = 0; i < passengers.length; i++)
            set.add(passengers[i]);

        for (int i = 0; i < buses.length; i++) {
            int space = capacity;
            while (j < passengers.length && space > 0 && passengers[j] <= buses[i]) {
                ans = passengers[j];
                j++;
                space--;
            }
        }

        while (set.contains(ans))
            ans--;

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(lastestTimeToCatchTheBus(new int[] { 10, 20 }, new int[] { 2, 17, 18, 19 }, 2)); // output:
                                                                                                            // 16
        System.out.println(
                lastestTimeToCatchTheBus(new int[] { 20, 30, 10 }, new int[] { 19, 13, 26, 4, 25, 11, 21 }, 2)); // output: 20
                System.out.println(lastestTimeToCatchTheBus(new int[] { 20, 30, 10 }, new int[] { 19, 13, 26, 4, 25, 11, 21 }, 2)); // output: 20
        

    }
}