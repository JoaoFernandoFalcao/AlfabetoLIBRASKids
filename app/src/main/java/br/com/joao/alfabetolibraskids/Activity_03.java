package br.com.joao.alfabetolibraskids;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Activity_03 extends AppCompatActivity implements View.OnClickListener{

    ImageView letra[] = new ImageView[8];
    ImageView letradica[]= new ImageView[8];
    int letrapreenchida[] = new int[8];
    String palavra;
    int erros = 0;
    TextView textoTopo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_03);

        letra[1]= (ImageView) findViewById(R.id.imageView301);
        letra[2]= (ImageView) findViewById(R.id.imageView302);
        letra[3]= (ImageView) findViewById(R.id.imageView303);
        letra[4]= (ImageView) findViewById(R.id.imageView304);
        letra[5]= (ImageView) findViewById(R.id.imageView305);
        letra[6]= (ImageView) findViewById(R.id.imageView306);
        letra[7]= (ImageView) findViewById(R.id.imageView307);

        letradica[1]= (ImageView) findViewById(R.id.imageView308);
        letradica[2]= (ImageView) findViewById(R.id.imageView309);
        letradica[3]= (ImageView) findViewById(R.id.imageView310);
        letradica[4]= (ImageView) findViewById(R.id.imageView311);
        letradica[5]= (ImageView) findViewById(R.id.imageView312);
        letradica[6]= (ImageView) findViewById(R.id.imageView313);
        letradica[7]= (ImageView) findViewById(R.id.imageView314);

        //gerar palavra (chamar função para sortear palavra e posição da letra que será exibida)
        gerarPalavra();

        textoTopo = (TextView) findViewById(R.id.textView31);

        Button botaoA = (Button) findViewById(R.id.buttonA);
        botaoA.setClickable(true);
        botaoA.setOnClickListener(this);

        Button botaoB = (Button) findViewById(R.id.buttonB);
        botaoB.setClickable(true);
        botaoB.setOnClickListener(this);

        Button botaoC = (Button) findViewById(R.id.buttonC);
        botaoC.setClickable(true);
        botaoC.setOnClickListener(this);

        Button botaoD = (Button) findViewById(R.id.buttonD);
        botaoD.setClickable(true);
        botaoD.setOnClickListener(this);

        Button botaoE = (Button) findViewById(R.id.buttonE);
        botaoE.setClickable(true);
        botaoE.setOnClickListener(this);

        Button botaoF = (Button) findViewById(R.id.buttonF);
        botaoF.setClickable(true);
        botaoF.setOnClickListener(this);

        Button botaoG = (Button) findViewById(R.id.buttonG);
        botaoG.setClickable(true);
        botaoG.setOnClickListener(this);

        Button botaoH = (Button) findViewById(R.id.buttonH);
        botaoH.setClickable(true);
        botaoH.setOnClickListener(this);

        Button botaoI = (Button) findViewById(R.id.buttonI);
        botaoI.setClickable(true);
        botaoI.setOnClickListener(this);

        Button botaoJ = (Button) findViewById(R.id.buttonJ);
        botaoJ.setClickable(true);
        botaoJ.setOnClickListener(this);

        Button botaoK = (Button) findViewById(R.id.buttonK);
        botaoK.setClickable(true);
        botaoK.setOnClickListener(this);

        Button botaoL = (Button) findViewById(R.id.buttonL);
        botaoL.setClickable(true);
        botaoL.setOnClickListener(this);

        Button botaoM = (Button) findViewById(R.id.buttonM);
        botaoM.setClickable(true);
        botaoM.setOnClickListener(this);

        Button botaoN = (Button) findViewById(R.id.buttonN);
        botaoN.setClickable(true);
        botaoN.setOnClickListener(this);

        Button botaoO = (Button) findViewById(R.id.buttonO);
        botaoO.setClickable(true);
        botaoO.setOnClickListener(this);

        Button botaoP = (Button) findViewById(R.id.buttonP);
        botaoP.setClickable(true);
        botaoP.setOnClickListener(this);

        Button botaoQ = (Button) findViewById(R.id.buttonQ);
        botaoQ.setClickable(true);
        botaoQ.setOnClickListener(this);

        Button botaoR = (Button) findViewById(R.id.buttonR);
        botaoR.setClickable(true);
        botaoR.setOnClickListener(this);

        Button botaoS = (Button) findViewById(R.id.buttonS);
        botaoS.setClickable(true);
        botaoS.setOnClickListener(this);

        Button botaoT = (Button) findViewById(R.id.buttonT);
        botaoT.setClickable(true);
        botaoT.setOnClickListener(this);

        Button botaoU = (Button) findViewById(R.id.buttonU);
        botaoU.setClickable(true);
        botaoU.setOnClickListener(this);

        Button botaoV = (Button) findViewById(R.id.buttonV);
        botaoV.setClickable(true);
        botaoV.setOnClickListener(this);

        Button botaoW = (Button) findViewById(R.id.buttonW);
        botaoW.setClickable(true);
        botaoW.setOnClickListener(this);

        Button botaoX = (Button) findViewById(R.id.buttonX);
        botaoX.setClickable(true);
        botaoX.setOnClickListener(this);

        Button botaoY = (Button) findViewById(R.id.buttonY);
        botaoY.setClickable(true);
        botaoY.setOnClickListener(this);

        Button botaoZ = (Button) findViewById(R.id.buttonZ);
        botaoZ.setClickable(true);
        botaoZ.setOnClickListener(this);

        Button novoJogo = (Button) findViewById(R.id.button31);
        novoJogo.setClickable(true);
        novoJogo.setOnClickListener(this);

    }//fim da função onCreate

    void gerarPalavra (){
        final int TAM = 70;
        String Palavras[] = {   "escola", "bola", "papai", "menina", "banana", "preto", "blusa",
                                "abacaxi", "tucano", "tigela", "sapo", "pipa", "boneca", "escada",
                                "batata", "livro", "caderno", "titia", "amigo", "sol", "receita",
                                "leitura", "ensinar", "igreja", "ouvir", "comer", "tomate", "pera",
                                "caqui", "adulto", "roma", "paris", "folha", "uva", "massa",
                                "cavalo", "caneta", "zebra", "navio", "manga", "onda", "jogo",
                                "terra", "carro", "viola", "bife", "arroz", "azul", "amarelo",
                                "branco", "rosa", "nublado", "clara", "clube", "piano", "certo",
                                "dupla", "diploma", "peixe", "peteca", "figo", "baleia", "correr",
                                "cenoura", "gema", "gelo", "gota", "galo", "quito", "manaus"};
        String Dicas[] = {      "estudar", "futebol", "parente", "garota", "fruta", "cor", "vestir",
                                "fruta", "animal", "cozinha", "animal", "brincar", "brincar", "subir",
                                "comer", "leitura", "escola", "parente", "colega", "estrela", "cozinha",
                                "livro", "escola", "templo", "escutar", "verbo", "comida", "fruta",
                                "fruta", "maior", "cidade", "cidade", "caderno", "fruta", "comida",
                                "animal", "escola", "animal", "mar", "fruta", "praia", "brincar",
                                "planeta", "brincar", "tocar", "comida", "comida", "cor", "cor",
                                "cor", "cor", "clima", "ovo", "futebol", "tocar", "exato",
                                "dois", "escola", "animal", "brincar", "fruta", "animal", "brincar",
                                "comida", "ovo", "frio", "chuva", "animal", "cidade", "cidade"};
        Random numRandomico = new Random();
        int var, i;

        var = numRandomico.nextInt(TAM);
        palavra = Palavras[var];
        for (i=1; i < 7 ;i++) {
            letrapreenchida[i] = 0;
            letra[i + 1].setVisibility(View.INVISIBLE);
        }//fim do for

        for (i=0; i<palavra.length() ;i++) {
            letra[i + 1].setImageResource(R.drawable.interrogacao);
            letra[i + 1].setVisibility(View.VISIBLE);
        }//fim do for

        for (i=1; i<=2 ; i++) {
            int a = numRandomico.nextInt(palavra.length());
            letrapreenchida[a + 1] = 1;
            switch (palavra.charAt(a)) {
                case 'a':
                    letra[a + 1].setImageResource(R.drawable.letraa);
                    break;
                case 'b':
                    letra[a + 1].setImageResource(R.drawable.letrab);
                    break;
                case 'c':
                    letra[a + 1].setImageResource(R.drawable.letrac);
                    break;
                case 'd':
                    letra[a + 1].setImageResource(R.drawable.letrad);
                    break;
                case 'e':
                    letra[a + 1].setImageResource(R.drawable.letrae);
                    break;
                case 'f':
                    letra[a + 1].setImageResource(R.drawable.letraf);
                    break;
                case 'g':
                    letra[a + 1].setImageResource(R.drawable.letrag);
                    break;
                case 'h':
                    letra[a + 1].setImageResource(R.drawable.letrah);
                    break;
                case 'i':
                    letra[a + 1].setImageResource(R.drawable.letrai);
                    break;
                case 'j':
                    letra[a + 1].setImageResource(R.drawable.letraj);
                    break;
                case 'k':
                    letra[a + 1].setImageResource(R.drawable.letrak);
                    break;
                case 'l':
                    letra[a + 1].setImageResource(R.drawable.letral);
                    break;
                case 'm':
                    letra[a + 1].setImageResource(R.drawable.letram);
                    break;
                case 'n':
                    letra[a + 1].setImageResource(R.drawable.letran);
                    break;
                case 'o':
                    letra[a + 1].setImageResource(R.drawable.letrao);
                    break;
                case 'p':
                    letra[a + 1].setImageResource(R.drawable.letrap);
                    break;
                case 'q':
                    letra[a + 1].setImageResource(R.drawable.letraq);
                    break;
                case 'r':
                    letra[a + 1].setImageResource(R.drawable.letrar);
                    break;
                case 's':
                    letra[a + 1].setImageResource(R.drawable.letras);
                    break;
                case 't':
                    letra[a + 1].setImageResource(R.drawable.letrat);
                    break;
                case 'u':
                    letra[a + 1].setImageResource(R.drawable.letrau);
                    break;
                case 'v':
                    letra[a + 1].setImageResource(R.drawable.letrav);
                    break;
                case 'w':
                    letra[a + 1].setImageResource(R.drawable.letraw);
                    break;
                case 'x':
                    letra[a + 1].setImageResource(R.drawable.letrax);
                    break;
                case 'y':
                    letra[a + 1].setImageResource(R.drawable.letray);
                    break;
                case 'z':
                    letra[a + 1].setImageResource(R.drawable.letraz);
                    break;
            }//fim do switch
        }//fim do for

        String dica = Dicas[var];
        for (i=1; i < 7 ; i++) {
            letradica[i + 1].setVisibility(View.INVISIBLE);
        }//fim do for

        for (i=0; i<dica.length() ; i++) {
            letradica[i + 1].setVisibility(View.VISIBLE);
            switch (dica.charAt(i)) {
                case 'a':
                    letradica[i + 1].setImageResource(R.drawable.letraa);
                    break;
                case 'b':
                    letradica[i + 1].setImageResource(R.drawable.letrab);
                    break;
                case 'c':
                    letradica[i + 1].setImageResource(R.drawable.letrac);
                    break;
                case 'd':
                    letradica[i + 1].setImageResource(R.drawable.letrad);
                    break;
                case 'e':
                    letradica[i + 1].setImageResource(R.drawable.letrae);
                    break;
                case 'f':
                    letradica[i + 1].setImageResource(R.drawable.letraf);
                    break;
                case 'g':
                    letradica[i + 1].setImageResource(R.drawable.letrag);
                    break;
                case 'h':
                    letradica[i + 1].setImageResource(R.drawable.letrah);
                    break;
                case 'i':
                    letradica[i + 1].setImageResource(R.drawable.letrai);
                    break;
                case 'j':
                    letradica[i + 1].setImageResource(R.drawable.letraj);
                    break;
                case 'k':
                    letradica[i + 1].setImageResource(R.drawable.letrak);
                    break;
                case 'l':
                    letradica[i + 1].setImageResource(R.drawable.letral);
                    break;
                case 'm':
                    letradica[i + 1].setImageResource(R.drawable.letram);
                    break;
                case 'n':
                    letradica[i + 1].setImageResource(R.drawable.letran);
                    break;
                case 'o':
                    letradica[i + 1].setImageResource(R.drawable.letrao);
                    break;
                case 'p':
                    letradica[i + 1].setImageResource(R.drawable.letrap);
                    break;
                case 'q':
                    letradica[i + 1].setImageResource(R.drawable.letraq);
                    break;
                case 'r':
                    letradica[i + 1].setImageResource(R.drawable.letrar);
                    break;
                case 's':
                    letradica[i + 1].setImageResource(R.drawable.letras);
                    break;
                case 't':
                    letradica[i + 1].setImageResource(R.drawable.letrat);
                    break;
                case 'u':
                    letradica[i + 1].setImageResource(R.drawable.letrau);
                    break;
                case 'v':
                    letradica[i + 1].setImageResource(R.drawable.letrav);
                    break;
                case 'w':
                    letradica[i + 1].setImageResource(R.drawable.letraw);
                    break;
                case 'x':
                    letradica[i + 1].setImageResource(R.drawable.letrax);
                    break;
                case 'y':
                    letradica[i + 1].setImageResource(R.drawable.letray);
                    break;
                case 'z':
                    letradica[i + 1].setImageResource(R.drawable.letraz);
                    break;
            }//fim do switch
        }//fim do for

    }//fim da função gerarPalavra

    @Override
    public void onClick (View v){
        int i, acertou = 0, fim = 1, novapalavra = 0;
        switch (v.getId()){
            case R.id.buttonA:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'a') {
                        letra[i + 1].setImageResource(R.drawable.letraa);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonB:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'b') {
                        letra[i + 1].setImageResource(R.drawable.letrab);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonC:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'c') {
                        letra[i + 1].setImageResource(R.drawable.letrac);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonD:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'd') {
                        letra[i + 1].setImageResource(R.drawable.letrad);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonE:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'e') {
                        letra[i + 1].setImageResource(R.drawable.letrae);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonF:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'f') {
                        letra[i + 1].setImageResource(R.drawable.letraf);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonG:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'g') {
                        letra[i + 1].setImageResource(R.drawable.letrag);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonH:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'h') {
                        letra[i + 1].setImageResource(R.drawable.letrah);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonI:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'i') {
                        letra[i + 1].setImageResource(R.drawable.letrai);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonJ:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'j') {
                        letra[i + 1].setImageResource(R.drawable.letraj);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonK:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'k') {
                        letra[i + 1].setImageResource(R.drawable.letrak);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonL:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'l') {
                        letra[i + 1].setImageResource(R.drawable.letral);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonM:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'm') {
                        letra[i + 1].setImageResource(R.drawable.letram);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonN:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'n') {
                        letra[i + 1].setImageResource(R.drawable.letran);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonO:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'o') {
                        letra[i + 1].setImageResource(R.drawable.letrao);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonP:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'p') {
                        letra[i + 1].setImageResource(R.drawable.letrap);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonQ:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'q') {
                        letra[i + 1].setImageResource(R.drawable.letraq);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonR:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'r') {
                        letra[i + 1].setImageResource(R.drawable.letrar);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonS:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 's') {
                        letra[i + 1].setImageResource(R.drawable.letras);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonT:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 't') {
                        letra[i + 1].setImageResource(R.drawable.letrat);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonU:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'u') {
                        letra[i + 1].setImageResource(R.drawable.letrau);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonV:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'v') {
                        letra[i + 1].setImageResource(R.drawable.letrav);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonW:
                for (i=0; i<palavra.length();i++)
                if (palavra.charAt(i) == 'w') {
                    letra[i + 1].setImageResource(R.drawable.letraw);
                    letrapreenchida [i+1] = 1;
                    acertou = 1;
                }//fim if
                break;
            case R.id.buttonX:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'x') {
                        letra[i + 1].setImageResource(R.drawable.letrax);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonY:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'y') {
                        letra[i + 1].setImageResource(R.drawable.letray);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonZ:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'z') {
                        letra[i + 1].setImageResource(R.drawable.letraz);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.button31:
                erros = 0;
                novapalavra = 1;
                textoTopo.setText("");
                gerarPalavra();
                break;


        }//fim switch

        if (novapalavra == 0) {
            for (i = 0; i < palavra.length(); i++)
                if (letrapreenchida[i + 1] != 1)
                    fim = 0;
            if (fim == 1) {
                textoTopo.setText(getString(R.string.textoActivity_03_04));
            }//fim if
            else {
                if (acertou == 0) {
                    erros++;
                    //vibrar
                    Vibrator rr = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    long milliseconds = 120; //tempo em milissegundos
                    rr.vibrate(milliseconds);
                }//fim if
                textoTopo.setText(getString(R.string.textoActivity_03_05) + String.valueOf(erros));
            }//fim else
        }//fim do if

    }//fim da função onClick

}//fim da classe Activity_03
