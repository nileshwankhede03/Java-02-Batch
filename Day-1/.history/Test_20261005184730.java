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
42
│
└── compilation ke around timestamp

1
│
└── compilation ID

3
│
└── C1 compiler

Test::add
│
└── tumhara method

(4 bytes)
│
└── bytecode method size


*/