package model;

import java.util.Date;

public class CardBook {
    private int cardID;
    private int bookID;
    private int studentID;
    private boolean status;
    private Date dayBorrow;
    private Date dayReturn;

    public CardBook() {
    }

    public CardBook(int bookID, int studentID, boolean status, Date dayBorrow, Date dayReturn) {
        this.bookID = bookID;
        this.studentID = studentID;
        this.status = status;
        this.dayBorrow = dayBorrow;
        this.dayReturn = dayReturn;
    }

    public CardBook(int cardID, int bookID, int studentID, boolean status, Date dayBorrow, Date dayReturn) {
        this.cardID = cardID;
        this.bookID = bookID;
        this.studentID = studentID;
        this.status = status;
        this.dayBorrow = dayBorrow;
        this.dayReturn = dayReturn;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDayBorrow() {
        return dayBorrow;
    }

    public void setDayBorrow(Date dayBorrow) {
        this.dayBorrow = dayBorrow;
    }

    public Date getDayReturn() {
        return dayReturn;
    }

    public void setDayReturn(Date dayReturn) {
        this.dayReturn = dayReturn;
    }
}
