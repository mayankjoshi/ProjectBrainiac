package my.interview.questions.thread;

public class SyncronizedExample {
	
	public static void main(String args[]){
		
	}

}


class MyClass {
	
	public synchronized  void syncMethod(){
		
		while(true){
			try{
				System.out.println("Inside Sync Method");
				wait(30000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
public  void aSyncMethod(){
		
		while(true){
			try{
				System.out.println("Inside ASync Method");
				wait(30000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
