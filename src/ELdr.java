public class ELdr implements  IInstruction {

    /* LDR <REG> <REG> <VAL> */

    @Override
    public String generate() {
        return String.format("LDR R%s %s %s", Fuzzer.randReg(), Fuzzer.randVal(), Fuzzer.randVal());
    }

}
