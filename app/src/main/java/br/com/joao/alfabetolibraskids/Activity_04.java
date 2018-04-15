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

public class Activity_04 extends AppCompatActivity implements View.OnClickListener{

    ImageView letra[] = new ImageView[8];
    ImageView letradica[]= new ImageView[8];
    int letrapreenchida[] = new int[8];
    String palavra;
    int erros = 0;
    TextView textoTopo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_04);

        letra[1]= (ImageView) findViewById(R.id.imageView401);
        letra[2]= (ImageView) findViewById(R.id.imageView402);
        letra[3]= (ImageView) findViewById(R.id.imageView403);
        letra[4]= (ImageView) findViewById(R.id.imageView404);
        letra[5]= (ImageView) findViewById(R.id.imageView405);
        letra[6]= (ImageView) findViewById(R.id.imageView406);
        letra[7]= (ImageView) findViewById(R.id.imageView407);

        letradica[1]= (ImageView) findViewById(R.id.imageView408);
        letradica[2]= (ImageView) findViewById(R.id.imageView409);
        letradica[3]= (ImageView) findViewById(R.id.imageView410);
        letradica[4]= (ImageView) findViewById(R.id.imageView411);
        letradica[5]= (ImageView) findViewById(R.id.imageView412);
        letradica[6]= (ImageView) findViewById(R.id.imageView413);
        letradica[7]= (ImageView) findViewById(R.id.imageView414);

        //gerar palavra (chamar função para sortear palavra e posição da letra que será exibida)
        gerarPalavra();

        textoTopo = (TextView) findViewById(R.id.textView41);

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

        Button novoJogo = (Button) findViewById(R.id.button41);
        novoJogo.setClickable(true);
        novoJogo.setOnClickListener(this);

    }//fim da função onCreate

    void gerarPalavra (){
        final int TAM = 100;
        String Palavras[] = {   "escola", "bola", "papai", "menina", "banana", "preto", "blusa",
                                "abacaxi", "tucano", "tigela", "sapo", "pipa", "boneca", "escada",
                                "batata", "livro", "caderno", "titia", "amigo", "sol", "receita",
                                "leitura", "ensinar", "igreja", "ouvir", "comer", "tomate", "pera",
                                "caqui", "adulto", "roma", "paris", "folha", "uva", "massa",
                                "cavalo", "caneta", "zebra", "navio", "manga", "onda", "jogo",
                                "terra", "carro", "viola", "bife", "arroz", "azul", "amarelo",
                                "branco", "rosa", "nublado", "clara", "clube", "piano", "certo",
                                "dupla", "diploma", "peixe", "peteca", "figo", "baleia", "correr",
                                "cenoura", "gema", "gelo", "gota", "galo", "quito", "manaus",
                                "mico", "bezerro", "garrafa", "cigarra", "vacina", "alface", "giz",
                                "brinco", "cobra", "hotel", "guache", "freio", "cruel", "creme",
                                "fralda", "cravo", "pedra", "banho", "nuca", "chuva", "foguete",
                                "cimento", "garupa", "gigante", "gostoso", "garfo", "goleiro", "golfe", "anel", "soldado"};
        String Dicas[] = {      "estudar", "futebol", "parente", "garota", "fruta", "cor", "vestir",
                                "fruta", "animal", "cozinha", "animal", "brincar", "brincar", "subir",
                                "comer", "leitura", "escola", "parente", "colega", "estrela", "cozinha",
                                "livro", "escola", "templo", "escutar", "verbo", "comida", "fruta",
                                "fruta", "maior", "cidade", "cidade", "caderno", "fruta", "comida",
                                "animal", "escola", "animal", "mar", "fruta", "praia", "brincar",
                                "planeta", "brincar", "tocar", "comida", "comida", "cor", "cor",
                                "cor", "cor", "clima", "ovo", "futebol", "tocar", "exato",
                                "dois", "escola", "animal", "brincar", "fruta", "animal", "brincar",
                                "comida", "ovo", "frio", "chuva", "animal", "cidade", "cidade",
                                "animal", "filhote", "vidro", "canta", "cura", "verdura", "quadro",
                                "orelha", "animal", "hospede", "pintura", "parar", "mau", "sorvete",
                                "bebe", "flor", "dura", "agua", "cabeca", "pingo", "lua",
                                "obra", "moto", "grande", "bom", "comer", "futebol", "jogo", "dedo", "guerra"};
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
                    letra[a + 1].setImageResource(R.drawable.maoa);
                    break;
                case 'b':
                    letra[a + 1].setImageResource(R.drawable.maob);
                    break;
                case 'c':
                    letra[a + 1].setImageResource(R.drawable.maoc);
                    break;
                case 'd':
                    letra[a + 1].setImageResource(R.drawable.maod);
                    break;
                case 'e':
                    letra[a + 1].setImageResource(R.drawable.maoe);
                    break;
                case 'f':
                    letra[a + 1].setImageResource(R.drawable.maof);
                    break;
                case 'g':
                    letra[a + 1].setImageResource(R.drawable.maog);
                    break;
                case 'h':
                    letra[a + 1].setImageResource(R.drawable.maoh);
                    break;
                case 'i':
                    letra[a + 1].setImageResource(R.drawable.maoi);
                    break;
                case 'j':
                    letra[a + 1].setImageResource(R.drawable.maoj);
                    break;
                case 'k':
                    letra[a + 1].setImageResource(R.drawable.maok);
                    break;
                case 'l':
                    letra[a + 1].setImageResource(R.drawable.maol);
                    break;
                case 'm':
                    letra[a + 1].setImageResource(R.drawable.maom);
                    break;
                case 'n':
                    letra[a + 1].setImageResource(R.drawable.maon);
                    break;
                case 'o':
                    letra[a + 1].setImageResource(R.drawable.maoo);
                    break;
                case 'p':
                    letra[a + 1].setImageResource(R.drawable.maop);
                    break;
                case 'q':
                    letra[a + 1].setImageResource(R.drawable.maoq);
                    break;
                case 'r':
                    letra[a + 1].setImageResource(R.drawable.maor);
                    break;
                case 's':
                    letra[a + 1].setImageResource(R.drawable.maos);
                    break;
                case 't':
                    letra[a + 1].setImageResource(R.drawable.maot);
                    break;
                case 'u':
                    letra[a + 1].setImageResource(R.drawable.maou);
                    break;
                case 'v':
                    letra[a + 1].setImageResource(R.drawable.maov);
                    break;
                case 'w':
                    letra[a + 1].setImageResource(R.drawable.maow);
                    break;
                case 'x':
                    letra[a + 1].setImageResource(R.drawable.maox);
                    break;
                case 'y':
                    letra[a + 1].setImageResource(R.drawable.maoy);
                    break;
                case 'z':
                    letra[a + 1].setImageResource(R.drawable.maoz);
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
                    letradica[i + 1].setImageResource(R.drawable.maoa);
                    break;
                case 'b':
                    letradica[i + 1].setImageResource(R.drawable.maob);
                    break;
                case 'c':
                    letradica[i + 1].setImageResource(R.drawable.maoc);
                    break;
                case 'd':
                    letradica[i + 1].setImageResource(R.drawable.maod);
                    break;
                case 'e':
                    letradica[i + 1].setImageResource(R.drawable.maoe);
                    break;
                case 'f':
                    letradica[i + 1].setImageResource(R.drawable.maof);
                    break;
                case 'g':
                    letradica[i + 1].setImageResource(R.drawable.maog);
                    break;
                case 'h':
                    letradica[i + 1].setImageResource(R.drawable.maoh);
                    break;
                case 'i':
                    letradica[i + 1].setImageResource(R.drawable.maoi);
                    break;
                case 'j':
                    letradica[i + 1].setImageResource(R.drawable.maoj);
                    break;
                case 'k':
                    letradica[i + 1].setImageResource(R.drawable.maok);
                    break;
                case 'l':
                    letradica[i + 1].setImageResource(R.drawable.maol);
                    break;
                case 'm':
                    letradica[i + 1].setImageResource(R.drawable.maom);
                    break;
                case 'n':
                    letradica[i + 1].setImageResource(R.drawable.maon);
                    break;
                case 'o':
                    letradica[i + 1].setImageResource(R.drawable.maoo);
                    break;
                case 'p':
                    letradica[i + 1].setImageResource(R.drawable.maop);
                    break;
                case 'q':
                    letradica[i + 1].setImageResource(R.drawable.maoq);
                    break;
                case 'r':
                    letradica[i + 1].setImageResource(R.drawable.maor);
                    break;
                case 's':
                    letradica[i + 1].setImageResource(R.drawable.maos);
                    break;
                case 't':
                    letradica[i + 1].setImageResource(R.drawable.maot);
                    break;
                case 'u':
                    letradica[i + 1].setImageResource(R.drawable.maou);
                    break;
                case 'v':
                    letradica[i + 1].setImageResource(R.drawable.maov);
                    break;
                case 'w':
                    letradica[i + 1].setImageResource(R.drawable.maow);
                    break;
                case 'x':
                    letradica[i + 1].setImageResource(R.drawable.maox);
                    break;
                case 'y':
                    letradica[i + 1].setImageResource(R.drawable.maoy);
                    break;
                case 'z':
                    letradica[i + 1].setImageResource(R.drawable.maoz);
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
                        letra[i + 1].setImageResource(R.drawable.maoa);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonB:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'b') {
                        letra[i + 1].setImageResource(R.drawable.maob);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonC:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'c') {
                        letra[i + 1].setImageResource(R.drawable.maoc);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonD:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'd') {
                        letra[i + 1].setImageResource(R.drawable.maod);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonE:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'e') {
                        letra[i + 1].setImageResource(R.drawable.maoe);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonF:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'f') {
                        letra[i + 1].setImageResource(R.drawable.maof);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonG:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'g') {
                        letra[i + 1].setImageResource(R.drawable.maog);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonH:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'h') {
                        letra[i + 1].setImageResource(R.drawable.maoh);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonI:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'i') {
                        letra[i + 1].setImageResource(R.drawable.maoi);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonJ:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'j') {
                        letra[i + 1].setImageResource(R.drawable.maoj);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonK:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'k') {
                        letra[i + 1].setImageResource(R.drawable.maok);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonL:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'l') {
                        letra[i + 1].setImageResource(R.drawable.maol);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonM:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'm') {
                        letra[i + 1].setImageResource(R.drawable.maom);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonN:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'n') {
                        letra[i + 1].setImageResource(R.drawable.maon);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonO:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'o') {
                        letra[i + 1].setImageResource(R.drawable.maoo);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonP:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'p') {
                        letra[i + 1].setImageResource(R.drawable.maop);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonQ:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'q') {
                        letra[i + 1].setImageResource(R.drawable.maoq);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonR:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'r') {
                        letra[i + 1].setImageResource(R.drawable.maor);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonS:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 's') {
                        letra[i + 1].setImageResource(R.drawable.maos);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonT:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 't') {
                        letra[i + 1].setImageResource(R.drawable.maot);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonU:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'u') {
                        letra[i + 1].setImageResource(R.drawable.maou);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonV:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'v') {
                        letra[i + 1].setImageResource(R.drawable.maov);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonW:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'w') {
                        letra[i + 1].setImageResource(R.drawable.maow);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonX:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'x') {
                        letra[i + 1].setImageResource(R.drawable.maox);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonY:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'y') {
                        letra[i + 1].setImageResource(R.drawable.maoy);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.buttonZ:
                for (i=0; i<palavra.length();i++)
                    if (palavra.charAt(i) == 'z') {
                        letra[i + 1].setImageResource(R.drawable.maoz);
                        letrapreenchida [i+1] = 1;
                        acertou = 1;
                    }//fim if
                break;
            case R.id.button41:
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

}//fim da classe Activity_04
