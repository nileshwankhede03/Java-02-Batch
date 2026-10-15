public class Test {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10_000_000; i++) {
            add(i, i);
        }
    }
}

/*
 * JVM mujhe batao ki tum runtime par kaunse Java methods ko JIT compiler se
 * compile kar rahe ho.
 * 
 * 42
 * │
 * └── compilation ke around timestamp
 * 
 * 1
 * │
 * └── compilation ID
 * 
 * 3
 * │
 * └── C1 compiler
 * 
 * Test::add
 * │
 * └── tumhara method
 * 
 * (4 bytes)
 * │
 * └── bytecode method size
 * 
 * java -XX:+UnlockDiagnosticVMOptions \
 * -XX:+PrintCompilation \
 * Test
 * 56 1 3 java.lang.Object::<init> (1 bytes)
 * 58 3 3 java.lang.String::hashCode (60 bytes)
 * 58 2 3 java.lang.Byte::toUnsignedInt (6 bytes)
 * 58 4 n 0 jdk.internal.misc.Unsafe::getReferenceVolatile (native)
 * 58 5 n 0 jdk.internal.vm.Continuation::enterSpecial (native) (static)
 * 58 6 n 0 jdk.internal.vm.Continuation::doYield (native) (static)
 * 61 7 3 java.lang.String::coder (15 bytes)
 * 63 8 3 Test::add (4 bytes)
 * 63 9 4 Test::add (4 bytes)
 * 64 8 3 Test::add (4 bytes) made not entrant
 * 65 10 % 3 Test::main @ 2 (21 bytes)
 * 65 11 3 Test::main (21 bytes)
 * 65 12 % 4 Test::main @ 2 (21 bytes)
 * 66 10 % 3 Test::main @ 2 (21 bytes) made not entrant
 * 67 12 % 4 Test::main @ 2 (21 bytes) made not entrant
 */
