import java.util.Arrays;
import java.util.List;

public class InstructionFactory {

    private List<IInstruction> insGeneratorLst;

    public InstructionFactory() {

        // Generate all the instructions
        EAdd add = new EAdd();
        ESub sub = new ESub();
        EMul mul = new EMul();
        EDiv div = new EDiv();
        ERet ret = new ERet();
        EMov mov = new EMov();
        ELdr ldr = new ELdr();
        EStr str = new EStr();
        EJmp jmp = new EJmp();
        EJz  jz  = new EJz() ;

        // Initialize the generator
        insGeneratorLst = Arrays.asList(add,sub,mul,div,ret,mov,ldr,str,jmp,jz);
    }

    public String getInstruction(int index) {
        return insGeneratorLst.get(index).generate();
    }

}
