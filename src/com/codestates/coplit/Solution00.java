package com.codestates.coplit;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution00 {
    public static void main(String[] args) {
/*
        Solution00 solution00 = new Solution00();
        System.out.println("=".repeat(20) + "solution00" + "=".repeat(20));
        System.out.println(solution00.method(input00));
*/

/*        Solution01 solution01 = new Solution01();
        System.out.println("=".repeat(20) + "solution01" + "=".repeat(20));
        int[] input011 = {42,25,60,73,103,167};
        int input012 = 187;
        System.out.println(solution01.movingStuff(input011,input012));

        Solution05 solution05 = new Solution05();
        System.out.println("=".repeat(20) + "solution05_rockPaperScissors" + "=".repeat(20));
        int rounds = 5;
        ArrayList<String[]> output05 = new ArrayList<String[]>( solution05.rockPaperScissors(rounds) );
        for(String[] i : output05) { //for문을 통한 전체출력
            System.out.println(Arrays.toString(i));
        }
*/

        Solution06 solution06 = new Solution06();
        System.out.println("=".repeat(20) + "solution06_newChickenRecipe" + "=".repeat(20));
        int[] stuffArr = {1, 10, 1100, 1111};
        int choiceNum = 2;
        ArrayList<Integer[]> output06 = new ArrayList<Integer[]>( solution06.newChickenRecipe( stuffArr, choiceNum ));
        for(Integer[] i : output06) { //for문을 통한 output 전체출력
           System.out.println(Arrays.toString(i));
        }
 /*
        Solution07 solution07 = new Solution07();
        System.out.println("=".repeat(20) + "solution07_BoringBlackJack" + "=".repeat(20));
        int[] cards = {2, 3, 4, 8, 13};
        System.out.println(solution07.boringBlackjack(cards));

        Solution08 solution08 = new Solution08();
        System.out.println("=".repeat(20) + "solution08_divideChocolateStick" + "=".repeat(20));
        int M = 4;
        int N = 8;
        ArrayList<Integer[]> output08 = new ArrayList<Integer[]>( solution08.divideChocolateStick(M,N) );
        for(Integer[] i : output08) {
            System.out.println(Arrays.toString(i));
        }

        Solution09 solution09 = new Solution09();
        System.out.println("=".repeat(20) + "solution09_missHouseMeal" + "=".repeat(20));
        String[] sideDishes = new String[]{"eggroll", "kimchi", "fishSoup"};
        ArrayList<String[]> output09 = new ArrayList<String[]>( solution09.missHouseMeal( sideDishes ) );
        for(String[] i : output09) {
            System.out.println(Arrays.toString(i));
        }
*/

    }
}
