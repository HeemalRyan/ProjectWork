package org.Heemal.Ryan;
 
public class PaintSection {
/*	private String colour;
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
*/
	
	
	// Injecting Objects
	private PaintProperties Paint_Colour;
	private PaintProperties Paint_Type;
	private PaintProperties Paint_Brand;
	
	//Setters/Getters - Object injection
	public PaintProperties getPaint_Colour() {
		return Paint_Colour;
	}
	public void setPaint_Colour(PaintProperties paint_Colour) {
		Paint_Colour = paint_Colour;
	}
	public PaintProperties getPaint_Type() {
		return Paint_Type;
	}
	public void setPaint_Type(PaintProperties paint_Type) {
		Paint_Type = paint_Type;
	}
	public PaintProperties getPaint_Brand() {
		return Paint_Brand;
	}
	public void setPaint_Brand(PaintProperties paint_Brand) {

		
		Paint_Brand = paint_Brand;
	}
	public void getPaint() {
		System.out.println("Paint Colour: " + getPaint_Colour().getColour() + "\nPaint Type: " + getPaint_Type().getType());
		System.out.println("Paint Brand: " + getPaint_Brand().getBrand());
	}

}
