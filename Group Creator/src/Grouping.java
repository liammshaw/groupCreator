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
		static ArrayList<Student> students = new ArrayList<Student>();
		static ArrayList<String> groups = new ArrayList<String>();
		static ArrayList<String[] > groupsTest = new ArrayList<String[]>();
		
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
		
//		public static void findNumberOfGroups()
//		{
//			System.out.println("How many groups would you like to make?");
//			numberOfGroups = userInt.nextInt();
//			int remainder;
//			for(int i =0;i < students.size(); i++)
//				{
//					remainder = (students.get(i).getSpot() % numberOfGroups);
//					//System.out.println(remainder);
//					if(remainder == 1)
//						{
//							groups.add(students.get(i).getName());
//							//group[i]= students.get(i).getName();
//						}
//					else if(remainder == 2);
//				}
//			System.out.println(groups.size());
//		}
		public static void printStudents()
		{
//			for(Student s:students)
//				{
//					System.out.println(s.getName() + "" + s.getSpot());
//				}
			for(String s:groups)
				{
					System.out.println(s);
				}
		}
		public static void findNumberOfGroups()
		{
			System.out.println("How many groups would you like to make?");
			numberOfGroups = userInt.nextInt();
			groupSize = students.size()/numberOfGroups;
			remainder = students.size() - (numberOfGroups*groupSize);
			bigGroup = remainder;
			smallGroup = numberOfGroups-remainder;
			
			//String[] group = new String[students.size()/numberOfGroups];

			for(int i =0;i < students.size(); i++)
				{
					int remainder = (students.get(i).getSpot() % numberOfGroups);
					//System.out.println(remainder);
					if(remainder == 1)
						{
							//group[i] = students.get(i).getName();
						}
				}
		}
	}
