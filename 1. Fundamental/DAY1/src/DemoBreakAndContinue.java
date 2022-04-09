public class DemoBreakAndContinue
{
        public static void main(String [] bebas)
        {
                int i=0;
                while(i<20){
			i++;
			if((i%2)!=0){
                        	System.out.println("Nilai i: "+i);
                        }else{
				continue;
			}
			
			if(i>15){
				break;
			}
                }
        }
}
