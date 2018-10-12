public class ERet implements  IInstruction {

    /* RET <REG> */

    @Override
    public String generate() {
        return String.format("RET R%s", Fuzzer.randReg());
    }

}
