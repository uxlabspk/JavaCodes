package src;
// src.counter.java

import java.util.Scanner;

public class counter {
    private String str;
    private int totalWords;
    private int totalLetters;

    counter() {
        str = "";
        totalLetters = totalWords = 0;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void countTotal() {
        for (int words = 0; words < str.length(); words++) {
            if (str.charAt(words) == ' ') {
                totalWords++;
                totalLetters++;
            } else {
                totalLetters++;
            }
        }
    }

    public void showResults() {
        System.out.println("There are " + totalLetters + " letters and " + (totalWords + 1) + " words.");
    }

    public static void main(String[] args) {
        var c = new counter();

        var s = new Scanner(System.in);
        System.out.print("Enter the text string : ");
        String str = s.nextLine();
        str = str.trim();
        s.close();

        c.setStr(str);
        c.countTotal();
        c.showResults();
    }
}
