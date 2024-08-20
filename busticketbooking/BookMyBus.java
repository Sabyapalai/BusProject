package com.test.busticketbooking;

import java.util.Scanner;

public class BookMyBus {
	static Scanner sc = new Scanner(System.in);

	static void printBanner() {
		System.out.println(
				"   🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌 ");
		System.out.println(
				"   🚌             R R R R     E E E E E    D D D D D           B B B B     U           U    S S S S S         🚌");
		System.out.println(
				"   🚌             R      R    E            D         D         B       B   U           U   S                  🚌");
		System.out.println(
				"   🚌             R      R    E            D          D        B       B   U           U   S                  🚌");
		System.out.println(
				"   🚌             R R R R     E E E        D          D        B B B B     U           U    S S S S S         🚌");
		System.out.println(
				"   🚌             R   R       E            D          D        B       B   U           U             S        🚌");
		System.out.println(
				"   🚌             R     R     E            D         D         B       B    U         U              S        🚌");
		System.out.println(
				"   🚌             R       R   E E E E E    D D D D D           B B B B        U U U U       S S S S S         🚌");
		System.out.println(
				"   🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌\n\n");

	}

	public static void selectLocation() {
		System.out.println("🚌🚌🚌🚌🚌🚌🚌🚌🚌Our bus only from Hydrabad to Other state🚌🚌🚌🚌🚌🚌🚌🚌🚌\n\n");
		System.out.println("🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌 Home Page 🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌🚌\n");
		System.out.println("1.Hydrabad to Odisha-----------> 18hr 24min (891.8km).");
		System.out.println("2.Hydrabad to karnataka--------> 9hr 24min (452.6km).");
		System.out.println("3.Hydrabad to Bihar------------> 27hr (1,533.2km).");
		System.out.println("4.Hydrabad to Maharastra-------> 9hr 21min (532.9km).");
		System.out.println("5.Hydrabad to Kerala-----------> 20hr 30min (1,117.7km).");
		System.out.println("6.Hydrabad to Andhra-----------> 5hr 43min (292.4km).");
		System.out.println("7.Hydrabad to Tamilnadu--------> 15hr 19min (867.6km).");
		System.out.println("8.Hydrabad to Uttr Pradesh-----> 26hr (1,398.3km).");
		System.out.println("9.Hydrabad to Chhatisgarh------> 15hr 3min(741.7km).");
		System.out.println("10.Exit.");
		System.out.println("Please Enter The Above Number only:");
		System.out.println("-------------------------------");
		System.out.println();
		int choose = sc.nextInt();
		int noOfTry = 1;
		while (choose > 10 || choose < 1) {
			noOfTry++;
			if (noOfTry <= 3) {
				System.out.println("Please Enter The Above Number only:");
				System.out.println("-------------------------------");
				System.out.println();
				choose = sc.nextInt();
			} else {
				throw new RuntimeException(" Try again After Some Time");
			}
		}
		chooseYourClass(choose);
	}

	static void chooseYourClass(int locationCode) {

		switch (locationCode) {
		case 1:
			System.out.println("Ok your chioce is Hydrabad to Odisha.");
			System.out.println("Hydrabad to Odisha:- (891.8km).\n");
			chooseAcNonAc();
			break;

		case 2:
			System.out.println("Ok your chioce is Hydrabad to Karnataka.");
			System.out.println("Hydrabad to Karnataka:- (452.6km).\n");
			chooseAcNonAc();
			break;

		case 3:
			System.out.println("Ok your chioce is Hydrabad to Bihar.");
			System.out.println("Hydrabad to Bihar:- (1,533.2km).\n");
			chooseAcNonAc();
			break;
		case 4:
			System.out.println("Ok your chioce is Hydrabad to Maharastra.");
			System.out.println("Hydrabad to Maharastra:- (532.9km).\n");
			chooseAcNonAc();
			break;
		case 5:
			System.out.println("Ok your chioce is Hydrabad to Kerala.");
			System.out.println("Hydrabad to Kerala:- (1,117.7km).\n");
			chooseAcNonAc();
			break;
		case 6:
			System.out.println("Ok your chioce is Hydrabad to Andhra.");
			System.out.println("Hydrabad to Andhra:- (292.4km).\n");
			chooseAcNonAc();
			break;
		case 7:
			System.out.println("Ok your chioce is Hydrabad to Tamilnadu.");
			System.out.println("Hydrabad to Tamilnadu:- (867.6km).\n");
			chooseAcNonAc();
			break;
		case 8:
			System.out.println("Ok your chioce is Hydrabad to Uttr Pradesh.");
			System.out.println("Hydrabad to Uttr Pradesh:- (1,398.3km).\n");
			chooseAcNonAc();
			break;
		case 9:
			System.out.println("Ok your chioce is Hydrabad to Chhatisgarh.");
			System.out.println("Hydrabad to Chhatisgarh:- (741.7km).\n");
			chooseAcNonAc();
			break;
		}
	}

	static void chooseAcNonAc() {
		System.out.println(" 1.AC \n 2.Without AC\n");
		System.out.println("If you will choose AC you will pay some extra money.");
		System.out.println("choose 1 from 2 Option:");
		System.out.println("-----------------------");
		int classType = sc.nextInt();
		System.out.println("\n");
		int noOfTry = 1;
		while (classType > 2 || classType < 1) {
			noOfTry++;
			if (noOfTry <= 2) {
				System.out.println("You have Last Chances");
				System.out.println("Please Enter The Above Number only:");
				System.out.println("-------------------------------");
				System.out.println();
				classType = sc.nextInt();
			} else {
				throw new RuntimeException(" Try again After Some Time");
			}
		}
		selectYourBus(classType);
	}

	static void selectYourBus(int classType) {
		int bus = 0;
		if (classType == 1) {
			System.out.println("Ok your choice is AC.");
			System.out.println("We have different bus with defferent price.\n");
			System.out.println("1.Dolphin   ------->(luxury)►►►►►►►(9hr 25min) ---------> ₹1070 for one ticket.");
			System.out.println("2.Volvo     ------->(luxury)►►►►►►►(8hr 45min) ---------> ₹1130 for one ticket.");
			System.out.println("3.Reliance  ------->(luxury)►►►►►►►(9hr)       ---------> ₹1150 for one ticket.");
			System.out.println("4.Spider    ------->(luxury)►►►►►►►(9hr 45min) ---------> ₹1200 for one ticket.");
			System.out.println("5.King      ------->(luxury)►►►►►►►(8hr)       ---------> ₹1200 for one ticket.");
			System.out.println("6.Salman    ------->(luxury)►►►►►►►(9hr 20min) ---------> ₹1040 for one ticket.");
			System.out.println("7.Sultan    ------->(luxury)►►►►►►►(10hr 20min)---------> ₹1000 for one ticket.");
			System.out.println("8.GaribRatha------->(Non-luxury)►►►(10hr 35min)---------> ₹1100  for one ticket.");
			System.out.println("9.ChilikaRani------>(Non-luxury)►►►(10hr 55min)---------> ₹1080 for one ticket.");
			System.out.println("10.None of the above");

			System.out.println("please enter Given Number only:");
			System.out.println("-------------------------------");
			bus = sc.nextInt();
			System.out.println("\n");
			int noOfTry = 1;
			while (bus > 10 || bus < 1) {
				noOfTry++;
				if (noOfTry <= 2) {
					System.out.println("You have Last Chances");
					System.out.println("Please Enter The Above Number only:");
					System.out.println("-------------------------------");
					System.out.println();
					bus = sc.nextInt();
				} else {
					throw new RuntimeException(" Try again After Some Time");
				}
			}
		} else {
			System.out.println("Ok your choice is WITHOUTAC");
			System.out.println("We have different bus with defferent price.\n");
			System.out.println(
					"1.Binapani      ------->(Non-luxury)►►►►►►►(9hr 25min)  ---------> ₹880  for one ticket.");
			System.out.println(
					"2.Omm           ------->(luxury)►►►►►►►(8hr 45min)      ---------> ₹900  for one ticket.");
			System.out.println(
					"3.Kedernath     ------->(luxury)►►►►►►►(9hr)            ---------> ₹950  for one ticket.");
			System.out.println(
					"4.Bibekananda   ------->(Non-luxury)►►►►►►►(9hr 45min)  ---------> ₹790  for one ticket.");
			System.out.println(
					"5.Happy & Lucky ------->(luxury)►►►►►►►(8hr)            ---------> ₹1000 for one ticket.");
			System.out.println(
					"6.Umbrela       ------->(Non-luxury)►►►►►►►(9hr 20min)  ---------> ₹700  for one ticket.");
			System.out.println(
					"7.KedaraGouri   ------->(Non-luxury)►►►►►►►(10hr 20min) ---------> ₹800  for one ticket.");
			System.out.println(
					"8.Ganesh        ------->(Non-luxury)►►►(10hr 35min)     ---------> ₹820  for one ticket.");
			System.out.println(
					"9.Ram           ------>(luxury)►►►(10hr 55min)          ---------> ₹950  for one ticket.");
			System.out.println("10.None of the above");
			System.out.println("please enter Given Number only:");
			System.out.println("-------------------------------");
			bus = sc.nextInt();
			System.out.println("\n");
			int noOfTry = 1;
			while (bus > 10 || bus < 1) {
				noOfTry++;
				if (noOfTry <= 2) {
					System.out.println("You have Last Chances");
					System.out.println("Please Enter The Above Number only:");
					System.out.println("-------------------------------");
					System.out.println();
					bus = sc.nextInt();
				} else {
					throw new RuntimeException(" Try again After Some Time");
				}
			}

		}
		chooseYourSeat(classType, bus);

	}

	static void chooseYourSeat(int classType, int bus) {
		int price = 0;
		if (classType == 1) {
			switch (bus) {
			case 1:
				System.out.println("Ok your choice is Dolphin(luxury BUS)\n");
				price = 1000;
				seatType(price);
				break;
			case 2:
				System.out.println("Ok your choice is Volvo(luxury BUS)\n");
				price = 1070;
				seatType(price);
				break;
			case 3:
				System.out.println("Ok your choice is Reliance(luxury BUS)\n");
				price = 1130;
				seatType(price);
				break;
			case 4:
				System.out.println("Ok your choice is Spider(luxury BUS)\n");
				price = 1150;
				seatType(price);
				break;
			case 5:
				System.out.println("Ok your choice is King(luxury BUS)\n");
				price = 1200;
				seatType(price);
				break;
			case 6:
				System.out.println("Ok your choice is Salman(luxury BUS)\n");
				price = 1200;
				seatType(price);
				break;
			case 7:
				System.out.println("Ok your choice is Sultan(luxury BUS)\n");
				price = 1040;
				seatType(price);
				break;
			case 8:
				System.out.println("Ok your choice is GaribRatha(luxury BUS)\n");
				price = 1100;
				seatType(price);
				break;
			case 9:
				System.out.println("Ok your choice is ChilikaRani(luxury BUS)\n");
				price = 1180;
				seatType(price);
				break;
			case 10:
//				System.out.println("Ok your choice is Dolphin(luxury BUS)\n");
//				seatType();
				break;
			}
		} else {
			switch (bus) {
			case 1:
				System.out.println("Ok your choice is Binapani(Non-luxury BUS)\n");
				price = 880;
				seatType(price);
				break;
			case 2:
				System.out.println("Ok your choice is Omm(luxury BUS)\n");
				price = 900;
				seatType(price);
				break;
			case 3:
				System.out.println("Ok your choice is Kedernatha(luxury BUS)\n");
				price = 950;
				seatType(price);
				break;
			case 4:
				System.out.println("Ok your choice is Bibekananda(Non-luxury BUS)\n");
				price = 790;
				seatType(price);
				break;
			case 5:
				System.out.println("Ok your choice is Happy & Lucky(luxury BUS)\n");
				price = 1000;
				seatType(price);
				break;
			case 6:
				System.out.println("Ok your choice is Umbrela(Non-luxury BUS)\n");
				price = 700;
				seatType(price);
				break;
			case 7:
				System.out.println("Ok your choice is KederaGouri(Nonluxury BUS)\n");
				price = 800;
				seatType(price);
				break;
			case 8:
				System.out.println("Ok your choice is Ganesh(Non-luxury BUS)\n");
				price = 820;
				seatType(price);
				break;
			case 9:
				System.out.println("Ok your choice is Ram(luxury BUS)\n");
				price = 950;
				seatType(price);
				break;
			case 10:
//				System.out.println("Ok your choice is Dolphin(luxury BUS)\n");
//				seatType();
				break;
			}

		}

	}

	static void seatType(int price) {
		System.out.println("1.Upper seat");
		System.out.println("2.Lower seat\n");
		System.out.println("choose given number only. Which seat you want??");
		int seat = sc.nextInt();
		int noOfTry = 1;
		while (seat > 2 || seat < 1) {
			noOfTry++;
			if (noOfTry <= 2) {
				System.out.println("You have Last Chances");
				System.out.println("Please Enter The Above Number only:");
				System.out.println("-------------------------------");
				System.out.println();
				seat = sc.nextInt();
			} else {
				throw new RuntimeException(" Try again After Some Time");
			}
		}
		if (seat == 1) {
			amountOfTicket(" Upper seat ", price);
		} else {
			amountOfTicket(" Lower seat ", price);
		}

	}

	static void amountOfTicket(String seatType, int price) {
		int book;
		String names[];
		int ages[];
		String date[];
		String gender[];

		System.out.println("--------Ok You Want" + seatType + " -------\n");
		System.out.println("You can book 6 ticket at a time.....");
		System.out.println("How many ticket's you want to book");
		int noOfTicket = sc.nextInt();
		int noOfTry = 1;
		while (noOfTicket > 6 || noOfTicket < 1) {
			noOfTry++;
			if (noOfTry <= 2) {
				System.out.println("You have Last Chances");
				System.out.println("Please Enter The Above Number only:");
				System.out.println("-------------------------------");
				System.out.println();
				noOfTicket = sc.nextInt();
			} else {
				throw new RuntimeException(" Try again After Some Time");
			}
		}

		names = new String[noOfTicket];
		ages = new int[noOfTicket];
		date = new String[noOfTicket];
		gender = new String[noOfTicket];
		int totalPrice = price * noOfTicket;
		System.out.println("Enter " + names.length + " names and age for booking confromation");
		for (int i = 0; i < names.length; i++) {
			System.out.print("Enter Name " + (i + 1) + " :");
			names[i] = sc.next();
			for (int j = i; j <= i; j++) {
				System.out.print("Enter Age " + (j + 1) + " :");
				ages[j] = sc.nextInt();
				for (int m = i; m <= i; m++) {
					System.out.print("Enter Gender Male,Female or TranceGender " + (m + 1) + " :");
					gender[m] = sc.next();
					for (int k = m; k <= m; k++) {
						System.out.print("Enter Date like DD-MM-YYYY format " + (k + 1) + " :");
						date[k] = sc.next();
					}
				}
			}
		}

		System.out.println(seatType);
		System.out.println("Name    Age    Date    Gender");
		System.out.println("-----------------------------");
		for (int i = 0; i < noOfTicket; i++) {
			System.out.println(names[i] + "    " + ages[i] + "    " + date[i] + "    " + gender[i]);
		}
		System.out.println("Your Total Price Is ***" + totalPrice + "*** for " + noOfTicket + " Ticket");

	}

	public static void main(String[] args) {
		printBanner();
		selectLocation();
	}
}
