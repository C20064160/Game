import java.util.*;

class Game{
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
	
		/*�������瓱��*/
		System.out.println("\n�����_�����h���S���Y�̐��E�ɂ悤�����I");
		
		System.out.print("���Ȃ��̖��O�͉��ł����H\t");
		String userName=scan.next();
		System.out.println("\n"+userName+"����\t����ɂ���");
		System.out.println("���Ȃ��̃p�����[�^�͈ȉ��̂悤�ɂȂ�܂��B\n");
		/*�����܂œ���*/
	
		/*�p�����[�^����*/
		int hitpoint=0;
		int attack=1;
		int defence=2;
		int magicattack=3;
		int magicdefence=4;
		
		int[] parametersUser={hitpoint,attack,defence,magicattack,magicdefence};
		
		for(int i=0;i<=4;i++){
			Random random=new Random();
			
			parametersUser[i] = random.nextInt(10);
			
			

			
		}
		System.out.println("\n�̗͂�"  + (parametersUser[hitpoint]+1));
		System.out.println("�U���͂�"  + (parametersUser[attack]+1));
		System.out.println("�h��͂�"  +( parametersUser[defence]+1));
		System.out.println("���U��"  + (parametersUser[magicattack]+1));
		System.out.println("���h��"  + (parametersUser[magicdefence]+1));
		/*�I���*/
		
		
		

		
	}
}