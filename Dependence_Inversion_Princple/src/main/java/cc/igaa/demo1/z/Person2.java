package cc.igaa.demo1.z;

public class Person2 {
    private IBook iBook;
    
    public void read(){
        System.out.println("我读了一本" + iBook.getContent());
    }
    
    public void setiBook(IBook iBook){
        this.iBook = iBook;
    }
}
