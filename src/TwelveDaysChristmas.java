package src;
// Muhammad Naveed
// 20 - Arid - 348
// https://www.github.com/uxlabspk/JavaCodes/


public class TwelveDaysChristmas {
    // static variable
    private static String result = "";

    // static method 
    public static void songLyrics() {
        // main loop for iterating 
        for (int day = 1; day < 13; day++) {
            // appending the song lyrics
            result += "\nOn the ";

            // main switch for appending src.first, second, third, etc.
            switch (day) {
                case 1:
                    result += "src.first";
                    break;

                case 2:
                    result += "second";
                    break;

                case 3:
                    result += "third";
                    break;

                case 4:
                    result += "fourth";
                    break;

                case 5:
                    result += "fifth";
                    break;

                case 6:
                    result += "sixth";
                    break;

                case 7:
                    result += "seventh";
                    break;

                case 8:
                    result += "eight";
                    break;

                case 9:
                    result += "ninth";
                    break;

                case 10:
                    result += "tenth";
                    break;

                case 11:
                    result += "eleventh";
                    break;

                case 12:
                    result += "twelvth";
                    break;
            }

            // appending song lyrics 
            result += " day of Christmas my true love gave to me ";

            // switch for appending song lyrics
            switch (day) {
                case 1:
                    result += "a Patridge in a pear tree";
                    break;

                case 2:
                    result += "Two turtle doves";
                    break;

                case 3:
                    result += "Three french hens";
                    break;

                case 4:
                    result += "Four calling birds";
                    break;

                case 5:
                    result += "Five golden rings";
                    break;

                case 6:
                    result += "Six geese-a-laying";
                    break;

                case 7:
                    result += "Seven swans-a-swimming";
                    break;

                case 8:
                    result += "Eight maids-a-milking";
                    break;

                case 9:
                    result += "Nine ladies dancing";
                    break;

                case 10:
                    result += "Ten drummers drumming";
                    break;

                case 11:
                    result += "Eleven pipers piping";
                    break;

                case 12:
                    result += "Twelve Lords-a-leaping";
                    break;
            }

            // showing the song lyrics 
            System.out.println(result);
        }
    }

    // main driven function
    public static void main(String[] args) {
        // calling static method
        songLyrics();
    }
}