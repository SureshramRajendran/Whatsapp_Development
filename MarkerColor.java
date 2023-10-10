package Preparation;

public class MarkerColor {
	public static void main(String[]args) throws MarkerColorException {
		String marker="White";
		try {
			if(marker.equals("Blue")==true) {
				System.out.println("Marker is Blue Color");
			}
			else {
				throw new MarkerColorException("Marker is Red Color");
			}
		}
		finally {
			System.out.println("Marker is Black Color");
		}
		
	}

}
