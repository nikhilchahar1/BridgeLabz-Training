import java.util.*;
public class StreamBuzz {
	
	public static void choiceMenu() {
		System.out.println("\n1. Register Creator");
		System.out.println("2. Get top post counts");
		System.out.println("3. Average Weekly Likes");
		System.out.println("4. EXIT\n");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Program p = new Program();
		boolean decision = true;
		
		while(decision) {
			choiceMenu();
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
				case 1 :
					System.out.println("Enter the Creator's name : ");
					String name = sc.nextLine();
					double[] likes = new double[4];
					System.out.println("Enter the weekly likes(1-4) : ");
					for(int i=0;i<4;i++) {
						double like = sc.nextDouble();
						likes[i] = like;
					}
					CreatorStats cs = new CreatorStats(name, likes);
					p.registerCreator(cs);
					System.out.println("Creator registered successfully!!\n");
					break;
				
				case 2 :
					System.out.println("Enter the threshold value : ");
					double threshold = sc.nextDouble();
					System.out.println(p.getTopPostCounts(threshold)); 
					break;
					
				case 3 :
					System.out.println(p.calculateAverageLikes());
					break;
					
				case 4 :
					decision = false;
					System.out.println("Logging off! - Keep creating with StreamBuzz");
			}
		}
	}
}