package com.bloc.interfaces.people;

/************************************************
 *	ASSIGNMENT:
 *	Have Albert implement the SalsaDancer interface
/************************************************/

import com.bloc.interfaces.people.hobbies.*;

import java.lang.Override;

public class Albert extends Person implements SalsaDancer {
	public Albert() {
		super("Albert", "Cobb", "Male", 1.8d, 72d, "Green");
	}

    @Override
    public void putOnShoes(){

    }

    @Override
    public void findAPartner(){

    }

    @Override
    public void salsa(){

    }
}