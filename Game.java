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
		
		int riku=0,kyon=1,hibiki=2,karen=3,nozomi=4;
		
		int[][] enemy=new int[5][5];
		/*�񂪓G�̖��O�ɂȂ�܂��B
		�s�����ꂼ��̃p�����[�^�[�ɂȂ�܂��B*/
		for(int i=0;i<=4;i++){
			for(int j=0;j<=4;j++){
				Random randomEnemy=new Random();
				enemy[i][j]=randomEnemy.nextInt(10);
			}
			
		}
		
		for(int i=0;i<=4;i++){
			System.out.print(enemy[0][i]);
		}
		
		

		
	}
}