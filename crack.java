import java.util.Scanner;

class crack {

    String[] letters = {
        "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
        "u", "v", "w", "x","y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
        "O", "P", "Q", "R", "S", "T", "U", "V", "W","X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7",
        "8", "9"
    };
    public boolean isDone = false;
    public int length = 1;
    public int attempt = 0;

    void bf(int length, String pw, String password)
    {
        if (length == 0 && !isDone)
        {
            if(pw == password)
            {
                isDone = true;
            }
        }
        else if (!isDone)
        {
            for(int i = 0; i < letters.length; i++)
            {
                attempt++;
                bf(length - 1, pw + letters[i], password);
            }
        }
    }
    public static void main(String[] args) {

        crack c = new crack();

        String input = "";
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the pass : ");
        input = s.nextLine();

        while(!c.isDone)
        {
            c.bf(c.length, "", input);
            c.length++;
        }

        System.out.print(c.attempt);
        s.close();

    }
}
