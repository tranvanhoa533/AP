/***********************************************************************
 * Module:  Chapter.java
 * Author:  vanhoa
 * Purpose: Defines the Class Chapter
 ***********************************************************************/

import java.util.*;

/** @pdOid 573abb10-225e-4541-9b37-51e1ec9ffede */
public class Chapter {
   /** @pdOid b676eaff-86f0-4778-a4e0-cf81d6aa56c3 */
   public int chapterId;
   
   /** @pdRoleInfo migr=no name=Peple assc=author coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Peple> Compose;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Peple> getCompose() {
      if (Compose == null)
         Compose = new java.util.HashSet<Peple>();
      return Compose;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCompose() {
      if (Compose == null)
         Compose = new java.util.HashSet<Peple>();
      return Compose.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCompose */
   public void setCompose(java.util.Collection<Peple> newCompose) {
      removeAllCompose();
      for (java.util.Iterator iter = newCompose.iterator(); iter.hasNext();)
         addCompose((Peple)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPeple */
   public void addCompose(Peple newPeple) {
      if (newPeple == null)
         return;
      if (this.Compose == null)
         this.Compose = new java.util.HashSet<Peple>();
      if (!this.Compose.contains(newPeple))
      {
         this.Compose.add(newPeple);
         newPeple.addChapter(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldPeple */
   public void removeCompose(Peple oldPeple) {
      if (oldPeple == null)
         return;
      if (this.Compose != null)
         if (this.Compose.contains(oldPeple))
         {
            this.Compose.remove(oldPeple);
            oldPeple.removeChapter(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCompose() {
      if (Compose != null)
      {
         Peple oldPeple;
         for (java.util.Iterator iter = getIteratorCompose(); iter.hasNext();)
         {
            oldPeple = (Peple)iter.next();
            iter.remove();
            oldPeple.removeChapter(this);
         }
      }
   }

}