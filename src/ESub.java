public class ESub implements  IInstruction {

    /* SUB <REG> <REG> <REG> */

    @Override
    public String generate() {
        return String.format("SUB R%s R%s R%s", Fuzzer.randReg(), Fuzzer.randReg(), Fuzzer.randReg());
    }

}
