package com.company;

import java.io.IOException;

public class NumberSubscriber extends StringSubscriber {

    public NumberSubscriber(String uid) throws IOException {
        super(uid);
        fileManager = new FileManager("./Numbers.txt");
        executor = ".*[0-9]+.*";
    }
}
