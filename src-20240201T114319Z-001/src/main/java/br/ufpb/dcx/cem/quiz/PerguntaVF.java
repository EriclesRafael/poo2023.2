package br.ufpb.dcx.cem.quiz;

public class PerguntaVF extends Pergunta {

    private String [] afirmativa;

    public PerguntaVF(String enunciado, String [] afirmativa, String respostaCorreta){
        super(enunciado, respostaCorreta);
        this.afirmativa=afirmativa;
    }
    public PerguntaVF(){
        this("", new String[]{}, "" );
        this.afirmativa=new String[]{};
    }

    @Override
    public boolean estahCorretaResposta(String resposta) {
        for (String afirmativa : afirmativa) {
            if (afirmativa.equals(resposta)) {
                return true;
            }
        }
        return false;
    }

    public String[] getAfirmativa() {
        return afirmativa;
    }

    public void setAfirmativa(String[] afirmativa) {
        this.afirmativa = afirmativa;
    }
}
