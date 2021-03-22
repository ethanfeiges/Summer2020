package Day7;

public class InterfaceConcreteDemo implements InterfaceDemo
{

	public static void main(String[] args)
	{
		InterfaceDemo demo = new InterfaceConcreteDemo();
		execute(demo);
	}
	
	public static void execute (InterfaceDemo param)
	{
		param.doDemo(5);
	}
	public void doDemo(int param)
	{
		System.out.println("Done did demo" + param);
	}

}
