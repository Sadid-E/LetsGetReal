public class RealNumber extends Number{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }
  //---------ONLY EDIT BELOW THIS LINE------------

  /*
   *Return a new RealNumber that has the value of:
   *the sum of this and the other
   */
  public RealNumber add(RealNumber other){
    RealNumber sum = new RealNumber(this.getValue() + other.getValue());
    return sum;
  }

  /*
   *Return a new RealNumber that has the value of:
   *the product of this and the other
   */
  public RealNumber multiply(RealNumber other){
    RealNumber sum = new RealNumber(this.getValue() * other.getValue());
    return sum;
  }

  /*
   *Return a new RealNumber that has the value of:
   *this divided by the other
   */
  public RealNumber divide(RealNumber other){
    RealNumber sum = new RealNumber(this.getValue() / other.getValue());
    return sum;
  }

  /*
   *Return a new RealNumber that has the value of:
   *this minus the other
   */
  public RealNumber subtract(RealNumber other){
    RealNumber sum = new RealNumber(this.getValue() - other.getValue());
    return sum;
  }

}
