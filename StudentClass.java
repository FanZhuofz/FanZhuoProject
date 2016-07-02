package test.java.fans;

/*�����༶��StudentClass��
���԰���     �༶���ƣ�name����������capacity����ѧ����student����ʵ��������size��
��������     ���췽����get������set������toString������ 
*/
//����ѧ���༶��StudentClass
public class StudentClass {
	private String name;						//�༶����
	static int capacity;						//�������
	private Student students[];					//ѧ��
	private int size;							//ʵ������
	
												//���췽��
	public StudentClass(String name,int size) {
		this.name=name;
		this.size=size;
		students = new Student[capacity];
	}

	public String getName() {
		return name;
	}
	
	public static int getCapacity() {
		return capacity;
	}
	
	public Student[] getStudents() {
		return students;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setSize(int size) {
		if(size>capacity){
			System.out.println("sizeΪ"+size+"���ܳ���"+capacity);
			return;
		}
		this.size = size;
	}
	//�ɱ�ڲ����ķ���������JDK5�����ϰ汾����
	public void setStudents(Student...students) {
		for(int i=0;i<size;i++){
			this.students[i]=new Student(students[i]);
		}
		this.size=students.length;
	}

	@Override
	public String toString() {
		String s;
		s = "�༶��" + name + "\t" + "������" + capacity + "\t" + "ʵ��������" + size + "\n\n";
		s = s + "ѧ��" + "\t" + "����" + "\t" + "Ӣ��" + "\t" + "��ѧ" + "\t" + "�����" + "\t" + "�ܳɼ�\n";
		for(int i=0;i<size;i++){
			s = s + students[i].getId()+"\t"+students[i].getName()+"\t"+students[i].getEng()+"\t"+students[i].getMath()+"\t"+students[i].getComp()+"\t"+students[i].getSum()+"\n";
		}
		return s;
	}
}
