import utils.AnagramChecker;

public class Main {

    public static void main(String[] args) {
        AnagramChecker anagramChecker = new AnagramChecker();

        anagramChecker.isAnagram("anagram", "nagaram");
        anagramChecker.isAnagram("anagram", "nagrm");
    }

}