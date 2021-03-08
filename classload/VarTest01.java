/*
   关于java语言当中的变量

     1、什么是变量？
        *变量本质上来说是内存中的一块空间，这块空间有"数据类型"、有"名字"、有"字面值"。
		*变量包含三部分：数据类型、名称、字面值【数据】。
		*变量是内存中存储数据的最基本的单元。

     2、数据类型的作用？
	    *不同的数据有不同的类型，不同的数据类型底层会分配不同大小的空间和。
		*数据类型是指导程序在运行阶段应该分配多大的内存空间。

     3、变量要求：变量中存储的具体的“数据”必须和变量的“数据类型”一致，当不一致的时候编译报错。

	 4、声明/定义变量的语法格式：
	     数据类型  变量名；
		    *数据类型：目前还没学，但是提前告诉大家有一种数据类型叫整数型，叫int。
			*变量名：只要是合法的标识符就行。规范中要求：首字母小写。后面每个单词首字母大写。
			例如：
                int i；
				int age；
				int length；
				int size；
				int num；

				其中int是数据类型， i，age等都是变量名
			      
	 
	 5、变量声明之后怎么赋值？
	   语法格式：

	       变量名 = 字面值；

	   要求：字面值的数据类型必须和变量的数据类型一致。
	   = 等号是一个运算符，叫做赋值运算符，赋值运算符先运算等号右边的表达式，表达式执行结束之后的
	   结果赋值给左边的变量。

	  6、声明和赋值可以放到一起完成。
	  例： int i = 10；

	  7、变量赋值之后，可以重新赋值，变量的值可变化；
	  int i = 10；
	  System.out.println（i);//10
	  i = 20
	  System.out.println（i);//20
	  i = 100；
	  System.out.println（i);//100

	  8、有了变量的概念之后，内存空间得到了重复的使用。
	    int i = 10;
		System.put.println（i）;
		...
		....
		system.out.println(i);

      9、通常访问一个变量包括两种访问形式；
	   *第一种：读取变量中保存的具体数据 get/获取
	   *第二种：修改变量中保存的具体数据 set/设置
	   i = 20；//set
	   
	   System.ou.println(i);//get
	   10、变量可以在一行上声明多个
	     int a，b，c；

	   11、变量必须先声明，在赋值，才能访问。
	      int i;程序执行到这里，内存空间并没有开辟出来，变量i并没有初始化。所以没有赋值之前无法访问

*/

public class VarTest01{

public static void main(String[] args){
      //声明一个int类型的变量，起名i
	   int i;
	   i=100;
	   System.out.println(i);
	   
	   //再次重新赋值
	   i = 200;
	   System.out.println(i);

	   //一行上可以同时声明多个变量
	   //a和b没初始化，c赋值300
	   int a,b,c = 300;
	   a = 0;
	   b = 1;
	   System.out.println(a);
	   
	   System.out.println(b);
	   
	   System.out.println(c); 


   }
}