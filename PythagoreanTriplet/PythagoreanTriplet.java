import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class PythagoreanTriplet {
	int bs;
	int ht;
	int hy;
	PythagoreanTriplet(int bs, int ht, int hy) {
		this.bs = bs;
		this.ht = ht;
		this.hy = hy;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bs, ht, hy);
	}
	@Override
	public boolean equals(Object obj) {
		PythagoreanTriplet other = (PythagoreanTriplet) obj;
		return bs == other.bs && ht == other.ht && hy == other.hy;
	}
	int calculateSum() {
		return bs + ht + hy;
	}
	long calculateProduct() {
		return bs * ht * hy;
	}
	boolean isPythagorean() {
		return bs * bs + ht * ht == hy * hy;
	}
	static PythagoreanTripletBuilder makeTripletsList() {
		return new PythagoreanTripletBuilder();
	}
}
class PythagoreanTripletBuilder {
	int upper;
	Integer sum;
	PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int upper) {
		this.upper = upper;
		return this;
	}
	PythagoreanTripletBuilder thatSumTo(int sum) {
		this.sum = sum;
		return this;
	}
	List<PythagoreanTriplet> build() {
		List<PythagoreanTriplet> result = new ArrayList<PythagoreanTriplet>();
		for (int bs = 1; bs <= upper; bs++) {
			for (int ht = bs + 1; ht <= upper; ht++) {
				int hy = (int) Math.round(Math.sqrt(bs * bs + ht * ht));
				if (hy > upper) {
					break;
				}
				PythagoreanTriplet pt = new PythagoreanTriplet(bs, ht, hy);
				if (pt.isPythagorean() && (sum == null || pt.calculateSum() == sum)) {
					result.add(pt);
				}
			}
		}
		return result;
	}
}