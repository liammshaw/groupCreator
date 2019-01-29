
public class Student
	{
		private String name;
		private int spot;
		
		public Student(String n, int s) 
			{
				name = n;
				spot = s;
			}

		public String getName()
			{
					return name;
			}

		public void setName(String name)
			{
					this.name = name;
			}

		public int getSpot()
			{
					return spot;
			}

		public void setSpot(int spot)
			{
					this.spot = spot;
			}
	}
