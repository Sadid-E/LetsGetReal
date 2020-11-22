public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *  If the denominator is negative, negate both numerator and denominator
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);
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

}
