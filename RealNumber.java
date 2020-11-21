public class RealNumber{
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
  *Return true when the values are within 0.001% of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(RealNumber other){
    if (this.getValue() == other.getValue()) {
      return true;
    }
    if (this.getValue() != 0 && other.getValue() != 0) {
      if (Math.abs((this.getValue() - other.getValue()) / other.getValue()) <= .00001) {
        return true;
      }
    }
    return false;
  }

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

}
