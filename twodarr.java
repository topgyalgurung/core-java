
public class twodarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr=new int [2][2];
		for(int i=0;i<2;i++) {  //row
			for(int j=0;j<2;j++) //col
			{
				arr[i][j]=i*10+j;
				//arr[j][i]=i*10+j; // transpose
			}
		}
		
		for(int i=0;i<2;i++) {  //row
			for(int j=0;j<2;j++) //col
			{
				System.out.println(" "+arr[i][j]);
			}
		}

	}

}
