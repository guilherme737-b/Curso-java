package br.com.erros;

public class SenhaTeste {


   static void autenticar(String senha) throws SenhaInvalidaException {
       if ("123".equals(senha)){
           System.out.println("Autenticado");
       } else {
           throw new SenhaInvalidaException("Senha incorreta");
       }

   }



    public static void main(String[] args) {
       try {
           autenticar("1223");
       }catch (SenhaInvalidaException e){
           e.printStackTrace();
           System.out.println(e.getMessage());

       }

    }
}
