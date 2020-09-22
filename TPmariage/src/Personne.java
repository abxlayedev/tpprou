

import java.util.ArrayList;
import java.util.List;

public class Personne {

	private String name;
	private boolean married;
	private List<Friend> listFriend;
	private List<Personne> listConjoint;
	private boolean isDejaAmis;
	
	
	public Personne() {
		listFriend = new ArrayList();
		listConjoint = new ArrayList();
	}


	public void addFriend(Friend friend) {
		
		checkIfFriendIsFriend(friend);
		
		
		if ( isDejaAmis == true ) {
			System.out.println("Vous etes déjà amls !");
		} else {
			listFriend.add(friend);
			System.out.println("Félicitation ! Vous etes amls !");
		}
	}
	
	public void removeFriend(Friend friend) {
		
		checkIfFriendIsFriend(friend);
		
		if ( isDejaAmis == true ) {
			System.out.println("Félicitation ! Vous n'êtes plus amis .... :/ ");
			listFriend.remove(friend);
		} else {
			System.out.println("C'est pas ton amis déjà que t'as pas d'amis tu veux perdre des amis que t'as pas ...");
		}
		
	}
	
	public void checkIfFriendIsFriend(Friend friend) {
		
		isDejaAmis = false;
		
		listFriend.forEach((ami)-> { 
			if (ami.getName().equals(friend.getName())) {
				isDejaAmis = true;
			}
		});
	}
	
	
	public void seMarier(Personne personne) {
		
		if ( listConjoint.size() > 1 ) {
			
			System.out.println("T'es déjà marié wesh !");

		} else {
			if ( !this.isMarried() && !personne.isMarried() ) {
				
				System.out.println("Felicitation "+this.name+" et "+personne.getName()+" Vous êtes marié !");
				this.setMarried(true);
				personne.setMarried(true);
				listConjoint.add(personne);
			} else if  ( this.isMarried() || personne.isMarried() ) {
				
				System.out.println("Attends quoi ? Tu trompes ton conjoint ?! Bah bravo !");
				
			}  else {
				System.out.println("Pas de polygamie dans ce pays merci au revoir. Mais je connais un endroit où tu peux te marier avec plusieurs personne ;)...");
			}
		}
		
		
	}
	
	
	public void divorcer(Personne personne) {
		if ( this.isMarried() && personne.isMarried() ) {
			
			System.out.println("Felicitation "+this.name+" et "+personne.getName()+" Vous êtes divorcé !");
			this.setMarried(false);
			personne.setMarried(false);
		} else if  ( !this.isMarried() || !personne.isMarried() ) {
			
			System.out.println("Déjà maries toi après on verra !");

		}  else {
			System.out.println("Tu ne peux pas divorcer !");
		}
	}


	////////////////////////////////////////////////////////////////////////////////////
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	

	public boolean isDejaAmis() {
		return isDejaAmis;
	}

	public void setDejaAmis(boolean isDejaAmis) {
		this.isDejaAmis = isDejaAmis;
	}
}
