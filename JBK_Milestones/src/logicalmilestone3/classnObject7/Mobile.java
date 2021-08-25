package logicalmilestone3.classnObject7;
//4. W.A.java program create a class Mobile [model_no, model_name, cost] 
//Accept 5 Mobiles details and display it.(use Constructor and array of Objects).

public class Mobile {
	
	int model_no;
	String model_name;
	float cost;
	
	public Mobile(int model_no, String model_name, float cost) {
		this.model_no = model_no;
		this.model_name = model_name;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Mobile [model_no=" + model_no + ", model_name=" + model_name + ", cost=" + cost + "]";
	}
	
	
	

}
