import java.util.Random;

public class Fuzzer {

    /* A fuzzer */

    static final int MAX_VAL = 65535;
    static final int MIN_VAL = -65535;
    static final int MAX_REG = 31;
    static final int MIN_REG = 0;
    static final int MAX_INS   = 9;
    static final int MIN_INS   = 0;

    // Init...
    public Fuzzer() {
        // Initialize the Instruction factory
        InstructionFactory IF = new InstructionFactory();


        //==================================================
        for (int i = 0; i < 1000; i++) {
//            System.out.println(randInvGauRatio());
            System.out.println(IF.getInstruction(randIns()));
        }
        //System.out.println(randGen(10,21));
    }

    // Pure random number generator
    static private int randGen(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
    static private int randPosNeg() {
        if (randGen(0,1)==0) {
            return -1;
        } else {
            return 1;
        }
    }

    // Guassian random number generator
    static private double randGauRatio() {
        Random rand = new Random();
        return rand.nextGaussian();
    }
    static private double randInvGauRatio() {
        Random rand = new Random();
        double val = rand.nextGaussian();

        if (val >= 0) {
            return val - 1.0;
        } else {
            return val + 1.0;
        }
    }


    // Random Number Generator - Access from anywhere
    static public int randVal() {return randGen(MIN_VAL,MAX_VAL);}
    static public int randReg() {return randGen(MIN_REG,MAX_REG);}
    static public int randIns() {return randGen(MIN_INS,MAX_INS);}

    // Normal Distribution Number generator | Easy to generate extrema (65535 and -65535)
    static public int randValExtrema() {return (int)(randVal()*(randGauRatio()-1));}

    // Generate a Normal Distributed number from 0.0 to 1.0
    public double genStdGaussian() {

        /*  Author:       Kevin Wayne
         *  Date:         8/20/04
         *  Computes a standard Gaussian random deviate using the cartesian
         *  form of the Box-Muller transform. The method is to compute a
         *  random point (x, y) inside the circle centered at (0, 0) with
         *  radius 1.
         *  */


        double r, x, y, z = 4;

        while (z<=-3.75 || z>=3.75) {
            // find a uniform random point (x, y) inside unit circle
            do {
                x = 2.0 * Math.random() - 1.0;
                y = 2.0 * Math.random() - 1.0;
                r = x * x + y * y;
            } while (r > 1 || r == 0);


            // apply the Box-Muller formula to get standard Gaussian z
            z = x * Math.sqrt(-2.0 * Math.log(r) / r);
        }


        return z;
    }

    // A Generator
    private String insGen() {

        // 1: generate instructions


        return "";
    }


    // Random Standard instructions generator (ADD SUB MUL DIV MOV RET LDR STR)
    private String insGen_s() {




        return "";
    }



}
