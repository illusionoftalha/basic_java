/** Objects combine state with operations that protect that state. */
public class ClassesAndObjects {
    public static class Book {
        private final String title;
        private boolean borrowed;

        public Book(String title) {
            if (title == null || title.trim().isEmpty()) {
                throw new IllegalArgumentException("title cannot be blank");
            }
            this.title = title.trim();
        }

        public String getTitle() { return title; }
        public boolean isBorrowed() { return borrowed; }

        public void borrow() {
            if (borrowed) {
                throw new IllegalStateException("book is already borrowed");
            }
            borrowed = true;
        }

        public void returnBook() { borrowed = false; }
    }

    public static void main(String[] args) {
        Book book = new Book("Learning Java");
        book.borrow();
        System.out.println(book.getTitle() + ": borrowed=" + book.isBorrowed());
        book.returnBook();
        System.out.println(book.getTitle() + ": borrowed=" + book.isBorrowed());
    }
}
