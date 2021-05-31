// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


@Namespace("tflite") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteIntArrayDeleter extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TfLiteIntArrayDeleter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TfLiteIntArrayDeleter(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteIntArrayDeleter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TfLiteIntArrayDeleter position(long position) {
        return (TfLiteIntArrayDeleter)super.position(position);
    }
    @Override public TfLiteIntArrayDeleter getPointer(long i) {
        return new TfLiteIntArrayDeleter((Pointer)this).offsetAddress(i);
    }

  public native @Name("operator ()") void apply(TfLiteIntArray a);
}