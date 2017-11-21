package one71031Testing.java.intermLearning;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JavaSolved {
    public static void main(String[] args) {//throws IOException {
        String file = "languages.txt";
        System.out.println("Writing to file: " + file);
        // Files.newBufferedWriter() uses UTF-8 encoding by default
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("languages.txt"/*file*/))) {
            writer.write("Java\n");
            writer.write("Python\n");
            writer.write("Clojure\n");
            writer.write("Scala\n");
            writer.write("JavaScript\n");
        } catch (IOException e){
            System.out.println(e);// the file will be automatically closed
        }
    }
}

