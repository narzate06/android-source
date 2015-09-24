package com.bloc.singletons;

import java.util.ArrayList;
import java.util.List;


/************************************************
 *	ASSIGNMENT:
 *	Populate this class with the defined methods.
 *
 *	This is a singleton class which maintains communication
 *	between Talker and Listener interface objects.
/************************************************/

public class Speakerphone extends Object {

	static Speakerphone instance;
	List<Listener> listeners;

	public Speakerphone(){
		listeners = new ArrayList<Listener>();
	}
	/*
	 * get
	 *
	 * @return the singleton instance of Speakerphone (Speakerphone)
	 */

	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the get method
	/************************************************/
	public static Speakerphone get() {

		if (instance == null){
			instance = new Speakerphone();
		}
		return instance;

	}
	/*
	 * addListener
	 *
	 * Add a listener to Speakerphone's list
	 *
	 * @param listener an instance of the Listener interface (Listener)
	 * @return nothing
	 */

	public void addListener(Listener l){
		listeners.add(l);
	}

	/*
	 * removeListener
	 *
	 * Remove a Listener from the Speakerphone's list
	 *
	 * @param listener the Listener to remove (Listener)
	 * @return nothing
	 */
	 public void removeListener(Listener l){
		 listeners.remove(l);
	 }

	/*
	 * removeAll
	 *
	 * Removes all Listeners from Speakerphone
	 *
	 * @return nothing
	 */
	 public void removeAll(){
		 listeners.clear();
	 }

	/*
	 * contains
	 *
	 * Checks whether a Listener is found in the Speakerphone's
	 * collection.
	 *
	 * @param listener
	 * @return `true` if the Listener has already been added to
	 *		   the Speakerphone, `false` otherwise (boolean)
	 */
	 public boolean contains(Listener l){
		 return listeners.contains(l);
	 }


	/*
	 * shoutMessage
	 *
	 * Sends the message to all of the Listeners tracked by Speakerphone
	 *
	 * @param talker a Talker whose message will be sent (Talker)
	 * @return nothing
	 */
	 public void shoutMessage(Talker talker){
		 for (Listener l : listeners){
			 l.onMessageReceived(talker.getMessage());
		 }
	 }

	/*
	 * shoutMessage
	 *
	 * Sends the message to all of the Listeners which are instances of
	 * the cls parameter
	 *
	 * @param talker a Talker whose message will be sent (Talker)
	 * @param cls a Class object representing the type which the Listener
	 *			  should extend from in order to receive the message (Class)
	 * @return nothing
	 *
	 * HINT: see Class.isAssignableFrom()
	 *		 http://docs.oracle.com/javase/7/docs/api/java/lang/Class.html#isAssignableFrom(java.lang.Class)
	 */
	 public void shoutMessage(Talker talker, Class cls){

		if  (Talker.class.isAssignableFrom(cls)){
			shoutMessage(talker);
		}

	 }

}