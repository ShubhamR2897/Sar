package practice;

public class overlooding {
	int a;
	char f;
	overlooding(){
		a=10;
		f='b';
	}
	overlooding(int c){
		a= 48;
		f= 55;
	}
	overlooding(char c){
		a= 'j';
		f= 44;
		}
	overlooding(char c, int v){
		a= 66;
		}
	overlooding(int c, char d){
		a=55;
	}
	
	public static void main(String[] args) {
		overlooding z= new overlooding('c');
		System.out.println("z.a= " +z.a);
	}
	
	
	
}


