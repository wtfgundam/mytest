
//测试程序
public class OOTest05
{
	public static void main(String[]args){
	
	    Customer c = new Customer();
		u.g(c.id);

		c = null;
		//以下程序可以编译通过，因为符合语法
		//空引用访问实例相关的数据一定会出现空指针异常
		//java.lang.NullPointerException
	    u.g(c.id);	
	
	}
}


//实例相关的数据表示：这个数据访问的时候必须有对象的参与，
//这种数据就是实例相关的数据