
package programa.biblioteca;

public class Propiedad {
    
    String title;
        String author;
        String genre;
        int DatePub;
        String avariable;
        int quantity;
        int loadtime;
        String User;
        int LoanDate;
        int ReturnDate;

    public Propiedad(String title, String author, String genre, int DatePub, String avariable, int quantity, int loadtime, String User, int LoanDate, int ReturnDate) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.DatePub = DatePub;
        this.avariable = avariable;
        this.quantity = quantity;
        this.loadtime = loadtime;
        this.User = User;
        this.LoanDate = LoanDate;
        this.ReturnDate = ReturnDate;
    }
        
    public Propiedad (){}
    
        public void saySomething() {
        System.out.println("Nombre del libro: "+this.title+this.author+""+this.genre+""+this.DatePub+""+this.avariable+""+this.quantity+this.loadtime+this.User+this.LoanDate+this.ReturnDate);
        }
        
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDatePub() {
        return DatePub;
    }

    public void setDatePub(int DatePub) {
        this.DatePub = DatePub;
    }

    public String getAvariable() {
        return avariable;
    }

    public void setAvariable(String avariable) {
        this.avariable = avariable;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getLoadtime() {
        return loadtime;
    }

    public void setLoadtime(int loadtime) {
        this.loadtime = loadtime;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public int getLoanDate() {
        return LoanDate;
    }

    public void setLoanDate(int LoanDate) {
        this.LoanDate = LoanDate;
    }

    public int getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(int ReturnDate) {
        this.ReturnDate = ReturnDate;
    }
    
        
}

