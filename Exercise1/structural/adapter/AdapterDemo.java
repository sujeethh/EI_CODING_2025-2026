package structural.adapter;
class OldRectangle{public void draw(int x1,int y1,int x2,int y2){System.out.println("Rect: ("+x1+","+y1+")-("+x2+","+y2+")");}}
interface Shape{void draw(int x,int y,int w,int h);}class RectangleAdapter implements Shape{private final OldRectangle adaptee=new OldRectangle();public void draw(int x,int y,int w,int h){adaptee.draw(x,y,x+w,y+h);}}
public class AdapterDemo{public static void run(){Shape r=new RectangleAdapter();r.draw(10,20,30,40);}}
