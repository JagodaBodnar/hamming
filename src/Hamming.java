public class Hamming {
    private String leftStrand;
    private String rightStrand;

    public void setLeftStrand(String leftStrand) {
        this.leftStrand = leftStrand;
    }

    public void setRightStrand(String rightStrand) {
        this.rightStrand = rightStrand;
    }

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("DNA strands need to have the same length");
        }
        setLeftStrand(leftStrand);
        setRightStrand(rightStrand);
    }

    public int getHammingDistance() {
        int sum = 0;
        for(int i= 0; i < leftStrand.length(); i++){
            if(leftStrand.charAt(i) != rightStrand.charAt(i)){
                sum += 1;
            }
        }
        return sum;
    }
}

