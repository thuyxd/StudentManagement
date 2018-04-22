package cudosoft.demo.excercises;

import java.util.Scanner;

public class AdmissionsManagement {

	public static void main(String[] args) {
		int option = 0;
		int number = 0;
		String identification = null;
		String confirm;
		Examinee examinee;
		Examinee[] examineeList = null;
		Scanner inputString = new Scanner(System.in);
		Scanner inputNumber = new Scanner(System.in);
		AdmissionsManagement management = new AdmissionsManagement();
		do {
			management.showMenu();
			option = inputNumber.nextInt();
			switch (option) {
			case 1: {
				do {
					System.out.println("Enter number of element: ");
					number = inputNumber.nextInt();
					if (number <= 0) {
						System.out.println("The number have to bigger zero. Please try again!!!");
					}
				} while (number <= 0);
				examineeList = new Examinee[number];
				management.inputExamineeList(examineeList);

				break;
			}
			case 2: {
				if (examineeList != null) {
					management.displayExamineeList(examineeList);
				} else {
					System.out.println("This is function execute after menu 1");
				}

				break;
			}
			case 3: {
				do {
					System.out.println("Enter identification: ");
					identification = inputString.nextLine();
					examinee = management.searchByIdentification(examineeList, identification);
					if (examinee != null) {
						management.displayExaminee(examinee);
					} else {
						System.out.println("Have not existing Examinee with " + identification);
					}
					
					System.out.println("Do you want to search other examinee? Y or N");
					confirm = inputString.nextLine();
				} while (!confirm.equalsIgnoreCase("N"));
				break;
			}

			case 0:
				break;
			}
		} while (option == 1 || option == 2 || option == 3);

	}

	private void showMenu() {
		System.out.println("Enter 1: Input information of examinee");
		System.out.println("Enter 2: Display information of examinee list");
		System.out.println("Enter 3: Search information of examinee by identification number");
		System.out.println("Enter 0: Exit program");
	}

	// This is method to enter Examinee list by call inputExaminee method
	private Examinee[] inputExamineeList(Examinee[] listExaminee) {
		for (int i = 0; i < listExaminee.length; i++) {
			Examinee examinee = new Examinee();
			System.out.println("Please enter information of Examinee " + (i+1) + ": ");
			listExaminee[i] = inputExaminee(examinee);
		}

		return listExaminee;
	}

	// This is method to enter only one Examinee
	private Examinee inputExaminee(Examinee examinee) {
		String block = null;
		Scanner inputNumber = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		BlockExamination blockExamination = new BlockExamination();

		System.out.println("Enter examinee's identification number: ");
		examinee.setIdentificationNumber(inputString.nextLine());
		System.out.println("Enter examinee's full name: ");
		examinee.setFullName(inputString.nextLine());
		System.out.println("Enter examinee's address: ");
		examinee.setAddress(inputString.nextLine());
		System.out.println("Enter examinee's priority: ");
		examinee.setPriority(inputNumber.nextFloat());
		System.out.println("Enter character A: Math, Physical, Chemistry");
		System.out.println("Enter character B: Math, Chemistry, Biology");
		System.out.println("Enter character C: Literary, History, Geography");
		System.out.println("Enter character D: Math, Literary, English");
		block = inputString.nextLine();
		examinee.setBlockExamination(blockExamination.inputBlockExamination(block));

		return examinee;
	}

	// This is method to display Examinee list by call displayExaminee()
	private void displayExamineeList(Examinee[] examinees) {
		for (Examinee examinee : examinees) {
			displayExaminee(examinee);
			System.out.println("=============================================");
		}
	}

	// This is method to display only one Examinee
	private void displayExaminee(Examinee examinee) {
		System.out.println("Identification number: " + examinee.getIdentificationNumber());
		System.out.println("Full name: " + examinee.getFullName());
		System.out.println("Address: " + examinee.getAddress());
		System.out.println("Priority: " + examinee.getPriority());
		System.out.println("Exams: " + examinee.getBlockExamination().getExamOne() + " - "
				+ examinee.getBlockExamination().getExamTwo() + " - " + examinee.getBlockExamination().getExamThree());
	}

	// This is method to search Examiness by identification
	private Examinee searchByIdentification(Examinee[] examinees, String identification) {
		for (Examinee examinee : examinees) {
			if (identification.equalsIgnoreCase(examinee.getIdentificationNumber())) {
				return examinee;
			}
		}

		return null;
	}

}
