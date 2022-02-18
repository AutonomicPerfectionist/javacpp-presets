// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;


/** 
 * 2D Npp64f Point
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class NppiPoint64f extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppiPoint64f() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppiPoint64f(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiPoint64f(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppiPoint64f position(long position) {
        return (NppiPoint64f)super.position(position);
    }
    @Override public NppiPoint64f getPointer(long i) {
        return new NppiPoint64f((Pointer)this).offsetAddress(i);
    }

    /**  x-coordinate. */
    public native @Cast("Npp64f") double x(); public native NppiPoint64f x(double setter);
    /**  y-coordinate. */
    public native @Cast("Npp64f") double y(); public native NppiPoint64f y(double setter);
}