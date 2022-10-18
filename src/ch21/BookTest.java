package ch21;

public class BookTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		//Book 5개를 위한 메모리 공간을 확보.
//		for (int i=0; i<library.length ; i++) {
//			System.out.println(library[i]);
		//null, null, null, null, null
//		}
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
//			ch21.Book@7d417077
//			태백산맥1, 조정래
//			ch21.Book@3cb5cdba
//			태백산맥2, 조정래
//			ch21.Book@56cbfb61
//			태백산맥3, 조정래
//			ch21.Book@1134affc
//			태백산맥4, 조정래
//			ch21.Book@d041cf
//			태백산맥5, 조정래
		}
		
	}

}
