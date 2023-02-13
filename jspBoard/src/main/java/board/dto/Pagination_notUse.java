package board.dto;

public class Pagination_notUse {
	
	private int page;
	private int size;
	
	public Pagination_notUse(int page, int size) {
		this.page = page;
		this.size = size;
	}
	
	public int getStartIndex() {
		return (page - 1) * size;
	}
	
	public int getEndIndex() {
		return page * size;
	}
	
	public int getPaginationStart() {
		return (page / size) * size + 1;
	}
	
	public int getPaginationEnd() {
		if (page % 10 == 0) {
			return (page / size) * size; 
		} else {
			return (page / size + 1) * size;
		}

	}
	
}
