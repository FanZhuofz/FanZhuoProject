package test.java.fans;
/*��������������Tester1������Keyboard�����������3����3-14����Ϊ���Լ򵥣�
 �����ɾ���5��ѧ���İ༶��5��ѧ������Ϣ�Ӽ������룬Ϊ�˱����Ժ����ظ����룬�ɽ������ѧ����Ϣ
 ���浽�ļ����С��������£�*/
//Tester1.java
import java.io.*;
public class Tester {
	public static void main(String[] args) {
		Student students[];
		StudentClass aClass = new StudentClass("��� 0201",5);
		students = new Student[aClass.getSize()];
		for(int i=0;i<aClass.getSize();i++){
			students[i] = new Student(getAstudent(i+1));
		}
		//StudentClasss��setStudents�����β�Ϊ�ɱ䳤����������ʵ��Ϊ����
		aClass.setStudents(students);
		String sss = aClass.toString();
		System.out.println(aClass);
		//��ѧ����Ϣ���浽�ļ�stu.ser��
		try{
			FileOutputStream fo = new FileOutputStream("stu.ser");
			ObjectOutputStream so = new ObjectOutputStream(fo);
			for(Student s:students){
				so.writeObject(s);
			}
			so.close();
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
	public static Student getAstudent(int i){
		Student studenti;
		System.out.println("�����"+i+"ѧ������Ϣ��");
		System.out.print("������");
		String name = Keyboard.getString();
		
		System.out.print("ѧ�ţ�");
		String id = Keyboard.getString();
		
		System.out.print("Ӣ��ɼ���");
		int eng = Keyboard.getInteger();
		
		System.out.print("��ѧ�ɼ���");
		int math = Keyboard.getInteger();
		
		System.out.print("������ɼ���");
		int comp = Keyboard.getInteger();
		
		studenti = new Student(id,name,eng,math,comp);
		return studenti;
	}

}
