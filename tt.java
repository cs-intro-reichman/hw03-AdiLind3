public class tt {


    public static void main(String[] args) 
    {
        double loan = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        int n = Integer.parseInt(args[2]);
        double epsilon = Double.parseDouble(args[3]);
		int iterationCounter=0;
        double initialGuess = loan/n;
        double balance = 0;
        double g = loan/n;
		double increment = epsilon;
		while(endBalance(loan, rate, n, g) > 0)
		{
			g = g+ increment;
			iterationCounter++;
		}
        System.out.println("the num of yearly payment" + g);

        public static double endBalance(double loan, double rate, int n, double payment) {
            for ( int i = 0 ; i <= n ; i++)
            {
                loan = (loan - payment) * (1 + (rate * 100));
            }
            return loan;
        }
           
    }
       
    

