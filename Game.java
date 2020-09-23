package Snake_Ladder;

public class Game 
{
	public static void main(String[] args)
	{
		int total_throw=0;
		int pos=0;
		int no_play=0;
		int Ladder=1;
		int snake=2;
		while(pos!=100)
		{	
			int dice_no=(int)Math.floor(Math.random()*100)%7;
			int options=(int)Math.floor(Math.random()*100)%3;
			total_throw+=1;
			switch(options)
		  {
	        case 0:
	        	System.out.println("No play, you are at position "+pos);
	        	break;
	        case 1:
	        	if(pos+dice_no<=100)
	        	    pos+=dice_no;
	        	System.out.println("Ladder, you are at position "+pos);
	        	break;
	        case 2:
	        	if(pos-dice_no>=0)
	        	   pos-=dice_no; 
	        	else
	        		pos=0;
	        	System.out.println("Snake, you are at position "+pos);
	        	break; 	
	        
		  }
		}
		System.out.println("no. of times dice was thrown :"+total_throw);
		
	}
	
}
