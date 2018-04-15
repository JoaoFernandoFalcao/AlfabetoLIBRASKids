package br.com.joao.alfabetolibraskids;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class Activity_05 extends AppCompatActivity implements View.OnClickListener{

    ImageView figura;
    ImageView letra[] = new ImageView[8];;
    String palavra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_05);

        figura = (ImageView) findViewById(R.id.imageView51);

        letra[1]= (ImageView) findViewById(R.id.imageView501);
        letra[2]= (ImageView) findViewById(R.id.imageView502);
        letra[3]= (ImageView) findViewById(R.id.imageView503);
        letra[4]= (ImageView) findViewById(R.id.imageView504);
        letra[5]= (ImageView) findViewById(R.id.imageView505);
        letra[6]= (ImageView) findViewById(R.id.imageView506);
        letra[7]= (ImageView) findViewById(R.id.imageView507);

        //gerar palavra (chamar função para sortear palavra e colocar figura
        gerarPalavra();

        ImageView botaoA = (ImageView) findViewById(R.id.buttonA);
        botaoA.setClickable(true);
        botaoA.setOnClickListener(this);

        ImageView botaoB = (ImageView) findViewById(R.id.buttonB);
        botaoB.setClickable(true);
        botaoB.setOnClickListener(this);

        ImageView botaoC = (ImageView) findViewById(R.id.buttonC);
        botaoC.setClickable(true);
        botaoC.setOnClickListener(this);

        ImageView botaoD = (ImageView) findViewById(R.id.buttonD);
        botaoD.setClickable(true);
        botaoD.setOnClickListener(this);

        ImageView botaoE = (ImageView) findViewById(R.id.buttonE);
        botaoE.setClickable(true);
        botaoE.setOnClickListener(this);

        ImageView botaoF = (ImageView) findViewById(R.id.buttonF);
        botaoF.setClickable(true);
        botaoF.setOnClickListener(this);

        ImageView botaoG = (ImageView) findViewById(R.id.buttonG);
        botaoG.setClickable(true);
        botaoG.setOnClickListener(this);

        ImageView botaoH = (ImageView) findViewById(R.id.buttonH);
        botaoH.setClickable(true);
        botaoH.setOnClickListener(this);

        ImageView botaoI = (ImageView) findViewById(R.id.buttonI);
        botaoI.setClickable(true);
        botaoI.setOnClickListener(this);

        ImageView botaoJ = (ImageView) findViewById(R.id.buttonJ);
        botaoJ.setClickable(true);
        botaoJ.setOnClickListener(this);

        ImageView botaoK = (ImageView) findViewById(R.id.buttonK);
        botaoK.setClickable(true);
        botaoK.setOnClickListener(this);

        ImageView botaoL = (ImageView) findViewById(R.id.buttonL);
        botaoL.setClickable(true);
        botaoL.setOnClickListener(this);

        ImageView botaoM = (ImageView) findViewById(R.id.buttonM);
        botaoM.setClickable(true);
        botaoM.setOnClickListener(this);

        ImageView botaoN = (ImageView) findViewById(R.id.buttonN);
        botaoN.setClickable(true);
        botaoN.setOnClickListener(this);

        ImageView botaoO = (ImageView) findViewById(R.id.buttonO);
        botaoO.setClickable(true);
        botaoO.setOnClickListener(this);

        ImageView botaoP = (ImageView) findViewById(R.id.buttonP);
        botaoP.setClickable(true);
        botaoP.setOnClickListener(this);

        ImageView botaoQ = (ImageView) findViewById(R.id.buttonQ);
        botaoQ.setClickable(true);
        botaoQ.setOnClickListener(this);

        ImageView botaoR = (ImageView) findViewById(R.id.buttonR);
        botaoR.setClickable(true);
        botaoR.setOnClickListener(this);

        ImageView botaoS = (ImageView) findViewById(R.id.buttonS);
        botaoS.setClickable(true);
        botaoS.setOnClickListener(this);

        ImageView botaoT = (ImageView) findViewById(R.id.buttonT);
        botaoT.setClickable(true);
        botaoT.setOnClickListener(this);

        ImageView botaoU = (ImageView) findViewById(R.id.buttonU);
        botaoU.setClickable(true);
        botaoU.setOnClickListener(this);

        ImageView botaoV = (ImageView) findViewById(R.id.buttonV);
        botaoV.setClickable(true);
        botaoV.setOnClickListener(this);

        ImageView botaoW = (ImageView) findViewById(R.id.buttonW);
        botaoW.setClickable(true);
        botaoW.setOnClickListener(this);

        ImageView botaoX = (ImageView) findViewById(R.id.buttonX);
        botaoX.setClickable(true);
        botaoX.setOnClickListener(this);

        ImageView botaoY = (ImageView) findViewById(R.id.buttonY);
        botaoY.setClickable(true);
        botaoY.setOnClickListener(this);

        ImageView botaoZ = (ImageView) findViewById(R.id.buttonZ);
        botaoZ.setClickable(true);
        botaoZ.setOnClickListener(this);

        Button novaPalavra = (Button) findViewById(R.id.button51);
        novaPalavra.setClickable(true);
        novaPalavra.setOnClickListener(this);

    }//fim da função onCreate

    @Override
    public void onClick (View v){
        int i, acertou = 0;
        switch (v.getId()){
            case R.id.buttonA:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'a') {
                        letra[i + 1].setImageResource(R.drawable.maoa);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonB:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'b') {
                        letra[i + 1].setImageResource(R.drawable.maob);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonC:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'c') {
                        letra[i + 1].setImageResource(R.drawable.maoc);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonD:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'd') {
                        letra[i + 1].setImageResource(R.drawable.maod);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonE:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'e') {
                        letra[i + 1].setImageResource(R.drawable.maoe);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonF:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'f') {
                        letra[i + 1].setImageResource(R.drawable.maof);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonG:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'g') {
                        letra[i + 1].setImageResource(R.drawable.maog);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonH:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'h') {
                        letra[i + 1].setImageResource(R.drawable.maoh);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonI:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'i') {
                        letra[i + 1].setImageResource(R.drawable.maoi);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonJ:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'j') {
                        letra[i + 1].setImageResource(R.drawable.maoj);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonK:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'k') {
                        letra[i + 1].setImageResource(R.drawable.maok);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonL:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'l') {
                        letra[i + 1].setImageResource(R.drawable.maol);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonM:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'm') {
                        letra[i + 1].setImageResource(R.drawable.maom);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonN:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'n') {
                        letra[i + 1].setImageResource(R.drawable.maon);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonO:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'o') {
                        letra[i + 1].setImageResource(R.drawable.maoo);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonP:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'p') {
                        letra[i + 1].setImageResource(R.drawable.maop);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonQ:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'q') {
                        letra[i + 1].setImageResource(R.drawable.maoq);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonR:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'r') {
                        letra[i + 1].setImageResource(R.drawable.maor);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonS:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 's') {
                        letra[i + 1].setImageResource(R.drawable.maos);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonT:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 't') {
                        letra[i + 1].setImageResource(R.drawable.maot);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonU:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'u') {
                        letra[i + 1].setImageResource(R.drawable.maou);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonV:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'v') {
                        letra[i + 1].setImageResource(R.drawable.maov);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonW:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'w') {
                        letra[i + 1].setImageResource(R.drawable.maow);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonX:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'x') {
                        letra[i + 1].setImageResource(R.drawable.maox);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonY:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'y') {
                        letra[i + 1].setImageResource(R.drawable.maoy);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonZ:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'z') {
                        letra[i + 1].setImageResource(R.drawable.maoz);
                        acertou = 1;
                    }//fim if
                break;
            case R.id.button51:
                gerarPalavra();
                acertou = 1;
                break;


        }//fim switch

        if (acertou == 0) {
                    //vibrar
                    Vibrator rr = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    long milliseconds = 120; //tempo em milissegundos
                    rr.vibrate(milliseconds);
        }//fim if


    }//fim da função onClick

    void gerarPalavra (){
        final int TAM = 50;
        String Palavras[] = {   "casa", "girafa", "baleia", "cavalo", "escola", "laranja", "garfo", "cobra", "carro", "carreta",
                                "serrote", "cenoura", "gelo", "bombom", "carimbo", "enxada", "ponte", "pente", "alface", "caracol",
                                "anel", "galinha", "escova", "poste", "mosca", "colher", "caderno", "aranha", "ninho", "horta",
                                "formiga", "cofre", "fralda", "quadro", "barata", "garrafa", "blusa", "trator", "gravata", "rato",
                                "folha", "flecha", "cadeira", "foca", "coruja", "cama", "banana", "apito", "tijolo", "tucano"};

        Random numRandomico = new Random();
        int var, i;

        var = numRandomico.nextInt(TAM);
        palavra = Palavras[var];

        //visualização da figura
        String textoFigura = "@drawable/"+palavra;
        int imageResource = getResources().getIdentifier(textoFigura, null, getPackageName());
        figura.setImageResource(imageResource);

        for (i=1; i < 7 ;i++) {
            letra[i + 1].setVisibility(View.INVISIBLE);
        }//fim do for

        for (i=0; i<palavra.length() ;i++) {
            letra[i + 1].setImageResource(R.drawable.interrogacao);
            letra[i + 1].setVisibility(View.VISIBLE);
        }//fim do for


    }//fim da função gerarPalavra

}//fim da classe Activity_05
