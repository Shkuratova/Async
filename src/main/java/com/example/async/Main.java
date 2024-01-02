package com.example.async;
import reactor.core.publisher.Mono;
import java.util.Scanner;
import static com.example.async.AsyncWay.modifyNumber;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        Mono<Integer> b = modifyNumber(a);
        b.subscribe(System.out::println);
    }
}
