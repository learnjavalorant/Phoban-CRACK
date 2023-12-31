package camchua.phoban.nbtapi;

public class NBTListCompound extends NBTCompound {
   private NBTList<?> owner;
   private Object compound;

   protected NBTListCompound(NBTList<?> parent, Object obj) {
      super((NBTCompound)null, (String)null);
      this.owner = parent;
      this.compound = obj;
   }

   public NBTList<?> getListParent() {
      return this.owner;
   }

   public Object getCompound() {
      return this.compound;
   }

   protected void setCompound(Object compound) {
      this.compound = compound;
   }

   protected void saveCompound() {
      this.owner.save();
   }
}
