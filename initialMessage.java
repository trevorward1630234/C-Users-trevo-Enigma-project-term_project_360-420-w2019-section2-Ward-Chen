import java.util.Scanner; //to include 

public class initialMessage
{
	public static void main (String[] args)
	{
		int i = 1000000; //array size
		String[] TempMessArr = new String[i]; //TempMessArr = temporary initial Message array
		int count = 0;
		
		while(true){
			
			Scanner Keyboard = new Scanner(System.in);
			System.out.println("Please enter the message letter by letter. If the message is over, type '0'.");
			TempMessArr[i] = Keyboard.nextLine();
			count++;
			
			if(Keyboard.equals("0")){
				break;
		}}

		String[] inMessArr = new String[count];
		inMessArr = TempMessArr;
		

		System.out.print(inMessArr);
	}
}
