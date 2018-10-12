public class EStr implements  IInstruction {

    /* STR <REG> <VAL> <REG> */

    @Override
    public String generate() {
        return String.format("STR R%s %s R%s", Fuzzer.randReg(), Fuzzer.randVal(), Fuzzer.randReg());
    }

}
