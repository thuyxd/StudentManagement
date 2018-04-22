package cudosoft.demo.excercises;

public class BlockExamination {
	private String examOne;
	private String examTwo;
	private String examThree;

	public BlockExamination() {
		super();
	}

	public BlockExamination(String examOne, String examTwo, String examThree) {
		super();
		this.examOne = examOne;
		this.examTwo = examTwo;
		this.examThree = examThree;
	}

	public String getExamOne() {
		return examOne;
	}

	public void setExamOne(String examOne) {
		this.examOne = examOne;
	}

	public String getExamTwo() {
		return examTwo;
	}

	public void setExamTwo(String examTwo) {
		this.examTwo = examTwo;
	}

	public String getExamThree() {
		return examThree;
	}

	public void setExamThree(String examThree) {
		this.examThree = examThree;
	}

	public BlockExamination inputBlockExamination(String blockExamination) {
		do {
			switch (blockExamination.toUpperCase()) {
			case "A": {
				BlockExamination BlockA = new BlockExamination("Math", "Physical", "Chemistry");
				return BlockA;
			}
			case "B": {
				BlockExamination BlockB = new BlockExamination("Math", "Chemistry", "Biology");
				return BlockB;
			}
			case "C": {
				BlockExamination BlockC = new BlockExamination("Literary", "History", "Geography");
				return BlockC;
			}
			case "D": {
				BlockExamination BlockD = new BlockExamination("Math", "Literary", "English");
				return BlockD;
			}
			default:
				System.out.println("Please enter block examination again!!!");
				break;
			}
		} while (!(blockExamination.equals("A") || blockExamination.equals("B") || blockExamination.equals("C")
				|| blockExamination.equals("D")));

		return null;
	}
}
