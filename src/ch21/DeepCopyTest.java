package ch21;

public class DeepCopyTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		
		//복사 실시
		for (int i=0; i<5; i++) {
			copyLibrary[i] = new Book();
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		
		
		
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		for(Book book : copyLibrary) {
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
//			ch21.Book@129a8472
//			태백산맥1, 조정래
//			ch21.Book@1b0375b3
//			태백산맥2, 조정래
//			ch21.Book@2f7c7260
//			태백산맥3, 조정래
//			ch21.Book@2d209079
//			태백산맥4, 조정래
//			ch21.Book@6bdf28bb
//			태백산맥5, 조정래

		}
	}

}
