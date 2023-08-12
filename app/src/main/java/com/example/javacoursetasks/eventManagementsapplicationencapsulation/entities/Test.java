package com.example.javacoursetasks.eventManagementsapplicationencapsulation.entities;

public class Test {

	public static void main(String[] args) {

		System.out.println("The first event: ");
		System.out.println("\n");

		Event event = new Event();

		event.setName("Youth Social Resposibility");
		event.setDescription("An event held by the Ministry of Youth and Sports to" + "\n"
				+ "spread awareness amongt the youth about their different roles in society.");
		event.setStartTime("October 19th at 10 AM");
		event.setEndTime("October 20th at 7 PM");
		event.setIsStarted(false);

		System.out.println("Event: " + event.getName() + "\n");
		System.out.println("Description: " + event.getDescription() + "\n");
		System.out.println("Start Time: " + event.getStartTime() + "\n");
		System.out.println("End Time: " + event.getEndTime() + "\n");
		System.out.println("Started: " + event.getIsStarted() + "\n");

		Event organizer = new Organizer();
		organizer.setName("Minisitry of Youth and Sports");
		System.out.println("Organizer(s): " + organizer.getName() + "\n");

		Event participants = new Participants();
		participants.setName("Anyone  from 18 to 30 years old");
		System.out.println("Allowed to attend: " + participants.getName() + "\n");

		Event venue = new Venue();
		Venue venueDownCast = (Venue) venue;

		venue.setName("The Arab League Building");
		venueDownCast.setCountry("Egypt");
		venueDownCast.setCity("Cairo");
		venueDownCast.setStreetAdress("26VM+V8R, Ismailia, Qasr El Nil, Cairo Governorate 4272081");

		System.out.println("Venue: " + venue.getName() + "\n");
		System.out.println("Country: " + venueDownCast.getCountry() + "\n");
		System.out.println("City: " + venueDownCast.getCity() + "\n");
		System.out.println("Address: " + venueDownCast.getStreetAdress() + "\n");

	}

}
