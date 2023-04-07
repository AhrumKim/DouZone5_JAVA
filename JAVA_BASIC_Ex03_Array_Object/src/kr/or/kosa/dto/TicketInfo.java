package kr.or.kosa.dto;

public class TicketInfo {
	
	private int row; // 행
	private int col; // 열
	private int ticekNum; // 티켓 번호
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public int getTicekNum() {
		return ticekNum;
	}
	public void setTicekNum(int ticekNum) {
		this.ticekNum = ticekNum;
	}

}
