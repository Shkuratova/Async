package com.example.async;
import reactor.core.publisher.Mono;
public class AsyncWay {
    public static Mono<Integer> modifyNumber(int a) {
        return toMono(a).
                map(b -> AsyncWay.Squared(b)).
                map(c -> AsyncWay.minusDigits(c));
    }

    public static int Squared(int a) {
        return a * a;
    }

    public  static int minusDigits(int a){
        int sum = 0;
        int b = a;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return b - sum;
    }

    public static Mono<Integer> toMono(int a) {
        return Mono.justOrEmpty(a);
    }
}
