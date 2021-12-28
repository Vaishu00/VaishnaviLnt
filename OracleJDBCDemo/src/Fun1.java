
public interface Fun1 {
void print();
default void show()
{
	System.err.println("show fun1");
}
static void dispaly()
{
	System.out.println("diplay fun1");
}
}
