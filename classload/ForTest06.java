/*
    for循环嵌套for循环

*/
public class ForTest06
{
	public static void main(String[]args)
		for (int i =1;i<=10;i++)//共循环十次
		{
           //循环体中可以编写其他控制语句
		   //控制语句可以嵌套使用
		   //控制语句可以是：if if...else switch for while do...whlie
           //最好不要想太多，即使循环体当中是一个for循环，不要将这个for特殊化，也只是一个普通的for循环
		   //只不过是一段符合java语法的代码
           //内层循环中的变量名和外层循环中的变量名不能重名。
           //这里是循环体，无论这个循环当中编写了什么代码，都得执行十遍。
            for (int j=0;j<3;j++)//执行十次0 1 2
            {
				System.out.println(j);
            }
		}
		 
}