class human 
{
	double height;
	double weight;
	double age;
	double ratio()
	{
		return weight/height;
	}
	void dispAge()
	{
		System.out.println("the AGEIS :"+age);
	}
	human(double w,double h,double a)
	{
		weight=w;
		height=h;
		age=a;
	}
}
class Hum1
{
	public static void main(String args[])
	{
		human h1 =new human(58,5.9,32);
		h1.dispAge();
		System.out.println("the ratio is:"+h1.ratio());
	}

}