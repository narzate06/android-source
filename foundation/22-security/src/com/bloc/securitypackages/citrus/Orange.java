package com.bloc.securitypackages.citrus;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/
import com.bloc.securitypackages.Fruit;


public class Orange extends Fruit {
	public Orange() {
		super("Orange", 130, new Orange(), .21d);
	}
}