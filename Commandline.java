class Commandline
{
	public static void main(String args [])
	{

		System.out.println(args.length > 0 ? "Command-line arguments are : ":"No command-line arguments were passed :");
		for(int i=0;i < args.length;i++)
		{
			System.out.println("Argument "+(i+1)+" : "+args[i]);
		}

	/*	if(args.length > 0);
		{
			System.out.println("Command line arguments are : ");
			
			for(int i=0;i<args.length;i++)
			{
				System.out.println("Argument "+(i+1)+" : "+args[i]);
			}
		}
		else
		{
			System.out.println("No argument is there.");
		}   */

	}
}