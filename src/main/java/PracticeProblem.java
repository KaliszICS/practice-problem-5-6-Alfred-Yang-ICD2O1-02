public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int getAge(String[] buh, int[] sho, String duh){
		int i = 0;
		int chud = 0;
		for(i = 0; i<buh.length; i++){
			if (buh[i].equals(duh)){
				chud = i;
				i = 999999999;
			}
		}
		return sho[chud];
	}

	public static int[] createLengthArray(String[] buh){

		int[] awray = new int[buh.length];

		int i = 0;
		for (i = 0; i<buh.length; i++){
			awray[i] = buh[i].length();

		}
		return awray;

	}


	public static void swapPeople(String[] buh, int[] duh, String shud, String cud){
		int i = 0;
		int firsti = 0;
		int sndi = 0;
		String newbuh;
		boolean done = false;
		boolean done2 = false;
		for (i = 0; i<buh.length; i++){
			if (buh[i].contains(shud) && done == false){
				firsti = i;	done = true;}
			if (buh[i].contains(cud) && done2 == false){
				sndi = i; done2 = true;
			}
		}
		int newint;
		newbuh = buh[firsti];
		buh[firsti] = buh[sndi];
		buh[sndi] = newbuh;

		newint = duh[firsti];
		duh[firsti] = duh[sndi];
		duh[sndi] = newint;

	}

}
