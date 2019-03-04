package org.Heemal.Ryan;
 
public class PaintSection {
	private String colour;
	private String type;
	
	//Constructor Injection
	public PaintSection(String type) {
		this.type = type;
	}
	
	//Setters and Getters - Getter/Setter Injection
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}

	public void getPaint() {
		System.out.println("Setter/Getter injection: Colour of paint is " + getColour());
		System.out.println("Constructor injection: Type of paint is " + this.type);
	}


}
