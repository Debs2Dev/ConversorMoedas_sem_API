import java.util.Scanner;

public class ConversorMoedas {

    public static void main(String[] args) {
        //  Scanner para ler entradas inseridas pelo usuário
        Scanner scanner = new Scanner(System.in);

        // Menu de mostragem das opções de moedas disponíveis para conversão
        System.out.println("Bem-vindo ao conversor de moedas em tempo real! Tenha sua cotação diaria");
        System.out.println("Moedas a converter:");
        System.out.println("1 - Real (BRL)");
        System.out.println("2 - Dólar (USD)");
        System.out.println("3 - Euro (EUR)");
        System.out.println("4 - Libra Esterlina (GBP)");
        System.out.println("5 - Iene (JPY)");
        System.out.println("6 - Franco Suíço (CHF)");
        System.out.println("7 - Yuan Chinês (CNY)");
        System.out.println("8 - Dólar Australiano (AUD)");
        System.out.println("9 - Dólar Canadense (CAD)");
        System.out.println("10 - Rúpia Indiana (INR)");
        System.out.println("11 - Peso Mexicano (MXN)");
        System.out.println("12 - Peso Argentino (ARS)");



        // Perguntar ao usuario qual a moeda de origem
        System.out.print("Escolha o número correspondente à moeda de origem: ");
        int moedaOrigem = scanner.nextInt();

        // Perguntar ao usuario qual a moeda desejada para execuar a convesão
        System.out.print("Escolha o número correspondente da moeda de destino: ");
        int moedaDestino = scanner.nextInt();

        // Perguntar qual sera o valor a ser convertido
        System.out.print("Digite o valor a ser convertido: ");
        double valor = scanner.nextDouble();

        // Variável para armazenar o resultado da conversão de moedas
        double valorConvertido = 0;

        // Realizar a conversão de acordo com a escolha do usuário
        switch (moedaOrigem) {
            case 1: // Real (BRL)
                if (moedaDestino == 2) {
                    valorConvertido = valor / 5.0; // BRL para USD
                } else if (moedaDestino == 3) {
                    valorConvertido = valor / 6.0; // BRL para EUR
                } else if (moedaDestino == 4) {
                    valorConvertido = valor / 7.0; // BRL para GBP
                } else if (moedaDestino == 5) {
                    valorConvertido = valor / 0.046; // BRL para JPY
                } else if (moedaDestino == 6) {
                    valorConvertido = valor / 5.5; // BRL para CHF
                } else if (moedaDestino == 7) {
                    valorConvertido = valor / 0.75; // BRL para CNY
                } else if (moedaDestino == 8) {
                    valorConvertido = valor / 3.75; // BRL para AUD
                } else if (moedaDestino == 9) {
                    valorConvertido = valor / 4.0; // BRL para CAD
                } else if (moedaDestino == 10) {
                    valorConvertido = valor / 0.067; // BRL para INR
                } else if (moedaDestino == 11) {
                    valorConvertido = valor / 0.24; // BRL para MXN
                } else if (moedaDestino == 12) {
                    valorConvertido = valor / 0.035; // BRL para ARS
                } else {
                    valorConvertido = valor; // BRL para BRL (nenhuma conversão)
                }
                break;
            case 2: // Dólar (USD)
                if (moedaDestino == 1) {
                    valorConvertido = valor * 5.0; // USD para BRL
                } else if (moedaDestino == 3) {
                    valorConvertido = valor * 0.85; // USD para EUR
                } else if (moedaDestino == 4) {
                    valorConvertido = valor * 0.72; // USD para GBP
                } else if (moedaDestino == 5) {
                    valorConvertido = valor * 110.0; // USD para JPY
                } else if (moedaDestino == 6) {
                    valorConvertido = valor * 0.92; // USD para CHF
                } else if (moedaDestino == 7) {
                    valorConvertido = valor * 6.75; // USD para CNY
                } else if (moedaDestino == 8) {
                    valorConvertido = valor * 1.35; // USD para AUD
                } else if (moedaDestino == 9) {
                    valorConvertido = valor * 1.25; // USD para CAD
                } else if (moedaDestino == 10) {
                    valorConvertido = valor * 75.0; // USD para INR
                } else if (moedaDestino == 11) {
                    valorConvertido = valor * 20.0; // USD para MXN
                } else if (moedaDestino == 12) {
                    valorConvertido = valor * 28.5; // USD para ARS
                } else {
                    valorConvertido = valor; // USD para USD (nenhuma conversão)
                }
                break;
            case 3: // Euro (EUR)
                if (moedaDestino == 1) {
                    valorConvertido = valor * 6.0; // EUR para BRL
                } else if (moedaDestino == 2) {
                    valorConvertido = valor / 0.85; // EUR para USD
                } else if (moedaDestino == 4) {
                    valorConvertido = valor * 0.85; // EUR para GBP
                } else if (moedaDestino == 5) {
                    valorConvertido = valor * 129.0; // EUR para JPY
                } else if (moedaDestino == 6) {
                    valorConvertido = valor * 1.08; // EUR para CHF
                } else if (moedaDestino == 7) {
                    valorConvertido = valor * 7.90; // EUR para CNY
                } else if (moedaDestino == 8) {
                    valorConvertido = valor * 1.60; // EUR para AUD
                } else if (moedaDestino == 9) {
                    valorConvertido = valor * 1.47; // EUR para CAD
                } else if (moedaDestino == 10) {
                    valorConvertido = valor * 88.0; // EUR para INR
                } else if (moedaDestino == 11) {
                    valorConvertido = valor * 23.5; // EUR para MXN
                } else if (moedaDestino == 12) {
                    valorConvertido = valor * 33.0; // EUR para ARS
                } else {
                    valorConvertido = valor; // EUR para EUR (nenhuma conversão)
                }
                break;
            case 4: // Libra Esterlina (GBP)
                if (moedaDestino == 1) {
                    valorConvertido = valor * 7.0; // GBP para BRL
                } else if (moedaDestino == 2) {
                    valorConvertido = valor / 0.72; // GBP para USD
                } else if (moedaDestino == 3) {
                    valorConvertido = valor / 0.85; // GBP para EUR
                } else if (moedaDestino == 5) {
                    valorConvertido = valor * 151.0; // GBP para JPY
                } else if (moedaDestino == 6) {
                    valorConvertido = valor * 1.27; // GBP para CHF
                } else if (moedaDestino == 7) {
                    valorConvertido = valor * 9.3; // GBP para CNY
                } else if (moedaDestino == 8) {
                    valorConvertido = valor * 1.89; // GBP para AUD
                } else if (moedaDestino == 9) {
                    valorConvertido = valor * 1.74; // GBP para CAD
                } else if (moedaDestino == 10) {
                    valorConvertido = valor * 105.0; // GBP para INR
                } else if (moedaDestino == 11) {
                    valorConvertido = valor * 28.0; // GBP para MXN
                } else if (moedaDestino == 12) {
                    valorConvertido = valor * 39.0; // GBP para ARS
                } else {
                    valorConvertido = valor; // GBP para GBP (nenhuma conversão)
                }
                break;
            case 5: // Iene (JPY)
                if (moedaDestino == 1) {
                    valorConvertido = valor * 0.046; // JPY para BRL
                } else if (moedaDestino == 2) {
                    valorConvertido = valor * 0.0091; // JPY para USD
                } else if (moedaDestino == 3) {
                    valorConvertido = valor * 0.0077; // JPY para EUR
                } else if (moedaDestino == 4) {
                    valorConvertido = valor * 0.0066; // JPY para GBP
                } else if (moedaDestino == 6) {
                    valorConvertido = valor * 0.0084; // JPY para CHF
                } else if (moedaDestino == 7) {
                    valorConvertido = valor * 0.061; // JPY para CNY
                } else if (moedaDestino == 8) {
                    valorConvertido = valor * 0.0126; // JPY para AUD
                } else if (moedaDestino == 9) {
                    valorConvertido = valor * 0.0113; // JPY para CAD
                } else if (moedaDestino == 10) {
                    valorConvertido = valor * 0.68; // JPY para INR
                } else if (moedaDestino == 11) {
                    valorConvertido = valor * 0.19; // JPY para MXN
                } else if (moedaDestino == 12) {
                    valorConvertido = valor * 0.26; // JPY para ARS
                } else {
                    valorConvertido = valor; // JPY para JPY (nenhuma conversão)
                }
                break;
            case 6: // Franco Suíço (CHF)
                if (moedaDestino == 1) {
                    valorConvertido = valor * 5.5; // CHF para BRL
                } else if (moedaDestino == 2) {
                    valorConvertido = valor * 1.08; // CHF para USD
                } else if (moedaDestino == 3) {
                    valorConvertido = valor / 1.08; // CHF para EUR
                } else if (moedaDestino == 4) {
                    valorConvertido = valor / 1.27; // CHF para GBP
                } else if (moedaDestino == 5) {
                    valorConvertido = valor * 129.0; // CHF para JPY
                } else if (moedaDestino == 7) {
                    valorConvertido = valor * 7.1; // CHF para CNY
                } else if (moedaDestino == 8) {
                    valorConvertido = valor * 1.47; // CHF para AUD
                } else if (moedaDestino == 9) {
                    valorConvertido = valor * 1.35; // CHF para CAD
                } else if (moedaDestino == 10) {
                    valorConvertido = valor * 82.0; // CHF para INR
                } else if (moedaDestino == 11) {
                    valorConvertido = valor * 22.0; // CHF para MXN
                } else if (moedaDestino == 12) {
                    valorConvertido = valor * 31.0; // CHF para ARS
                } else {
                    valorConvertido = valor; // CHF para CHF (nenhuma conversão)
                }
                break;
            case 7: // Yuan Chinês (CNY)
                if (moedaDestino == 1) {
                    valorConvertido = valor * 0.75; // CNY para BRL
                } else if (moedaDestino == 2) {
                    valorConvertido = valor / 6.75; // CNY para USD
                } else if (moedaDestino == 3) {
                    valorConvertido = valor / 7.9; // CNY para EUR
                } else if (moedaDestino == 4) {
                    valorConvertido = valor / 9.3; // CNY para GBP
                } else if (moedaDestino == 5) {
                    valorConvertido = valor * 18.85; // CNY para JPY
                } else if (moedaDestino == 6) {
                    valorConvertido = valor / 7.1; // CNY para CHF
                } else if (moedaDestino == 8) {
                    valorConvertido = valor * 0.21; // CNY para AUD
                } else if (moedaDestino == 9) {
                    valorConvertido = valor * 0.19; // CNY para CAD
                } else if (moedaDestino == 10) {
                    valorConvertido = valor * 11.4; // CNY para INR
                } else if (moedaDestino == 11) {
                    valorConvertido = valor * 3.1; // CNY para MXN
                } else if (moedaDestino == 12) {
                    valorConvertido = valor * 4.4; // CNY para ARS
                } else {
                    valorConvertido = valor; // CNY para CNY (nenhuma conversão)
                }
                break;
            case 8: // Dólar Australiano (AUD)
                if (moedaDestino == 1) {
                    valorConvertido = valor * 3.75; // AUD para BRL
                } else if (moedaDestino == 2) {
                    valorConvertido = valor / 1.35; // AUD para USD
                } else if (moedaDestino == 3) {
                    valorConvertido = valor / 1.6; // AUD para EUR
                } else if (moedaDestino == 4) {
                    valorConvertido = valor / 1.89; // AUD para GBP
                } else if (moedaDestino == 5) {
                    valorConvertido = valor * 82.0; // AUD para JPY
                } else if (moedaDestino == 6) {
                    valorConvertido = valor / 1.47; // AUD para CHF
                } else if (moedaDestino == 7) {
                    valorConvertido = valor / 0.21; // AUD para CNY
                } else if (moedaDestino == 9) {
                    valorConvertido = valor * 0.91; // AUD para CAD
                } else if (moedaDestino == 10) {
                    valorConvertido = valor * 54.0; // AUD para INR
                } else if (moedaDestino == 11) {
                    valorConvertido = valor * 14.9; // AUD para MXN
                } else if (moedaDestino == 12) {
                    valorConvertido = valor * 21.1; // AUD para ARS
                } else {
                    valorConvertido = valor; // AUD para AUD (nenhuma conversão)
                }
                break;
            case 9: // Dólar Canadense (CAD)
                if (moedaDestino == 1) {
                    valorConvertido = valor * 4.0; // CAD para BRL
                } else if (moedaDestino == 2) {
                    valorConvertido = valor / 1.25; // CAD para USD
                } else if (moedaDestino == 3) {
                    valorConvertido = valor / 1.47; // CAD para EUR
                } else if (moedaDestino == 4) {
                    valorConvertido = valor / 1.74; // CAD para GBP
                } else if (moedaDestino == 5) {
                    valorConvertido = valor * 88.0; // CAD para JPY
                } else if (moedaDestino == 6) {
                    valorConvertido = valor / 1.35; // CAD para CHF
                } else if (moedaDestino == 7) {
                    valorConvertido = valor / 0.19; // CAD para CNY
                } else if (moedaDestino == 8) {
                    valorConvertido = valor / 0.91; // CAD para AUD
                } else if (moedaDestino == 10) {
                    valorConvertido = valor * 59.0; // CAD para INR
                } else if (moedaDestino == 11) {
                    valorConvertido = valor * 16.0; // CAD para MXN
                } else if (moedaDestino == 12) {
                    valorConvertido = valor * 22.6; // CAD para ARS
                } else {
                    valorConvertido = valor; // CAD para CAD (nenhuma conversão)
                }
                break;
            case 10: // Rúpia Indiana (INR)
                if (moedaDestino == 1) {
                    valorConvertido = valor * 0.067; // INR para BRL
                } else if (moedaDestino == 2) {
                    valorConvertido = valor / 75.0; // INR para USD
                } else if (moedaDestino == 3) {
                    valorConvertido = valor / 88.0; // INR para EUR
                } else if (moedaDestino == 4) {
                    valorConvertido = valor / 105.0; // INR para GBP
                } else if (moedaDestino == 5) {
                    valorConvertido = valor * 1.47; // INR para JPY
                } else if (moedaDestino == 6) {
                    valorConvertido = valor / 82.0; // INR para CHF
                } else if (moedaDestino == 7) {
                    valorConvertido = valor / 11.4; // INR para CNY
                } else if (moedaDestino == 8) {
                    valorConvertido = valor / 54.0; // INR para AUD
                } else if (moedaDestino == 9) {
                    valorConvertido = valor / 59.0; // INR para CAD
                } else if (moedaDestino == 11) {
                    valorConvertido = valor * 0.27; // INR para MXN
                } else if (moedaDestino == 12) {
                    valorConvertido = valor * 0.38; // INR para ARS
                } else {
                    valorConvertido = valor; // INR para INR (nenhuma conversão)
                }
                break;
            case 11: // Peso Mexicano (MXN)
                if (moedaDestino == 1) {
                    valorConvertido = valor * 0.24; // MXN para BRL
                } else if (moedaDestino == 2) {
                    valorConvertido = valor / 20.0; // MXN para USD
                } else if (moedaDestino == 3) {
                    valorConvertido = valor / 23.5; // MXN para EUR
                } else if (moedaDestino == 4) {
                    valorConvertido = valor / 28.0; // MXN para GBP
                } else if (moedaDestino == 5) {
                    valorConvertido = valor * 5.05; // MXN para JPY
                } else if (moedaDestino == 6) {
                    valorConvertido = valor / 22.0; // MXN para CHF
                } else if (moedaDestino == 7) {
                    valorConvertido = valor / 3.1; // MXN para CNY
                } else if (moedaDestino == 8) {
                    valorConvertido = valor / 14.9; // MXN para AUD
                } else if (moedaDestino == 9) {
                    valorConvertido = valor / 16.0; // MXN para CAD
                } else if (moedaDestino == 10) {
                    valorConvertido = valor * 0.27; // MXN para INR
                } else if (moedaDestino == 12) {
                    valorConvertido = valor * 1.3; // MXN para ARS
                } else {
                    valorConvertido = valor; // MXN para MXN (nenhuma conversão)
                }
                break;
            case 12: // Peso Argentino (ARS)
                if (moedaDestino == 1) {
                    valorConvertido = valor * 0.035; // ARS para BRL
                } else if (moedaDestino == 2) {
                    valorConvertido = valor / 28.5; // ARS para USD
                } else if (moedaDestino == 3) {
                    valorConvertido = valor / 33.0; // ARS para EUR
                } else if (moedaDestino == 4) {
                    valorConvertido = valor / 39.0; // ARS para GBP
                } else if (moedaDestino == 5) {
                    valorConvertido = valor * 3.62; // ARS para JPY
                } else if (moedaDestino == 6) {
                    valorConvertido = valor / 31.0; // ARS para CHF
                } else if (moedaDestino == 7) {
                    valorConvertido = valor / 4.4; // ARS para CNY
                } else if (moedaDestino == 8) {
                    valorConvertido = valor / 21.1; // ARS para AUD
                } else if (moedaDestino == 9) {
                    valorConvertido = valor / 22.6; // ARS para CAD
                } else if (moedaDestino == 10) {
                    valorConvertido = valor * 0.038; // ARS para INR
                } else if (moedaDestino == 11) {
                    valorConvertido = valor / 1.3; // ARS para MXN
                } else {
                    valorConvertido = valor; // ARS para ARS (nenhuma conversão)
                }
                break;
            default:
                System.out.println("Moeda de origem inválida!");
                break;
        }


        // Imprimir o resultado da conversão desejada
        if (valorConvertido != 0) {
            System.out.println("Valor convertido: " + valorConvertido);
        }

        // Encerrar o conversor de moedas
        scanner.close();
    }
}
