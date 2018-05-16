class Rectangle
{
 public int l;
 public int b;
 public Rectangle (int l,int b)
 {
   this.l = l;
   this.b = b;
 }

 int getArea()
 {
  return l * b ;
 }
 int getPerimeter()
 {
  return 2 * (l+b) ;
 }

}

public class Rectangles
{
	public static void main (String args[])
	{
        int ar,pr;
	Rectangle r = new Rectangle(10,20);
	System.out.println("len:"+r.l+"  width:"+r.b);
	ar = r.getArea();
	pr = r.getArea();
	System.out.println("Area:"+ar+"\npermiter"+pr);
        
	}
}
