
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Personne jean = new Personne();
		jean.setName("Jean");
		jean.setMarried(false);
		
		Personne jeanne = new Personne();
		jeanne.setName("Jeanne");
		jeanne.setMarried(false);

		jean.seMarier(jeanne);
		
		
		
		
		Friend mickmick = new Friend();
		mickmick.setName("Mickmick");
		
		Friend abdou = new Friend();
		abdou.setName("Abdou");
		
		jean.addFriend(mickmick);
		jean.addFriend(mickmick);
		jean.removeFriend(abdou);
		jean.removeFriend(mickmick);
		
		jean.seMarier(mickmick);
		jean.divorcer(jeanne);
		
	}

}
