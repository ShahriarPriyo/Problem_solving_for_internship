
public class FinalUserInput {
    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('9');
        
        System.out.println(input.getValue());

    }
}
