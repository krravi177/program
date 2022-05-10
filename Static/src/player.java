public class player {
String name;
int indivisualScore;
static int totalTeamScore;
void play (int run) {
	this.indivisualScore=run;
	totalTeamScore=totalTeamScore+run;
	
}
public static void main(String[] args) {
	System.out.println("total Team Score="+player.totalTeamScore);
	player p1=new player();
	p1.name="kohli";p1.play(55);
	player p2=new player();
	p1.name="rohit";p2.play(200);
	player p3=new player();
	p1.name="Dhoni";p3.play(105);
	System.out.println("Total team Score="+player.totalTeamScore);
}

}
