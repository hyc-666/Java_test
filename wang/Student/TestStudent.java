/*
 * class Stu
 * -name；String
 * -sex:char
 * age:int
 * ----------
 * +toString():String
 */ 
 
class Stu{
	private String name;
	private char sex;
	private int age;
	Stu(){}
	Stu(String name,char sex,int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getName(){
		return this.name;
	}
	public char getSex(){
		return this.sex;
	}
	public int getAge(){
		return this.age;
	}
	public String toString(){
		return "姓名："+getName()+" "+"性别："+getSex()+" "+"年龄："+getAge();
	}
}
/*class Student
  * -number:long
  * -phi:int
  * -eng:int
  * -comp:int
  * --------------
  * +aver():double
  * +max():int
  * +min():int
  * +toString():String
  * */
class Student extends Stu{
	private long number;
	private int phi;
	private int eng;
	private int comp;
	
	Student(){}
	Student(String name,char sex,int age,long number,int phi,int eng,int comp){
		super(name,sex,age);
		this.number = number;
		this.phi = phi;
		this.eng = eng;
		this.comp = comp;
	}
	public double aver(){
		return (double)((phi+eng+comp)/3.0);
	}
	public int max(){
		if(this.eng>=this.phi&&this.eng>=this.comp){
			return this.eng;
		}
		if(this.phi>=this.eng&&this.phi>=this.comp){
			return this.phi;
		}
		if(this.comp>=this.eng&&this.comp>=this.phi){
			return this.comp;
		}
		return 0;
	}
	public int min(){
		if(this.eng<=this.phi&&this.eng<=this.comp){
			return this.eng;
		}
		if(this.phi<=this.eng&&this.phi<=this.comp){
			return this.phi;
		}
		if(this.comp<=this.eng&&this.comp<=this.phi){
			return this.comp;
		}
		return 0;
	}
	@Override
	public String toString(){
			return "学号："+this.number+" 姓名："+super.getName()+" 性别："+
			super.getSex()+" 年龄："+super.getAge()+" 平均分："+
			this.aver()+" 最高分："+this.max()+" 最低分："+this.min();
	}
}
public class TestStudent{
	public static void main(String[] args){
		Stu Lili=new Student("李丽",'女',20,200501,95,87,270-95-87);
		System.out.println(Lili.toString());
	}
}
