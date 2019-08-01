package net.sourceforge.tess4j.example;

import java.io.File;


import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TesseractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File imageFile = new File("C:\\Users\\anand\\Desktop\\fwdofflinehtmltypingjobdemofile\\GOING TO TYPE.tif");
	        ITesseract instance = new Tesseract();  // JNA Interface Mapping
	        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping
	        //instance.setDatapath("C:/Program Files/Tesseract-OCR");
	        instance.setLanguage("en");
	        try {
	            Object result =instance.doOCR(imageFile);
	           System.out.print(result);
	        } catch (TesseractException e) {
	            System.err.println(e.getMessage());
	        }
	}

}