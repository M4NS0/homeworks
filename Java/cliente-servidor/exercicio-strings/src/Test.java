public class Test {
    public static void main(String[] args) {
        String str = "essa string contem 32 caracteres";
        System.out.println(str.length());

        String word = "string";
        System.out.println();
        System.out.println("Contém a palavra '" + word + "'?");
        if (str.contains(word) == true) {
            System.out.println("Sim");
        }
        System.out.println();
        StringBuilder sb = new StringBuilder();
        sb.append(str);

        System.out.println("String original: " + sb.toString());
        System.out.println("String reversa: " + sb.reverse());
        System.out.println();

        System.out.println("Contando a quantidade de palavras na string");
        int wordCount = 0;
        for (char letter = 'a' ; letter <= 'z'; letter++) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == letter) {
                    wordCount++;
                }
            }
            if (wordCount > 0) {
                System.out.println("Contém " + wordCount + " letras " + letter);
                wordCount = 0;
            }
        }
    }

}
