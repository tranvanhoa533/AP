/***********************************************************************
 * Module:  Peple.java
 * Author:  vanhoa
 * Purpose: Defines the Class Peple
 ***********************************************************************/

import java.util.*;

/** @pdOid d43b117f-d679-4f93-8a00-fd5a7398c13e */
public class Peple {
   /** @pdOid d61bd091-363e-45a3-aee6-b32993858073 */
   public java.lang.String name;
   /** @pdOid 58a2d84d-9183-4501-ab0c-3e722cdbe6bc */
   public java.util.Date doB;
   /** @pdOid 2c8592f8-e288-4709-8ed3-a20aa14c9a1a */
   public int peopleId;
   
   public java.util.Collection buying;
   /** @pdRoleInfo migr=no name=Chapter assc=author coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A */
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
      {
         this.chapter.add(newChapter);
         newChapter.addCompose(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldChapter */
   public void removeChapter(Chapter oldChapter) {
      if (oldChapter == null)
         return;
      if (this.chapter != null)
         if (this.chapter.contains(oldChapter))
         {
            this.chapter.remove(oldChapter);
            oldChapter.removeCompose(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllChapter() {
      if (chapter != null)
      {
         Chapter oldChapter;
         for (java.util.Iterator iter = getIteratorChapter(); iter.hasNext();)
         {
            oldChapter = (Chapter)iter.next();
            iter.remove();
            oldChapter.removeCompose(this);
         }
      }
   }

}