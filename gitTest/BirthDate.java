//��ʿ����ʦ���ڴ����_2�е�����

class BirthDate {	//������
	private int day;//��̬����
	private int month;
	private int year;
	public BirthDate(int d,int m,int y)//���캯��
	{day = d; month = m; year = y;}
	public void setDay(int d)//������
	{day = d;}
	public void setMonth(int m)//������
	{month = m;}
	public void setYear(int y)//������
	{year = y;}
	public int getDay()//��ȡ��
	{return day;}
	public int getMonth()//��ȡ��
	{return month;}
	public int getYear()//��ȡ��
	{return year;}
	public void display()//��ӡ
	{System.out.println
		(day+"-"+month+"-"+year);}
}

class BirthDateDemo	//��������
{
	public static void main(String[] args)
	{
		BirthDateDemo test = new BirthDateDemo();//����Test����
		int date = 9 ;
		BirthDate d1 = new BirthDate(7,7,1998);//�����¶���
		BirthDate d2 = new BirthDate(1,1,2000);//�����¶���
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
