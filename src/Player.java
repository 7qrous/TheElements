import java.util.Collections;
import java.util.Stack;

public class Player {
	String name;
	Stack<Card> cardStack;

	public Player(String name) {
		this.name = name;
		cardStackInit();

	}

	public void cardStackInit() {
		cardStack = new Stack<Card>();
		for (int type = 0; type < 4; type++) {
			for (int power = 1; power <= 3; power++) {
				Card c = new Card(power, type);
				cardStack.push(c);
			}
		}
		randomize();
	}

	public void randomize() {
		Collections.shuffle(cardStack);
	}
}
