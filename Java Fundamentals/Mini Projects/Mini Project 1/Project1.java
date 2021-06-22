
public class Project1 {
	public static void main(String[] args) {
		String Desination = null;
		int da = 0;
		String[][] empdetails=  {
				{"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
				{"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
				{"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
				{"1004", "Chahat", "29/01/2013", "r", "FrontDesk", "12000", "6000", "2000"},
				{"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
				{"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},
				{"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
			};
		String[][] datable= {
				{"e", "Engineer", "20000"},
				{"c", "Consultant", "32000"},
				{"k", "Clerk", "12000"},
				{"r", "Receptionist", "15000"},
				{"m", "Manager", "40000"}
			};
		for(int i=0;i<7;i++) {
			if(!empdetails[i][0].equals(args[0])) {
				System.out.println("There is no employee with empid : " + args[0]);
				break;
			}
			else {
				
			   for(int j=0;j<5;j++) {
				   if(datable[j][0].equals(empdetails[i][3])) {
					   Desination=datable[j][1];
					   da= Integer.parseInt(datable[j][2]);
				   }
			   }
				int salary=Integer.parseInt(empdetails[i][5])+Integer.parseInt(empdetails[i][6])+da-Integer.parseInt(empdetails[i][7]);
				System.out.printf("%-10s%-10s%-15s%-15s%-10s\n", "Emp No", "Emp Name", "Department", "Designation", "Salary");
				for (int x = 0; x < 80; x++) System.out.print("=");
				System.out.println();
				System.out.printf("%-10s%-10s%-15s%-15s%-10d",empdetails[i][0],empdetails[i][1],empdetails[i][4],Desination,salary);
				
			
			
		}
	}
}

	
		
	}

