package generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Random;

public class Generator implements GeneratorInterface {
    private Hashtable alphabet;
    private String language;
    private String parameters;
    private ArrayList param;

    public Generator(String language, String parameters) {
        this.language = language;
        this.parameters = parameters;
        param = new ArrayList();
        alphabet = new Hashtable();
    }

    public String generateAlpha(char startSymbol, char endSymbol) {
        String alphabet = "";
        for (int i = (int) startSymbol; i <= (int) endSymbol; i++) {
            alphabet += (char) i;
        }
        return alphabet;
    }

    public void parseStringToarray() {
        Random rand=new Random();
        String[] par = parameters.split("-");

        for (int i=0;i<par.length;i++){
            try {
                param.add(Integer.parseInt(par[i]));
            }catch (NumberFormatException e){
                if (i == 1){
                    param.add(1,rand.nextInt(10-1)+1);
                }else if (i==3){
                    param.add(1);

                }else if (i==4){
                    int randomvalue=rand.nextInt(10-1)+1;
                    int previousvalue= (int) param.get(1);
                    int finalvalue=randomvalue+previousvalue;
                    param.add(finalvalue);
                }
                else if (i==6){
                    param.add(1);

                }else if (i==7){
                    int anotherrandomvalue=rand.nextInt(7-1)+1;
                    int anotherpreviousvalue= (int) param.get(3);
                    int anotherfinalvalue=anotherrandomvalue+anotherpreviousvalue;
                    param.add(anotherfinalvalue);
                }

            }
        }
    }

    @Override
    public void generateAlphabet() {
        alphabet.put("ge", generateAlpha('ა', 'ჰ'));
        alphabet.put("en", generateAlpha('a', 'z'));
        alphabet.put("ru", generateAlpha('а', 'я'));
        System.out.println(alphabet);
    }

    @Override
    public char generateRandomChar() {
        char symbol = ' ';
        Random random = new Random();
        String a = alphabet.get(language).toString();
        symbol = a.charAt(random.nextInt(a.length()));
        return symbol;
    }

    @Override
    public String generateRandomWord() {
        String word="";
        int lower=(int)param.get(3);
        int max=(int)param.get(4);
        Random rand=new Random();
        int rannumber=rand.nextInt(max-lower)+lower;
        for (int i=1;i<=rannumber;i+=1){
            word+=generateRandomChar();

        }
        return word;
    }

    @Override
    public void generateSentence() {
        int lower=(int)param.get(1);
        int max=(int)param.get(2);
        Random rand=new Random();
        int rannumber=rand.nextInt(max-lower)+lower;

        for (int par = 0; par < rannumber; par+=1){
            System.out.print(generateRandomWord() + " ");
        }
        System.out.print(".    ");
    }
    public void generateParagraph(){
        int countpars=(int)param.get(0);
        System.out.print("    ");
        for (int i=0;i<countpars;i++){
            generateSentence();
        }
    }
}