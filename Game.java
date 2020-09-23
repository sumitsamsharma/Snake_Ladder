package Snake_Ladder;

public class Game 
{
	public static void main(String[] args)
	{
		int pos=0;
		int no_play=0;
		int Ladder=1;
		int snake=2;
		int dice_no=(int)Math.floor(Math.random()*100)%7;
		int options=(int)Math.floor(Math.random()*100)%3;
			
		switch(options)
		{
	        case 0:
	        	System.out.println("No play, you are at position "+pos);
	        	break;
	        case 1:
	        	pos+=dice_no;
	        	System.out.println("Ladder, you are at position "+pos);
	        	break;
	        case 2:
	        	if(pos>dice_no)
	        	   pos-=dice_no;
	        	System.out.println("Snake, you are at position "+pos);   
	        	break;	
		}
	}
	
}
