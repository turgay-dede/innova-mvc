package com.patika.tutorials;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SpecialFile {
    public static void specialSecurityMethod() throws IOException {
        String special = new String(Files.readAllBytes(Paths.get("special.txt")));
    }
}
