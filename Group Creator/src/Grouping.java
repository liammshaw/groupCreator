import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Grouping
	{
		static Scanner userInt = new Scanner(System.in);
		static int numberOfGroups;
		static int remainder;
		static int bigGroup;
		static int groupSize;
		static int smallGroup;
		static int numberOfBigGroups;
		static String[] group1;
		static String[] bigGroup1;
		static ArrayList<Student> students = new ArrayList<Student>();
		
		public static void importStudents() throws FileNotFoundException
		{
			int counter =1;
			Scanner names = new Scanner(new File("StudentNames.txt"));
			while(names.hasNext())
				{
					students.add(new Student(names.nextLine(),counter));
					counter++;
				}
		}
		
		public static void findNumberOfGroups()
		{
			System.out.println("How many groups would you like to make?");
			numberOfGroups = userInt.nextInt();
			groupSize = students.size()/numberOfGroups;
			remainder = students.size() - (groupSize*numberOfGroups);
			bigGroup = 1+groupSize;
			numberOfBigGroups = remainder;
			group1 = new String[numberOfGroups-numberOfBigGroups];
			bigGroup1 = new String[numberOfBigGroups];
			int counter =0;
			//System.out.println(groupSize + " " + remainder);
			for(int r = 0; r < (numberOfGroups-numberOfBigGroups); r++)
				{
					group1[r] = "";
					for(int c = 0; c < groupSize; c++)
						{
							if(counter < 22)
								{
									group1[r] += students.get(counter).getName();
								}
							counter++;
						}
					
				}
			for(int r = 0; r < numberOfBigGroups; r++)
				{
					bigGroup1[r] = "";
					for(int c = 0; c < bigGroup; c++)
						{
							if(counter < 22)
								{
									bigGroup1[r] += students.get(counter).getName();
								}
							counter++;
						}
					
				}
			System.out.println();
			System.out.println("Project #1");
			System.out.println();
			for(int i = 0; i < numberOfGroups-numberOfBigGroups;i++)
				{
					System.out.println(group1[i]);
					System.out.println(group1[i].length());
				}
			for(int i =0; i < numberOfBigGroups;i++)
				{
					System.out.println(bigGroup1[i]);
					System.out.println(bigGroup1[i].length());
				}
			
			//System.out.println(groups[4]);
			//System.out.println(groups[5]);
		}
		public static void printStudents()
		{
//			for(Student s:students)
//				{
//					System.out.println(s.getName() + "" + s.getSpot());
//				}
//			for(int i = 0; i < groups.length;i++)
//				{
//					System.out.println(groups[i]);
//				}
		}
	}
