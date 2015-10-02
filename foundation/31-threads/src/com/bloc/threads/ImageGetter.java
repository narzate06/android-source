package com.bloc.threads;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ImageGetter extends Thread {
    private final String url;
    private boolean openWhenCompleted;

	/*
	 * ImageGetter
	 *
	 * Initialize the ImageGetter class.
	 *
	 * @param url The URL of the image this ImageGetter should
	 *		  download (String)
	 * @param openWhenCompleted if `true`, the image will be opened
	 *		  as soon it is downloaded, `false` otherwise
	 */



    public ImageGetter(String url, boolean openWhenCompleted){

        this.url = url;
        this.openWhenCompleted = openWhenCompleted;
    }

	/************************************************
 	 *	ASSIGNMENT:
 	 *	Implement this constructor for ImageGetter.
 	 *	The variables passed into it must impact the `run()` method's
 	 *	behavior as described above.
	/************************************************/

	@Override
	public void run() {

        try {
            File existingImage = new File("google_logo.png");
            if (existingImage.exists()) {
                existingImage.delete();
            }
            URL url = new URL(this.url);
            BufferedImage bufferedImage = ImageIO.read(url);
            File outputfile = new File("google_logo.png");
            ImageIO.write(bufferedImage, "png", outputfile);
            if ("/".equals(System.getProperties().getProperty("file.separator"))) {
                Runtime.getRuntime().exec("open google_logo.png");
            } else {
                Runtime.getRuntime().exec("google_logo.png");

                super.run();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

		/************************************************
 		 *	ASSIGNMENT:
 		 *	Perform the work found in `Main.java` in this
 		 *	Thread instead.
		/************************************************/
	}
}