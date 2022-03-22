
public class NumericInput extends TextInput{
   public void add(char ch)
    {
       
        if(Character.isDigit(ch))
        {
            super.input = super.input + ch;
        }
    }
}
