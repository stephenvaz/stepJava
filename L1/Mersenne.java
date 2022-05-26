package L1;

import java.lang.Math; 

class Mersenne{
	 static void mer(){
		int res;
		System.out.println("p\t Number");
		for(int i = 2; i <= 20; i++){
			res =((int) Math.pow(2,i))-1;
       		int flag = 1;
       		if(res<2){
				flag = 0;
			}
			else{
				for(int j = 2; j*j<=res; j++){
					if(res%j == 0){
						flag = 0;
						break;
					}
				}

			}
			if(flag == 1){
				System.out.print(i);
				System.out.print("\t ");
				System.out.println(res);
			}
		}
	
	}
	public static void main(String args[]){ 
		Mersenne.mer();
	}
}




