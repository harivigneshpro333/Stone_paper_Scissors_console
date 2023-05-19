package Project_1;
import java.util.Scanner;
import java.lang.*;
public class Stone_Paper_Game {
String main(int game)

{

	String b[]=new String[] {"ROCK →🎱←","PAPER →📃←","SCISSORS →✂←"};
     String c=(b[game]);
	return c;
	
	}
int main1(int players,int randomval,int score)
{
	if(randomval==0&players==1)//if both are only true is become a true:
	/*Boolean voi=(players==1);	
	if(randomval.equal(voi))*/
	{
		System.out.println("\n*************************************→ → →");
		System.out.println("\n\t😁😜↓GAME IS TIE😁😜↓"
				+ "\n\t↓ ↓ ↓ ↓");
	}
	else if(randomval==1&players==2)
	{System.out.println("\n*************************************→ → →");
		System.out.println("\t😁😜↓GAME IS TIE😁😜↓"
				+ "\n\t↓ ↓ ↓ ↓");
	}
	if(randomval==2&players==3)
	{System.out.println("\n*************************************→ → →"); 
		System.out.println("\t😁😜↓GAME IS TIE😁😜↓"
				+ "\n\t↓ ↓ ↓ ↓");
	}
	else if(randomval==0&players==2)//rock.paper
	
	{System.out.println("\n*************************************→ → →");
		System.out.println("😊🤞😉\n\tYOU WON THE MICKY😊🤞😉"
				+ "\n😊🤞😉U CAN HOLD THE ROCK AND THROUGHT IT OUT 😊🤞😉"
				+ "\n\t↓ ↓ ↓ ↓");
		
	}
	else if(randomval==0&players==3)//rock.scisors
	{System.out.println("\n*************************************→ → →");
		System.out.println("\n\t😢‍🤦YOU LOST😢‍🤦‍♂️"
				+ "\n😢🤷‍♀️🤦‍♂️BECAUSE ROCK CAN BREAK U EASY😢🤷‍♀️🤦‍♂️"
				+ "\n\t↓ ↓ ↓ ↓");
	
	}
	else if(randomval==1&players==1)//paper.rock
	{System.out.println("\n*************************************→ → →");
		System.out.println("\n\t😢‍🤦YOU LOST😢‍🤦‍♂️"
				+ "\n😢🤷‍♀️🤦‍♂️MICKY CAUGHT U AND THROUGHT IT OUT😢🤷‍♀️🤦‍♂️"
				+ "\n\t↓ ↓ ↓ ↓");

	}
	else if(randomval==1&players==3)//paper.scissor
	{System.out.println("\n*************************************→ → →");
		System.out.println("\n\t😊🤞😉YOU WON THE MICKY😊🤞😉"
				+ "\n😊🤞😉U CAN CUT THE PAPER,BECAUSE U ARE SCISSOR😊🤞😉"
				+ "\n\t↓ ↓ ↓ ↓");
		
	}
	else if(randomval==2&players==1)//SCISSOR.ROCK
	{System.out.println("\n*************************************→ → →");
		System.out.println("\n\t😊🤞😉YOU WON THE MICKY😊🤞😉"
				+ "\n😊🤞😉YOU CAN BREAK THE MICKY EASY,BECAUSE U ARE ROCK😊🤞😉"
				+ "\n\t↓ ↓ ↓ ↓");
	score++;	
	}
	else if(randomval==2&players==2)//SCISSOR.PAPER
	{System.out.println("\n*************************************→ → →");
		System.out.println("\n\t😢‍🤦YOU LOST😢‍🤦‍♂️"
				+ "\n😢🤷‍♀️🤦MICKY CAN EASILY CUT U,BECAUSE U ARE PAPER😢🤷‍♀️🤦"
				+ "\n\t↓ ↓ ↓ ↓");

	}
	return score;
	}
	public static void main(String[] args) {
	
		System.out.println("\n🤞PLAY WITH ME NOW🤞");
		System.out.println("\t🤞✌😉ROCK →🎱← "
				+ "\n\t🤞✌😉PAPER →📃← "
				+ "\n\t🤞✌😉SCISSOR →✂← "
				+ "\n\t🤞✌😉GAME😉✌🤞"
				+ "\n🤞✌U HAVING ONLY 10 PLAY TURNS🤞✌");
		System.out.println("\n🤞✌😉GAME STARTED NOW😉✌🤞");
		
		Scanner sc=new Scanner(System.in);
		Stone_Paper_Game view=new Stone_Paper_Game();
		System.out.println("TYP START AND ENTER.");
		 String start=sc.nextLine();
		
		 int player;
		
		int a=0;
		 
while(a<=10)
    {
//0
	int randomvalu=(int)(Math.random() *2);
		int randomdemo=randomvalu;
		
		String value=view.main(randomdemo);	
		
		System.out.println("\n*************************************→ → →");
		System.out.println("\nYour Object In Below: "
				+ "\n\t1→ →ROCK →🎱←."
				+ "\n\t2→ →PAPER →📃←."
				+ "\n\t3→ →SCISSOR →✂←."
				+ "\n\t4→ →Tried →☹←");
		System.out.println("\nPLAY→ →");
		player=sc.nextInt();
		int scores=0;
		int tscore=(view.main1(player,randomvalu,scores));
		if(player==1)
		{
			String ro="ROCK →🎱←";
		System.out.println("\n YOU  ▶▶▶ "+ro);
		System.out.println("\n MICKY  ▶▶▶ "+value);
		
		}
		else if(player==2)
		{
			String pap="PAPER →📃←";
			System.out.println("\n YOU  ▶▶▶ "+pap);
			System.out.println("\n MICKY  ▶▶▶ "+value);
			
			
		
		}
		else if(player==3)
		{
			String sci="SCISSORS →✂←";
			System.out.println("\n YOU  ▶▶▶ "+sci);
			System.out.println("\n MICKY  ▶▶▶ "+value);
		
			
		}
		
		else if(player>4)
		{
			System.out.println("😒✌PLZ😒✌\n😁✌GIVE PLAY TURNS😁✌\n😁✌IN BELOW THE OPTIONS ONLY ACCEPTED😁✌");;
		}
		else {
			System.exit(0);
		}
	
		a++;
		
		}
}		
	
	}


