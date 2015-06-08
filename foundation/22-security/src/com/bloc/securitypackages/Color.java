package com.bloc.securitypackages;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

public class Color extends Object {
	// Name of the color
	private String mName;
	// Alpha value
	private int mAlpha;
	// Red value
	private int mRed;
	// Green value
	private int mGreen;
	// Blue value
	private int mBlue;

	public Color(int red, int green, int blue) {
		this(null, red, green, blue);
	}

	public Color(String name, int red, int green, int blue) {
		mName = name;
		mRed = red;
		mGreen = green;
		mBlue = blue;
	}
}