public class EDiv implements  IInstruction {

    /* MUL <REG> <REG> <REG> */

    @Override
    public String generate() {
        return String.format("DIV R%s R%s R%s", Fuzzer.randReg(), Fuzzer.randReg(), Fuzzer.randReg());
    }

}
