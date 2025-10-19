package Atividades.App;
import Atividades.Metodos.*;

public class ClinicaApp {
    public static void main(String[] args) {
        Procedimento drenagem = new Procedimento("Drenagem Linfatica", 60, 350);
        Procedimento laser = new Procedimento("Laser Depilatorio", 120, 200);
        Procedimento massagem = new Procedimento("Massagem", 60, 150);

        PlanoTratamento plano = new PlanoTratamento();

        plano.adicionaAtendimento(new Atendimento(drenagem, 2));
        plano.adicionaAtendimento(new Atendimento(laser, 5));
        plano.adicionaAtendimento(new Atendimento(massagem, 5));

        System.out.println("Custo total:" + plano.calculaCustoTotal());
        System.out.println("Tempo total:" + plano.calculaTempoTotal() + " minutos");

    }
}
