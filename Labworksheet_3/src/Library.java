import java.util.*;

public class Library {
    private List<BorrowableItems> BorrowableItemsList = new ArrayList<>();

    public void addLibraryItem(BorrowableItems item){
        BorrowableItemsList.add(item);
    }

    public void checkoutItem(String title){
        for (BorrowableItems item:BorrowableItemsList){
            if (item instanceof Book){
                Book book= (Book) item;
                if (book.getTitle().equals(title) && book.isAvailable()){
                    book.setAvailable(false);
                    System.out.println("Checked out: " + title);
                    System.out.println();
                    return;
                }
            }
        }
        System.out.println("Book not found or already checked out: \n" + title);
    }

    public void  listAvailableItems() {
        System.out.println("All available items in the library..........\n");

        for (BorrowableItems item : BorrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isAvailable()){
                    book.displayInfo();
                }
            }
        }
    }

    public void displayLibraryInfo(){
        System.out.println("Total number of available items: " + BorrowableItemsList.size());
    }

}
