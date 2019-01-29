import java.io.FileNotFoundException;

public class GroupRunner
	{
		public static void main(String[] args) throws FileNotFoundException
			{
				Grouping.importStudents();
				Grouping.findNumberOfGroups();
				Grouping.printStudents();
			}
	}
