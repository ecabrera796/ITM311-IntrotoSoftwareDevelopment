public class Fraction
{
    int num, den; 

    //default constructor
    public Fraction()
    {
        num = 1;
        den = 1;
    }
    //overloaded constructor 
    public Fraction(int n, int d)
    {
        num = n;
        if (d==0) 
        {
            System.out.println( "error- division by zero");
            System.exit(0); // terminate program if division by 0  
        }
        else
            den = d;
    }
    public Fraction Sum(Fraction someFraction)
    {
        int n = someFraction.den+someFraction.num*den;
        int d = den*someFraction.den;
        return new Fraction(n/gcd(n,d),d/gcd(n,d));  //return refreshed member values 
    }


    public Fraction Difference(Fraction someFraction)
    {
     //code function definition 
        int n = someFraction.den-someFraction.num*den;
        int d = den*someFraction.den;
        return new Fraction(n/gcd(n,d),d/gcd(n,d));
    }
    public Fraction Multiply(Fraction someFraction)
    {
     //code function definition
        int n = num * someFraction.num;
        int d = den*someFraction.den;
        return new Fraction(n/gcd(n,d),d/gcd(n,d));
    }
    public Fraction Division(Fraction someFraction)
    {
     //code function definition 
    	int n = num * someFraction.den;
        int d = den*someFraction.num;
        return new Fraction(n/gcd(n,d),d/gcd(n,d));
    }

    //find and return greatest common denominator
    public int gcd(int n, int d)
    {
        int remainder;
        while (d != 0)
        {
            remainder = n % d;
            n = d;
            d = remainder;
        }
        return n;
    }
    public void display() // Display method
    {
    	int n = this.num;
    	int d = this.den;
    	System.out.println(n + "/" + d);
    }

    public static void main(String [] args)
    {
 
    Fraction frac1 = new Fraction(1,2);
    Fraction frac2 = new Fraction(1,4);
    Fraction fracResult = new Fraction();

    fracResult = frac1.Sum(frac2); // Result 3/4
    fracResult.display();  
    
    //finish coding to call the Difference, Multiply and division functions
    
    fracResult = frac1.Difference(frac2); // Result 1/4
    fracResult.display();
    
    fracResult = frac1.Multiply(frac2); // Result 1/8
    fracResult.display();
    
    fracResult = frac1.Division(frac2); // Result 2/1
    fracResult.display();
    
    //include also the call to the display function for additional results

    }//end main
}//end class