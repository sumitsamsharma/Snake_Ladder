package Snake_Ladder;

public class Game 
{

	public static void main(String[] args)
	{
		int count=0;
		int pos1=0;
		int pos2=0;
		int no_play=0;
		int Ladder=1;
		int snake=2;
		int options=0;
		while(pos1!=100 || pos2!=100)
		{	
			options=(int)Math.floor(Math.random()*100)%3;
			pos1=score(options,pos1);
			count++;
			while(options==1)
			{
				pos1=score(options,pos1);
				options=(int)Math.floor(Math.random()*100)%3;
				count++;
			}
			System.out.println("Player 1 at position: "+pos1);
			if(pos1==100)
			{
				System.out.println("Player 1 Won");	
				break;
			}
			
			options=(int)Math.floor(Math.random()*100)%3;
			count++;
			pos2=score(options,pos2);
			while(options==1)
			{
				pos2=score(options,pos2);
				options=(int)Math.floor(Math.random()*100)%3;
				count++;
			}
			System.out.println("Player 2 at position "+pos2);
			if(pos2==100)
			{
				System.out.println("Player 2 Won");
				break;
			}
		}
		System.out.println("Total no of times dice thrown: "+count);
		
	}
	public static int score(int choice,int pos)
	{
		int dice_no=(int)Math.floor(Math.random()*100)%7;
		switch(choice)
	  {
        case 0:
        	System.out.println("No play");
        	break;
        case 1:
        	if(pos+dice_no<=100 && pos!=100)
        	    pos+=dice_no;
        	System.out.println("Ladder");
        	break;
        	
        case 2:
        	if(pos-dice_no>=0)
        	   pos-=dice_no; 
        	else
        		pos=0;
        	System.out.println("Snake");
        	break;
        
	  }
	  return pos;	
	}
  
}
