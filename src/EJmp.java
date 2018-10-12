public class EJmp implements  IInstruction {

    /* JMP <VAL> */

    @Override
    public String generate() {
        return String.format("JMP %s", Fuzzer.randVal());
    }

}
