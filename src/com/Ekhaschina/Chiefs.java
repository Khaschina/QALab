package com.Ekhaschina;


public abstract class Chiefs implements CompanysWorker{

	abstract int salary();

	public static int randomTask()
	{
		int rnd1 = (int) (Math.random () * ((3)));
		return rnd1;
	}

	protected String whomGiveTask(int tasksNumber)
	{
		if(tasksNumber == 0)
		{
			return "������ ���";
		}
		else if (tasksNumber == 1)
		{
			return "�������� �����";
		}
		else if (tasksNumber == 2)
		{
			return "����������� ���������";
		}
		else
			return "��������� ������ � �����";
	}
}
