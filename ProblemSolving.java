
import java.util.Scanner;

public class ProblemSolving {

    public static int getNoationIntValue(char notation) {

        switch (notation) {
            case 'r':
                return 4;

            case 'w':
                return 2;

            case 'x':
                return 1;

            case '-':
                return 0;

        }
        return -1;
    }

   public static int decodeSymbolicNotation(String notation)
   {
        int i=1;
        boolean flag=true;
        String output = "";
        int count = 0;
        while (i <= notation.length()) {
            if (ProblemSolving.getNoationIntValue(notation.charAt(i - 1)) != -1) {
                count += ProblemSolving.getNoationIntValue(notation.charAt(i - 1));
                if (i % 3 == 0) {
                    output += count;
                    count = 0;
                }
            } else {
                System.out.println("Wrong Input");
                flag=false;
                break;
            }
            i++;
        }
        if(flag){
            return Integer.parseInt(output);
        }
        else
        {
            return -1;
        }
   }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
     //   boolean flag = false;
        String input = in.next();
        System.out.println("Output:" + ProblemSolving.decodeSymbolicNotation(input));
    }

}

