//Hellen Parpinel Hobbs

public class ManagersCrossing {

	public static boolean isMoveOkay(int boatBefore, int managerABefore, int managerBBefore, int managerCBefore,
			int engineerABefore, int engineerBBefore, int engineerCBefore, int boatAfter, int managerAAfter,
			int managerBAfter, int managerCAfter, int engineerAAfter, int engineerBAfter, int engineerCAfter) {

		int numberOfPeopleMoving = 0;
		
		if ((boatBefore < 1) || (boatBefore > 2) || (boatAfter < 1) || (boatAfter > 2) || (managerABefore < 1) || (managerABefore > 2) || (managerBBefore < 1) || (managerBBefore > 2) || (managerCBefore < 1) || (managerCBefore > 2) ||  (managerAAfter < 1) || (managerAAfter > 2) || (managerBAfter < 1) || (managerBAfter > 2) || (managerCAfter < 1) || (managerCAfter > 2) || (engineerABefore < 1) || (engineerABefore > 2) || (engineerBBefore < 1) || (engineerBBefore > 2) || (engineerCBefore < 1) || (engineerCBefore > 2) || (engineerAAfter <1) || (engineerAAfter > 2) || (engineerBAfter <1) ||  (engineerBAfter > 2) || (engineerCAfter < 1) || (engineerCAfter > 2)) {
			System.out.println("All positions must be 1 or 2!");
			return false;
		}
		
		if (boatBefore != 1) {
			if (boatBefore == boatAfter) {
				System.out.println("The boat must move!");
				return false;
			}
		}

		
			if (boatAfter != 2) {
				if (boatAfter == boatBefore) {
					System.out.println("The boat must move!");
					return false;
				}
			}
		
		{
		if (managerABefore != managerAAfter) { // manager must have moved
			if (boatBefore != managerABefore) { // boat & managerABefore moved
				System.out.println("You may not move a person who is not with the boat!");

				return false;
			}
			numberOfPeopleMoving = numberOfPeopleMoving + 1;
		}

		if (managerBBefore != managerBAfter) {
			if (boatBefore != managerBBefore) {
				System.out.println("You may not move a person who is not with the boat!");
				return false;
			}
			numberOfPeopleMoving = numberOfPeopleMoving + 1;
		}

		if (managerCBefore != managerCAfter) {
			if (boatBefore != managerCBefore) {
				System.out.println("You may not move a person who is not with the boat!");
				return false;
			}
			numberOfPeopleMoving = numberOfPeopleMoving + 1;
		}

		if (engineerABefore != engineerAAfter) {
			if (boatBefore != engineerABefore) {
				System.out.println("You may not move a person who is not with the boat!");
				return false;
			}
			numberOfPeopleMoving = numberOfPeopleMoving + 1;
		}

		if (engineerBBefore != engineerBAfter) {
			if (boatBefore != engineerBBefore) {
				System.out.println("You may not move a person who is not with the boat!");
				return false;
			}
			numberOfPeopleMoving = numberOfPeopleMoving + 1;
		}

		if (engineerCBefore != engineerCAfter) {
			if (boatBefore != engineerCBefore) {
				System.out.println("You may not move a person who is not with the boat!");
				return false;
			}
			numberOfPeopleMoving = numberOfPeopleMoving + 1;
		}

		if ((numberOfPeopleMoving < 1) || (numberOfPeopleMoving > 2)) {
			System.out.print("You must move one or two people!");
			return false;
		}
		{
			if ((managerABefore == engineerBBefore) && (managerBBefore != engineerBBefore)) {
				System.out.println("Manager A would try to recruit someone!");
				return false;
			}
			numberOfPeopleMoving = numberOfPeopleMoving + 1;
		}
		{
			if ((managerABefore == engineerCBefore) && (managerCBefore != engineerCBefore)) {
				System.out.println("Manager A would try to recruit someone!");
				return false;
			}
			numberOfPeopleMoving = numberOfPeopleMoving + 1;
		}
		{
			if ((managerBBefore == engineerABefore) && (managerABefore != engineerABefore)) {
				System.out.println("Manager B would try to recruit someone!");
				return false;
			}
			numberOfPeopleMoving = numberOfPeopleMoving + 1;
		}
		{
			if ((managerBBefore == engineerCBefore) && (managerCBefore != engineerCBefore)) {
				System.out.println("Manager B would try to recruit someone!");
				return false;
			}
			numberOfPeopleMoving = numberOfPeopleMoving + 1;
		}
		{
			if ((managerCBefore == engineerABefore) && (managerABefore != engineerABefore)) {

				System.out.println("Manager C would try to recruit someone!");
				return false;
			}
			numberOfPeopleMoving = numberOfPeopleMoving + 1;
		}
		{
			if ((managerCBefore == engineerBBefore) && (managerBBefore != engineerBBefore)) {

				System.out.println("Manager C would try to recruit someone!");
				return false;
			}
			numberOfPeopleMoving = numberOfPeopleMoving + 1;
		}
		{
			if ((managerAAfter == engineerBAfter) && (managerBAfter != engineerBAfter)) {
				System.out.println("Manager A would try to recruit someone!");
				return false;
			}
			numberOfPeopleMoving = numberOfPeopleMoving + 1;
		}
		{
			if ((managerAAfter == engineerCAfter) && (managerCAfter != engineerCAfter)) {
				System.out.println("Manager A would try to recruit someone!");
				return false;
			}
			numberOfPeopleMoving = numberOfPeopleMoving + 1;
		}
		{
			if ((managerBAfter == engineerCAfter) && (managerCAfter != engineerCAfter)) {
				System.out.println("Manager B would try to recruit someone!");
				return false;
			}
			numberOfPeopleMoving = numberOfPeopleMoving + 1;
		}
		{
			if ((managerBAfter == engineerAAfter) && (managerAAfter != engineerAAfter)) {
				System.out.println("Manager B would try to recruit someone!");
				return false;
			}
			numberOfPeopleMoving = numberOfPeopleMoving + 1;
		}
		{
			if ((managerCAfter == engineerAAfter) && (managerAAfter != engineerAAfter)) {
				System.out.println("Manager C would try to recruit someone!");
				return false;
			}
			numberOfPeopleMoving = numberOfPeopleMoving + 1;
		}
		{
			if ((managerCAfter == engineerBAfter) && (managerBAfter != engineerBAfter)) {
				System.out.println("Manager C would try to recruit someone!");
				return false;
			}
			numberOfPeopleMoving = numberOfPeopleMoving + 1;
		}
		
		if ((boatAfter == 2) && (managerAAfter != 2) && (managerBAfter != 2) && (managerCAfter != 2)
				&& (engineerAAfter != 2) && (engineerBAfter != 2) && (engineerCAfter != 2)) {
		
		return false;
		}}
		
		
		// At this point, everything ok
		if ((boatAfter == 2) && (managerAAfter == 2) && (managerBAfter == 2) && (managerCAfter == 2)
				&& (engineerAAfter == 2) && (engineerBAfter == 2) && (engineerCAfter == 2)) {
			System.out.println("You solved the puzzle!");

		}
		return true;
	

}}
