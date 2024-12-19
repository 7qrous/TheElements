
public class Main {
	public static void main(String[] args) {
		Tester t = new Tester();
		Card c1 = new Card(CardType.FIRE, 1);
		Card c2 = new Card(CardType.FIRE, 1);
		System.out.println(t.compare(c1, c2));

		Card c11 = new Card(CardType.FIRE, 1);
		Card c22 = new Card(CardType.FIRE, 2);
		System.out.println(t.compare(c11, c22));

		Card c111 = new Card(CardType.FIRE, 1);
		Card c222 = new Card(CardType.WATER, 1);
		System.out.println(t.compare(c111, c222));

		Card c1111 = new Card(CardType.WATER, 1);
		Card c2222 = new Card(CardType.FIRE, 1);
		System.out.println(t.compare(c1111, c2222));
	}
}
