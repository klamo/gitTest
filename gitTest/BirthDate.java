//马士兵老师在内存解析_2中的例子

//clone 提交

class BirthDate {	//建立类
	private int day;//静态变量
	private int month;
	private int year;
	public BirthDate(int d,int m,int y)//构造函数
	{day = d; month = m; year = y;}
	public void setDay(int d)//设置日
	{day = d;}
	public void setMonth(int m)//设置月
	{month = m;}
	public void setYear(int y)//设置年
	{year = y;}
	public int getDay()//获取日
	{return day;}
	public int getMonth()//获取月
	{return month;}
	public int getYear()//获取年
	{return year;}
	public void display()//打印
	{System.out.println
		(day+"-"+month+"-"+year);}
}

class BirthDateDemo	//建立对象
{
	public static void main(String[] args)
	{
		BirthDateDemo test = new BirthDateDemo();//建立Test对象
		int date = 9 ;
		BirthDate d1 = new BirthDate(7,7,1998);//建立新对象
		BirthDate d2 = new BirthDate(1,1,2000);//建立新对象
		test.change1(date);
		test.change2(d1);
		test.change3(d2);
		System.out.println("date="+date);
		d1.display();
		d2.display();
	}
	public void change1(int i)
	{i=1234;}
	public void change2(BirthDate b)
	{b=new BirthDate(22,2,2004);}
	public void change3(BirthDate b)
	{b.setDay(22);}
}
