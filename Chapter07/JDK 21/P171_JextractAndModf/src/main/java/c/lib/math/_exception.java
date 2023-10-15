// Generated by jextract

package c.lib.math;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _exception {
 *     int type;
 *     char* name;
 *     double arg1;
 *     double arg2;
 *     double retval;
 * };
 * }
 */
public class _exception {

    public static MemoryLayout $LAYOUT() {
        return constants$8.const$0;
    }
    public static VarHandle type$VH() {
        return constants$8.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$8.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$8.const$1.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$8.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$8.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle name$VH() {
        return constants$8.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static MemorySegment name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$8.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static void name$set(MemorySegment seg, MemorySegment x) {
        constants$8.const$2.set(seg, x);
    }
    public static MemorySegment name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$8.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$8.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle arg1$VH() {
        return constants$8.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double arg1;
     * }
     */
    public static double arg1$get(MemorySegment seg) {
        return (double)constants$8.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double arg1;
     * }
     */
    public static void arg1$set(MemorySegment seg, double x) {
        constants$8.const$3.set(seg, x);
    }
    public static double arg1$get(MemorySegment seg, long index) {
        return (double)constants$8.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void arg1$set(MemorySegment seg, long index, double x) {
        constants$8.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle arg2$VH() {
        return constants$8.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double arg2;
     * }
     */
    public static double arg2$get(MemorySegment seg) {
        return (double)constants$8.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double arg2;
     * }
     */
    public static void arg2$set(MemorySegment seg, double x) {
        constants$8.const$4.set(seg, x);
    }
    public static double arg2$get(MemorySegment seg, long index) {
        return (double)constants$8.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void arg2$set(MemorySegment seg, long index, double x) {
        constants$8.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle retval$VH() {
        return constants$8.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double retval;
     * }
     */
    public static double retval$get(MemorySegment seg) {
        return (double)constants$8.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double retval;
     * }
     */
    public static void retval$set(MemorySegment seg, double x) {
        constants$8.const$5.set(seg, x);
    }
    public static double retval$get(MemorySegment seg, long index) {
        return (double)constants$8.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void retval$set(MemorySegment seg, long index, double x) {
        constants$8.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

