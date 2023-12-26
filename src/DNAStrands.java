public class DNAStrands {
    public static void main(String[] args) {
        Hamming hamming = new Hamming("GAGCCTACTAACGGGAT", "CATCGTAATGACGGCCT");
        System.out.printf("Hamming distance: %d%n", hamming.getHammingDistance());
        hamming = new Hamming("GACT", "CAT");
        System.out.printf("Hamming distance: %d%n", hamming.getHammingDistance());
    }
}
