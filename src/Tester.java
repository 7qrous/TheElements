
public class Tester {
	public int compare(Card c1, Card c2) {
		int typeResult = compareType(c1.type, c2.type);
		int compareResult = comparePower(c1.power, c2.power);
		if (typeResult == 0 ) {
			return compareResult;
		} else {
			return typeResult;
		}
	}

	public int comparePower(int p1, int p2) {

		if (p1 > p2) {
			return 1;
		} else if (p1 == p2) {
			return 0;
		} else {
			return -1;
		}
	}

	public int compareType(int t1, int t2) {
		int[][] typeTable = new int[][] { { 0, 1, 0, -1 }, { -1, 0, 1, 0 }, { 0, -1, 0, 0 }, { 1, 0, -1, 0 } };
		return typeTable[t2][t1];
	}
}
