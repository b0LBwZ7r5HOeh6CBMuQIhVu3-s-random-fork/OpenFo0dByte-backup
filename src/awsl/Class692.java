/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ArrayListMultimap
 *  com.google.common.collect.Multimap
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  net.minecraft.launchwrapper.IClassTransformer
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package awsl;

import awsl.Class15;
import awsl.Class169;
import awsl.Class224;
import awsl.Class398;
import awsl.Class399;
import awsl.Class400;
import awsl.Class401;
import awsl.Class402;
import awsl.Class403;
import awsl.Class404;
import awsl.Class405;
import awsl.Class406;
import awsl.Class408;
import awsl.Class409;
import awsl.Class410;
import awsl.Class422;
import awsl.Class427;
import awsl.Class428;
import awsl.Class429;
import awsl.Class430;
import awsl.Class431;
import awsl.Class432;
import awsl.Class433;
import awsl.Class434;
import awsl.Class435;
import awsl.Class436;
import awsl.Class437;
import awsl.Class441;
import awsl.Class455;
import awsl.Class456;
import awsl.Class457;
import awsl.Class458;
import awsl.Class459;
import awsl.Class460;
import awsl.Class462;
import awsl.Class463;
import awsl.Class464;
import awsl.Class465;
import awsl.Class466;
import awsl.Class467;
import awsl.Class468;
import awsl.Class469;
import awsl.Class470;
import awsl.Class91;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import net.minecraft.launchwrapper.IClassTransformer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class692
implements IClassTransformer {
    private final Logger Field2986 = LogManager.getLogger((String)"FoodByte Transformer");
    private static final Multimap Field2987 = ArrayListMultimap.create();

    public Class692() {
        int n = Class441.Method2706();
        Class692.Method2513(new Class399());
        Class692.Method2513(new Class402());
        Class692.Method2513(new Class409());
        Class692.Method2513(new Class406());
        Class692.Method2513(new Class408());
        Class692.Method2513(new Class403());
        Class692.Method2513(new Class405());
        Class692.Method2513(new Class410());
        Class692.Method2513(new Class459());
        Class692.Method2513(new Class465());
        Class692.Method2513(new Class398());
        Class692.Method2513(new Class434());
        Class692.Method2513(new Class457());
        Class692.Method2513(new Class456());
        Class692.Method2513(new Class460());
        Class692.Method2513(new Class462());
        Class692.Method2513(new Class435());
        Class692.Method2513(new Class437());
        Class692.Method2513(new Class427());
        Class692.Method2513(new Class429());
        Class692.Method2513(new Class470());
        Class692.Method2513(new Class458());
        Class692.Method2513(new Class436());
        Class692.Method2513(new Class428());
        Class692.Method2513(new Class468());
        Class692.Method2513(new Class455());
        Class692.Method2513(new Class400());
        Class692.Method2513(new Class431());
        Class692.Method2513(new Class464());
        Class692.Method2513(new Class463());
        Class692.Method2513(new Class469());
        Class692.Method2513(new Class433());
        Class692.Method2513(new Class466());
        Class692.Method2513(new Class432());
        Class692.Method2513(new Class401());
        Class692.Method2513(new Class404());
        Class692.Method2513(new Class467());
        Class692.Method2513(new Class430());
        Class91.Method3647(new String[4]);
    }

    private static void Method2513(Class422 a) {
        String[] stringArray = a.Method1360();
        int n = stringArray.length;
        int a2 = Class441.Method2707();
        int n2 = 0;
        if (n2 < n) {
            String a3 = stringArray[n2];
            Field2987.put((Object)a3, (Object)a);
            ++n2;
        }
    }

    public byte[] transform(String a, String a2, byte[] a3) {
        return this.Method2514(a2, a3);
    }

    public byte[] Method2514(String a, byte[] a2) {
        return null;
    }

    private void Method2515(String a, Class169 a2) {
        File a3;
        block4: {
            File a4 = new File("fbbytecode");
            a3 = new File(a4, a + ".class");
            if (!a4.exists()) {
                return;
            }
            if (a3.exists()) break block4;
            a3.createNewFile();
        }
        try {
            FileOutputStream a5 = new FileOutputStream(a3);
            a5.write(a2.Method1503());
            a5.close();
        }
        catch (IOException a6) {
            a6.printStackTrace();
        }
    }

    private void Method2516(String a, Class224 a2, Class422 a3) {
        this.Field2986.fatal("Applying transformer {} on {}...", new Object[]{a3.getClass().getName(), a});
        a3.Method1361(a2, a);
        a2.Field1260.forEach(arg_0 -> Class692.Method2517(a3, a, arg_0));
    }

    private static void Method2517(Class422 a, String a2, Class15 a3) {
        a.Method1359(a3, a2);
    }

    private static Throwable Method2518(Throwable throwable) {
        return throwable;
    }
}