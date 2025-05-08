import Graphics.*;
import java.util.*;
class main
{
  public static void main(String args[])
  {
    rectangle rect=new rectangle();
    square squ=new square();
    circle cir=new circle();
    triangle tri=new triangle();
    rect.area();
    squ.area();
    cir.area();
    tri.area();
    rect.display();
    squ.display();
    cir.display();
    tri.display();
  }
}
