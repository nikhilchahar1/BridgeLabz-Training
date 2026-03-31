import java.util.*;
public class Program {

	public static List<CreatorStats> engagementBoard = new ArrayList<>();
	
	public void registerCreator(CreatorStats record) {
		engagementBoard.add(record);
	}
	
	public Map<String, Integer> getTopPostCounts(double likeThreshold) {
		HashMap<String, Integer> map = new HashMap<>();
		
		for(CreatorStats record : engagementBoard) {
			int count = 0;
			for(double likes : record.weeklyLikes) {
				if(likes >= likeThreshold) {
					count++;
					
				}
			}
			if(count>0) {
				map.put(record.creatorName, count);
			}
		}
		
		if(map.isEmpty()) {
			System.out.println("no top post this week!!");
		}
		else {
			System.out.println("\nTop post count : ");
		}
		
		return map; 
	}
	
	public double calculateAverageLikes() {
		int weeks = 0, likes = 0;
		for(CreatorStats record : engagementBoard) {
			weeks += 4;
			for(double l : record.weeklyLikes) {
				likes += l;
			}
		}
		
		double averageLikes = likes/weeks;
		return averageLikes;  
	}
	
}