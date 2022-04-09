public class TokoPonsel
{
	static void testPonsel(CellPhone [] c)
	{
		for(int i=0;i<c.length;i++)
		{
			c[i].panggil();
		}
	}
	public static void main(String [] bebas)
	{
		CellPhone [] barangDagangan=new CellPhone[10];
		for(int i=0;i<barangDagangan.length;i++)
		{
			if((i%2)==0){
				barangDagangan[i]=new Samsung();
			}else{
				barangDagangan[i]=new Oppo();
			}
		}
		testPonsel(barangDagangan);
	}
}
