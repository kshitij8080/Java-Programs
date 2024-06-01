import java.util.*;
public class cricketplayer {
	String playername;
	int innings,notout,totalruns;
	float batavarage;
	
	void accept() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Player Name:");
		playername=s.next();
		System.out.println("Enter Number of innings:");
		innings=s.nextInt();
		System.out.println("Enter Number of not out's:");
		notout=s.nextInt();
		System.out.println("Enter total Runs:");
		totalruns=s.nextInt();
		batavarage=avg(innings,totalruns,notout);
	}
	static float avg(int innings,int totalruns,int notout) {
		return totalruns/(innings-notout);
	}
	static void sort(cricketplayer ob[],int n) {
		int i,pass;
		for(pass=1;pass<n;pass++) {
			for(i=1;i<n-pass;i++) {
				if(ob[i].batavarage<ob[i+1].batavarage) {
					cricketplayer t=ob[i];
					ob[i]=ob[i+1];
					ob[i+1]=t;
				}
			}
		}
		for(i=0;i<n;i++) {
			System.out.println(ob[i].playername+"\t"+ob[i].innings+"\t"+ob[i].notout+"\t"
					+ob[i].totalruns+"\t"+ob[i].batavarage);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Limit:");
		int n=s.nextInt();
		cricketplayer ob[]=new cricketplayer[n];
		for(int i=0;i<n;i++) {
			ob[i]=new cricketplayer();
			ob[i].accept();
		}
		sort(ob,n);
	}
}
