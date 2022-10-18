package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		
		//복사 실시
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
	}

}
