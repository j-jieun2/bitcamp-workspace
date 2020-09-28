package com.eomcs.basic.test;

class Test {
	String subject; // 필드 교과서명
	int point; // 필드 점수

	void setPoint(String s, int p) { // 점수를 설정하는 메소드
		subject = s;
		point = p;
	}

	String getPoint() { //한 과목의 점수를 가져오는 메소드
		return subject + ":" + point;
	}
}

class Cll {
	int id; // �ʵ� �л� ��ȣ
	String name; // �ʵ� �̸�
	int subnum; // �ʵ� ���� ��
	Test[ ] test; // �ʵ� �׽�Ʈ Ŭ������ ������Ʈ �迭

	Student(int i, String n, int s) { // ������
		id = i;
		name = n;
		subnum = s;
		test = new Test[s];
		for(int j = 0; j < s; j++)
			test[j] = new Test(); // �迭�� ��� �ϳ��ϳ��� ����
	} // new���� ������Ʈ�� ����

	String getName() { // �̸��� �������� �޼ҵ�
		return id + ":" + name;
	}

	int getGrade() { // ������ �������� �޼ҵ�
		int sum = 0;
		for(int i = 0; i < subnum; i++)
			sum += test[i].point;
		return sum;
	}

	// �޼ҵ��� �����ε�
	int getGrade(int a) { // ������ ���ϴ� �޼ҵ�
		int base = 100 * subnum / a;
		int rank = getGrade() / base + 1;
		return (rank �� a) ? a : rank; //rank�� a���� Ŭ ���� a��,
						//�� �ܴ̿� rank�� �����ݴϴ�.
	}

	void printScore() { // ������ ǥ���ϴ� �޼ҵ�
		System.out.println(getName( ));
		for(int i = 0; i < subnum; i++)
			System.out.print(test[i].getPoint( ) + " ");
		System.out.println( );
		System.out.println("���� " + getGrade( ));
		int rank = 5;
		System.out.println(rank + "�ܰ� ��" + getGrade(rank));
		System.out.println( );
	}
}
1
class ClassClroom {
	public static void main(String[] args) {
		Student kim = new Student(12, "������", 3);
		kim.test[0].setPoint("����", 95);
		kim.test[1].setPoint("����", 83);
		kim.test[2].setPoint("����", 76);
		kim.printScore( );

		Student lee = new Student(7, "�� ��", 3);
		lee.test[0].setPoint("����", 66);
		lee.test[1].setPoint("����", 97);
		lee.test[2].setPoint("����", 72);
		lee.printScore( );
	}
}