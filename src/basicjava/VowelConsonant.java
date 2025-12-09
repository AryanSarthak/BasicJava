package basicjava;

public class VowelConsonant {
    char ch;
    VowelConsonant(char ch) {
        this.ch = ch;
    }
    public void checkVowelConsonant() {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
            System.out.println("Vowel");
        }else {
            System.out.println("Consonant");
        }
    }
}
