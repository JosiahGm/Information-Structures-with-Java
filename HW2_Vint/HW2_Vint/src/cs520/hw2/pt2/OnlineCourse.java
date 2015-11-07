package cs520.hw2.pt2;

public class OnlineCourse extends Course {

	private int technologyFee;
	
	//OnlineCourse constructor including technology fee
	public OnlineCourse(String courseName, int costPerCredit, 
			int numberOfCredits, int technologyFee){
		
		super(courseName, costPerCredit, numberOfCredits);
		this.technologyFee = technologyFee; 
		
		System.out.print(", TechnologyFee = " + getTechnologyFee());
	}
	
	//technology fee set method
	public void setTechnologyFee(int techFee){
		technologyFee = techFee;
	}
	
	//technology fee get method
	public int getTechnologyFee(){
		return technologyFee;
	}
	
	//override tuition calculation method to include technology fee
	public int getTotalTuition(){
		return getCostPerCredit() * getNumberOfCredits() + getTechnologyFee(); 
	}
	
	//override method to print OnlineCourse info
	public String toString(){
		return "OnlineCourse: " + getCourseName() + " @ $" + getTotalTuition();
	}
	
}
