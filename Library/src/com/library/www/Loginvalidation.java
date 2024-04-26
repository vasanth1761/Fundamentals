package com.library.www;

import java.util.*;

public class Loginvalidation {

	public static void logincalc(String account, Library lib) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			if (account.equals("y") || account.equals("Y")) {
				System.out.println("---WELCOME TO LOGIN PAGE----");
				System.out.println("USERNAME:");
				String user = ValidationMainBody.usernamevalidation();

				System.out.println("PASSWORD:");
				String password = ValidationMainBody.passwordvalidation();

				long phonenmber = 97865432165l;
				int id = 101;
				lib.setName(user);
				lib.setPhonenumber(phonenmber);
				lib.setId(id);
				break;

			} else if (account.equals("N") || account.equals("n")) {
				System.out.println("---WELCOME TO SIGNUP PAGE----");
				System.out.println("Enter the user name:");
				String user = ValidationMainBody.usernamevalidation();

				System.out.println("create the password:");
				String passwor = ValidationMainBody.passwordvalidation();

				System.out.println("Enter the phonenumber:");
				Long phone = ValidationMainBody.phonenumbervalidation();

				int id = 101;
				lib.setName(user);
				lib.setPhonenumber(phone);
				lib.setId(id);
				lib.setName(user);
				break;
			} else {
				System.out.println("Enter the valid data:");
				account = sc.next();
			}

		}
	}

	public static void booktypes() {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b) {

			String book = sc.next();
			switch (book.toLowerCase()) {
			case "comics":
				System.out.println("---GREAT---");
				System.out.println("Available");
				System.out.println("1.IRONMAN" + "\n" + "2.SUPERMAN" + "\n" + "3.DEADPOOL");
				System.out.println("Select the type:");
				int type=ValidationMainBody.booktypevalid();
      
		        switch (type) {
				case 1:
					System.out.println("part 1 or part2");
					ValidationMainBody.bookpartvalidation();
					System.out.println("-The book is available-");
					break;
				case 2:
					System.out.println("part 1 or part2");
					ValidationMainBody.bookpartvalidation();
					System.out.println("-The book is available-");
					break;
				case 3:
					System.out.println("part 1 or part2");
					ValidationMainBody.bookpartvalidation();
					System.out.println("-The book is available-");
					break;
				default:
					System.out.println("The book is not available");
					System.out.println("Enter the proper book name");
				}
				
				b = false;
				break;
			case "horror":
				System.out.println("---GREAT---");
				System.out.println("Available");
				System.out.println("1.DRACULA" + "\n" + "2.IT" + "\n" + "3.PET SEMETARY");
				System.out.println("Select the type:");
				int horror = ValidationMainBody.booktypevalid();
				
					switch (horror)

					{
					case 1:
						System.out.println("part 1 or part2");
						ValidationMainBody.bookpartvalidation();
						System.out.println("-The book is available-");
						break;
					case 2:
						System.out.println("part 1 or part2");
						ValidationMainBody.bookpartvalidation();
						System.out.println("-The book is available-");
						break;
					case 3:
						System.out.println("part 1 or part2");
						ValidationMainBody.bookpartvalidation();
						System.out.println("-The book is available-");
						break;
					
				}
				b = false;
				break;
			case "science fiction":
				System.out.println("---GREAT---");
				System.out.println("Available");
				System.out.println("1.STATION ELEVAN" + "\n" + "2.DUNE" + "\n" + "3.THE MARTIAN");
				System.out.println("Select the type:");
				int science = ValidationMainBody.booktypevalid();;
				switch (science) {
				case 1:
					System.out.println("part 1 or part2");
					ValidationMainBody.bookpartvalidation();
					System.out.println("-The book is available-");
					break;
				case 2:
					System.out.println("part 1 or part2");
					ValidationMainBody.bookpartvalidation();
					System.out.println("-The book is available-");
					break;
				case 3:
					System.out.println("part 1 or part2");
					ValidationMainBody.bookpartvalidation();
					System.out.println("-The book is available-");
					break;
				}
				b = false;
				break;
			case "adventure":
				System.out.println("---GREAT---");
				System.out.println("Available");
				System.out.println("1.THE ROAD" + "\n" + "2.HARRY PORTER" + "\n" + "3.TREASURE ISLANDS");
				System.out.println("Select the type:");
				int adventure = ValidationMainBody.booktypevalid();;
				switch (adventure) {
				case 1:
					System.out.println("part 1 or part2");
					ValidationMainBody.bookpartvalidation();
					System.out.println("-The book is available-");
					break;
				case 2:
					System.out.println("part 1 or part2");
					ValidationMainBody.bookpartvalidation();
					System.out.println("-The book is available-");
					break;
				case 3:
					System.out.println("part 1 or part2");
					ValidationMainBody.bookpartvalidation();
					System.out.println("-The book is available-");
					break;
				}
				b = false;
				break;
			case "fantasy":
				System.out.println("---GREAT---");
				System.out.println("Available");

				System.out.println("1.GAME OF THRONES" + "\n" + "2.THE HOUSE OF DRAGONS" + "\n" + "3.CITY OF GLASS+" );
				System.out.println("Select the type:");
				int fantasy =ValidationMainBody.booktypevalid();
				switch (fantasy) {
				case 1:
					System.out.println("part 1 or part2");
					ValidationMainBody.bookpartvalidation();
					System.out.println("-The book is available-");
					break;
				case 2:
					System.out.println("part 1 or part2");
					ValidationMainBody.bookpartvalidation();
					System.out.println("-The book is available-");
					break;
				case 3:
					System.out.println("part 1 or part2");
					ValidationMainBody.bookpartvalidation();
					System.out.println("-The book is available-");
					break;
				}
				b = false;
			default:
				System.out.println("Enter the valid data");

			}
		}
	}

	public static void toselectadddelte(int adddelete)

	{
		Scanner sc = new Scanner(System.in);
		switch (adddelete) {
		case 1:
			System.out.println("TOTAL ROWS:50");
			System.out.println("SELECT THE ROW");
			ValidationMainBody.rows();
			System.out.println("How many books");
			int book = ValidationMainBody.books();
			String a[] = new String[book];
			for (int i = 0; i < book; i++) {
				System.out.println("Enter the book name " + (i + 1));
				a[i] = sc.next();
			}

			System.out.println("----The books has successfully added-----");

			return;
		case 2:
			System.out.println("TOTAL ROWS:50");
			System.out.println("SELECT THE ROW");
			ValidationMainBody.rows();
			System.out.println("How many books");
			int book1 = ValidationMainBody.books();
			String b[] = new String[book1];
			for (int i = 0; i < book1; i++) {
				System.out.println("Enter the book name " + (i + 1));
				b[i] = sc.next();
			}

			System.out.println("----The books has successfully deleted-----");

			break;

		}

	}
}
