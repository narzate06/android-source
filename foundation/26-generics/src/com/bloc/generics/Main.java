package com.bloc.generics;



import com.bloc.generics.things.*;




public class Main extends Object {

	public static void main(String [] args) {

		ToyBox toyBox = new ToyBox();

        /************************************************
 		 *	ASSIGNMENT:
 		 *	Place several Toy objects into toyBox
		/************************************************/

        ActionFigure actionFigure = new ActionFigure();
        Book book = new Book();
        Spoon spoon = new Spoon();

        Toy<ActionFigure> actionFigureToy = new Toy<ActionFigure>(new ActionFigure());
        toyBox.addToy(actionFigureToy);

        Toy<Book> bookToy = new Toy<Book>(new Book());
        toyBox.addToy(bookToy);

        Toy<Spoon> spoonToy = new Toy<Spoon>(new Spoon());
        toyBox.addToy(spoonToy);











        assert toyBox.getToyCount() > 0 : "Let's get some toys in that box!";
		System.out.println("Inside your toybox you've got:");
		for (int i = 0; i < toyBox.getToyCount(); i++) {
			System.out.println("- " + toyBox.getToyAtIndex(i).get());
		}
		System.out.println("Sounds like fun!\n");

		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/*   If you see this,   */");
		System.out.println("/*   congratulations!   */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}
