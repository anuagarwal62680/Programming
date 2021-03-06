import java.io.InputStreamReader;

class Ayan10_Prime_or_not {

    public static void main(String[] args) throws IOException {
        // using BufferedReader class to take efficiant input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        //take input of an integer
        int number = Integer.parseInt(input[0]);

        //made a flag
        boolean flag = false;
        for(int i = 2; i <= number/2; ++i)
        {
            // condition for nonprime number and if condition is true flag set true
            if(number % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(number + " is a prime number");
        else
            System.out.println(number + " is not a prime number");
    }

}
