public class timeComplexity {

    public static void main(String[] args) {
    
        int num[] = {1,2,3,4,5,6,7,8,9,0};

        log(num);
        
    }

    public static void log(int[] numbers) {

        // O(n + m)
        // O(n)

        for(int number : numbers) {          //O(n)
            System.out.println(number);
        }

        for(int second : numbers) {         //O(m)
            System.out.println(second);
        }
    }
}
