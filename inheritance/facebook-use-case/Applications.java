class Meta
{
	void methodMeta()
	{
		System.out.println("Meta is Parent class of facebook company");
	}
}

class Facebook extends Meta
{
	void methodFacebook()
	{
		System.out.println("Facebook is chlid company of Meta");
	}
}

class Instagram extends Facebook
{
	void methodInstagram()
	{
		System.out.println("Instagram is derived company of Facebook");
	}
}

class Applications
{
	public static void main(String[] args)
	{
		System.out.println("Showing  multilevel inheritance in company");
 		Instagram ob1=new Instagram();
 		ob1.methodMeta();
 		ob1.methodFacebook();
	 	ob1.methodInstagram();
	}
}