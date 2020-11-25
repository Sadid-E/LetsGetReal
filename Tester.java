public class Tester{

  public static void main(String[] args) {
    RealNumber a = new RealNumber(100);
    RealNumber b = new RealNumber(100.001);
    RealNumber c = new RealNumber(100.01);
    RealNumber d = new RealNumber(0);
    RealNumber e = new RealNumber(0);
    RealNumber f = new RealNumber(0.00000001);
    RealNumber g = new RealNumber(3.5);
    RealNumber h = new RealNumber(3.500000001);
    System.out.println(a.equals(b));
    System.out.println(a.equals(c));
    System.out.println(b.equals(c));
    System.out.println(d.equals(e));
    System.out.println(d.equals(f));
    System.out.println(g.equals(h));
    System.out.println(a.add(h));
    System.out.println(d.add(g));
    System.out.println(a.multiply(h));
    System.out.println(d.multiply(g));
    System.out.println(a.divide(h));
    System.out.println(d.divide(g));
    System.out.println(g.divide(d));
    System.out.println(a.subtract(h));
    System.out.println(d.subtract(g));
    RationalNumber i = new RationalNumber(3,5);
    RationalNumber j = new RationalNumber(13,11);
    RationalNumber k = new RationalNumber(3,0);
    RationalNumber l = new RationalNumber(4,-7);
    RationalNumber m = new RationalNumber(-4,7);
    RationalNumber n = new RationalNumber(210,45);
    RationalNumber o = new RationalNumber(-270,192);
    System.out.println(i);
    System.out.println(j);
    System.out.println(k.getNumerator());
    System.out.println(k.getDenominator());
    System.out.println(l.getNumerator());
    System.out.println(l.getDenominator());
    System.out.println(i.reciprocal());
    System.out.println(j.reciprocal());
    System.out.println(i.equals(j));
    System.out.println(l.equals(m));
    System.out.println(l.toString());
    System.out.println(k.toString());
    System.out.println(n);
    System.out.println(o);
    System.out.println(i.multiply(j));
    System.out.println(n.divide(o));
    System.out.println(i.add(j));
    System.out.println(n.subtract(o));
    System.out.println(l.compareTo(m));
    System.out.println(a.compareTo(g));
    System.out.println(i.compareTo(j));
  }

}
