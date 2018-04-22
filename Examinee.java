package cudosoft.demo.excercises;

public class Examinee {
	private String identificationNumber;
	private String fullName;
	private String address;
	private float priority;
	private BlockExamination blockExamination;

	public Examinee() {
		super();
	}

	public Examinee(String identificationNumber, String fullName, String address, float priority,
			BlockExamination blockExamination) {
		super();
		this.identificationNumber = identificationNumber;
		this.fullName = fullName;
		this.address = address;
		this.priority = priority;
		this.blockExamination = blockExamination;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getPriority() {
		return priority;
	}

	public void setPriority(float priority) {
		this.priority = priority;
	}

	public BlockExamination getBlockExamination() {
		return blockExamination;
	}

	public void setBlockExamination(BlockExamination blockExamination) {
		this.blockExamination = blockExamination;
	}

	

}
