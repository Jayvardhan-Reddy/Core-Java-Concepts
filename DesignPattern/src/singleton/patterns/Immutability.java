package Archive_service;

public final class Immutability {

	private int i;

	Immutability(int i) {
		this.i = i;
	}

	private Immutability modify(int i) {

		if (this.i == i) {
			return this;
		} else {
			return new Immutability(i);
		}
	}

	public static void main(String[] args) {
		
		Immutability i = new Immutability(10);
		Immutability i1 = i.modify(100);
		Immutability i2 = i.modify(10);
		
		System.out.println(i == i1);
		System.out.println(i == i2);
		System.out.println(i == i);
	}

}
