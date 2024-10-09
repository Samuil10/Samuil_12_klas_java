package com.company;
class Book{
    private Author author;
    private int pagesCount;
    private String category;
    private String publisher;

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public void setCategory(String caetegory) {
        this.category = caetegory;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public String getCategory() {
        return category;
    }

    public String getPublisher() {
        return publisher;
    }
}
