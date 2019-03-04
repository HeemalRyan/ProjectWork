package org.Heemal.Ryan;
import java.util.List;

public class PaintSection {
	private List<PaintProperties> Paint_Properties;
		
	//Setters/Getters 
	public List<PaintProperties> getPaint_Properties() {
		return Paint_Properties;
	}
	public void setPaint_Properties(List<PaintProperties> paint_Properties) {
		Paint_Properties = paint_Properties;
	}


	public void getPaint() {
		for (PaintProperties property : Paint_Properties) {
			System.out.println("Paint Colour: " + property.getColour() + "	Paint Type: " + property.getType());
		}
	}





}
