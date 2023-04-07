public class Divide implements Operate {
   @Override
           public Double getResult(Double... numbers)
            {
               Double Div =numbers[0];
               for(int i=1; i< numbers.length ;i++)
               {
                Div /=numbers[i];
               }
               return Div;
            }
 }
