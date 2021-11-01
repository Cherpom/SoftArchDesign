package com.company;

import java.io.IOException;

public class AlphabetSubscriber extends StringSubscriber {

    public AlphabetSubscriber(String uid) throws IOException {
        super(uid);
        fileManager = new FileManager("./Alphabet.txt");
        executor = ".*[a-zA-Z]+.*";
    }

}
