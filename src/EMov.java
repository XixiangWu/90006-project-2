public class EMov implements  IInstruction {

    /* MOV <REG> <VAL> */

    @Override
    public String generate() {
        return String.format("MOV R%s %s", Fuzzer.randReg(), Fuzzer.randVal());
    }

}
