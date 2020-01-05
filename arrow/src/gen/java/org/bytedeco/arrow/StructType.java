// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Concrete type class for struct data */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class StructType extends NestedType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StructType(Pointer p) { super(p); }

  @MemberGetter public static native @Cast("const arrow::Type::type") int type_id();
  public static final int type_id = type_id();

  public static native String type_name();

  public StructType(@Const @ByRef FieldVector fields) { super((Pointer)null); allocate(fields); }
  private native void allocate(@Const @ByRef FieldVector fields);

  public native @ByVal DataTypeLayout layout();

  public native @StdString String ToString();
  public native @StdString String name();

  /** Returns null if name not found */
  public native @SharedPtr @ByVal Field GetFieldByName(@StdString String name);
  public native @SharedPtr @ByVal Field GetFieldByName(@StdString BytePointer name);

  /** Return all fields having this name */
  public native @ByVal FieldVector GetAllFieldsByName(@StdString String name);
  public native @ByVal FieldVector GetAllFieldsByName(@StdString BytePointer name);

  /** Returns -1 if name not found or if there are multiple fields having the
   *  same name */
  public native int GetFieldIndex(@StdString String name);
  public native int GetFieldIndex(@StdString BytePointer name);

  /** Return the indices of all fields having this name */
  public native @StdVector IntPointer GetAllFieldIndices(@StdString String name);
  public native @StdVector IntBuffer GetAllFieldIndices(@StdString BytePointer name);

  public native @Deprecated @SharedPtr @ByVal Field GetChildByName(@StdString String name);
  public native @Deprecated @SharedPtr @ByVal Field GetChildByName(@StdString BytePointer name);

  public native @Deprecated int GetChildIndex(@StdString String name);
  public native @Deprecated int GetChildIndex(@StdString BytePointer name);
}