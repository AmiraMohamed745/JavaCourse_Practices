package com.example.javacoursetasks.flowcontrol;

public class Continue {

	public static void main(String[] args) {
		
		System.out.println("The number of participants in your group can be: ");
		for (int groupParticipants = 0; groupParticipants <= 15; groupParticipants++) {
			if (groupParticipants % 2 == 0) {
				continue; // means to skip every result the has the division remainder of 0
			}
			System.out.println(groupParticipants);
		}
		
		System.out.println("The number of people allowed in the room: ");
		for (int peopleAllowed = 0; peopleAllowed <= 100; peopleAllowed++) {
			if (peopleAllowed % 2 != 0) {
				continue;
			}
			System.out.println(peopleAllowed);
		}

	}

}
