package kr.seacretdirect.mst.data.vo;

public class ProductVO {
	private String MEMBEREMAIL;
	private String MEMBERPW;
	
	public String getMEMBEREMAIL() {
		return MEMBEREMAIL;
	}
	public void setMEMBEREMAIL(String mEMBEREMAIL) {
		MEMBEREMAIL = mEMBEREMAIL;
	}
	public String getMEMBERPW() {
		return MEMBERPW;
	}
	public void setMEMBERPW(String mEMBERPW) {
		MEMBERPW = mEMBERPW;
	}
	
	@Override
	public String toString() {
		return "ProductVO [MEMBEREMAIL=" + MEMBEREMAIL + ", MEMBERPW=" + MEMBERPW + "]";
	}
	
}
