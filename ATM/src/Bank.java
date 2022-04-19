
public class Bank {
	
	private String name;
	
	private ArrayList<User> users;
	
	private ArrayList<Account> accounts; 
	
	public String getNewUserUUID(){
	
		//init
		String uuid;
		Random rng= new Random();
		int len=6;
		boolean nonUnique;
		
		//continue looping untill we get a unique ID
		do{
			
			//generate the number
			uuid= "";
			for(int c=0;c<len;c++){
				uuid +=(Integer)rng.nextInt(10).toString();
			}
			
			//check to make sure it's unique
			nonUnique= false;
			for(User u : this.users){
				if(uuid.compareTo(u.getUUID())==0){
					nonUnique=true;
					break;
				}
			}
			
		}while(nonUnique);
		
		return uuid;
	}

	public String getNewAccountUUID(){
		
	}

	
}
