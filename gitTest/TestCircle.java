

/*
内存分析
 1.为下面Circle类添加一个方法，计算一个点（Point对象）是否在圆
 （Circle对象）内，并写程序验证。      
 2.确定一个方法有三点：
	一、方法的名字；
	二、方法的参数；
	三、方法的返回值
 （1）、名称为contain（包含），这用第三人称为contains     
 （2）、方法的参数为一个点所以为Point p
 （3）、返回值包不包含所以返回值为boolean类型    
 3.计算思想  该点到圆心的距离    
   遗留问题：把内存分析重新画一下
*/







class Point
{
	private double x;//成员变量
	private double y;//成员变量
	Point(double x1,double y1)//构造方法 同名且无返回值
	{ x = x1; y = y1; }
	public double getX(){return x;}
	public double getY(){return y;}
	public void setX(double i){x=i;}
	public void setY(double i){y=i;}
}

class Circle
{
	private Point o ;
	private double radius;
	Circle(Point p,double r)//构造方法1重载
	{ o = p; radius = r;}
	Circle(double r)//构造方法2重载
	{ o = new Point(0.0 ,0.0);
	  radius=r;		}
	boolean contains(Point p)//contain包含的意思
	{
		double x = p.getX()-o.getX();
		double y = p.getY()-o.getY();
		if ( x*x+y*y > radius*radius )
			return false;
		else return true;
	}
	public void setO(double x,double y)
		{ o.setX(x);o.setY(y);	}

	public Point getO(){return o ;}
	public double getRadius(){return radius;}
	public void setRadius(double r){radius=r;}
	public double area()
	{ return 3.14*radius*radius;}
}

public class TestCircle
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle(new Point(1.0,2.0),2.0);
		Circle c2 = new Circle(5.0);
		System.out.println("FF"+c1.getO().getX()+c1.getO().getY());
		System.out.println("c1:("+c1.getO().getX()+","
			+c1.getO().getY()+"),"+c1.getRadius());
		System.out.println("c2:("+c2.getO().getX()+","
			+c2.getO().getY()+"),"+c2.getRadius());
		System.out.println("c1 area = "+c1.area());
		System.out.println("c1 area = "+c2.area());
		c1.setO(5,6);
		c2.setRadius(9.0);
		System.out.println("c1:("+c1.getO().getX()+","
			+c1.getO().getY()+"),"+c1.getRadius());
		System.out.println("c2:("+c2.getO().getX()+","
			+c2.getO().getY()+"),"+c2.getRadius());
		System.out.println("c1 area = "+c1.area());
		System.out.println("c1 area = "+c2.area());

		Point p1 = new Point(5.2,6.3);
		System.out.println(c1.contains(p1));
		System.out.println(c1.contains(new Point(10.0,9.0)));
	}
}