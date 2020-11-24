public class RationalNumber extends Number{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *  If the denominator is negative, negate both numerator and denominator
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super();
    if (deno == 0) {
      nume = 0;
      deno = 1;
    }
    if (deno < 0) {
      nume = nume * -1;
      deno = deno * -1;
    }
    numerator = nume;
    denominator = deno;
    reduce();
  }

  public double getValue(){
    return ((double) numerator / (double) denominator);
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }

  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }

  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber reciprocal = new RationalNumber(denominator, numerator);
    return reciprocal;
  }

  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return (this.getNumerator() == other.getNumerator() &&
            this.getDenominator() == other.getDenominator());
  }

  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    if (denominator == 1) {
      return "" + numerator;
    } else
    return numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    int gcd = 1;
    for (int i = 1; i <= Math.max(a,b); i++) {
      if (a % i == 0 && b % i == 0) {
        gcd = i;
      }
    }
    return gcd;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int n = numerator;
    int d = denominator;
    numerator = numerator / gcd(n,d);
    denominator = denominator / gcd(n,d);
  }

  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    RationalNumber p = new RationalNumber(this.getNumerator()*other.getNumerator(),
                                          this.getDenominator()*other.getDenominator());
    return p;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber d = new RationalNumber(this.getNumerator()*other.getDenominator(),
                                          this.getDenominator()*other.getNumerator());
    return d;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    RationalNumber a = new RationalNumber((this.getNumerator()*other.getDenominator()) +
                                          (other.getNumerator()*this.getDenominator()),
                                           this.getDenominator()*other.getDenominator());
    return a;
  }

  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    RationalNumber s = new RationalNumber((this.getNumerator()*other.getDenominator()) -
                                          (other.getNumerator()*this.getDenominator()),
                                           this.getDenominator()*other.getDenominator());
    return s;
  }

}
