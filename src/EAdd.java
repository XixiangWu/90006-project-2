public class EAdd implements IInstruction {

    /* ADD <REG> <REG> <REG> */

    @Override
    public String generate() {
        return String.format("ADD R%s R%s R%s", Fuzzer.randReg(), Fuzzer.randReg(), Fuzzer.randReg());
    }

}
