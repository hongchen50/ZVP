package Util;

public class Grass {
	public int x;
	public int y;
    

	public boolean exist;
	static int height=120;
	static int width=90;
	static int BasciX=100;
	public Grass() {
	
		x=0;
		y=0;
		exist=false;
	}
	public static Grass grasses[][]=new Grass[5][7];

	public static void CreateGrass(){
		for(int i=0;i<5;i++) {
			for(int j=0;j<7;j++) {
			grasses[i][j]=new Grass();
			grasses[i][j].y=i*Grass.height;
		    grasses[i][j].x=j*Grass.width+BasciX;
		   // System.out.println(grasses[i][j].x+" "+grasses[i][j].y);
			}
		}
		
	}
	
	public static int ReturnX(int x){
		for(int i=1;i<8;i++) {
			if(x<=Grass.width*i+BasciX) {
				return i-1;
			}
		}
		return -1;
	}
	
	public static int ReturnY(int y){
		for(int i=1;i<6;i++) {
			if(y<=Grass.height*i) {
				return i-1;
			}
		}
		return -1;
	}
	

}
