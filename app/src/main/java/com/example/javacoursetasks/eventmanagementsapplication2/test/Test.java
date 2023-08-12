package com.example.javacoursetasks.eventmanagementsapplication2.test;

import com.example.javacoursetasks.eventmanagementsapplication.com.myevent.entities.Event;
import com.example.javacoursetasks.eventmanagementsapplication.com.myevent.entities.Organizer;
import com.example.javacoursetasks.eventmanagementsapplication.com.myevent.entities.Participants;
import com.example.javacoursetasks.eventmanagementsapplication.com.myevent.entities.Venue;


public class Test {

	public static void main(String[] args) {
		
		System.out.println("The first event: ");
		System.out.println("\n");
		
		Organizer organizer = new Organizer ("Minisitry of Youth and Sports");
		// create an object and add arguments to its constructor 
		System.out.println("Organizer(s): " + organizer.name);
		System.out.println("\n");
		
		Event event = new Event("Youth Social Resposibility", "An event held by the Ministry of Youth and Sports to"
		+"\n" +"spread awareness amongt the youth about their different roles in society.", "October 19th at 10 AM", "October 20th at 7 PM", false);
		System.out.println ("Event: " + event.name);
		System.out.println ("Description: " + event.description);
		System.out.println ("Start Time: " + event.startTime);
		System.out.println ("End Time: " + event.endTime);
		System.out.println ("Started: " + event.isStarted);
		System.out.println("\n");
		
		Participants participants = new Participants("All youth under 30 years old");
		System.out.println ("Allowed to attend: " + participants.name);
		System.out.println("\n");
		
		Venue venue = new Venue("The Arab League Building", "Egypt", "Cairo", " 26VM+V8R, Ismailia, Qasr El Nil, Cairo Governorate 4272081");
		System.out.println ("Venue: " + venue.name);
		System.out.println ("Country: " + venue.country);
		System.out.println ("City: " + venue.city);
		System.out.println ("Address: " + venue.streetAdress);
		System.out.println("\n");
		
		System.out.println("The second event: ");
		System.out.println("\n");
		
		organizer = new Organizer ("Zewail University");
		// you can create another object of the same class
		System.out.println("Organizer(s): " + organizer.name);
		System.out.println("\n");

		event = new Event("Sceince Inventions", "An event held by Ahmed Zewail University to" + "\n"
		+"inspire the youth to emabark on new sceince journeys.", "October 22nd at 10 AM", "October 24th at 7 PM", false);
		System.out.println("Event: " + event.name);
		System.out.println("Description: " + event.description);
		System.out.println("Start Time: " + event.startTime);
		System.out.println("End Time: " + event.endTime);
		System.out.println("Started: " + event.isStarted);
		System.out.println("\n");

		Participants participants2 = new Participants("All youth under 30 years old");
		System.out.println("Allowed to attend: " + participants2.name);
		System.out.println("\n");

		venue = new Venue("Ahmed Zewail University in Sheikh Zaid", "Egypt", "Cairo",
				" 26VM+V8R, Ismailia, Qasr El Nil, Cairo Governorate 4272081");
		System.out.println("Venue: " + venue.name);
		System.out.println("Country: " + venue.country);
		System.out.println("City: " + venue.city);
		System.out.println("Address: " + venue.streetAdress);
		System.out.println("\n");
		
		System.out.println("The third event: ");
		System.out.println("\n");
		
		organizer = new Organizer("Ain Shams University");
		System.out.println("Organizer(s): " + organizer.name);
		
		
	}

}
