import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] names = { "Wierd Al", "Eddie", "Londa", "Frieda", "Toby", "Grace Jones" };
		String[] homeTown = { "Weed", "Erie", "Estral Beach", "Centralia", "Tampa", "Zzyzx" };
		String[] favFood = { "Bannanas", "Meat", "Ginger", "Burritos", "Tostadas", "breakfast at Yeman Cafe" };


		System.out.println("Welcome to our class!");

		do {

		for (int i = 0; i < names.length; i++) { // length could be either array cause same size
			System.out.print((i + 1) + ". " + names[i] + " ");
		}


		int studentNum = Validator.getInt(sc, "\nPick a Student(1-6): ", 1, 6);
		System.out.print("Student " + studentNum + " is " + names[studentNum - 1]
				+ ". What else would you like to know about " + names[studentNum - 1]);
		

		String studentInfo = Validator.getString(sc, "? (enter \"hometown\" or \"favorite food\") \n");
		// ask about space and equals


		if (studentInfo.equalsIgnoreCase("hometown")) {
			System.out.println(names[studentNum - 1] + "'s hometown is " + homeTown[studentNum - 1] + ".");

		} else if (studentInfo.equalsIgnoreCase("favorite")) {
			System.out.println(names[studentNum - 1] + "'s favorite food is " + favFood[studentNum - 1] + ".");
		} else {
			System.out.println("That data does not exisit. Please enter \"hometown\" or \"favorite food\".");

			}
			System.out.println("\nDo you want to continue? (y/n)");

		} while (sc.next().equalsIgnoreCase("Y"));

		System.out.println("Thanks!");

		sc.close();


	}

}
