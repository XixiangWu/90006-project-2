public class EJz implements  IInstruction {

    /* JZ <REG> <VAL> */

    @Override
    public String generate() {
        return String.format("JZ R%s %s", Fuzzer.randReg(),Fuzzer.randVal());
    }

}
