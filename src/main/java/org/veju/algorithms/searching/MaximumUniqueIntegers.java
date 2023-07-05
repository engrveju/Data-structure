package org.veju.algorithms.searching;

import java.util.*;

public class MaximumUniqueIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            // Updating the frequency map
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

            // If the size of the frequency map exceeds m, remove the first element
            if (i >= m) {
                int removedNum = in.nextInt();
                frequencyMap.put(removedNum, frequencyMap.get(removedNum) - 1);
                if (frequencyMap.get(removedNum) == 0) {
                    frequencyMap.remove(removedNum);
                }
            }

            // Update the maximum unique count
            maxUnique = Math.max(maxUnique, frequencyMap.size());
        }

        System.out.println(maxUnique);
        in.close();
    }
}
