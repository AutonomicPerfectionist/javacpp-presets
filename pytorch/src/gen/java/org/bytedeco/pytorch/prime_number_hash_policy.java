// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;
 // namespace detailv3

@Namespace("ska_ordered") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class prime_number_hash_policy extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public prime_number_hash_policy() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public prime_number_hash_policy(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public prime_number_hash_policy(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public prime_number_hash_policy position(long position) {
        return (prime_number_hash_policy)super.position(position);
    }
    @Override public prime_number_hash_policy getPointer(long i) {
        return new prime_number_hash_policy((Pointer)this).offsetAddress(i);
    }

  public static native @Cast("uint64_t") long mod0(@Cast("uint64_t") long arg0);
  public static native @Cast("uint64_t") long mod2(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod3(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod5(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod7(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod11(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod13(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod17(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod23(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod29(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod37(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod47(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod59(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod73(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod97(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod127(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod151(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod197(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod251(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod313(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod397(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod499(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod631(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod797(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod1009(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod1259(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod1597(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod2011(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod2539(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod3203(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod4027(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod5087(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod6421(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod8089(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod10193(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod12853(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod16193(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod20399(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod25717(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod32401(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod40823(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod51437(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod64811(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod81649(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod102877(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod129607(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod163307(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod205759(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod259229(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod326617(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod411527(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod518509(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod653267(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod823117(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod1037059(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod1306601(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod1646237(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod2074129(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod2613229(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod3292489(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod4148279(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod5226491(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod6584983(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod8296553(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod10453007(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod13169977(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod16593127(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod20906033(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod26339969(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod33186281(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod41812097(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod52679969(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod66372617(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod83624237(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod105359939(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod132745199(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod167248483(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod210719881(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod265490441(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod334496971(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod421439783(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod530980861(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod668993977(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod842879579(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod1061961721(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod1337987929(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod1685759167(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod2123923447(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod2675975881(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod3371518343(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod4247846927(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod5351951779(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod6743036717(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod8495693897(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod10703903591(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod13486073473(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod16991387857(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod21407807219(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod26972146961(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod33982775741(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod42815614441(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod53944293929(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod67965551447(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod85631228929(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod107888587883(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod135931102921(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod171262457903(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod215777175787(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod271862205833(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod342524915839(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod431554351609(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod543724411781(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod685049831731(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod863108703229(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod1087448823553(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod1370099663459(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod1726217406467(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod2174897647073(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod2740199326961(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod3452434812973(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod4349795294267(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod5480398654009(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod6904869625999(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod8699590588571(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod10960797308051(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod13809739252051(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod17399181177241(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod21921594616111(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod27619478504183(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod34798362354533(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod43843189232363(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod55238957008387(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod69596724709081(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod87686378464759(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod110477914016779(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod139193449418173(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod175372756929481(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod220955828033581(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod278386898836457(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod350745513859007(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod441911656067171(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod556773797672909(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod701491027718027(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod883823312134381(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod1113547595345903(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod1402982055436147(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod1767646624268779(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod2227095190691797(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod2805964110872297(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod3535293248537579(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod4454190381383713(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod5611928221744609(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod7070586497075177(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod8908380762767489(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod11223856443489329(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod14141172994150357(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod17816761525534927(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod22447712886978529(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod28282345988300791(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod35633523051069991(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod44895425773957261(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod56564691976601587(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod71267046102139967(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod89790851547914507(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod113129383953203213(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod142534092204280003(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod179581703095829107(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod226258767906406483(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod285068184408560057(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod359163406191658253(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod452517535812813007(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod570136368817120201(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod718326812383316683(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod905035071625626043(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod1140272737634240411(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod1436653624766633509(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod1810070143251252131(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod2280545475268481167(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod2873307249533267101(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod3620140286502504283(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod4561090950536962147(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod5746614499066534157(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod7240280573005008577(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod9122181901073924329(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod11493228998133068689(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod14480561146010017169(@Cast("uint64_t") long hash);
  public static native @Cast("uint64_t") long mod18446744073709551557(@Cast("uint64_t") long hash);

  public static class mod_function extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    mod_function(Pointer p) { super(p); }
      protected mod_function() { allocate(); }
      private native void allocate();
      public native @Cast("uint64_t") long call(@Cast("uint64_t") long arg0);
  }

  public native mod_function next_size_over(@Cast("uint64_t*") @ByRef LongPointer size);
  public native mod_function next_size_over(@Cast("uint64_t*") @ByRef LongBuffer size);
  public native mod_function next_size_over(@Cast("uint64_t*") @ByRef long[] size);
  public native void commit(mod_function new_mod_function);
  public native void reset();

  public native @Cast("uint64_t") long index_for_hash(@Cast("uint64_t") long hash, @Cast("uint64_t") long arg1);
  public native @Cast("uint64_t") long keep_in_range(@Cast("uint64_t") long index, @Cast("uint64_t") long num_slots_minus_one);
}