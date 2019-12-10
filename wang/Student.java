//一、1
//类图简单写一下
/*
 * -name:String
 * -id:int
 * -age:int
 * -------------
 * +Student()
 * +Student(name:String,id:int,age:int)
 * +introduceMyself():void
*/
class Student{
	//属性
	private String name;
	private int id;
	private int age;
	//构造器
	Student(){}//这个可以不要
	Student(String name,int id,int age){
		this.name = name;
		this.id = id;
		this.age = age;
	}
	//自我介绍方法
	public void introduceMyself(){
		System.out.println("name:"+this.name+" "+"id:"+this.id+" "+"age:"+this.age);
	}
	//这个方法也可以写成这样，一般项目里这么写会好一点
	public String introduceMyself_rewrite(){
		return "name:"+this.name+" "+"id:"+this.id+" "+"age:"+this.age;
	}
	
	public static void main(String[] args){
		Student Tom = new Student("Tom",4556,18);
		Tom.introduceMyself();
		//调用的时候是这么调用的
		System.out.println(Tom.introduceMyself_rewrite());
	}
}
























