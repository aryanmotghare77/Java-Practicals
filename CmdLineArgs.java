class CmdLineArgs
{
	public static void main(String[]args)
	{
		int length = args.length;
		if(length<=0)
		{
			System.out.println("You need to enter some Argument");
		}
		for(int i=0;i<length;i++)
		{
			System.out.println(args[i]);
		}
	}
}