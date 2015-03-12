package com.bloc.securitypackages.citrus;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/
import com.bloc.securitypackages.Fruit;
import com.bloc.securitypackages.colors.*;

public class Grapefruit extends Fruit {
	public Grapefruit() {
		super(Grapefruit.class.getSimpleName(), 210, new OrangeRed(), .48d);
	}
}