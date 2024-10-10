public class FormatadorCepEx {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("40028922");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            System.out.println("O cep não corresponde com as regras de negocio");;
        }
    }

    static String formatarCep(String cep) throws CepInvalidException{
        if(cep.length() != 8){
            throw new CepInvalidException();
        }
        return "05145-000";
    }
}
