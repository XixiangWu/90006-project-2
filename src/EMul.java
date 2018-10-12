public class EMul implements  IInstruction {

    /* MUL <REG> <REG> <REG> */

    @Override
    public String generate() {
        return String.format("MUL R%s R%s R%s", Fuzzer.randReg(), Fuzzer.randReg(), Fuzzer.randReg());
    }

}
