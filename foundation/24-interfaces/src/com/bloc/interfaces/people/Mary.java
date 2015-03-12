package com.bloc.interfaces.people;

/************************************************
 *	ASSIGNMENT:
 *	Have Mary implement the Skydiver interface
/************************************************/
import com.bloc.interfaces.people.hobbies.*;

import java.lang.Override;

public class Mary extends Person implements Skydiver {
	public Mary() {
		super("Mary", "Whiters", "Female", 1.65d, 62d, "Blue");
	}

    @Override
    public void getInPlane(){

    }

    @Override
    public void jumpFromPlane(){

    }

    @Override
    public void releaseParachute(){

    }
}