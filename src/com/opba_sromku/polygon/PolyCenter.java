package main.sromku.polygon;

import java.util.List;


/**
 * @author Opba (hkanata@gmail.com)
 */

public class PolyCenter {
	private Double PI;
	private Double X = 0.0;
	private Double Y = 0.0;
	private Double Z = 0.0;
	
	public PolyCenter(){
		PI = 22/7d;
	}
	
	protected Point getCenter(List<Point> vertexes){
		for( Point p : vertexes ) {
			Double la = p.x * PI / 180;
			Double lo = p.y * PI / 180;
			X = X + Math.cos(la) * Math.cos(lo);
			Y = Y + Math.cos(la) * Math.sin(lo);
			Z = Z + Math.sin(la);
		}
		Double Hyp = Math.sqrt(X*X+Y*Y);
		
		Double LoX = Math.atan2(Y, X);
		Double LaX  = Math.atan2(Z, Hyp);
		
		double lat = LaX * 180/PI;
		double lng = LoX * 180/PI;
		
		
		//System.out.println("PI: " + lat + " : " + lng);
		//testa();
		Point p = new Point();
		p.x = (float)lat;
		p.y = (float)lng;
		return p;
	}
}
