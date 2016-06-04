public class AsciiArt{

	public static void main(String[] args){
	
		String[] drawing = {
		
			"  |\\",
			"  | \\  ",
			"  | | ",
			"  | |",
			"  | | ",
			"  | | ",
			"  | | ",
			"  | | ",
			"-------",
			"  | | ",
			"  |_| ",
			" ____   ____",
			"| o  | | o  |",
			"|o   | |o   |",
			"|  o | |  o |      __/|____",
			"|   o| |   o|     <_o__o_o_| &&&&&&&&&&&",
			"| o  | | o  |        \\|",
			"|    | |    |",
			"|  o | |  o |",
			"| o  | | o  |",
			"|    | |    |",
			"-------------",
			
			
		};
		
		draw(drawing);
	}
	public static void draw(String[] drawing){
	
		for(int i = 0; i < drawing.length; i++){
			System.out.println(drawing[i]);
		}
	}
}
