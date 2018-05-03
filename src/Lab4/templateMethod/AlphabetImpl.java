package Lab4.templateMethod;

public class AlphabetImpl extends Alphabet {

    @Override
    public char findAlphabet(char[][] alpha) {
        return alpha[15][0];
    }

    @Override
    public char[][] reconstructAlphabet(char[][] alpha, char symmetryType) {
        char[][] recAlphaA = new char[20][10];
        for(int i=0;i<alpha.length;i++){
            for(int j=0;j<alpha[i].length;j++){
                System.arraycopy(alpha[i], 0, recAlphaA[i], 0, 5);
                //recAlphaA[i]=alpha[i];
                System.arraycopy(reverseArr(alpha[i]), 0, recAlphaA[i], alpha[i].length, 5);
            }
        }

        return recAlphaA;
    }

    @Override
    public void printAlphabet(char[][] recAlpha) {
        for(int i=0;i<recAlpha.length;i++)
            System.out.println(recAlpha[i]);
    }

    private char[] reverseArr(char[] alphaArr){
        char[] revArr = new char[5];
        int j=0;
        for(int i=alphaArr.length-1;i>=0;i--){

            revArr[j]=alphaArr[i];
            j++;
        }
        return revArr;
    }

}
