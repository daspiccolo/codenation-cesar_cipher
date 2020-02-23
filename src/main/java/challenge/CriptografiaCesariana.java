package challenge;

public class CriptografiaCesariana implements Criptografia {

    String texto;
    int chave =3;
    String textoCriptografado = "";
    String textoDecriptografado = "";

    @Override
    public String criptografar(String texto) {
        if ( texto == null){
            throw new NullPointerException();
        }else if (texto == "") {
            throw new IllegalArgumentException();
        }else{
            texto = texto.toLowerCase();
            int size = texto.length();

            for (int i = 0; i < size; i++) {
                char ch = texto.charAt(i);
                if (Character.isLetter(ch)) {
                    char c = (char) (ch + chave);
                    if(c >'z'){
                        textoCriptografado += (char)(ch -(26 - chave));
                    }else{
                        textoCriptografado += c;
                    }
                } else {
                    textoCriptografado += ch;
                }

            }
        }
        return textoCriptografado;
    }

    @Override
    public String descriptografar(String texto) {
        if ( texto == null){
            throw new NullPointerException();
        }else if (texto == "") {
            throw new IllegalArgumentException();
        }else{
            texto = texto.toLowerCase();
            int size = texto.length();

            for (int i = 0; i < size; i++) {
                char ch = texto.charAt(i);
                if (Character.isLetter(ch)) {
                    char c = (char) (ch - chave);
                    if(c >'z'){
                        textoDecriptografado += (char)(ch -(26 - chave));
                    }else{
                        textoDecriptografado += c;
                    }
                } else {
                    textoDecriptografado += ch;
                }

            }
        }
        return textoDecriptografado;
    }


}

