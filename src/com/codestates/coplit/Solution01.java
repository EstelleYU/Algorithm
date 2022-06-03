package com.codestates.coplit;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution01 {
    public int movingStuff(int[] stuff, int limit) {
        // TODO
        ArrayList<Integer> sort = new ArrayList<>();
        Arrays.sort(stuff);
        for (int i: stuff){
            sort.add(i);
        }

        int count = 0;

        // stuff = {25, 42, 60, 73, 103, 167}  //sorted
        // left=25, right=167
        // 25+167 > limit
        // 167: count++, right--
        // left = 25, right=103
        // 25+103 < limit : count++, left++, right--   128+42=170
        // left =2, right=3
        // 2+3 < limit : count++, left++, right--

        int left = 0;
        int right = stuff.length - 1;

        while (right >= left) {
            if (stuff[left] + stuff[right] <= limit) {
                left++;
                right--;
                count++;
            } else {
                right--;
                count++;
            }
        }
        return count;// 3

    }
}