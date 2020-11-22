public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);
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

}
