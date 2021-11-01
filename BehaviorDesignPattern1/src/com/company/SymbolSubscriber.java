package com.company;

import java.io.IOException;

public class SymbolSubscriber extends StringSubscriber {

    public SymbolSubscriber(String uid) throws IOException {
        super(uid);
        fileManager = new FileManager("./Symbols.txt");
        executor = ".*[-+*/%@()]*"; // just an example of symbol filtering
    }
}
