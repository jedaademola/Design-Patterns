package Lab4.templateMethod;

public class Client {
    public static void main(String[] args) {
        Alphabet alpha = new AlphabetImpl();
        //construct alphabets in 2 dimensional array
        char[][] alphabetA = new char[20][5];
        alphabetA[0][0]='-';
        alphabetA[0][1]='-';
        alphabetA[0][2]='-';
        alphabetA[0][3]='-';
        alphabetA[0][4]='-';

        alphabetA[1][0]='-';
        alphabetA[1][1]='-';
        alphabetA[1][2]='-';
        alphabetA[1][3]='-';
        alphabetA[1][4]='+';

        alphabetA[2][0]='-';
        alphabetA[2][1]='-';
        alphabetA[2][2]='-';
        alphabetA[2][3]='+';
        alphabetA[2][4]='+';

        alphabetA[3][0]='-';
        alphabetA[3][1]='-';
        alphabetA[3][2]='+';
        alphabetA[3][3]='+';
        alphabetA[3][4]='-';

        alphabetA[4][0]='-';
        alphabetA[4][1]='+';
        alphabetA[4][2]='+';
        alphabetA[4][3]='-';
        alphabetA[4][4]='-';

        alphabetA[5][0]='-';
        alphabetA[5][1]='+';
        alphabetA[5][2]='+';
        alphabetA[5][3]='-';
        alphabetA[5][4]='-';


        alphabetA[6][0]='-';
        alphabetA[6][1]='+';
        alphabetA[6][2]='+';
        alphabetA[6][3]='-';
        alphabetA[6][4]='-';

        alphabetA[7][0]='-';
        alphabetA[7][1]='+';
        alphabetA[7][2]='+';
        alphabetA[7][3]='-';
        alphabetA[7][4]='-';

        alphabetA[8][0]='-';
        alphabetA[8][1]='+';
        alphabetA[8][2]='+';
        alphabetA[8][3]='-';
        alphabetA[8][4]='-';

        alphabetA[9][0]='-';
        alphabetA[9][1]='+';
        alphabetA[9][2]='+';
        alphabetA[9][3]='+';
        alphabetA[9][4]='+';

        alphabetA[10][0]='-';
        alphabetA[10][1]='+';
        alphabetA[10][2]='+';
        alphabetA[10][3]='-';
        alphabetA[10][4]='-';

        alphabetA[11][0]='-';
        alphabetA[11][1]='+';
        alphabetA[11][2]='+';
        alphabetA[11][3]='-';
        alphabetA[11][4]='-';

        alphabetA[12][0]='-';
        alphabetA[12][1]='+';
        alphabetA[12][2]='+';
        alphabetA[12][3]='-';
        alphabetA[12][4]='-';

        alphabetA[13][0]='-';
        alphabetA[13][1]='+';
        alphabetA[13][2]='+';
        alphabetA[13][3]='-';
        alphabetA[13][4]='-';

        alphabetA[14][0]='-';
        alphabetA[14][1]='+';
        alphabetA[14][2]='+';
        alphabetA[14][3]='-';
        alphabetA[14][4]='-';

        alphabetA[15][0]='V';
        alpha.showAlphabet(alphabetA);
    }

}
