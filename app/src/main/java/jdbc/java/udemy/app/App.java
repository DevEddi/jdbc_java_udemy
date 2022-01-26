/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jdbc.java.udemy.app;

import jdbc.java.udemy.list.LinkedList;

import static jdbc.java.udemy.utilities.StringUtils.join;
import static jdbc.java.udemy.utilities.StringUtils.split;
import static jdbc.java.udemy.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
