package com.company;

import java.io.IOException;
import java.util.concurrent.SubmissionPublisher;

public class Main {

    public static void main(String[] args) throws IOException {

        var publisher = new StringPublisher();
        var s1 = new AlphabetSubscriber("Alphabet");
        var s2 = new SymbolSubscriber("Symbol");
        var s3 = new NumberSubscriber("Number");

        publisher.subscribe(s1);
        publisher.subscribe(s2);
        publisher.subscribe(s3);


        System.out.println("==========================");
        publisher.publish("Alphabet should received only 10 words");
        s1.renew(15);
        System.out.println("==========================");
        publisher.publish("Alphabet should received more 15 words");
        System.out.println("==========================");
        publisher.publish("+++123");
        System.out.println("==========================");
        publisher.publish("12345");
        System.out.println("==========================");


    }
}