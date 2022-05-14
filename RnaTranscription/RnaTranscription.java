import java.util.*;
class RnaTranscription {
    private static final Map<Character, Character> nucleoComponent;
    static{
        Map<Character,Character> map=new HashMap<>();
        map.put('C','G');
        map.put('G','C');
        map.put('T','A');
        map.put('A','U');
        nucleoComponent=Collections.unmodifiableMap(map);
    }
    String transcribe(String dnaStrand) {
        String rnaStrand="";
        char[] nucleotide= dnaStrand.toCharArray();
        for (char nucleo:nucleotide){
            rnaStrand+=nucleoComponent.get(nucleo);
        }
        return rnaStrand;
    }
}