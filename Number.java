public abstract class Number{
  public abstract double getValue();

  /*return 0 when this Number equals the other RealNumber
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number other){
    //TO BE IMPLEMENTED
    if (this.equals(other)) {
      return 0;
    }
    if (this.getValue() < other.getValue()) {
      return -1;
    }
      return 1;
  }

  /*
  *Return true when the % difference of the values
  *are within 0.00001 of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(Number other){
    //TO BE IMPLEMENTED  }
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

}
