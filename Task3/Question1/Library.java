package GUVI_CLASSTASKS.Task3.Question1;
public class Library{
    private Book[] books;
    public Library() { // initialized Book array and added few books
        this.books = new Book[5];
        books[0]=new Book(21,"Politics","Aristotle",true);
        books[1]=new Book(22,"Republic","Plato",true);
        books[2]=new Book(23,"Hamlet","Shakespeare",true);
    }
    // Method to add a book to library
    public void addBooks(Book book,int position){
        books[position]=book;
    }
    // Method to remove a book to library
    public void removeBooks(String bookname){
        for(int i=0;i<5;i++){
            String bookName=books[i].getTitle();
            if (bookName.equals(bookname)){
                books[i].setAvailable(false);
            }
        }
    }
    // Method to search for a book
    public void searchBooks(int bookID){
        for(int i=0;i<5;i++){
            int bookid=books[i].getBookID();
            if (bookid==bookID){
                if(books[i].isAvailable()){
                    System.out.println(bookID+" "+"'"+books[i].getTitle()+"'"+" book is available");
                }else{
                    System.out.println(bookID+" "+"'"+books[i].getTitle()+"'"+" book is not available");
                }
            }
        }
    }
    // Method to display all books in library
    public void display(){
        System.out.println("Books in this library");
        for(int i=0;i<5;i++){
            System.out.println("Book ID : "+books[i].getBookID()+" Book name : "+books[i].getTitle()+
            " Author name : "+books[i].getAuthor()+" Available or not : "+ (books[i].isAvailable()? "Available":"Not Available"));
        }
    }
}