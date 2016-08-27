import java.util.HashMap;
import java.util.PriorityQueue;

public class Hauffman {

	//calculate the alphabet frequency 
	private void calculateFrequency(String inputString){

		HashMap<Character,Integer> hash = new HashMap<Character,Integer>();

		for(int counter = 0;counter < inputString.length();counter++){

			char inputStringtoCharacter = inputString.charAt(counter);

			if(hash.containsKey(inputStringtoCharacter)){

				int currentFrequencyofThealphabet = hash.get(inputStringtoCharacter);
				hash.put(inputStringtoCharacter, currentFrequencyofThealphabet+1);

			}
			else{

				hash.put(inputStringtoCharacter,1);

			}

		}
		prioritize(hash);
	}

	//priority queue to get the minimal elements in hashmap
	public void prioritize(HashMap inputHash){
		
		PriorityQueue<Integer> minimalElement = new PriorityQueue<Integer>(inputHash.values());
		
		
	}
	
	public static void main(String args[]){

		Hauffman trial = new Hauffman();
		trial.calculateFrequency("This is saranya");
	}
}
