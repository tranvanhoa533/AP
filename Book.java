/***********************************************************************
 * Module:  Book.java
 * Author:  vanhoa
 * Purpose: Defines the Class Book
 ***********************************************************************/

import java.util.*;

/** @pdOid 1c2dde86-7716-47d6-b68b-0633ef54b7e2 */
public class Book {
   /** @pdOid 6f983c19-a0f0-421e-b141-89f0e3c09a66 */
   public java.lang.String title;
   /** @pdOid 1a777237-24f2-4939-8e0b-8593a9bb1986 */
   public java.lang.String description;
   /** @pdOid 31cfc224-da54-4b76-9158-f96340dc8a4b */
   public int ssid;
   /** @pdOid 8e7b341a-c904-4a41-8356-ec0216b7d9f2 */
   public java.util.Date publishDate;
   
   public java.util.Collection buying;
   /** @pdRoleInfo migr=no name=Chapter assc=contain coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Composition side=A */
   public java.util.Collection<Chapter> chapter;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Chapter> getChapter() {
      if (chapter == null)
         chapter = new java.util.HashSet<Chapter>();
      return chapter;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorChapter() {
      if (chapter == null)
         chapter = new java.util.HashSet<Chapter>();
      return chapter.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newChapter */
   public void setChapter(java.util.Collection<Chapter> newChapter) {
      removeAllChapter();
      for (java.util.Iterator iter = newChapter.iterator(); iter.hasNext();)
         addChapter((Chapter)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newChapter */
   public void addChapter(Chapter newChapter) {
      if (newChapter == null)
         return;
      if (this.chapter == null)
         this.chapter = new java.util.HashSet<Chapter>();
      if (!this.chapter.contains(newChapter))
         this.chapter.add(newChapter);
   }
   
   /** @pdGenerated default remove
     * @param oldChapter */
   public void removeChapter(Chapter oldChapter) {
      if (oldChapter == null)
         return;
      if (this.chapter != null)
         if (this.chapter.contains(oldChapter))
            this.chapter.remove(oldChapter);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllChapter() {
      if (chapter != null)
         chapter.clear();
   }

}