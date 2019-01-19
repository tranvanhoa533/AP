/***********************************************************************
 * Module:  Library.java
 * Author:  vanhoa
 * Purpose: Defines the Class Library
 ***********************************************************************/

import java.util.*;

/** @pdOid 6d436d0c-5f5d-4295-a576-5623ee6a67a5 */
public class Library {
   /** @pdOid c7e5b9db-889b-4eeb-a78d-5b1d34ebe5f1 */
   public java.lang.String address;
   /** @pdOid 6399fc86-c405-492f-9eaa-9966ab3f5e01 */
   public int libraryId;
   
   /** @pdRoleInfo migr=no name=Book assc=belongto coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A */
   public java.util.Collection<Book> book;
   /** @pdRoleInfo migr=no name=Peple assc=librarian mult=1..1 side=A */
   public Peple peple;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Book> getBook() {
      if (book == null)
         book = new java.util.HashSet<Book>();
      return book;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBook() {
      if (book == null)
         book = new java.util.HashSet<Book>();
      return book.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBook */
   public void setBook(java.util.Collection<Book> newBook) {
      removeAllBook();
      for (java.util.Iterator iter = newBook.iterator(); iter.hasNext();)
         addBook((Book)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBook */
   public void addBook(Book newBook) {
      if (newBook == null)
         return;
      if (this.book == null)
         this.book = new java.util.HashSet<Book>();
      if (!this.book.contains(newBook))
         this.book.add(newBook);
   }
   
   /** @pdGenerated default remove
     * @param oldBook */
   public void removeBook(Book oldBook) {
      if (oldBook == null)
         return;
      if (this.book != null)
         if (this.book.contains(oldBook))
            this.book.remove(oldBook);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBook() {
      if (book != null)
         book.clear();
   }

}