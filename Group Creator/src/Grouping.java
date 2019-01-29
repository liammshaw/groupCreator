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
		static String[] groups;
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
			bigGroup = remainder+groupSize;
			groups = new String[numberOfGroups];
			int counter =0;
			//System.out.println(groupSize + " " + remainder);
			for(int r = 0; r < numberOfGroups; r++)
				{
					groups[r] = "";
					for(int c = 0; c < groupSize; c++)
						{
							if(counter < 22)
								{
									groups[r] += students.get(counter).getName();
								}
							counter++;
						}
					
				}
			
			//System.out.println(groups[4]);
			//System.out.println(groups[5]);
		}
		public static void printStudents()
		{
			for(Student s:students)
				{
					System.out.println(s.getName() + "" + s.getSpot());
				}
			for(int i = 0; i < groups.length;i++)
				{
					System.out.println(groups[i]);
				}
		}
	}
