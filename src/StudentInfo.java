import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] names = { "Wierd Al", "Fred", "Londa", "Frieda", "Toby", "Connie" };
		String[] homeTown = { "Weed", "Erie", "Estral Beach", "Centralia", "Tampa", "Zzyzx" };
		String[] favFood = { "Bannanas", "Tacos", "Ginger", "Burritos", "Tostadas", "Yeman Cafe breakfast" };


		System.out.println("Welcome to our class!");

		for (int i = 0; i < names.length; i++) { // length could be either array cause same size
			System.out.print((i + 1) + ". " + names[i] + " ");
		}


		int studentNum = Validator.getInt(sc, "\nPick a Student(1-6): ", 1, 6);
		System.out.print("Student " + studentNum + " is " + names[studentNum - 1]
				+ ". What else would you like to know about " + names[studentNum - 1]);
		


		String studentInfo = Validator.getString(sc, "? (enter \"hometown\" or \"favorite food\") \n");

		String[] ff = studentInfo.split(" ");

		if (studentInfo.equalsIgnoreCase("hometown")) {
			System.out.println(names[studentNum - 1] + "'s hometown is " + homeTown[studentNum - 1] + ".");

		} else if (studentInfo.equalsIgnoreCase("favorite")) {
			System.out.println(names[studentNum - 1] + "'s favorite food is " + favFood[studentNum - 1] + ".");
		} else {
			System.out.println("error");

		}


	}

}
