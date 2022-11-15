package datastructure.arrays.java;

public class ChemicalElement implements Comparable<ChemicalElement> {

		int atomicNumber;
		String atomicName;
		String atomicFormula;
		float  atomicWeght;
		
		ChemicalElement right;
		ChemicalElement left;
		
		public ChemicalElement(int atomicNumber, String atomicName, String atomicFormula, float atomicWeght) {
			super();
			this.atomicNumber = atomicNumber;
			this.atomicName = atomicName;
			this.atomicFormula = atomicFormula;
			this.atomicWeght = atomicWeght;
		}
		public ChemicalElement() {
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicFormula="
					+ atomicFormula + ", atomicWeght=" + atomicWeght + "]";
		}
		@Override
		public int compareTo(ChemicalElement o) {
			System.out.println("Comparing "+atomicNumber+"with"+o.atomicNumber);
			   Integer y = Integer.compare(atomicNumber, o.atomicNumber);
			return y;
		}
		
		
}
