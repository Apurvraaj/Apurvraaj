public class Multiply implements Operate{

        @Override
           public Double getResult(Double... numbers)
            {
               Double Mul =1.0;
               for(Double num : numbers)
               {
                Mul *=num;
               }
               return Mul;
            }
    }
