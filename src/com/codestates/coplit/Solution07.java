package com.codestates.coplit;

import java.util.Arrays;

public class Solution07 {
    public int boringBlackjack(int[] cards) {
        int count = 0;
        // 1. cards 에서 카드 3장 뽑기
        int length = cards.length;
        // 카드 뽑는 방식은 첫 카드를 cards 의 0번 index 부터 고정해 놓고 1씩 뒤로 옮겨간다
        for(int i = 0; i < length; i++) {
            // 두 번째 카드의 인덱스는 첫 카드 + 1에서 시작해야 하고
            for(int j = i + 1; j < length; j++) {
                // 세 번째 카드의 인덱스는 두 번째 카드 + 1에서 시작해야 한다
                for(int k = j + 1; k < length; k++) {
                    System.out.print("number="+cards[i] +"+"+ cards[j] +"+"+ cards[k]+"=");
                    int number = cards[i] + cards[j] + cards[k];
                    System.out.println(number);
                    // 세 카드의 합이 소수이면 경우의 수 + 1
                    if(isPrime(number)) count++;
                }
            }
        }
        return count;
    }

    //2. 소수 판별
    public boolean isPrime(int number) {
        // 2부터 비교하기 시작해서 나누어 떨어지는 수가 있으면 소수가 아니다
        // for 문 조건을 Math.sqrt(number) 로 해도 되는 이유는 i > Math.sqrt(number) 가 되면 몫이 절대 0이 될수 없기 때문에
        // Math.sqrt(number) 까지만 비교해 보아도 소수 판별이 가능하다
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
}
