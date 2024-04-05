package com.java;

public class TestClass {
public static void main(String[] args) {
	
	Medicineinfo medicine1 = new Tablet();
    Medicineinfo medicine2 = new Syrup();
    Medicineinfo medicine3 = new Ointment();
    
    medicine1.displayLabel();
    medicine2.displayLabel();
    medicine3.displayLabel();
    
}
}
