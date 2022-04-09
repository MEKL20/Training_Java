public class DemoArray4
{
	public static void main(String [] bebas)
	{
		int[][] daftar={{1,2},{3,4},{5,6}};
		int baris=daftar.length;
		for(int i=0;i<baris;i++){
			for(int j=0;j<daftar[i].length;j++){
				System.out.println("daftar["+i+"]["+j+"]:"+daftar[i][j]);
			}
		}
	}
}
