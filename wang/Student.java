//һ��1
//��ͼ��дһ��
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
	//����
	private String name;
	private int id;
	private int age;
	//������
	Student(){}//������Բ�Ҫ
	Student(String name,int id,int age){
		this.name = name;
		this.id = id;
		this.age = age;
	}
	//���ҽ��ܷ���
	public void introduceMyself(){
		System.out.println("name:"+this.name+" "+"id:"+this.id+" "+"age:"+this.age);
	}
	//�������Ҳ����д��������һ����Ŀ����ôд���һ��
	public String introduceMyself_rewrite(){
		return "name:"+this.name+" "+"id:"+this.id+" "+"age:"+this.age;
	}
	
	public static void main(String[] args){
		Student Tom = new Student("Tom",4556,18);
		Tom.introduceMyself();
		//���õ�ʱ������ô���õ�
		System.out.println(Tom.introduceMyself_rewrite());
	}
}
























